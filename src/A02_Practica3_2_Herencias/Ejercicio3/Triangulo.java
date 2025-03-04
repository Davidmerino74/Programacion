package A02_Practica3_2_Herencias.Ejercicio3;

public class Triangulo implements Figura{
    private int base;
    private int altura;

    public Triangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    public int getAltura() {
        return this.altura;
    }
    public int getBase() {
        return this.base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setBase(int base){
        this.base=base;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }
}
