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


    public int getLongitud() {
        return this.longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }




    //método generarPassword, he dejado un documento llamado StringBuilder es mas practico que concatenar String
    public String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
    
        for (int i = 0; i < this.longitud; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteres.length());
            password.append(caracteres.charAt(indiceAleatorio));
        }
    
        return password.toString();
    }
    
}
