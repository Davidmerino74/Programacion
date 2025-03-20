package POO_ConexionNico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.*;

public class testConexionBasica {
    public static void main(String[] args) {
        //String url = "jdbc:mysql://datos.somorrostro.com:3306/2324Equipo01";//para cuando funcione datos.somorrostro.com
        String url = "jdbc:mysql://127.0.0.1:3306/recuperacion";
        String user = "alumno";
        String password = "alumno";

        try {
            // Conexión a la base de datos
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
            String str="INSERT INTO tablanico (nombre,apellidos,direccion,edad) VALUES ('david','merino sanz','barrio n14',"+(int)(Math.random()*20)+")";
            //conn.createStatement():Aquí se crea un objeto de tipo Statement a partir de la conexión conn. Este objeto es el que te permite enviar consultas SQL al servidor de la base de datos.
            //stmt.executeUpdate(str):Este método ejecuta una consulta SQL que se encuentra en el string str. En este caso, el string contiene una instrucción INSERT INTO que añade un registro a la tabla tablanico con valores específicos
            Statement stmt=conn.createStatement();
            stmt.executeUpdate(str);

            System.out.println(str);
            //siempre hay que cerrar la conexión
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
