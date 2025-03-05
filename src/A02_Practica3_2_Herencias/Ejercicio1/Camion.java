package A02_Practica3_2_Herencias.Ejercicio1;

public class Camion extends Vehiculo{
    private int capacidadCarga;
    private String tipoCarga;


    public Camion (String marca,String modelo,int anio,int kilometraje,int capacidadCarga, String tipoCarga){
        super(marca,modelo,anio,kilometraje);
        this.capacidadCarga=capacidadCarga;
        if (tipoCarga=="liviana"||tipoCarga=="media"||tipoCarga=="pesada"){
            this.tipoCarga=tipoCarga;
        }else{
            this.tipoCarga="liviana";
        }
    }


    public int getCapacidadCarga() {
        return this.capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        if (capacidadCarga>0){
            this.capacidadCarga = capacidadCarga;
        }else{
            System.out.println("la capacidad de carga tiene que ser superior a cero");
        }
        
    }

    public String getTipoCarga() {
        return this.tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        if (tipoCarga.equals("liviana")||tipoCarga.equals("media")||tipoCarga.equals("pesada")){
            this.tipoCarga = tipoCarga;
        }else{
            System.out.println("tipo de carga incorrecto, datos validos: liviana,media o pesada, ponemos media por defecto");
            this.tipoCarga="media";
        }
    }

        //método preguntar profesor puso this.marca marca error
    public void mostrarInfo(){
        System.out.println("Camion: "+ 
            " Marca = "+ this.marca +
            " Modelo ="+ this.modelo+ 
            " Año = " + this.anio+
            " Kilometraje = " + this.kilometraje+
            " Capacidad = " + this.capacidadCarga+
            " Tipo de Carga = " + this.tipoCarga
            );
    }
}
