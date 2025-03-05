package A01_Ejercicios_de_Clases_2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int rendimiento;//mejor que sean double
    private int capacidadTanque;

    public Vehiculo(String pMarca, String pModelo,int pRendimiento,int pCapacidadTanque){
        this.marca=pMarca;
        this.modelo=pModelo;
        this.rendimiento=pRendimiento;
        this.capacidadTanque=pCapacidadTanque;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo() {
        return modelo;
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
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setRendimiento(int pRendimiento){
        this.rendimiento=pRendimiento;
    }
    public void setCapacidadTanque(int pCapacidadTanque){
        this.capacidadTanque=pCapacidadTanque;
    }

    public double calcularAutomomia(){
        double autonomia=this.capacidadTanque/this.rendimiento;
        return autonomia;
    }

}
