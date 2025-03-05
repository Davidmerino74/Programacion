package A02_Practica3_2_Herencias.Ejercicio1;

import java.util.Scanner;

public class Coche extends Vehiculo{
    private int numeroPuertas;
    private String tamanoDelMotor;

    public Coche (String marca,String modelo,int anio,int kilometraje,int numeroPuertas, String tamanoDelMotor){
        super(marca,modelo,anio,kilometraje);
        this.numeroPuertas=numeroPuertas;
        if (tamanoDelMotor=="Pequeño"|| tamanoDelMotor=="Mediano"|| tamanoDelMotor=="Grande"){
            this.tamanoDelMotor=tamanoDelMotor;
        }else{
            this.tamanoDelMotor="Pequeño";
        }
    }

    public int getNumeroPuertas(){
        return this.numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas){
        if (numeroPuertas>0){
        this.numeroPuertas=numeroPuertas;
        }
    }
    public String getTamanoDelMotor(){
        return this.tamanoDelMotor;
    }
    public void setTamanoDelMotor(String tamanoDelMotor) {
        this.tamanoDelMotor = tamanoDelMotor;
    }
 

    // Scanner scanner = new Scanner(System.in);

    // // Utilizamos || en lugar de &&
    // while (!tamanoDelMotor.equals("pequeño") && !tamanoDelMotor.equals("mediano") && !tamanoDelMotor.equals("grande")) {
    //     System.out.println("El tamaño del motor tiene que ser: pequeño, mediano o grande");
    //     tamanoDelMotor = scanner.nextLine();
    // }
    
    // this.tamanoDelMotor = tamanoDelMotor;
    // scanner.close();    //aún quitandolo sigue mal,para mediano y granda sale bien pero para pequeño sale siempre la frase   
}



    //método
    public void mostrarInfo(){
    System.out.println("Coche: "+ 
        " Marca = "+ this.marca+
        " Modelo ="+ this.modelo + 
        " Año = " +this.anio+
        " Kilometraje = " + this.kilometraje +
        " Numero de puertas = " + this.numeroPuertas+
        " Tamaño del motor = " + this.tamanoDelMotor
        );
    }

}
