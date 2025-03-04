package A01_Ejercicios_de_Clases_2;

public class Vehiculo {
    private String marca;
    private int rendimiento;
    private int capacidadTanque;

    public Vehiculo(String pMarca,int pRendimiento,int pCapacidadTanque){
        this.marca=pMarca;
        this.rendimiento=pRendimiento;
        this.capacidadTanque=pCapacidadTanque;
    }

    public String getMarca(){
        return this.marca;
    }
    public int getRendimiento(){
        return this.rendimiento;
    }
    public int getCapacidadTanque(){
        return this.capacidadTanque;
    }
    public void setMarca(String pMarca){
        this.marca=pMarca;
    }
    public void setRendimiento(int pRendimiento){
        this.rendimiento=pRendimiento;
    }
    public void setCapacidadTanque(int pCapacidadTanque){
        this.capacidadTanque=pCapacidadTanque;
    }

    public double calcularAutomomia(){
        double autonomia=capacidadTanque/rendimiento;
        return autonomia;
    }

}
