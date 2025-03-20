package A01_Ejercicios_de_Clases_2;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private int aniosTrabajados;

    public Empleado(String nombre,double salarioBase,int aniosTrabajados){
        this.nombre=nombre;
        this.salarioBase=salarioBase;
        this.aniosTrabajados=aniosTrabajados;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAniosTrabajados() {
        return this.aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public  double calcularBono(){
        double salarioconbono=salarioBase;
        if (aniosTrabajados>10){
            salarioconbono=salarioBase+1000;

        }
        if (aniosTrabajados>2){
            salarioconbono=this.aniosTrabajados*(salarioBase+(salarioBase*5/100))+salarioconbono;//el calculo creo que esta mal por cada año un 5%
        }
        return salarioconbono;
    }
}
