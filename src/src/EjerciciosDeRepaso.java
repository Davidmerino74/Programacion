package src;

public class EjerciciosDeRepaso {
    public static void main(String[] args) throws Exception {

        System.out.println("inicio ejercicio 1");
        /*
         * 1 pedir al usuario dos números, uno entero y otro real y mostrar su producto.
         * al no saber como recoger el número solo se pide
         */
        System.out.println("dame un número");
        int numuno = 10;
        System.out.println("dame un número con decimales");
        double numdos = 10.5;
        double producto = numuno * numdos;
        System.out.println("la multiplicación de los dos números es : " + producto);

        System.out.println("   fin ejercicio 1");

        System.out.println("inicio ejercicio 2");
        /* 2 Calcular el área de un círculo cuyo radio se le preguntará al usuario. */
        double pi = 3.1416;
        int radio = 10;
        double area = pi * (radio*radio);
        System.out.println("el área del círculo es:" + area);

        /*otra forma */
        /*double area =Math.PI*(radio^2);
        System.out.println(area);*/

        System.out.println("   fin ejercicio 2");

        System.out.println("inicio ejercicio 3");
        /*
         * 3 Pedir al usuario los coeficientes (a, b, c) de un polinomio de segundo
         * grado y mostrar las dos raíces.
         */
        int a = 5, b = 10, c = 15;
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        /*
         * si es positivo hay dos resultados si es 0 hay uno y si es negativo no hay
         * solución
         */
        if (discriminante > 0) {
            double raizdiscriminante = Math.sqrt(discriminante);
            double x1 = (-b + raizdiscriminante) / (2 * a);
            double x2 = (-b - raizdiscriminante) / (2 * a);
            System.out.println("las soluciones son x1=" + x1 + " y x2=" + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("la solución es x=" + x);

        } else {
            System.out.println("No hay solución real debido a que el discriminante es negativo");
        }
        System.out.println("   fin ejercicio 3");

        System.out.println("inicio ejercicio 4");
        /*
         * 4 Preguntar al usuario su nombre (texto) y su edad (valor entero) y mostrar
         * por pantalla un texto del estilo del siguiente: Te llamas Lucía y tienes 19
         * años.
         */

        String nombre = "David";
        int edad = 50;
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");

        System.out.println("   fin ejercicio 4");

        System.out.println("inicio ejercicio 5");
        /*
         * 5 Preguntar una cantidad en euros e indicar la cantidad de monedas de cada
         * tipo que se necesitarán para entregar esa cantidad. Se utilizarán las monedas
         * de mayor valor posible.
         */

        double dinero = 237.88;
        /*el (int) (dinero*100) es parsearlo */
        int centimos = (int) (dinero * 100);
        int moneda =  (centimos / 200);
        System.out.println("monedas de dos Euros: " + moneda);
        centimos = centimos - (moneda * 200);
        moneda = (centimos / 100);
        System.err.println("monedas de 1 Euro: " + moneda);
        centimos = centimos - (moneda * 100);
        moneda = (centimos / 50);
        System.out.println("monedas de 50 cts: " + moneda);
        centimos = centimos - (moneda * 50);
        moneda = (centimos / 20);
        System.out.println("monedas de 20 cts " + moneda);
        centimos = centimos - (moneda * 20);
        moneda = (centimos / 10);
        System.out.println("monedas de 10 cts " + moneda);
        centimos = centimos - (moneda * 10);
        moneda = (centimos / 5);
        System.out.println("monedas de 5 cts " + moneda);
        centimos = centimos - (moneda * 5);
        moneda = (centimos / 2);
        System.out.println("monedas de 2 cts " + moneda);
        centimos = centimos - (moneda * 2);
        System.out.println("monedas de 1 cts " + moneda);
    
        System.out.println("   fin ejercicio 5");

        System.out.println("CONDICIONALES inicio ejercicio 1");
        //Pedir un número entero al usuario e indicar si es par o impar.
        int numtres=5;
        if (numtres%2==0){
            System.out.println("el número es par");
        }else{
            System.out.println("el número es impar");
        }

        System.out.println("CONDICIONALES    fin ejercicio 1");       

        System.out.println("CONDICIONALES inicio ejercicio 2");
        //Preguntar a un usuario cuántos años tiene y, si es mayor de edad, preguntarle si tiene carné de conducir.
        int edaddos=19;
        if (edaddos>=18){
            System.out.println("¿tienes carnet de conducir?");
        }
         // si ponemos menos de 18 no le preguntamos nada   

        System.out.println("CONDICIONALES    fin ejercicio 2");

        System.out.println("CONDICIONALES inicio ejercicio 3");
        //Pedir al usuario tres valores enteros y mostrar el menor de ellos.
        int aa=3;
        int bb=5;
        int cc=1;
        int menor;
        if (aa<=bb && aa<=cc){
            menor=aa;
        }else if(bb<=aa && bb<=cc){
            menor=bb;
        }else{
            menor=cc;
        }
        System.out.println("el número menor es: "+ menor);


        System.out.println("CONDICIONALES    fin ejercicio 3");

        System.out.println("CONDICIONALES inicio ejercicio 4");
        //Pedir tres números reales al usuario y mostrar el menor o el mayor, según decida.(se va a indicar el menor y el mayor)
        int num1=7;
        int num2=9;
        int num3=5;
        int menos,mas;
        if (num1>=num2 && num1>=num3){
            mas=num1;
            if (num2>=num3){
                menos=num3;
            }else{
                menos=num2;
            }
        }else if (num2>=num1 && num2>=num3){
            mas=num2;
            if (num1>=num3){
                menos=num3;
            }else{
                menos=num1;
            }
        }else{
            mas=num3;
            if (num2>=num1){
                menos=num1;            
            }else {
                menos=num2;
            }    
        }
        System.out.println(("el número menor es : "+ menos +" y el mayor :"+mas));






        System.out.println("CONDICIONALES    fin ejercicio 4");

        System.out.println("CONDICIONALES inicio ejercicio 5");
        /*Escribir un programa que pida un número real de precisión sencilla y haga muestre los siguientes resultados:
        Si el número es menor que 50, mostrará su cuadrado.
        Si el número es igual a 25, 30 ó 75, mostrará su raíz cúbica.
        Si el número vale 10 ó es mayor que 100 ó está en los intervalos [3,8]
        o [77, 90], mostrará el valor dividido por 10.
        Encualquier otro caso, mostrará el número leído.*/
        double real=100;
        int otrocaso=0;
        if (real<50){
            double cuadrado=Math.pow(real,2);
            System.out.println("su cuadrado es : "+cuadrado);
            otrocaso++;
        }
        if (real==25 || real==30 || real==75){
            double raiz=Math.cbrt(real);
            System.out.println("la raíz cúbica es :"+raiz);
            otrocaso++;
        }
        if ((real==10) || (real>100) || (real>=3 && real<=8) || (real>=77 && real<=90)) {
            double division=real/10;
            System.out.println("la división entre 10 es : "+division);
            otrocaso++;
            
        }
        if (otrocaso==0){
            System.err.println("El número introducido es : "+real);
        }


        System.out.println("CONDICIONALES    fin ejercicio 5");

        System.out.println("CONDICIONALES inicio ejercicio ");        
        System.out.println("CONDICIONALES    fin ejercicio ");

    }
}
