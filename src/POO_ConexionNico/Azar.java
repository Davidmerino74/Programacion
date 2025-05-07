public class Azar{
static String[] aNombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Bartolo",
				"Bartolomé", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
static String[] aApellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };				
//FUNCIONES FUNCIONES FUNCIONES
public static int aleatorio(int min, int max){
	int dev=(int)(Math.random()*(max-min+1))+min;
	return(dev);
}
public static double aleatorio(double min, double max){
	double dev=(Math.random()*(max-min+1))+min;
	
	return(dev);
	//return(Math.round(dev/100d));
}
public static char aleatorio(String letras){
	int longi=letras.length();
	char letra=letras.charAt(aleatorio(0,longi-1));
	return(letra);
}

//static String[] aNombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Bartolo",
//				"Bartolomé", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
//				"Caritina", "Carlota", "Baltazar"};
public static String generarNombre(){
	int longi=aNombres.length;
	int iAzar=(int)(Math.random()*longi);
	String nombre=aNombres[iAzar];
	return (nombre);
}

public static String getNombre(){
	return (generarNombre());
}
public static String generarApellido(){
	int longi=aApellidos.length;
	
	int iAzar=(int)(Math.random()*longi);
	return(aApellidos[iAzar]);
}
public static String generarNombreApellido(){
	return(generarNombre()+" "+generarApellido());
}

public static String[] generarNombresAleatorios(int cantidad) {
	String[] nombresAleatorios = new String[cantidad];
	for (int i = 0; i < cantidad; i++) {
			nombresAleatorios[i] = generarNombreApellido();
	}
	return nombresAleatorios;
}
public static void imprimir(String[] nombresGenerados) {
	for (int i = 0; i < nombresGenerados.length; i++) {
		System.out.print("\n"+i+ " "+nombresGenerados[i]);
	}
}
public static String generarDni(){
	int max=99999999;
	int min=10000000;
	int num=(int)(Math.random()*(max-min+1))+min;
	char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 
                               'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	char letra=letras[num % 23];
	return (""+num+letra);
}

 public static String generarLetras(int numLetras) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String dev = "";
        int azar;
        for (int i = 0; i < numLetras; i++) {
            azar =(int)(Math.random()*caracteres.length());
            dev=dev+caracteres.charAt(azar);
        }
        return dev;
    }
}//fin de la clase

