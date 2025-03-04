package A01_Ejercicios_de_Clases_2;

public class Producto {

    private double precioBase;
    private int impuesto;
    private String nombre;

    public Producto(double pPrecioBase,int pImpuesto,String pNombre){
        this.precioBase=pPrecioBase;
        this.impuesto=pImpuesto;
        this.nombre=pNombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public int getImpuesto(){
        return this.impuesto;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setPrecioBase(double pPrecioBase){
        this.precioBase=pPrecioBase;
    }
    public void setImpuesto(int pImpuesto){
        this.impuesto=pImpuesto;
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }

    public double calcularPrecioFinal(){
        double precioFinal=this.precioBase+(this.precioBase*(this.impuesto/100));
        if (precioFinal>500){
           precioFinal=precioFinal-(precioFinal*0.05);           
        }
        return precioFinal; 
    }
}
