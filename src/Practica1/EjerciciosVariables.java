package Practica1;

public class EjerciciosVariables {
     // ESTE MÉTODO NI TOCAR
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
            Programa java que realice lo siguiente: declarar una variable N de tipo int, 
            una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
            A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, 
            la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.
       */  
        System.out.println("Ejercicio número 1");

        // Vuestro código va aquí
        int N=10;
        double A=10.5;
        char C='C';
        System.out.println("El valor de N es :"+N);
        System.out.println("El valor de A es :"+A);
        System.out.println("El valor de C es :"+C);
        double suma=(N+A);
        System.out.println("El valor de N+A es :"+suma);
        double resta=(N-A);
        System.out.println("El valor de A-N es :"+resta);        
        System.out.println("el valor numérico de C es :"+(int)C);

        //Final del ejercicio
        System.out.println("Final del ejercicio número 1");

    }

    private static void ejercicio2(){
        /* 
            Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, 
            dos variables N y M de tipo double y asigna a cada una un valor. A continuación reliza 
            y muestra por pantalla una serie de operaciones entre ellas.
        */

        System.out.println("Ejercicio número 2");

        // Vuestro código va aquí
        int x=2,y=3;
        double n=2.5,m=2.3;

        System.out.println("la suma de x + y es :"+(x+y));
        System.out.println("la resta de x - y es :"+(x-y));
        System.out.println("la multiplicación  de n por m es :"+(n*m));
        System.out.println("la división de n entre m es :"+(n/m)); 


        //Final del ejercicio
        System.out.println("Final del ejercicio número 2");
    }

    private static void ejercicio3(){
        /*
            Programa Java que declare una variable entera N y asígnale un valor. A continuación escribe 
            las instrucciones que realicen lo siguiente: Incrementar N en 77, Decrementarla en 3, Duplicar su valor.
        */

        System.out.println("Ejercicio número 3");

        // Vuestro código va aquí
        int N=10;
        System.out.println("incremento en 77 en N ="+(N+77));
        System.out.println("el decremento en 3 es :"+(N-3));
        System.out.println("el doble de su valor es :"+(N*2));

        // o también
        System.out.println(N+77);
        System.out.println(N-3);
        System.out.println(N*2);


        //Final del ejercicio
        System.out.println("Final del ejercicio número 3");
    }

    private static void ejercicio4(){
        /*
            Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor acada una.
            A continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
            A tome el valor de D, D tome el valor de B. 
        */

        System.out.println("Ejercicio número 4");

        // Vuestro código va aquí
        int a=10,b=20,c=30,d=40;
        int intermedia;
        intermedia=d;
        d=b;
        b=c;
        c=a;
        a=intermedia;
        System.out.println("el valor de a es:"+a);
        System.out.println("el valor de b es:"+b);
        System.out.println("el valor de c es:"+c);
        System.out.println("el valor de d es:"+d);

        //Final del ejercicio
        System.out.println("Final del ejercicio número 4");
    }

    private static void ejercicio5(){
        /*
            Programa java que declare dos variables enteras a y b y asignales un valor a cada una. 
            A continuación printea los valores asignados a cada valor y después intercambia los valores 
            de las variables entre ellos para volver a printear los valores correspondientes.
        */

        System.out.println("Ejercicio número 5");

        // Vuestro código va aquí
        int a=10, b=20, intermedia;
        System.out.println("el valor de a es :"+a);
        System.out.println("el valor de b es :"+b);
        intermedia=a;
        a=b;
        b=intermedia;
        System.out.println("el valor de a es :"+a);
        System.out.println("el valor de b es :"+b);
        //Final del ejercicio
        System.out.println("Final del ejercicio número 5");
    }

    private static void ejercicio6(){
        /*
            Programa java que declare dos variables enteras a y b y asignales un valor a cada una. 
            A continuación printea los valores asignados a cada valor y después intercambia los valores de las variables entre ellos, 
            al nuevo valor de la variable a multiplícalo por el nuevo valor de la variable b y, después, al nuevo valor de la variable 
            b restale el nuevo valor de la variable a, el valor posterior a la multiplicación.(no entiendo esta última parte) En la terminal printea los valores intercambiados 
            y los posteriores a las operaciones.
        */

        System.out.println("Ejercicio número 6");

        // Vuestro código va aquí
        int a=10,b=20,intercambia;
        System.out.println("el valor de a es :"+a);
        System.out.println("el valor de b es :"+b);
        intercambia=a;
        a=b;
        b=intercambia;
        System.out.println("el valor de a es :"+a);
        System.out.println("el valor de b es :"+b);
        
        System.out.println("la multiplicación de las variables es :"+(a*b));
        a=a*b;
        System.out.println("la multiplicación de a :"+a);
        b=b-a;
        System.out.println("La resta es :"+b);
        System.out.println("la resta de b menos a es :"+(b-a));
        
        


        //Final del ejercicio
        System.out.println("Final del ejercicio número 6");
    }
}
