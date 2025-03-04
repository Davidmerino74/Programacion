package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dime nombre jugador lol :");
        String nombrelol=scanner.nextLine();
        JugadorLol jugadorlol=new JugadorLol(nombrelol,"española","equipoA",10,100,1,"categoriaerronea");
        jugadorlol.ganarTorneo(5);
        jugadorlol.subirNivel();

        System.out.print("Ingrese nombre del jugador de CSGO: ");
        String nombreCSGO = scanner.nextLine();
        JugadorCSGO jugadorCSGO = new JugadorCSGO(nombreCSGO, "fracesa", "equipob", 11, 200, 2,90 );
        jugadorCSGO.ganarTorneo(6);
        jugadorCSGO.subirNivel();

        System.out.print("Ingrese nombre del jugador de FIFA: ");
        String nombreFIFA = scanner.nextLine();
        JugadorFIFA jugadorFIFA = new JugadorFIFA(nombreFIFA, "italiana", "equipoC", 12, 300, 3, 30);
        jugadorFIFA.ganarTorneo(7);
        jugadorFIFA.subirNivel();

        System.out.print("Ingrese nombre del jugador de Valorant: ");
        String nombreValorant = scanner.nextLine();
        JugadorValorant jugadorValorant = new JugadorValorant(nombreValorant, "china", "equidoD", 13, 400, 4, "Agente Secreto");
        jugadorValorant.ganarTorneo(8);
        jugadorValorant.subirNivel();



        
        scanner.close();
        
    }
        
}
