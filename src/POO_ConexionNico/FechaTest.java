package POO_ConexionNico;

//import java.io.IO;

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
            
            //dia siguiente
            

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
            

            Fecha f6=new Fecha();
            f6.setNow();
            f6.next();
            int cont=0;
            while (cont<100){
                f6.mostrarFecha();
                f6.next();
                cont++;
            }

            //pasamos la fecha a un número, testeamos el metodo valueOf
            Fecha f8=new Fecha();
            f8.setNow();
            int valor;
            valor=f8.valueOf();
            f8.mostrarFecha();
            System.out.println("el valor es: "+valor);


            //probando el método sobreescrito toString
            System.out.println(f8.toString());
            System.out.println(f8);

            //probando el método toString2
            System.out.println(f8.toString2());
            System.out.println(f8);//imprimen lo mismo,ya que espera el tostring, en este caso coge el toString primero no el toString2

            //probamos el parseInt
            f8.parseInt(20260825);
            //imprimirlo para verlo bien por pantalla

            //test para fecha esFechaValida
            int d2;
            int m2;
            int a2;
            d2=10;
            m2=12;
            a2=2025;
            if (Fecha.esFechaValida(d2,m2,a2)){
                System.out.println("es fecha valida");

            }else{
                System.err.println("Noes fecha valida");
            }

            Fecha f9=new Fecha(d2,m2,a2);
            if (f9.esFechaValida()){
                System.out.println("es fecha valida");

            }else{
                System.out.println("no es fecha valida");
            }
            
        }
        

        



}
