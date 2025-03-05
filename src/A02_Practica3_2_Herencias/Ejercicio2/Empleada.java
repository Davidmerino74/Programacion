package A02_Practica3_2_Herencias.Ejercicio2;

public abstract class Empleada {
    protected String nombre;
    protected String apellidos;
    protected double salario;
    protected static final int salarioxHora=10;

    
    
    public Empleada(String nombre,String apellidos,double salario){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.salario=salario;
    }
    public Empleada(String nombre,String apellidos){
        //con esta instrucción llamamos al constructor de tres parámetros y le pasamos el salario a cero, ya que corresponde al empleado a tiempo parcial cuyo sueldo parte de cero
        this(nombre,apellidos,0);
    }
    //métodos
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public double getSalario(){
        return this.salario;
    }
    //no se pone el this.salarioxHora y hay que poner el static
    public static int getSalarioxHora(){
        return salarioxHora;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    
    public abstract void pagar_salario();
}
