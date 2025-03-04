package Practica2;

import java.util.Calendar;
import java.time.LocalDateTime;

public class Fecha {
    private int d;
    private int m;
    private int a;

    // métodos
    public void setFecha(int pd,int pm,int pa){
        this.d=pd;
        this.m=pm;
        this.a=pa;
    }
    public void mostrarFecha(){
        Io.sop (this.d+"/"+this.m+"/"+this.a);
    }
    
    Fecha (){  //constructor vacío, se pueden poner valores por defecto , se podría poner this.d=1, this.m=1,this.a=1, los valores son indistintos.
        d=30;
        m=12;
        a=2026;
    }

    Fecha (int pd, int pm, int pa){
        this.d=pd;
        this.m=pm;
        this.a=pa;
    }  
    Fecha (int pa){
        this.a=pa;
        this.d=1;
        this.m=1;
    } 
    Fecha (int pm, int pa){
        this (1,pm,pa);//llama al constructor con el mismo número de parámetros y tipos, esta buscando un constructor con tres parámetros el this(,,)
    }

//este constructor recibe un objeto
    Fecha(Fecha obj){//obj nombre que le damos nosotros, recibe el constructor vacío Fecha()
        this.d=obj.d;
        this.m=obj.m;
        this.a=obj.a;

    }

    //obtener la fecha del sistema
    //Para la clase Fecha crear un método llamaso setnow que asigne la fecha actual al objeto

    public void setNow(){
        Calendar c1=Calendar.getInstance();//esto es una funcion
            this.d=c1.get(Calendar.DAY_OF_MONTH);
            this.m=c1.get(Calendar.MONTH)+1;//ojo sumar +1, ver oracle calendar para ver por que hay que poner el +1 solo en el mes
            this.a=c1.get(Calendar.YEAR);       

    }
    //igual pero con LocalDateTime
    public void setNow_con_LocalDateTime() {
    LocalDateTime now = LocalDateTime.now(); // Obtener la fecha y hora actual
        this.d=now.getDayOfMonth();
        this.m=now.getMonthValue();
        this.a=now.getYear();
    }


    //método llamado next que incrementa la fecha en un día
    public void next(){
        Calendar c2=Calendar.getInstance();
        

        this.d=c2.get(Calendar.DAY_OF_MONTH)+1;//por el día de más
        this.m=c2.get(Calendar.MONTH)+1;// por que empieza en 0 como los arrays
        this.a=c2.get(Calendar.YEAR);        
    }

    //un método es bueno cuando resuelve su misión, 
    //metodo usa atributos del objeto o de la clase


    //funcion no usa los atributos titne que ser STATIC "ES IMPORTANTISIMO"
    public static boolean esBisiesto(int anio){
        return (anio%4==0);
    }


    // este es igual pero en método
    public boolean esBisiesto(){
        return(this.a%4==4);
    }
    public int getAnio(){
        return (this.a);
    }
    public int diaMaxMes(){
        int dev=31;//por defecto se coge los que mas meses tiene 31 días
        if (this.m==4||this.m==6||this.m==9||this.m=11);
            dev=30;

    }else{
        if (this.m==2){
            dev=28;
            if (esBisiesto()){
                dev=29;
            }
        }
    }
    return(dev);


}