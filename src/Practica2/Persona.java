package Practica2;

import java.util.Random;

/*ejercicio 2 de la práctica 3.1 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double peso;
    private double altura;/*lo ponemos double para el imc que se calcula con los metros, sino habría que pasar los centimetros a metros */
    /*En Java, los caracteres individuales (char) se deben rodear con comillas simples (') en lugar de comillas dobles (") */
    /*final para establecer una constante y el static es para que ese valor sea igual en todas las instancias */
    private static final String sexoPorDefecto="M";
    private static final int debajo_peso=-1;/*static final junto para variables constantes */
    private static final int peso_ideal=0;
    private static final int sobrepeso=1;

    

    //funciones nico
    public static void sop (String s){
        System.out.println(s);
    }
    // public void setNombre(String s){
    //     this.nombre=s;
    // }
    public void mostrar(){
        sop("Persona :"+this.nombre);
    }

    //constructor por defecto
    public Persona(){
        this.nombre="david";
        this.edad=0;
        this.dni=generarDni();
        this.sexo=sexoPorDefecto;
        this.peso=0.0;
        this.altura=0.0;
    }
    //constructor rápido
    public Persona(String pNombre,String pSexo,int pEdad){
        this.nombre=pNombre;
        this.sexo=comprobarSexo(pSexo);
        this.edad=pEdad;
        this.dni=generarDni();
        this.peso=0.0;
        this.altura=0.0;
    }
    //constructor con todos los atributos como parámetros
    public Persona(String pNombre,int pEdad,String pDni,String pSexo, double pPeso,double pAltura){
        this.nombre=pNombre;
        this.edad=pEdad;
        this.dni=pDni;
        this.sexo=comprobarSexo(pSexo);
        this.peso=pPeso;
        this.altura=pAltura;
    }

    //setter y getter
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String pNombre){
        this.nombre=pNombre;
    }  
    public int getEdad(){
        return this.edad;
    }  
    public void setEdad(int pEdad){
        this.edad=pEdad;
    }
    public String getDni(){
        return this.dni;
    }
    // creo que del dni no hay que hacer el set
    // public void setDni(String pDni){
    //     this.dni=pDni;
    // }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String pSexo){
        this.sexo=pSexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double pPeso){
        this.peso=pPeso;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double pAltura){
        this.altura=pAltura;
    }


    
    //métodos
    // método generaDni() de internet

    public String generarDni(){
        //int randomNum = (int) (Math.random() * 100000000);
        //revisar si es asi o 
        //return String.format("%08d",randomNum);
        Random random=new Random();
        int numero=random.nextInt(90000000)+10000000;
        int calculo=numero%23;
        String letra="";
        switch(calculo){
            case 0:letra="T";
            case 1:letra="R";
            //...hacer el resto

        }
        return numero+letra;

    }

    
    //método calcularImc() las variables se las pasamos o las coge del this.
    public int calcularImc(){
        double imc=this.peso/(this.altura*this.altura);
        if (imc<18){
            return debajo_peso;
        }else if (imc<25) {//
            return peso_ideal;
        }else{
            return sobrepeso;
        }
    }
    //método esMayorDeEdad()
    public boolean esMayorDeEdad(){
        if (this.edad>=18){
            return true;
        }else{
            return false;
        }
    }
    //método comprobarSexo()
    private String comprobarSexo(String pSexo){
        if (pSexo !="H" || pSexo !="M" || pSexo !="NB") {
            return "M";
        }else{
            return pSexo;
        }
    }

    //método toString() que devuelva toda la información del objeto, no se si incluidos los metodos,mayoredad,imc..
    @Override
    public String toString(){
        return "Persona{"+
                "nombre= "+nombre+ "\n"+
                " edad= "+edad+"\n"+
                " dni= "+dni+"\n"+
                " sexo= "+sexo+"\n"+
                " peso= "+peso+"\n"+
                " altura= "+altura+"\n"+
                " es mayor de edad= "+esMayorDeEdad()+"\n"+
                " según su imc su peso es= "+calcularImc()+"\n"+
                "}";
    }
    //replicar el método clonar
    @Override
    public Persona clone(){
        Persona pclon=new Persona(this.nombre,this.edad,this.dni,this.sexo,this.peso,this.altura);//verificar orden
        return pclon;
    }

}
