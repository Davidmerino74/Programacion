package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        //AvionComercial
        System.out.println("dime el fabricante :");
        String fabricante=scanner.nextLine();
        System.out.println("dime el modelo");
        String modelo=scanner.nextLine();
        System.out.println("capacidad de pasajeros :");
        int capacidadPasajeros=scanner.nextInt();
        System.out.println("autonomia de vuelo en km");
        int autonomiaVuelo=scanner.nextInt();
        System.out.println("velocidad máxima en km/h");
        int velocidad=scanner.nextInt();

        System.out.println("numero de la aerolinea");
        int numeroAerolinea=scanner.nextInt();
        scanner.nextLine();
        System.out.println("en que clase viaja: turista,business o primera clase");
        String clase=scanner.nextLine();

        AvionComercial com=new AvionComercial(fabricante, modelo, capacidadPasajeros, autonomiaVuelo, velocidad, numeroAerolinea, clase);
        



        //AvionCarga
        System.out.println("dime el fabricante :");
        String fabricante2=scanner.nextLine();
        System.out.println("dime el modelo");
        String modelo2=scanner.nextLine();
        System.out.println("capacidad de pasajeros :");
        int capacidadPasajeros2=scanner.nextInt();
        System.out.println("autonomia de vuelo en km");
        int autonomiaVuelo2=scanner.nextInt();
        System.out.println("velocidad máxima en km/h");
        int velocidad2=scanner.nextInt();

        System.out.println("capacidad de carga en capacidadCargaToneladas :");
        int capacidadCargaToneladas=scanner.nextInt();
        scanner.nextLine();//para limpiar el buffer después de introducir un número y si viene un String
        System.out.println("tipo de mercancia principal :");
        String tipoMercanciaPrincipal=scanner.nextLine();

        AvionCarga car=new AvionCarga(fabricante2, modelo2, capacidadPasajeros2, autonomiaVuelo2, velocidad2, capacidadCargaToneladas, tipoMercanciaPrincipal);

        
        //CazaMilitar
        System.out.println("dime el fabricante :");
        String fabricante3=scanner.nextLine();
        System.out.println("dime el modelo");
        String modelo3=scanner.nextLine();
        System.out.println("capacidad de pasajeros :");
        int capacidadPasajeros3=scanner.nextInt();
        System.out.println("autonomia de vuelo en km");
        int autonomiaVuelo3=scanner.nextInt();
        System.out.println("velocidad máxima en km/h");
        int velocidad3=scanner.nextInt();
        scanner.nextLine();//para limpiar el buffer

        System.out.println("tipo de armamento principal");
        String tipoArmamentoPrimcipal=scanner.nextLine();
        System.out.println("velocidad de ascenso en metros por segundo");
        int velocidadAscenso=scanner.nextInt();

        CazaMilitar caz=new CazaMilitar(fabricante3, modelo3, capacidadPasajeros3, autonomiaVuelo3, velocidad3, tipoArmamentoPrimcipal, velocidadAscenso);

        //Helicoptero
        System.out.println("dime el fabricante :");
        String fabricante4=scanner.nextLine();
        System.out.println("dime el modelo");
        String modelo4=scanner.nextLine();
        System.out.println("capacidad de pasajeros :");
        int capacidadPasajeros4=scanner.nextInt();
        System.out.println("autonomia de vuelo en km");
        int autonomiaVuelo4=scanner.nextInt();
        System.out.println("velocidad máxima en km/h");
        int velocidad4=scanner.nextInt();
        scanner.nextLine();//para limpiar el buffer

        System.out.println("número de rotores");
        int getNumeroRotores=scanner.nextInt();
        scanner.nextLine();//para limpiar el buffer
        System.out.println("que uso tiene, civil o militar");
        String usoCivil_Militar=scanner.nextLine();

        Helicoptero hel=new Helicoptero(fabricante4, modelo4, capacidadPasajeros4, autonomiaVuelo4, velocidad4, getNumeroRotores, usoCivil_Militar);
        
        System.out.println(com.calcularTiempovuelo(2000));
        com.repostarCombustible();
        com.actualizarModelo("Avión Supreme");

        System.out.println(car.calcularTiempovuelo(2000));
        car.repostarCombustible();
        car.actualizarModelo("Avión Carga Supreme");

        System.out.println(caz.calcularTiempovuelo(2000));
        caz.repostarCombustible();
        caz.actualizarModelo("Avión de Caza Supreme");

        System.out.println(hel.calcularTiempovuelo(2000));
        hel.repostarCombustible();
        hel.actualizarModelo("Helicoptero Supreme");



        scanner.close();
    }
}
