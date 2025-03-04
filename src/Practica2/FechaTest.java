package Practica2;

public class FechaTest {

        public static void main(String[] args) {
            // de manera tradicional, sin constructor
            int d,m,a;
            d=18;m=2;a=2025;
            System.out.println("hoy es " +d+"-"+m+"-"+a);

            Fecha f1=new Fecha();//el vacio
            Fecha f2=new Fecha(15,7,2024);//el completo
            Fecha f3=new Fecha(2025);//el que solo recibe el año
            Fecha f4=new Fecha(2,2025);//recibe el mes y el año
            Fecha f5=new Fecha(f1);//este constructor recibe un objeto y le da el mismo valor que f1, guardando la referencia en f5

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

            //comprobar si es bisiesto
            int anio=2025;
            //primero lo miramos usando la funcion  static boolean esBisiesto
            if (Fecha.esBisiesto(anio)){
                System.out.println("El año "+ anio+ " es bisiesto");
            }else{
                System.out.println("El año "+anio+ " NO es bisiesto");
            }

            //lo miramos ahora con el Método
            Fecha f7=new Fecha(2025);
            if (f7.esBisiesto()){
                System.out.println("el año "+f7.getAnio()+" es bisiesto");

            }else{
                System.out.println("El año "+f7.getAnio()+" NO es bisiesto");
            }

            
        }
        

        



}
