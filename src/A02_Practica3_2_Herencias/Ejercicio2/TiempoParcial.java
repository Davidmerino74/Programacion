package A02_Practica3_2_Herencias.Ejercicio2;

public class TiempoParcial extends Empleada{
    private double horasTrabajadas;

    public TiempoParcial(String nombre,String apellidos,double horastrabajadas){
        super(nombre,apellidos);
        this.horasTrabajadas=horastrabajadas;
    }

    public double getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas){
        this.horasTrabajadas=horasTrabajadas;
    }
    @Override
    public void pagar_salario(){
        double salarioTotal=salarioxHora*this.horasTrabajadas;
        System.out.println("Empleado :"+this.nombre+"\napellidos :"+ this.apellidos+"\nSalario Total :"+salarioTotal+" Euros" );
    }






}
