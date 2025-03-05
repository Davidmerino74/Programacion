package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

public  class Aeronave {
    protected String fabricante;
    protected String modelo;
    protected int capacidadPasajeros;
    protected int autonomiaVuelo;
    protected int velocidad;

    public Aeronave(String fabricante,String modelo,int capacidadPasajeros,int autonomiaVuelo,int velocidad){
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.capacidadPasajeros=capacidadPasajeros;
        this.autonomiaVuelo=autonomiaVuelo;
        this.velocidad=velocidad;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAutonomiaVuelo() {
        return this.autonomiaVuelo;
    }

    public void setAutonomiaVuelo(int autonomiaVuelo) {
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public double calcularTiempovuelo(int distancia){

        return (double)distancia/this.velocidad;
    }
    //al repostar he aumentado los km de la automomia en 1000
    public void repostarCombustible(){
        this.autonomiaVuelo=this.autonomiaVuelo+1000;
    }
    public void actualizarModelo(String nuevoModelo){
        this.modelo=nuevoModelo;
    }

}
