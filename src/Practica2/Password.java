package Practica2;

public class Password {
    private int longitud;
    private String contrasena;

    //constructor vacío
    public Password(){
        this.longitud=8;
        this.contrasena=generarPassword();
    }

    //constructor con parámetro longitud
    public Password(int pLongitud){
        this.longitud=pLongitud;
        this.contrasena=generarPassword();
    }

    //constructor con el parámetro contraseña
    public Password(String pContrasena){
        this.contrasena=pContrasena;
        this.longitud=pContrasena.length();
    }

    //método generarPassword
    public String generarPassword(){
        String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i=0;i<this.longitud;i++){
            
        }
    }
}
