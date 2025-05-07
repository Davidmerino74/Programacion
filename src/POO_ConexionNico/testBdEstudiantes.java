
import java.sql.*;
import java.util.*;

public class testBdEstudiantes{
    final static String hostname = "datos.somorrostro.com";
    final static String database = "2324Equipo01";
    final static String username = "2324Equipo01";
    final static String password = "2324Equipo01";
    static String url = "jdbc:mysql://" + hostname + ":3306/" + database + "?useSSL=false";
    static Scanner sc = new Scanner(System.in);

public static void main (String argv[]){
char opc;
String sNombre,sApel,sDni,sId,swId,swDni,swNom,swApel,sql;
Connection conn = null;
ResultSet rs=null;

Sop("Estableciendo conexión ....: ");
conn25=Io.getConexion(url,username,password);

if (conn==null){
	Sop("No se pudo establecer conexión!!!!!!");
	return;
}

do{
	Io.cls();
	Sop("************************************************************************************");
	Sop("*             CENTRO FORMACION SOMORROSTROS - ESTUDIANTES                " + Io.DTOC() );
	Sop("************************************************************************************");
	Sop("");
	Sop("  ==== OPCIONES BASICAS   =========        ====== OPCIONES ESPECIALES ========    ");
	Sop("  1.- Comprobar/establecer conexion         N.- Crear Tabla de Estudiantes");
	Sop("  2.- Generar 1 estudiante                  A.- Crear 100 estudiantes");
	Sop("  3.- Mostrar estudiantes                   B.- Borrar Tabla de Estudiantes");
	Sop("  4.- Eliminar un estudiantes               P.- Mostrar estudiantes paginando");
	Sop("  9.- Realizar la desconexion               W.- Aumentar el tamaño del cmd ");
	Sop("                                            X.- Disminuir el tamaño del cmd ");
	Sop("  5.- Buscar por Dni:                       S.- Mostrar estructura de datos ");
	Sop("                                                                            ");
	Sop("  0.- Finalizar");
	Sop("Seleccione una opcion: ");
	//opc=sc.nextLine().charAt(0);
	opc=Io.leerCaracter();
	switch (opc){
	case '1':
		if (conn==null) conn=Io.getConexion(url,username,password);
		Sop("La conexión está: "+Io.estadoConexion(conn));
		Io.inkey(1);
		break;
	case '2':  // Añadir un estudiante
		sNombre = Azar.generarNombre(); sDni=Azar.generarDni();
		sApel= Azar.generarApellido();
		sId=Azar.generarLetras(10);
		if (InsetEstudiante(conn,sDni,sNombre,sApel,sId)){ Sop(sNombre + " agregado !!!!!!");
		}else{ Sop(sNombre + " no se pudo agregar !!!!!!");
		}
		Io.inkey(1); break;
	case '3':  // Mostrar Estudiantes
		consultaTablaEstudiantes(conn,0);Io.inkey(3);break;
	case '4': // Borrar estudiante
		//Muestro 10 estudiantes
		consultaTablaEstudiantes(conn,10);
		Sop("Dame el Id: ");
		swId=sc.nextLine();
		if(borrarEstudiante(conn,swId)) Sop("Estudiante borrado !!!!!!");
		Io.inkey(1);break;
	case '5': // Buscar estudiante por Dni
		consultaTablaEstudiantes(conn,10);
		Sop("Introduce el Dni: ");
		swDni=Io.leerCadena();
		if (swDni.isEmpty()) break;
		sql="select * from ESTUDIANTES where EST_DNI= '"+swDni+"'";
		rs=buscarEstudiantesSql(conn,sql);
		if (rs==null){
			Sop("No encontrado con el dni: "+swDni);
		}else{
			MostrarDatosEstudiante(rs);
		}
		Io.inkey(2);break;
	case '6': // Buscar estudiante por Nombre
		Sop("Introduce el Nombre: ");
		swNom=Io.leerCadena();
		if (swNom.isEmpty()) break;
		sql="select * from ESTUDIANTES where EST_NOM= '"+swNom+"'";
		rs=buscarEstudiantesSql(conn,sql);
		if (rs==null){
			Sop("No encontrado con el nombre: "+swNom);
		}else{
			//swId=mostrarEstudiantesPaginadoSql(Connection conn, int nRegPag, int nPag, sql) {
			//+++;
		}
		Io.inkey(1);break;

	case 'P': 
	case 'p': 

		swId=consultarEstudiantesPaginado(conn,10,1);
		if (swId!=null){
			Io.Sop("Id seleccionado: "+swId);
		}
		Io.inkey(2);break;
	case 'N': 
	case 'n': 
		if (CrearTablaEstudiantes(conn)){ Sop("Fichero creado !!!!!!");
		}else{ Sop("No se pudo crear el fichero!!!!!!");
		}
		Io.inkey(1);break;
	case 'B': 
	case 'b': 
		if (borrarTablaEstudiantes(conn)){ Sop("Fichero borrado !!!!!!");
		}else{ Sop("No se pudo crear el fichero!!!!!!");
		}Io.inkey(1);break;
	case 'A':  // Añadir 10 estudiantes
	case 'a':  
		int cont,contExito;
		cont=10;contExito=0;
		while (cont>0){
			sNombre = Azar.generarNombre(); sDni=Azar.generarDni();
			sApel= Azar.generarApellido();
			sId=Azar.generarLetras(10);
			if (InsetEstudiante(conn,sDni,sNombre,sApel,sId)){ 
				contExito++;
			}else { 
				break;
			}
			cont--;
 		}
 		Sop(contExito + " registros agregados.") ;
 		Io.inkey(1);break;
 	case 'x':
 	case 'X': 
		Io.aumentarFuenteCmd(16);
		Sop("Se va a cerrar el programa para que los cambios");
		Sop("tengan efecto");
		opc='0';
		break;
 	case 'W':
 	case 'w': 
		Io.aumentarFuenteCmd(28);
		Sop("Se va a cerrar el programa para que los cambios");
		Sop("tengan efecto");
		opc='0';
		break;
 	case 'S':
 	case 's': structTabla(conn, "select * from ESTUDIANTES") ;
		Io.inkey(2);break;
	
	case '9': Io.cerrarConexion(conn);break;
	case '0': Io.cerrarConexion(conn); break;
	}
}while (opc!='0');
Io.cerrarConexion(conn);
}// fin de main

public static void structTabla(Connection con, String sql){
Statement stmt;
ResultSet rs;
ResultSetMetaData rsMeta;
int numColumnas,i;
String nombreColumna;
String tipoColumna;
try{
	stmt = con.createStatement();     
	rs = stmt.executeQuery(sql); 
	rsMeta = rs.getMetaData();       
	numColumnas = rsMeta.getColumnCount();     
	for (i=1; i<= numColumnas; i++) {             
		nombreColumna = rsMeta.getColumnName(i);    
		tipoColumna = rsMeta.getColumnTypeName(i);
		System.out.println("Columna = " + nombreColumna + 
	" es de tipo " + tipoColumna);
	}
}catch(SQLException e) { 
		System.out.println("\nProblema al leer estructura de tabla: \n"+sql+ " "+ 
			"\n"+e.getErrorCode() + " " + e.getMessage());    
	}
}


public static boolean CrearTablaEstudiantes(Connection conn){
	PreparedStatement st=null;
	String sql;
	sql="CREATE TABLE ESTUDIANTES ";
	sql+="(EST_DNI char(10), EST_NOM CHAR(50),EST_APEL CHAR(50), EST_ID CHAR(10))";
	try {
		st= conn.prepareStatement(sql);  
		st.execute(); 
		st.close();
		return(true);	           
	} catch (SQLException e) { 
		System.out.println("\nProblema al crear tabla estudiantes: \n"+sql+ " "+ 
			"\n"+e.getErrorCode() + " " + e.getMessage());    
	}
	return(false);
}
public static boolean borrarTablaDeEstudiantes(Connection conn) {
	String sql = "DROP TABLE IF EXISTS ESTUDIANTES";
	PreparedStatement st;
	try {
		st=conn.prepareStatement(sql);
		st.execute();
		st.close();
		return(true);
	} catch (SQLException e) {
		System.out.println("\nProblema al borrar tabla estudiantes: \n"+sql+ " "+ 
			"\n"+e.getErrorCode() + " " + e.getMessage());    
	}
	return(false);
}

public static boolean InsetEstudiante(Connection conn,String sDni,String sNombre,String sApel,String sId){
	PreparedStatement st=null;
	String sql="";
	try {
		//INSERT INTO nombre_tabla (nombre_columna1, nombre_columna2, ...) VALUES ('valor1', valor2, ...);
		sql="INSERT INTO ESTUDIANTES ";
		sql+= "(EST_DNI,EST_NOM,EST_APEL,EST_ID) VALUES ('"+sDni+"','"+sNombre+"','"+sApel+"','"+sId+"')";
		st= conn.prepareStatement(sql);  
		st.execute(); 
		st.close();
		return(true);	           
	} catch (SQLException e) { 
			Sop("Problema en la insert: "
			+"\n"+sql
			+"\n"+ e.getErrorCode() + " " + e.getMessage());    
	}
	return(false);
}
public static boolean borrarEstudiante(Connection conn, String id) {
	PreparedStatement st;
    int borrados;
    String sql = "DELETE FROM ESTUDIANTES WHERE EST_ID = '"+id+"'";
    try {
		st = conn.prepareStatement(sql);
           borrados = st.executeUpdate();
           return borrados > 0;
    } catch (SQLException e) {
		Sop("Problema al borrar: "
		+"\n"+sql +"\n"+ e.getErrorCode() + " " + e.getMessage());    
           return false;
    }
}

public static void MostrarDatosEstudiante(ResultSet rs){
	String swDni, swNom, swId, swApel;
	swDni="";swNom=""; swId="";swApel="";
	// O recibo null, o estoy ya en el registro a mostrar.
	try{
		if (rs==null) {
			Sop("Resultset nulo"); return;
		}
		//Se supone que estoy en el primer registro.
		swDni=rs.getString("EST_DNI");
		swNom=rs.getString("EST_NOM");
		swNom=Io.PADL(swNom,20);
		swApel=rs.getString("EST_APEL");
		swApel=Io.PADL(swApel,20);
		swId=rs.getString("EST_ID");
		Sop(swDni+" | "+swNom+" | "+swApel+" | "+swId);		
	} catch (SQLException exc) { 
		System.out.println("\nProblema al mostrar: "
			+"\n"+ exc.getErrorCode() + " " + exc.getMessage());    
	}
}

public static ResultSet buscarEstudiantesSql(Connection conn, String sql){
	Statement stm = null;
	ResultSet rs=null;
	try {
		stm = conn.createStatement();
        rs=stm.executeQuery(sql);
		if (!rs.next()){
			rs=null;
		}
		Sop("Encontrado!!");
	} catch (SQLException exc) { 
		System.out.println("\nProblema al buscar: "
			+"\n"+sql
			+"\n"+ exc.getErrorCode() + " " + exc.getMessage());    
	}
	// O devuelvo null o estoy en el registro.
	return(rs);
}
	
public static void consultaTablaEstudiantes(Connection conn, int totalRegistros) {
    //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante
	// Muestra hasta el total de registros que le decimos.
	// En caso de ser 0, muestra todo,
	Statement stm = null;
	ResultSet rs=null;
	String sql="SELECT * FROM ESTUDIANTES";
    String meDni,meNom,meApel,meId;
    try {
		stm = conn.createStatement();
        rs=stm.executeQuery(sql);
        System.out.println("\n TODOS LOS REGISTROS DE LA TABLA ESTUDIANTES:\n");
        int contador=0;
        while (rs.next()) {
			meDni=rs.getString("EST_DNI");
			meNom=rs.getString("EST_NOM");
			meNom=Io.PADL(meNom,20);
			meApel=rs.getString("EST_APEL");
			meApel=Io.PADL(meApel,20);
			meId=rs.getString("EST_ID");
			Sop(meDni+" | "+meNom+" | "+meApel+" | "+meId);
			contador++;
			if (contador>totalRegistros && totalRegistros!=0) break;
        }
	} catch (SQLException exc) { 
		System.out.println("\nProblema al consultar: "
			+"\n"+sql
			+"\n"+ exc.getErrorCode() + " " + exc.getMessage());    
	}
    

}
public static String consultarEstudiantesPaginado(Connection conn, int nRegPag, int nPag) {
    //Realizamos la consulta sql para mostrar todos los datos de la tabla estudiante
	//Se mostrarán estudiantes de 10 en 10 (nRegPag).
	//Los que correspondan a la página nPag
	//offSet es el desplazamiento dentro del fichero
	//limit: es el número de registros que voy a leer
	//Con + y - avanzaré una pagina. La primera pagina será la 1
	//Al pulsar ESC saldré de la consulta 
	Statement stm = null;
	ResultSet rs=null;
	int offset,contador,posicion;
	String meDni,meNom,meId,sql,swIdSeccionado;
	boolean salir=false;
    char opc;
    String [] aId=new String [nRegPag];
    swIdSeccionado=null;
	while (!salir){ // Control teclas +,-,ESC ....
	 offset = (nPag - 1) * nRegPag;
	 sql="SELECT * FROM ESTUDIANTES LIMIT "+nRegPag+ " OFFSET " +offset+ " ";
     rs=ejecutarSelect(conn,sql);
     System.out.println("\n TABLA ESTUDIANTES Pag: "+nPag);
     System.out.println("------------------------------");
     contador=0;
     try{
		while (rs.next()) {
			meDni=rs.getString("EST_DNI");
			meNom=rs.getString("EST_NOM");
			meNom=Io.PADL(meNom,20);
			meId=rs.getString("EST_ID");
			aId[contador]=meId;
			Sop(Io.PADL(contador+1+".- ",5)+ meDni+" | "+meNom+" | "+meId);
			contador++;
		}
	} catch (SQLException e) {
		System.out.println("\nProblema al ejecutar sql: \n"+sql+ " "+ 
			"\n"+e.getErrorCode() + " " + e.getMessage());    
	}
    System.out.println("\n"+" [+] Pág. Ant, [-] Pág. Ant. [ESC] Abandonar [Num] Selección");
    opc=sc.nextLine().charAt(0);
    switch (opc){
		case '+': nPag++;break;
		case '-': nPag--; if (nPag<0){ nPag=1;} break;
		case 'e':
		case 27 : salir=true; break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': posicion=Character.getNumericValue(opc)-1;
				 swIdSeccionado=aId[posicion];
				 salir=true; break;
	}
	}//fin de bucle
	return(swIdSeccionado);
}
public static ResultSet ejecutarSelect(Connection conn, String sql) {
	PreparedStatement st;
	ResultSet rs=null;
	try {
		st=conn.prepareStatement(sql);
		rs=st.executeQuery();
	} catch (SQLException e) {
		System.out.println("\nProblema al ejecutar sql: \n"+sql+ " "+ 
			"\n"+e.getErrorCode() + " " + e.getMessage());    
	}
	return(rs);
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



public static boolean borrarTablaEstudiantes(Connection conn){
	PreparedStatement comando=null;
	try {
		comando= conn.prepareStatement("DROP TABLE ESTUDIANTES");  
		comando.execute(); 
		comando.close();
		return(true);	           
	} catch (SQLException exc) { 
		System.out.println("Error en la ejecucion: " 
			+ exc.getErrorCode() + " " + exc.getMessage());    
	}
	return(false);
}




public static void Sop(String s){
	System.out.print("\n"+s);
}
}
