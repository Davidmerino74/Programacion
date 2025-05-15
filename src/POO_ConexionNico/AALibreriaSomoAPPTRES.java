package POO_ConexionNico;

import java.sql.*;
import java.util.Scanner;

public class AALibreriaSomoAPPTRES {
     // Función que recibe los parámetros de conexión y devuelve el objeto Connection
    public static Connection getConexion(String servidor, String baseDatos, String usuario, String password) {
        String url = "jdbc:mysql://" + servidor + "/" + baseDatos;
        try {
            return DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }

    // Crear tabla de libros
    public static boolean crearTabla(Connection conexion, String sql) {
        try (Statement stmt = conexion.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabla creada exitosamente.");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
            return false;
        }
    }

    // Insertar nuevo libro
    public static boolean insertarLibro(Connection conexion, String isbn, String titulo, String autor, String id) {
        String sql = "INSERT INTO TLIBROS (lib_isbn, lib_titulo, lib_autor, lib_id) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, isbn);
            pstmt.setString(2, titulo);
            pstmt.setString(3, autor);
            pstmt.setString(4, id);
            pstmt.executeUpdate();
            System.out.println("Libro insertado exitosamente.");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar libro: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection conexion = null;
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar conexión");
            System.out.println("2. Crear tabla de Libros");
            System.out.println("3. Insertar libro nuevo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    conexion = getConexion("datos.somox.com", "LibreriaSomox", "LibreriaSomox", "LibreriaSomox");
                    if (conexion != null) {
                        System.out.println("Conexión establecida correctamente.");
                    } else {
                        System.out.println("No se pudo establecer la conexión.");
                    }
                    break;

                case 2:
                    if (conexion != null) {
                        String sqlCrear = "CREATE TABLE TLIBROS (" +
                                "lib_isbn CHAR(10), " +
                                "lib_titulo CHAR(50), " +
                                "lib_autor CHAR(50), " +
                                "lib_id CHAR(10))";
                        crearTabla(conexion, sqlCrear);
                    } else {
                        System.out.println("Primero debe realizar la conexión.");
                    }
                    break;

                case 3:
                    if (conexion != null) {
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("ID: ");
                        String id = scanner.nextLine();
                        insertarLibro(conexion, isbn, titulo, autor, id);
                    } else {
                        System.out.println("Primero debe realizar la conexión.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        try {
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
        scanner.close();
    }
}

