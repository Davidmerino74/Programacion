package POO_ConexionNico;

import java.sql.*;
import java.util.Scanner;

public class AALibreriaSomoxApp {
    private static final String URL = "jdbc:mysql://datos.somox.com/LibreriaSomox";
    private static final String USER = "LibreriaSomox";
    private static final String PASSWORD = "LibreriaSomox";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }

    public static boolean crearTabla(Connection conexion) {
        String sql = "CREATE TABLE TLIBROS (" +
                    "lib_isbn CHAR(10), " +
                    "lib_titulo CHAR(50), " +
                    "lib_autor CHAR(50), " +
                    "lib_id CHAR(10))";
        try (Statement stmt = conexion.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabla creada exitosamente.");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
            return false;
        }
    }

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
        Connection conexion = getConexion();

        if (conexion == null) {
            System.out.println("No se pudo establecer conexión.");
            return;
        }

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Realizar conexión");
            System.out.println("2. Crear tabla de Libros");
            System.out.println("3. Insertar libro nuevo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Conexión establecida correctamente.");
                    break;
                case 2:
                    crearTabla(conexion);
                    break;
                case 3:
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    insertarLibro(conexion, isbn, titulo, autor, id);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
        scanner.close();
    }
}
