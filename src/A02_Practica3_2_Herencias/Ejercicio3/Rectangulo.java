package A02_Practica3_2_Herencias.Ejercicio3;

public class Rectangulo extends Figura{
    private int ancho;
    private int alto;


    public Rectangulo(int ancho,int alto){
        this.ancho=ancho;
        this.alto=alto;
    }

    public int getAncho(){
        return this.ancho;
    }
    public int getAlto(){
        return this.alto;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }

   
    public  double calcularArea(){
        return this.ancho*this.alto;
    }
}
