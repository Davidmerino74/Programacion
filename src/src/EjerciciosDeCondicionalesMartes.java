public class EjerciciosDeCondicionalesMartes {
    public static void main(String[] args) throws Exception {

        System.out.println("inicio ejercicio 1");
        /*
         * Realiza un programa que reciba dos números por teclado e indique cuál es
         * mayor o si son iguales.
         */
        int num1 = 31;
        int num2 = 31;
        if (num1 > num2) {
            System.out.println("el número mayor es el " + num1);
        } else if (num1 < num2) {
            System.out.println("el número mayor es el " + num2);
        } else {
            System.out.println("los dos números son iguales");
        }
        System.out.println("   fin ejercicio 1");

        System.out.println("inicio ejercicio 2");
        /*
         * Crea un programa que pida al usuario dos números y muestre el resultado de su
         * división. Si el segundo número es 0, debe mostrar un mensaje de error.
         */
        double numa = 10;
        double numb = 3;
        if (numb == 0) {
            System.out.println("el segundo número es cero");
        } else {
            double div = numa / numb;
            System.out.println("el resultado de la división es " + div);

        }
        System.out.println("   fin ejercicio 2");

        System.out.println("inicio ejercicio 3");
        /*
         * Realiza un programa que clasifique un triángulo tras recibir el tamaño de sus lados. Se debe clasificar como triángulo rectángulo, isósceles, equilátero o escaleno.
         */
        int a=3;
        int b=4;
        int c=8;
        /* se pueden comparar las tres a la vez así if (a==b==c){*/
        if ((a+b<=c)||(a+c<=b)||(b+c<=a)){
            System.out.println("No se puede hacer un triángulo con las medidas que has proporcionado");
        }else if (a==b && b==c){
            System.out.println("Triángulo Equilatero");
        }else if (a!=b && a!=c && b!=c){
            System.out.println("Triángulo Escaleno");
        }else if (a==b || a==c || b==c){
            System.out.println("Triángulo Isósceles");
        }else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                  Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || 
                  Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)){
            System.out.println("Triángulo Rectángulo");
        }else{
            System.out.println("Los datos introducidos no son válidos");
        }
        System.out.println("   fin ejercicio 3");

        System.out.println("inicio ejercicio 4");
        /* Escribe un programa que reciba un año y nos diga si es bisiesto o no. */
        int anio=1987;
        if (anio%4==0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
        System.out.println("   fin ejercicio 4");

        System.out.println("inicio ejercicio 5");
        /*
         * Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
         */
        int dia=8;
        switch (dia) {
            case 1:
                System.out.println("Es lunes");                
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miércoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sábado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.err.println("El número introducido no esta entre el 1 y el 7");
                break;
        }
        System.out.println("   fin ejercicio 5");

        System.out.println("inicio ejercicio 6");
        /*
         * Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
         */
        int mes=13;

        /* con el switch  se podria poner case 1,3,5,7,8,10,12; */
        if (mes==2){
            System.out.println("Tiene 28 días");
        }else if (mes==1 || mes==3 || mes==5 || mes ==7 || mes==8 ||mes==10 ||mes==12){
            System.out.println("Tiene 31 días");
        }else if (mes==2 || mes==4 || mes==6 || mes==9 || mes==11){
            System.out.println("Tiene 30 días");
        }else{
            System.out.println("no has indicado un número entre 1 y 12");
        }

        System.out.println("   fin ejercicio 6");

        System.out.println("inicio ejercicio 7");
        /*
         * Dado3númerosenteros, mostrar en consola los números de forma ascendente, de
         * menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50.
         */
        
        int aa=7;
        int bb=5;
        int cc=3;
        int mayor, medio, menor;
        if (aa>=bb && aa>=cc){
            mayor=aa;
            if (bb>=cc){
                medio=bb;
                menor=cc;
            }else{
                medio=cc;
                menor=bb;

            }
        }else if(bb>=aa && bb>=cc){
            mayor=bb;
            if (aa>=cc){
                medio=aa;
                menor=cc;
            }else{
                medio=cc;
                menor=aa;
            }
        }else{
            mayor=cc;
            if (bb>=aa){
                medio=bb;
                menor=aa;
            }else{
                medio=aa;
                menor=bb;
            }
        }
        System.out.println("Lo números ordenados son :"+menor+","+medio+","+mayor);




        System.out.println("   fin ejercicio 7");

        System.out.println("inicio ejercicio 8");
        /*
         * Dadounnúmeroentero imprimir en consola el valor correspondiente en la tabla del 9. Ejemplo Entrada = 3 Salida = 27.
         */
        int numdado=10;
        int resultado=numdado*9;
        System.err.println(resultado);
        System.out.println("   fin ejercicio 8");

        System.out.println("inicio ejercicio 9");
        /*
         * Realizar el ejercicio en el que se ingrese 4 notas del alumno, mostrar el promedio de las 4 notas e indicar si está APROBADO caso contrario NO APROBADO.
         */
        double nota1=5.3;
        double nota2=5.5;
        double nota3=8;
        double nota4=7;
        double medianota=(nota1+nota2+nota3+nota4)/4;
        System.err.println("La nota media es :"+medianota);
        if (medianota>=5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspendido");
        }
        System.out.println("   fin ejercicio 9");

        System.out.println("inicio ejercicio ");
        System.out.println("   fin ejercicio ");

        System.out.println("inicio ejercicio ");
        System.out.println("   fin ejercicio ");
    }
   
}
