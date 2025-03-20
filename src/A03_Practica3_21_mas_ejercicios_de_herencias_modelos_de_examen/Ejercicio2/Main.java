package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    

        //creados a mano, no los pide el ejercicio
        AtletaNatacion nat=new AtletaNatacion("david", "española", 25, "junior", 0, "libre");
        AtletaAtletismo atl=new AtletaAtletismo("jose", "francesa", 35, "senior", 10, "100m");
        AtletaGimnasia gim=new AtletaGimnasia("pepe", "italiana", 45, "juvenil", 20, "barra");
        AtletaCiclismo cic=new AtletaCiclismo("lolo", "estadounidense", 55, "senior2", 30, "ruta");

        System.out.println(nat.toString());
        System.out.println(atl.toString());
        System.out.println(gim.toString());
        System.out.println(cic.toString());



        //cuando se leen numeros antes que texto, primero lee el número y despues lee el salto de linea, se queda en el buffer , por ejemplo pongo 35 y enter, lee el 35 y se queda con el return, antes habria que hacer una limpieza de buffer con scanner.nextLine()
        Scanner scanner = new Scanner(System.in);

        //para natacion
        System.out.println("introduce tu nombre");
        String nombre=scanner.nextLine();
        System.out.println("dime tu nacionalidad");
        String nacionalidad=scanner.nextLine();
        System.out.println("dime la edad");
        int edad=scanner.nextInt();
        scanner.nextLine();
        System.out.println("cuál es tu disciplina?");
        String disciplina=scanner.nextLine();
        System.out.println("¿cuántas medallas has ganado?");
        int medallas=scanner.nextInt();
        scanner.nextLine();

        System.out.println("elige estilo principal entre libre,espalda,mariposa o pecho");
        String estilo=scanner.nextLine();

        AtletaNatacion nat1=new AtletaNatacion(nombre, nacionalidad, edad, disciplina, medallas, estilo);

        //para Atletismo
        System.out.println("introduce tu nombre");
        String nombre2=scanner.nextLine();
        System.out.println("dime tu nacionalidad");
        String nacionalidad2=scanner.nextLine();
        System.out.println("dime la edad");
        int edad2=scanner.nextInt();
        scanner.nextLine();
        System.out.println("cuál es tu disciplina?");
        String disciplina2=scanner.nextLine();
        System.out.println("¿cuántas medallas has ganado?");
        int medallas2=scanner.nextInt();
        scanner.nextLine();

        System.out.println("elige distancia preferida entre 100m,200m o maratón");
        String distancia=scanner.nextLine();
        
        AtletaNatacion atl1=new AtletaNatacion(nombre2, nacionalidad2, edad2, disciplina2, medallas2, distancia);

        //para gimnasia
        System.out.println("introduce tu nombre");
        String nombre3=scanner.nextLine();
        System.out.println("dime tu nacionalidad");
        String nacionalidad3=scanner.nextLine();
        System.out.println("dime la edad");
        int edad3=scanner.nextInt();
        scanner.nextLine();
        System.out.println("cuál es tu disciplina?");
        String disciplina3=scanner.nextLine();
        System.out.println("¿cuántas medallas has ganado?");
        int medallas3=scanner.nextInt();
        scanner.nextLine();

        System.out.println("elige tipo aparato entre barra,suelo o anillas");
        String aparato=scanner.nextLine();
        
        AtletaNatacion gim1=new AtletaNatacion(nombre3, nacionalidad3, edad3, disciplina3, medallas3, aparato);

        //para ciclismo
        System.out.println("introduce tu nombre");
        String nombre4=scanner.nextLine();
        System.out.println("dime tu nacionalidad");
        String nacionalidad4=scanner.nextLine();
        System.out.println("dime la edad");
        int edad4=scanner.nextInt();
        scanner.nextLine();
        System.out.println("cuál es tu disciplina?");
        String disciplina4=scanner.nextLine();
        System.out.println("¿cuántas medallas has ganado?");
        int medallas4=scanner.nextInt();
        scanner.nextLine();

        System.out.println("elige tipo de bici entre ruta, montaña o pista");
        String tipobici=scanner.nextLine();
        
        AtletaNatacion cil1=new AtletaNatacion(nombre4, nacionalidad4, edad4, disciplina4, medallas4, tipobici);
        scanner.close();

        System.out.println(nat1.toString());
        System.out.println(atl1.toString());
        System.out.println(gim1.toString());
        System.out.println(cil1.toString());
        

        
}
