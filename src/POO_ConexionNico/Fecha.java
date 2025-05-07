import java.util.Calendar;

public class Fecha{
	// atributos
	private static final String[] mesesLetra = {"", "Enero", "Febrero", "Marzo", 
		"abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", 
		"noviembre", "diciembre" };
	public static final String [] diasLetra={"Lunes","Martes","Miercoles",
		"Jueves", "Viernes","Sabado","Domingo"};
	private int d,m,a;
	// métodos
	public String formatoLargo() {      
		return ( d + " de " + mesesLetra[m] + " de " + a );
	}
	//public int getD(return(d));
	//public int getM(return(m));
	//public int getA(return(a));
	public String toString(){
		String dev="";
		if (this.d<10){
			dev=dev+"0";
		}
		dev=dev+this.d;
		dev=dev+"-"+this.m;
		dev=dev+"-"+this.a;
		return(dev);
	}

	public int valueOf(){
		return(a*10000+m*100+d);
	}
	// Función
	public static boolean esFechaValida(int d, int m,int a){
		if (d>diaMaxMes(m,a)||d<1 ) {return (false);}
		if (m>12||m<1) {return (false);}
		return(true);
	}
	
	public boolean esFechaValida(){
	  if (this.d>this.diaMaxMes()||this.d<1 ) {return (false);}
	  if (this.m>12||this.m<1) {return (false);}
	  return(true);
	}
	public boolean equals (Fecha obj){
	return(this.d==obj.d && this.m==obj.m &&a==obj.a);
	}
	
	public void parseInt(int valor){
		//Valor debe ser formato AAAMMDD
		int _d, _m , _a;
		_d=valor%100;
		_a=valor/10000;
		_m=(valor%10000)/100;
		this.d=_d;this.m=_m;this.a=_a;
	}
	
	
	public int diaDelAnio(){
		//Obtener el día del año
		Fecha ftemp= new Fecha();
		ftemp.setFecha(1,1,this.getAnio());
		int conta=1;
		while (ftemp.valueOf()!= this.valueOf()){
			ftemp.next();
			conta++;
		}
		return (conta);
	}
	public void setFecha(int _d, int _m, int _a){
		d=_d; m=_m; a=_a;
	}
	public void mostrarFecha(){
	  System.out.println("Hoy es: "+this.d+"-"+this.m+"-"+this.a);
	  //Io.Sop("Hoy es: "+this.d+"-"+this.m+"-"+this.a);
	}
	//Constructores
	Fecha(){ 
		this.d=1;this.m=1;this.a=1; 
	}
	Fecha(int _d,int _m, int _a){
		d=_d; m=_m; a=_a;
	}
	Fecha (int a){
			this(1,1,a);
	}
	Fecha (int m, int a){	
		this(1,m,a);
	}
	Fecha(Fecha obj){
		this.d=obj.d; this.m=obj.m; this.a=obj.a;
	}
	public void setNow(){
		Calendar c1= Calendar.getInstance();
		this.d= c1.get(Calendar.DAY_OF_MONTH);
		this.m= c1.get(Calendar.MONTH)+1;// OJo sumar +1 
		this.a=c1.get(Calendar.YEAR);
	}
	public int getAnio(){	return (this.a); }

	//Funciones 
	public static boolean esBisiesto(int anio){
	 return(anio%4==0);
	}
	public boolean esBisiesto(){ return (this.a%4==0); 	}
	public int diaMaxMes(){
	int dev=31;
	if (this.m==4||this.m==6||this.m==9||this.m==11) {
		dev=30;
	}else{
		if (this.m==2){
			dev=28;
			if (this.esBisiesto()) {	dev=29;	}
		}
	}
	return(dev);
	}
	public void next(){
		d=d+1;  //atributo día
		if (d>this.diaMaxMes()){
			d=1; m=m+1;
			if (m>12) {
				m=1; a++;
			}
		}
	}	
	public static int diaMaxMes(int mes,int anio){
	int dev=31;
	if (mes==4||mes==6||mes==9||mes==11) {dev=30;}
	if (mes==2){
		dev=28;
		if (esBisiesto(anio)) {dev=29;}
	}
	return(dev);
	}
}// fin de clase Fecha






















