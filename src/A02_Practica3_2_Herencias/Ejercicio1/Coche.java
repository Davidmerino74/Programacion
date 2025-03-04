package A02_Practica3_2_Herencias.Ejercicio1;

import java.util.Scanner;

public class Coche extends Vehiculo{
    private int numeroPuertas;
    private String tamanoDelMotor;

    public Coche (String marca,String modelo,int anio,int kilometraje,int numeroPuertas, String tamanoDelMotor){
        super(marca,modelo,anio,kilometraje);
        this.numeroPuertas=numeroPuertas;
        setTamanoDelMotor(tamanoDelMotor);
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
    if (tamanoDelMotor.equals("pequeño")||(tamanoDelMotor.equals("mediano")||(tamanoDelMotor.equals("grande")))){
        this.tamanoDelMotor=tamanoDelMotor;
    }else{
        this.tamanoDelMotor="mediano";
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
    System.out.println("Camion: "+ 
        " Marca = "+ getMarca() +
        " Modelo ="+ getModelo() + 
        " Año = " + getAnio() +
        " Kilometraje = " + getKilometraje() +
        " Numero de puertas = " + getNumeroPuertas()+
        " Tamaño del motor = " + getTamanoDelMotor()
        );
    }

}
