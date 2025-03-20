package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

import java.util.Scanner;

public class mainpruebaswitch {
    public static void main(String[] args) {
        AtletaNatacion t=new AtletaNatacion("david", "española", 25, "junior", 0, "libre");
        AtletaAtletismo l=new AtletaAtletismo("jose", "francesa", 35, "senior", 10, "100m");
        AtletaGimnasia gim=new AtletaGimnasia("pepe", "italiana", 45, "juvenil", 20, "barra");
        AtletaCiclismo c=new AtletaCiclismo("lolo", "estadounidense", 55, "senior2", 30, "ruta");

        System.out.println(t.toString());
        System.out.println(l.toString());
        System.out.println(gim.toString());
        System.out.println(c.toString());

        // prueba del switch
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("elige una opción :");
        int  opcion=scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println(t.toString());                
                break;
            case 2:
            System.out.println(c.toString());                
            break;        
            default:
            System.out.println("eleccion Incorrecta");
            
        }
        scanner.close();
    }
}
