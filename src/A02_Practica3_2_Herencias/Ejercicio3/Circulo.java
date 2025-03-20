package A02_Practica3_2_Herencias.Ejercicio3;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    public double getradio(){
        return this.radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }

    public  double calcularArea(){
        return Math.PI*radio*radio;
    }

}
    


