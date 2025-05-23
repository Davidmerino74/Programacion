package POO_ConexionNico.BarajaCartas;

public class Carta {
    String palo;
    int valor;
    Carta (String p, int v){
        this.palo=p;
        this.valor=v;
    }
    public String toString(){
        return (palo+" "+valor);
    }
        

}
