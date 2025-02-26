package Practica2;

public class FechaTest {

        public static void main(String[] args) {
            // de manera tradicional, sin constructor
            int d,m,a;
            d=18;m=2;a=2025;
            System.out.println("hoy es " +d+"-"+m+"-"+a);

            Fecha f1=new Fecha();
            Fecha f2=new Fecha(15,7,2024);
            Fecha f3=new Fecha(2025);
            Fecha f4=new Fecha(2,2025);
            Fecha f5=new Fecha(f1);//este constructor recibe un objeto

            f1.mostrarFecha();
            f2.mostrarFecha();
            f3.mostrarFecha();
            f4.mostrarFecha();
            f5.mostrarFecha();

            Fecha hoy=new Fecha();
            hoy.setNow();
            hoy.mostrarFecha();

            Fecha now1= new Fecha();
            now1.setFecha(31,12,2025);
            now1.mostrarFecha();
            
            Fecha next1= new Fecha();
            next1.next();
            next1.mostrarFecha();


            
        }
        

        



}
