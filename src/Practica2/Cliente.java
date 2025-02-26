package Practica2;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    /*
    Cread los siguientes atributos
     * nombre: Nombre del cliente.
     * apellidos: Apellidos del cliente.
     * dni: Número del DNI.
     * email: Dirección email.
     * fecha_nacimiento: La fecha de nacimiento del cliente.
     * libros: Un array de libros comprados por ese cliente.
     */
    private String nombre;
    private String apellidos;
    private int dni;
    private String email;
    private Date fecha_nacimiento;
    private ArrayList<Libro>listaLibros;
    //Método constructor
    public Cliente (String nombre,String apellidos, int dni,String email, Date fecha_nacimiento, ArrayList<Libro> listaLibros){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.email=email;
        this.fecha_nacimiento=fecha_nacimiento;
        this.listaLibros=listaLibros;
    }

    // Getters y setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setApellidos(String pApellidos){
        this.apellidos=pApellidos;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int pDni){
        this.dni=pDni;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String pEmail){
        this.email=pEmail;
    }
    public Date getFecha_nacimiento(){
        return this.fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date pFecha_nacimiento){
        this.fecha_nacimiento=pFecha_nacimiento;
    }
    public ArrayList<Libro> getListaLibros(){
        return this.listaLibros;
    }
    public void setListaLibros(ArrayList<Libro> pListaLibros){
        this.listaLibros=pListaLibros;
    }
    
}
