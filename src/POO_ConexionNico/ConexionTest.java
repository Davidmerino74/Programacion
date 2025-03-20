package POO_ConexionNico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionTest {
    public static void main (String argv[]){
    final String hostname = "datos.somorrostro.com";
    final String database = "2324Equipo01";
    final String username = "2324Equipo01";
    final String password = "2324Equipo01";
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    String url = "jdbc:mysql://" + hostname + ":3306/" + database + "?useSSL=false";
    Sop("Manejo de una base de datos"); 
    Sop("==========================="); 
    Sop("Nombre hostname o servidor: "+ hostname);
    Sop("Nombre de la Base de datos: "+ database);
    Sop("Usuario de acceso: "+ username);
    Sop("Clave de acceso: "+ password);
    Sop("Ruta de conexión: "+url);
    Sop("Estableciendo conexión ....: ");
    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Cargo el driver
        conn = DriverManager.getConnection(url, username, password);// Hago conexión 
    }catch (ClassNotFoundException  e) {
        Sop("\nExcepción por Clase no encontrada: "+e);
    }catch (SQLException e) {
        Sop("\nExcepción SQL: "+e);
    }
    if (conn!=null){
        Sop("Hay conexion !!!!!!");
    }else{ 
        Sop("No se pudo establecer conexión!!!!!!");
    }
    // Cerrar conexión
    try{
        conn.close();
        Sop("Cerrada la conexion");
    }catch (Exception e){
        Sop("Excepcion al cerrar conexión, posiblemente no se abrió" );
    }
    }// fin de main
    public static void Sop(String s){
        System.out.print("\n"+s);
    }// fin de sop
}// fin de clase

