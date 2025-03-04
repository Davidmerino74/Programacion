package A02_Practica3_2_Herencias.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
    
        Circulo cir=new Circulo(10.5);
        Rectangulo rec=new Rectangulo(10, 2);
        Triangulo tri=new Triangulo(10, 2);

        System.out.println(cir.calcularArea());
        System.out.println(rec.calcularArea());
        System.out.println(tri.calcularArea());
        

    }
}
