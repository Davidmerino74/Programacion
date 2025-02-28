package Practica1;

public class EjerciciosConBucles {
    public static void main(String[] args) throws Exception {
        // Si no queréis que se ejecute un método (ejercicio) en concreto comentadlo usando la barra de comentar --> // 
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    // A partir de este punto empiezan los ejercicios, los nombres de cada método indican a que ejercicio pertenecen.
    // Dadle caña y no dudeis en preguntar vuestras dudas :)

    private static void ejercicio1(){
        /*
            Programa java que printee en pantalla todos los números del 0 al 100, ambos incluídos.
            
       */  
        System.out.println("Ejercicio número 1");
        
        // Vuestro código va aquí
        int i;
          for (i=0;i<=100;i++){
            System.out.println(i);
          }

        //Final del ejercicio
        System.out.println("Final del ejercicio número 1");

    }

    private static void ejercicio2(){
        /* 
            Programa java que printee en pantalla únicamente los números pares que vayan del 0 al 100, ambos incluídos. 
            Recordad que el 0 es un número par. 
        */
                    
        System.out.println("Ejercicio número 2");
        // Vuestro código va aquí
        int i;
          for (i=0;i<=100;i+=2)  {
            System.out.println(i);
          }  
        //Final del ejercicio
        System.out.println("Final del ejercicio número 2");
    }

    private static void ejercicio3(){
        /*
            Programa java que declare dos variables con un valor entero. La función de este programa es ir sumándole a la primera variable a 
            la segunda hasta que el valor de esta primera pase de 100, una vez pase de ese valor printear el valor final en la pantalla.
        */
        
        System.out.println("Ejercicio número 3");
        // Vuestro código va aquí
        int a=5;
        int b=10;
        int suma=a;
        while (suma<100){
            suma=suma+b;
        }
        System.out.println(suma);
        //Final del ejercicio
        System.out.println("Final del ejercicio número 3");
    }

    private static void ejercicio4(){
        /*
            Programa java que declare dos variables enteras, la idea para este proyecto es multiplicar el valor de la primera variable 
            por el de la segunda pero sin usar la multiplicación. Por ejemplo, si queremos hacer la operación 2 * 3 no podemos hacerla tal cual, 
            deberíamos sumar 2 en 3 ocasiones, o sea, 2 + 2 + 2.
        */
        

        // Vuestro código va aquí
        int a=5;
        int b=10;
        int resultado=0;
        
        for (int i=1;i<=b;i++){
            resultado=resultado+a;            
        }
        System.out.println(resultado);

        System.out.println("Ejercicio número 4");

        //Final del ejercicio
        System.out.println("Final del ejercicio número 4");
    }

    //Cambiar a partir de aquí

    private static void ejercicio5(){
        /*
            Programa que declare dos variables enteras, la idea de este programita es que saque el resultado de la potencia de esos dos valores introducidos 
            aunque no se puede utilizar el operador de la potencia. (Es muy parecido al ejercicio anterior).
        */
        System.out.println("Ejercicio número 5");
        // Vuestro código va aquí
        int a=2;
        int b=3;
        int resultado=0;
        for (int i=1;i<=b;i++ ){
            for(int x=1;x<=2;x++){
                resultado=resultado+a;
            }

        }

        //Final del ejercicio
        System.out.println("Final del ejercicio número 5");
    }

    private static void ejercicio6(){
        /*
            Como último ejercicio, para rizar el rizo vais declarar dos variables enteras y mezclar tanto el ejercicio 4 como el 5, o sea, 
            tenéis que conseguir el resultado de la potencia entre dos números pero sin usar ni el operador de la potencia ni el de la multiplicación, véase, 
            a base de puras sumas y bucles. 
        */

        System.out.println("Ejercicio número 6");

        // Vuestro código va aquí


        //Final del ejercicio
        System.out.println("Final del ejercicio número 6");
        
    }
}
