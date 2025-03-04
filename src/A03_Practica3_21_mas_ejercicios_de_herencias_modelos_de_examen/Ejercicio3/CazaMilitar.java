package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

public class CazaMilitar extends Aeronave{
    private String tipoArmamento;
    private int velocidadAscenso;

    public CazaMilitar(String fabricante,String modelo,int capacidadPasajeros,int autonomiaVuelo,int velocidad,String tipoArmamento,int velocidadAscenso){
        super(fabricante,modelo,capacidadPasajeros,autonomiaVuelo,velocidad);
        this.tipoArmamento=tipoArmamento;
        this.velocidadAscenso=velocidadAscenso;
    }


    public String getTipoArmamento() {
        return this.tipoArmamento;
    }

    public void setTipoArmamento(String tipoArmamento) {
        this.tipoArmamento = tipoArmamento;
    }

    public int getVelocidadAscenso() {
        return this.velocidadAscenso;
    }

    public void setVelocidadAscenso(int velocidadAscenso) {
        this.velocidadAscenso = velocidadAscenso;
    }

}
