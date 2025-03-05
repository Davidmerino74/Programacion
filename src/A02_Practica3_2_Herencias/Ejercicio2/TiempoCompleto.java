package A02_Practica3_2_Herencias.Ejercicio2;

public class TiempoCompleto extends Empleada{
    private int bonoHoras;

    public TiempoCompleto(String nombre,String apellidos,double salario,int bonoHoras){
        super(nombre,apellidos,salario);
        this.bonoHoras=bonoHoras;
    }

    //métodos
    public int getBonoHoras(){
        return this.bonoHoras;
    }
    public void setBonoHoras(int bonoHoras){
        this.bonoHoras=bonoHoras;
    }

    @Override
    public void pagar_salario(){
        double salarioTotal=(this.salario+this.bonoHoras);
        System.out.println("Empleado :"+this.nombre+"\napellidos :"+ this.apellidos+"\nSalario Total :"+salarioTotal+" Euros" );
    }
    
}
