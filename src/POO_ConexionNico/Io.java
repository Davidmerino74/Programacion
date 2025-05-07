import java.sql.*;
import java.io.Console;
import java.util.Scanner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat; 
import java.util.Date; 


public class Io{
// Funciones
public static void sop(String s){
  System.out.println(s);
}
public static void Sop(String s){
  sop(s);
}
public static String estadoConexion(Connection conn){
	if (conn==null) return ("OFF");
	return ("ON");
}

public static boolean esConexion(String url, String user, String pass){
	Connection conn = null;
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url, user, pass);
    } catch (ClassNotFoundException  e) {
         e.printStackTrace();
    } catch (SQLException e) {
         e.printStackTrace();
    }
	if (conn==null){
		return(false);
	}
	return(true);
}
public static Connection getConexion(String url, String user, String pass){
	//import java.sql.*;
	Connection conn = null;
    try {
         //Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection(url, user, pass);
    //} catch (ClassNotFoundException  e) {
    //     e.printStackTrace();
    } catch (SQLException e) {
         e.printStackTrace();
    }
	return(conn);
}
public static Connection getConexion(String host, String bd, String user, String pass){
	Connection conn = null;
	String url = "jdbc:mysql://" + host + ":3306/" + bd + "?useSSL=false";
    try {
         conn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
         Sop("No se pudo establecer conexión");
    }
	return(conn);
}
public static boolean cerrarConexion(Connection conn){
	boolean dev=true;
	try{ 
		conn.close();
	}catch (Exception e){
		dev=false;
	}
	return(dev);
}
public static String PADL(String texto, int longitud) {
	if (texto.length() > longitud) {
		return texto.substring(0, longitud);
    } else {
        while (texto.length() < longitud) {
			texto+=" ";
		}
        return texto;
	}
}

public static char leerCaracterOculto() {
	//import java.io.Console;
	Console console = System.console();
	if (console == null) {
		throw new RuntimeException("No se puede acceder a la consola.");
	}
	char[] texto = console.readPassword("...");
	if (texto.length == 0) {
		throw new RuntimeException("No se ingresó ningún carácter.");
	}
	return texto[0];
}
public static String leerCadena(){
	Scanner teclado= new Scanner(System.in);
	String cadena;
	cadena=teclado.nextLine();
	if (cadena.isEmpty()){
		cadena=""; 
	}
	return(cadena);
}
public static int leerNumero(){
	int dev;
	Scanner teclado= new Scanner (System.in);
	do {
		try{
			dev=teclado.nextInt();
			break;
		}catch (InputMismatchException e){
			//Vacio el buffer de teclado
			teclado.nextLine();
		}
	}while (true);
	return (dev);
}	

public static Date leerFecha(){
//import java.text.SimpleDateFormat; 
int d,m,a;
Fecha fFecha;
Date dFecha;
do{
	d=leerNumero();
	m=leerNumero();
	a=leerNumero();
	fFecha= new Fecha (d,m,a);
	if (!fFecha.esFechaValida()){
		Sop("Fecha invalida "+fFecha.toString());
	}
}while(!fFecha.esFechaValida());
//Sop("Fecha Válida "+fFecha.toString());
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
try{
	dFecha = sdf.parse(fFecha.toString());
} catch (Exception e) {
	dFecha=new Date();
	System.err.println("No se ha podido convertir la fecha");
}
return(dFecha);
}	
	
	

	
	
public static char leerCaracter(){
	Scanner teclado= new Scanner(System.in);
	char letra;
	String cadena;
	cadena=teclado.nextLine();
	if (cadena.isEmpty()){
		letra=13; //enter
	}else{
		letra=cadena.charAt(0);
	}
	return(letra);
}


public static char getch() {
	//import java.io.IOException;
	try {
		System.out.print("Introduzca un carácter: ");
		return (char) System.in.read();
	} catch (IOException e) {
		throw new RuntimeException("Error al leer el carácter.", e);
	}
}
public static void cls() {
	try {
		if (System.getProperty("os.name").contains("Windows")) {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			new ProcessBuilder("clear").inheritIO().start().waitFor();
		}
	} catch (IOException | InterruptedException ex) {
		System.err.println("Error al limpiar la pantalla: " + ex.getMessage());
	}
}
public static void inkey(int seconds) {
	//import java.util.concurrent.TimeUnit;
	Thread thread = new Thread(() -> {
	try {
		TimeUnit.SECONDS.sleep(seconds);
	} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
	}
	});
	thread.start();
	try {
		while (thread.isAlive()) {
			if (System.in.available() > 0) {
				System.in.read(); // Consume la tecla presionada
				thread.interrupt();
				break;
			}
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}
    public static void aumentarFuenteCmd(int tamanioFuente) {
        try {
            // Cambiar tamaño de la fuente (requiere acceso a configuración del registro o herramientas externas)
            String fontCommand = "reg add HKCU\\Console /v FontSize /t REG_DWORD /d "+ (tamanioFuente * 65536) + " /f";
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", fontCommand});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static int getTamanioFuenteCmd() {
	   //import java.io.InputStreamReader;
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"cmd", "/c", "reg query HKCU\\Console /v FontSize"});
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("FontSize")) {
                   // String[] parts = line.trim().split("\s+");
                   int fontSize=10;//  = Integer.parseInt(parts[parts.length - 1], 16) / 65536;
                    return fontSize;
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return -1; // Valor por defecto si falla
    }
    
public static String DTOC() {
	//import java.util.Calendar;
	Calendar c1 = Calendar.getInstance();
	int dia = c1.get(Calendar.DAY_OF_MONTH);
	int mes = c1.get(Calendar.MONTH) + 1; // Enero es 0
	int anio = c1.get(Calendar.YEAR);
	return String.format("%02d/%02d/%04d", dia, mes, anio);
}

}// fin de clase Io
