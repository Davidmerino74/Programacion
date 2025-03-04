package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    

    //Doctor
    System.out.println("dime tu nombre");
    String nombre1=scanner.nextLine();
    System.out.println("dime tu edad");
    int edad1=scanner.nextInt();
    System.out.println("dime tu id");
    int id1=scanner.nextInt();
    scanner.nextLine();
    System.out.println("turno de trabajo entre mañana, tarde, noche");
    String turno1=scanner.nextLine();
    System.out.println("años de experiencia");
    int aniosExperiencia1=scanner.nextInt();
    scanner.nextLine();

    System.out.println("especialidad médica");
    String especialidad=scanner.nextLine();
    System.out.println("pacientes atendidos");
    int pacientesAtendidos=scanner.nextInt();
    scanner.nextLine();
    
    Doctor doc=new Doctor(nombre1, edad1, id1, turno1, aniosExperiencia1, especialidad, pacientesAtendidos);
    doc.atenderPaciente();
    doc.cambiarTurno("tarde");
    doc.ascenderPuesto();

    //Enfermero
    System.out.println("dime tu nombre");
    String nombre2=scanner.nextLine();
    System.out.println("dime tu edad");
    int edad2=scanner.nextInt();
    System.out.println("dime tu id");
    int id2=scanner.nextInt();
    scanner.nextLine();
    System.out.println("turno de trabajo entre mañana, tarde, noche");
    String turno2=scanner.nextLine();
    System.out.println("años de experiencia");
    int aniosExperiencia2=scanner.nextInt();
    scanner.nextLine();

    System.out.println("area asignada entre urgencias,pediatría y quirófano");
    String areaAsignada=scanner.nextLine();
    System.out.println("cantidad de pacientes bajo su cuidado");
    int cantPacientesAtendidos=scanner.nextInt();
    scanner.nextLine();

    Enfermero enf=new Enfermero(nombre2, edad2, id2, turno2, aniosExperiencia2, areaAsignada, cantPacientesAtendidos);

    enf.atenderPaciente();
    enf.cambiarTurno("noche");
    enf.ascenderPuesto();

    //Cirujado
    System.out.println("dime tu nombre");
    String nombre3=scanner.nextLine();
    System.out.println("dime tu edad");
    int edad3=scanner.nextInt();
    System.out.println("dime tu id");
    int id3=scanner.nextInt();
    scanner.nextLine();
    System.out.println("turno de trabajo entre mañana, tarde, noche");
    String turno3=scanner.nextLine();
    System.out.println("años de experiencia");
    int aniosExperiencia3=scanner.nextInt();
    scanner.nextLine();

    System.out.println("cantidad de cirugías realizadas");
    int cantCirujiasRealizadas=scanner.nextInt();
    scanner.nextLine();
    System.out.println("tipo de cigurias que puede realizar");
    String tipoCirugias=scanner.nextLine();

    Cirujano cir=new Cirujano(nombre3, edad3, id3, turno3, aniosExperiencia3, cantCirujiasRealizadas, tipoCirugias);

    cir.atenderPaciente();
    cir.cambiarTurno("mañana");
    cir.ascenderPuesto();


    //Administrativo
    System.out.println("dime tu nombre");
    String nombre4=scanner.nextLine();
    System.out.println("dime tu edad");
    int edad4=scanner.nextInt();
    System.out.println("dime tu id");
    int id4=scanner.nextInt();
    scanner.nextLine();
    System.out.println("turno de trabajo entre mañana, tarde, noche");
    String turno4=scanner.nextLine();
    System.out.println("años de experiencia");
    int aniosExperiencia4=scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("departamento en el que trabajas");
    String departamento=scanner.nextLine();
    System.out.println("tienes acceso a datos confidenciales");
    boolean accesoDatosConfidenciales=scanner.nextBoolean();

    Administrativo adm=new Administrativo(nombre4, edad4, id4, turno4, aniosExperiencia4, departamento, accesoDatosConfidenciales);

    adm.atenderPaciente();
    adm.cambiarTurno("tarde");
    adm.ascenderPuesto();



    scanner.close(); 
    }
}
