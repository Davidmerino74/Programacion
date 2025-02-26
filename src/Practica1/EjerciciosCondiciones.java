package Practica1;

public class EjerciciosCondiciones {
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
            Programa Java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra 
            un mensaje indicando si A es par o impar. Utiliza el operador condicional ( ? : ) dentro del println 
            para resolverlo.
        */

        System.out.println("Ejercicio número 1");

        // Vuestro código va aquí
        int a=10;
        System.out.println("el valor de a es : "+a +" y es "+(a%2==0?"par":"impar"));


        //Final del ejercicio
        System.out.println("Final del ejercicio número 1");
    }

    private static void ejercicio2(){
        /* 
            Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación muestra un 
            mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 0 como positivo. 
            Utiliza el operador condicional (? : ) dentro del println para resolverlo.
        */

        System.out.println("Ejercicio número 2");

        // Vuestro código va aquí
        int b=10;
        System.out.println("el valor de b es : "+b +" por lo que es "+(b>-1?"positivo":"negativo"));

        //Final del ejercicio
        System.out.println("Final del ejercicio número 2");
    }

    private static void ejercicio3(){
        /*
            Programa Java que declare una variable C de tipo entero y asígnale un valor. A continuación muestra un 
            mensaje indicando si el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5, si 
            es múltiplo de 10 y si es mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador 
            condicional ( ? : ) dentro del println para resolverlo. 
        */

        System.out.println("Ejercicio número 3");

        // Vuestro código va aquí
        int c=10;
        System.out.println("el número es : "+c +"  es "+(c>-1?"positivo,":"negativo,")+(c%2==0?" es par,":" es impar,")+(c%5==0?" es multiplo de 5,":" no es multiplo de 5,")+ (c%10==0?" es multiplo de 10,":" no es multiplo de 10,")+(c>100?" es mayor que 100,":" es menor que 100"));



        //Final del ejercicio
        System.out.println("Final del ejercicio número 3");
    }

    private static void ejercicio4(){
        /*
            Programa java que declare una variable numérica de 8 cifras. La idea de este programa es calcular la letra del DNI 
            asociada a esos ocho números, para ello vais a tener que seguir el pequeño tutorial de la siguiente página: 
            https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

            Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante la siguiente tabla:

            RESTO	0	1	2	3	4	5	6	7	8	9	10	11
            LETRA	T	R	W	A	G	M	Y	F	P	D	X	B
            

            RESTO	12	13	14	15	16	17	18	19	20	21	22
            LETRA	N	J	Z	S	Q	V	H	L	C	K	E
        */

        System.out.println("Ejercicio número 4");

        // Vuestro código va aquí
        int dni=30670769, resto=dni%23;
        System.out.println("la letra del dni 30670769 es : "+
        (resto==0?"t":
        (resto==1?"r":
        (resto==2?"w":
        (resto==3?"a":
        (resto==4?"g":
        (resto==5?"m":
        (resto==6?"y":
        (resto==7?"f":
        (resto==8?"p":
        (resto==9?"d":
        (resto==10?"x":
        (resto==11?"b":
        (resto==12?"n":
        (resto==13?"j":
        (resto==14?"z":
        (resto==15?"s":
        (resto==16?"q":
        (resto==17?"v":
        (resto==18?"h":
        (resto==19?"l":
        (resto==20?"c":
        (resto==21?"k":"e")))))))))))))))))))))));
        // hecho con el  switch
        int  resto2=dni%23;
        switch (resto2) {
            case 0:
                System.out.println("t");
                break;
            case 1:
                System.out.println("r");
                break;
            case 2:
                System.out.println("w");
                break;
            case 3:
                System.out.println("a");
                break;
            case 4:
                System.out.println("g");
                break;
            case 5:
                System.out.println("m");
                break;
            case 6:
                System.out.println("y");
                break;
            case 7:
                System.out.println("f");
                break;
            case 8:
                System.out.println("p");
                break;
            case 9:
                System.out.println("d");
                break;
            case 10:
                System.out.println("x");
                break;
            case 11:
                System.out.println("b");
                break;
            case 12:
                System.out.println("n");
                break;
            case 13:
                System.out.println("j");
                break;
            case 14:
                System.out.println("z");
                break;
            case 15:
                System.out.println("s");
                break;
            case 16:
                System.out.println("q");
                break;
            case 17:
                System.out.println("v");
                break;
            case 18:
                System.out.println("h");
                break;
            case 19:
                System.out.println("l");
                break;
            case 20:
                System.out.println("c");
                break;
            case 21:
                System.out.println("k");
                break;
            case 22:
                System.out.println("e");
                break;
            default:
                System.out.println("número introducido erróneo");
        }

        //Final del ejercicio
        System.out.println("Final del ejercicio número 4");
    }

    private static void ejercicio5(){
        /*
            Programa java que declare una variable entera y asignale un valor que vaya del 1 al 10. A continuación desarrolla un programa 
            que printee ese número pero con palabras, por ejemplo si le asignas el valor número 7 el programa debería printear Siete.
        */

        System.out.println("Ejercicio número 5");

        // Vuestro código va aquí
        int num=10;
        System.out.println("el número es el : "+
        (num==1?"uno":
        (num==2?"dos":
        (num==3?"tres":
        (num==4?"cuatro":
        (num==5?"cinco":
        (num==6?"seis":
        (num==7?"siete":
        (num==8?"ocho":
        (num==9?"nueve":"diez"))))))))));
        // hecho con el swicht
        int num2=10;
        switch (num2) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("número introducido incorrecto");
        }
        
        //Final del ejercicio
        System.out.println("Final del ejercicio número 5");
    }

    private static void ejercicio6(){
        /*
            Programa java que declare dos variables de tipo entero y asignales un valor. A continuación indica vía println si
            el primer número es mayor, menor o los dos números son iguales. 
        */

        System.out.println("Ejercicio número 6");

        // Vuestro código va aquí
        int a=10,b=10;
        System.out.println("el número "+a +(a>b?" es mayor ":(a<b?" es menor":" es igual a b que tiene un valor de "+b)));



        //Final del ejercicio
        System.out.println("Final del ejercicio número 6");
    }
}
