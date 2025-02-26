package Practica2;

import java.time.LocalTime;
public class Reloj {
    /*
    Cread los siguientes atributos
     * hora.
     * minutos.
     * segundos.
     */
    /* mirar info de 
    localDateTime=import java.time.LocalDateTime;
    representa tanto una fecha como una hora. Es útil cuando necesitas manejar una combinación de ambas.
    LocalDate=import java.time.LocalDate;
    representa solo una fecha (año, mes, día) sin información de tiempo. Es útil cuando solo necesitas trabajar con la fecha.
     y LocalTime=import java.time.LocalTime;
     representa solo una hora del día (hora, minuto, segundo) sin información de fecha. Es útil cuando solo necesitas trabajar con la hora.
    */
    private int hora;
    private int minutos;
    private int segundos;
    //Método constructor, no sé cual es mejor, en el primero nosotros metemos los datos y en segundo ya los coge del LocalTime.now()
    public Reloj(int pHora,int pMinutos,int pSegundos){
        this.hora=pHora;
        this.minutos=pMinutos;
        this.segundos=pSegundos;
    }
    /* no es la hora actual del sistema desde aqui para abajo nada */
    public Reloj(){
        LocalTime tiempoActual= LocalTime.now();
        this.hora=tiempoActual.getHour();
        this.minutos=tiempoActual.getMinute();
        this.segundos=tiempoActual.getSecond();

    }
    /*desde aqui para arriba nada */

    // Getters y setters
    public int getHora(){
        return this.hora;
    }
    public void setHora(int pHora){
        this.hora=pHora;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public void setMinutos(int pMinutos){
        this.minutos=pMinutos;
    }
    public int getSegundos(){
        return this.segundos;
    }
    public void setSegundos(int pSegundos){
        this.segundos=pSegundos;
    }
    //desde aqui para abajo no mirar//
    //Los otros métodos
    // método toString que devuelve la hora actual en formato HH:mm:ss
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d",this.hora,this.minutos,this.segundos);
    }
    //desde aqui para arriba nada//
    /*Esta línea de código usa el método String.format para formatear los valores de hora, minutos y segundos en un formato específico, en este caso HH:mm:ss. Aquí hay una descomposición paso a paso de lo que hace cada parte:
    String.format: Este es un método estático de la clase String que devuelve una cadena formateada según el formato especificado y los argumentos proporcionados. En este caso, el formato es "%02d:%02d:%02d" y los argumentos son this.hora, this.minutos y this.segundos.
    "%02d:%02d:%02d": Este es el formato de la cadena. Veamos qué significa cada parte:
    %02d: Este especificador de formato indica que se va a insertar un entero (d) con al menos dos dígitos (02). Si el entero tiene menos de dos dígitos, se rellenará con ceros a la izquierda. Por ejemplo, si hora es 5, se formateará como 05.
    :: Los dos puntos son caracteres literales que se insertan entre los valores de hora, minutos y segundos.
    El patrón se repite dos veces más para minutos y segundos, respectivamente.
    this.hora, this.minutos, this.segundos: Estos son los argumentos que se pasan al método String.format. Son los valores de los atributos hora, minutos y segundos del objeto actual.
    El resultado de esta línea será una cadena en el formato HH:mm:ss donde:
    HH es la hora, con dos dígitos.
    mm son los minutos, con dos dígitos.
    ss son los segundos, con dos dígitos.
    Por ejemplo, si this.hora es 5, this.minutos es 30 y this.segundos es 9, la cadena resultante será "05:30:09". 
    El % en %02d es un especificador de formato en el método String.format de Java. Sirve para definir cómo se debe representar el valor de una variable en la cadena de salida. Vamos a descomponerlo para entenderlo mejor:

    %: Indica el inicio de un especificador de formato.
    0: Este dígito opcional indica que se deben agregar ceros a la izquierda del número si tiene menos dígitos que el ancho especificado.
    2: Especifica el ancho mínimo del número. En este caso, se asegura de que el número tenga al menos 2 dígitos. Si el número tiene menos de 2 dígitos, se completará con ceros a la izquierda.
    d: Indica que el argumento correspondiente debe ser tratado como un número entero decimal.*/

    //método toString
    public String toString2(){
        return this.hora+":"+this.minutos+":"+this.segundos;
    }
    //método: enSegundos: Método que devuelve el tiempo en ese momento en segundos. 
    public int enSegundos(){
        return this.hora*3600+this.minutos*60+this.segundos;
    }

    //método: crearHoraConSegundos: Pasandole unos segundos lo convierte en horas y minutos. Por ejemplo si le pasamos 65 segundos nos tendría que crear 1 minuto y 5 segundos. 
    public String crearHoraConSegundos(int psegundos){
        this.hora=psegundos/3600;
        psegundos=psegundos%3600;/*me quedo con el resto de la division de los segundos iniciales entre 3600 y se lo paso a los nuevos psegundos como que son el resto de lo que me queda, parecido a ejercicio de las monedas */
        this.minutos=psegundos/60;/*divido los psegundos que quedan entre 60 para sacar los minutos y el resto ya serían los segundos */
        this.segundos=psegundos%60;/*el resto de la division anterior son los segundos que quedan */
        return String.format("%02d:%02d:%02d",this.hora,this.minutos,this.segundos);

    }
    /*otra forma corregido en clase hacia abajo*/
    public String crearHorasConSegundosDos(int pSeg){
        int segundos=0;
        int min=0;
        int hora=0;
        if(pSeg>59){
            min=pSeg/60;
            segundos=pSeg%60;
            if(min>59){
                hora=min/60;
                min=min%60;
            }
        }
        return hora+":"+min+":"+segundos;

    }
    /*corregido en clase hacia arriba */
    // Método que suma un segundo
    public void sumaSegundos() {
        this.segundos++;
        if (this.segundos >= 60) {
            this.segundos = 0;
            this.minutos++;
        }
        if (this.minutos >= 60) {
            this.minutos = 0;
            this.hora++;
        }
        if (this.hora >= 24) {
            this.hora = 0;
        }
    }

    // Método que suma un minuto
    public void sumaMinutos() {
        this.minutos++;
        if (this.minutos >= 60) {
            this.minutos = 0;
            this.hora++;
        }
        if (this.hora >= 24) {
            this.hora = 0;
        }
    }

    // Método que suma una hora
    public void sumaHoras() {
        this.hora++;
        if (this.hora >= 24) {
            this.hora = 0;
        }
    }
}
 