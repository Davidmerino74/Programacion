package Practica2;


import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;



public class PersonaTest {
    public static void main (String [] arg){//arg es una variable que se le puede dar cualquier nombre
        Persona p1=new Persona();// new reserva el espacio en memoria para crear un objeto Persona, usando el constructor vacío Persona()
        p1.setNombre("juan");
        p1.mostrar();
        Persona p2=new Persona();
        p2.setNombre("maria");
        p2.mostrar();


        //Pide por teclado el nombre, la edad, sexo, peso y altura. 
        Scanner scanner=new Scanner(System.in);
        System.out.println("dime tu nombre :");
        String pnombre=scanner.nextLine();
        System.out.println("dime tu edad:");
        int pedad=scanner.nextInt();
        System.out.println("dime tu peso");
        double ppeso=scanner.nextDouble();
        System.out.println("dime tu altura");
        double paltura=scanner.nextDouble();

        
        
        scanner.close();

        //Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables 
        // pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso 
        // y la altura y el último por defecto, para este último utiliza los métodos set para darle 
        // a los atributos un valor. 

        //en el primero no se si hay que usar el vacio y luego insertar las variables y que el dniy el sexo se genere solo o meterlo nosotros a mano
        Persona personaUno=new Persona(pnombre,pedad,"30670769R","M",ppeso,paltura);
        
        Persona personaDos=new Persona();
        personaDos.setNombre(pnombre);
        personaDos.setEdad(pedad);
        
        Persona personaTres=new Persona();
        personaTres.setNombre("david");
        personaTres.setEdad(25);
        personaTres.setSexo("H");
        personaTres.setPeso(65.25);
        personaTres.setAltura(1.72);



        

        //Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje
        if (personaUno.calcularImc()<0) {
            System.out.println(personaUno.getNombre() + " esta por debajo del peso");
            
        }else if (personaUno.calcularImc()==0) {
            System.out.println(personaUno.getNombre()+ " estas en tu peso ideal");
            
        }else{
            System.out.println(personaUno.getNombre()+" tienes sobrepeso");
        }

        if (personaDos.calcularImc()<0) {
            System.out.println(personaDos.getNombre() + " esta por debajo del peso");
            
        }else if (personaDos.calcularImc()==0) {
            System.out.println(personaDos.getNombre()+ " estas en tu peso ideal");
            
        }else{
            System.out.println(personaDos.getNombre()+" tienes sobrepeso");
        }

        if (personaTres.calcularImc()<0) {
            System.out.println(personaTres.getNombre() + " esta por debajo del peso");
            
        }else if (personaTres.calcularImc()==0) {
            System.out.println(personaTres.getNombre()+ " estas en tu peso ideal");
            
        }else{
            System.out.println(personaTres.getNombre()+" tienes sobrepeso");
        }


        //Indicar para cada objeto si es mayor de edad. 
        if (personaUno.esMayorDeEdad()) {
            System.out.println(personaUno.getNombre()+ " es mayor de edad");            
        }else{
            System.out.println("no es mayor de edad");
        }

        if (personaDos.esMayorDeEdad()) {
            System.out.println(personaDos.getNombre()+ " es mayor de edad");            
        }else{
            System.out.println("no es mayor de edad");
        }

        if (personaTres.esMayorDeEdad()) {
            System.out.println(personaTres.getNombre()+ " es mayor de edad");            
        }else{
            System.out.println("no es mayor de edad");
        }

        //Por último, mostrar la información de cada objeto. 
        System.out.println(personaUno.toString());
        System.out.println(personaDos.toString());
        System.out.println(personaTres.toString());
        
        


    }
    //funciones nico
    public static void sop (String s){
        System.out.println(s);
    }
    
     //TestPersona con jonAnder
    
    Persona per1=new Persona();
    Persona per2=new Persona("cristian","H",34);
    Persona per3=new Persona("Marcos",19, "H","30670769Q",70.2,1.96);

    @Test
    public void testCalcularIMC(){
        //por debajo del peso
        Persona porDebajo=new Persona("aitor",18,"H","30670769Q",2.0,2.0);
        assertEquals(porDebajo.calcularImc(),-1);
        assertNotEquals(porDebajo.calcularImc(), 0);
                //PREGUNTAR JON ANDER no se si habrá que poner assertNotEquals(porDebajo.calcularImc(), 1);
                //SI HAY QUE PONERLO CAMBIARLO AÑADIR LO QUE FALTA EN LOS DOS SIGUIENTES
                //peso ideal
        Persona peso_ideal=new Persona("pepe",18,"H","3068076Q",65,1.75);//el imc da 21.22
        assertEquals(peso_ideal.calcularImc(),0);
        assertNotEquals(peso_ideal.calcularImc(),1);

        //sobrepeso
        Persona sobrepeso=new Persona ("juan",20,"H","30670758Q",80,1.75);//el imc da 26.12
        assertEquals(sobrepeso.calcularImc(),1);
        assertNotEquals(sobrepeso.calcularImc(), 0);

    }

    
}
    



