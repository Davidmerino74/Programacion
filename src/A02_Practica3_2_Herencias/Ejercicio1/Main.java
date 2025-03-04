package A02_Practica3_2_Herencias.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche car=new Coche("opel","f15",2005,100000,5,"100cv");
        car.mostrarInfo();
        Camion cam=new Camion("volvo","v8",1999,20000,50000,"mala");
        cam.mostrarInfo();
    }

}
