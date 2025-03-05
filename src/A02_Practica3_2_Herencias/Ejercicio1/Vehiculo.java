package A02_Practica3_2_Herencias.Ejercicio1;

public class Vehiculo {//NO es abstracta
    protected String marca;
    protected String modelo;
    protected int anio;
    protected int kilometraje;


    public Vehiculo(String marca,String modelo,int anio,int kilometraje){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.kilometraje=kilometraje;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAnio(){
        return this.anio;
    }
    public int getKilometraje(){
        return this.kilometraje;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
    }
    

    //métodos
    public  void mostrarInfo(){
        System.out.println("tienes un"+this.marca+" modelo"+this.modelo+" del año"+ this.anio+" y con "+this.kilometraje);
    }


   

}
