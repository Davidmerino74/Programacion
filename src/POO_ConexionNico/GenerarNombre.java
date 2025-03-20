package POO_ConexionNico;

public class GenerarNombre {
    public static String[] aNombres={"Andrea","david"};

    public static String generarNombre(){
        int longi=aNombres.length;
        int iAzar=(int)(Math.random()*longi);
        String nombre=aNombres[iAzar];
        return (nombre)

    }
    
}

