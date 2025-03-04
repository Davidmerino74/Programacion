package A02_Practica3_2_Herencias.Ejercicio1;

public class Camion extends Vehiculo{
    private int capacidadCarga;
    private String tipoCarga;


    public Camion (String marca,String modelo,int anio,int kilometraje,int capacidadCarga, String tipoCarga){
        super(marca,modelo,anio,kilometraje);
        this.capacidadCarga=capacidadCarga;
        setTipoCarga(tipoCarga);
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

        //método
    public void mostrarInfo(){
        System.out.println("Camion: "+ 
            " Marca = "+ getMarca() +
            " Modelo ="+ getModelo() + 
            " Año = " + getAnio() +
            " Kilometraje = " + getKilometraje() +
            " Capacidad = " + getCapacidadCarga() +
            " Tipo de Carga = " + getTipoCarga()
            );
    }
    

   
    
   
}
