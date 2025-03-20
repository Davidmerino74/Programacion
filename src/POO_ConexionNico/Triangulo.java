package POO_ConexionNico;
//Clase Trianguio,
// Desarrollar una clase llamada triangulo con los atributos lado1, lado2, lado3 y sus métodos
// siguientes:
// Dos constructores: un sin parámetros que inicializa a 0 todos los lados y otro con parámetros
// asociados a dos los lados.
// Inicializar(): inicializa los lados del triangulo con valores al azar entre 1 y 100.
// Incializar ():inicializa los lados del triangulo con valores recibidos
// ImprimirLadoMayor (): visualiza un mensaje con el valor mayor de entre los tres lados
// getLadoMenor(): devuelve el valor del lado más pequeño.
// EsEquilatero(): devuelye true o false si el triangulo tiene todos los lados iguales. NO visualiza.
// getPerimetro(): devuelye el perimetro del triangulo.
// ToString(): devuelve un texto con la descripción del triangulo, sus valores y su perímetro.
// Setter y getter.
//sonIguales: recibe un Triandulo y devuelve si son iguales en términos de perimetro.(equals)
//compareTo: recibe un triangulo y devuelve 1 si es mayor,0 si son iguales y -1 si es menor.
//Constructor copia: construye un triengulo a partir de otro.
// Realizar desde otra clase un array de triángulos llamado Figuras de tamaño 15. Cargar y mostrar los
// iángulos. Crea uno llamado nuevo y comparar si hay alguno igual, indicándolo.

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    // Dos constructores: un sin parámetros que inicializa a 0 todos los lados y otro con parámetros
    // asociados a dos los lados. no sé si es a dos lados o a todos los lados

    public Triangulo(){
        this.lado1=0;
        this.lado2=0;
        this.lado3=0;       
    }
    public Triangulo (int pLado1,int pLado2,int pLado3){
        this.lado1=pLado1;
        this.lado2=pLado2;
        this.lado3=pLado3;
    }

    public int getLado1() {
        return this.lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return this.lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return this.lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }


    // Inicializar(): inicializa los lados del triangulo con valores al azar entre 1 y 100.
    public void Inicializar(){
        this.lado1=(int)(Math.random()*100)+1;
        this.lado2=(int)(Math.random()*100)+1;
        this.lado3=(int)(Math.random()*100)+1;
    }
    public void Inicializar(int pLado1,int pLado2,int pLado3){
        this.lado1=pLado1;
        this.lado2=pLado2;
        this.lado3=pLado3;
    }
    // ImprimirLadoMayor (): visualiza un mensaje con el valor mayor de entre los tres lados
    //se podría usar Math.max(num1,num2) solo admite dos numeros
    public void ImprimirLadoMayor(){
        int mayor=0;
        if (this.lado1>= this.lado2 && this.lado1>=this.lado3){
           mayor=this.lado1; 
        }else if (this.lado2>= this.lado1 && this.lado2>=this.lado3){
            mayor=this.lado2;
        }else{
            mayor=this.lado3;
        }
        System.out.println("el número mayor es :"+ mayor);
    }
    // getLadoMenor(): devuelve el valor del lado más pequeño.
    //usado como ejemplo el Math.min(num1,num2)solo admite dos números
    public int getLadoMenor(){
        int menor=Math.min(this.lado1,Math.min(this.lado2,this.lado3));
        return menor;

    }

    // EsEquilatero(): devuelye true o false si el triangulo tiene todos los lados iguales. NO visualiza.
    public boolean EsEquilatero(){
        return (this.lado1==this.lado2) && (this.lado2==this.lado3);
    }

    // getPerimetro(): devuelye el perimetro del triangulo.
    public int getPerimetro(){
        return this.lado1+this.lado2+this.lado3;
    }

    // ToString(): devuelve un texto con la descripción del triangulo, sus valores y su perímetro.
    @Override
    public String toString() {        
        return "El triangulo tiene en lado 1 :"+this.lado1 + "el lado 2 :"+this.lado2+ "el lado 3 :"+this.lado3+
        "y su perimetro es :"+getPerimetro();
    }
    
    //sonIguales: recibe un Triangulo y devuelve si son iguales en términos de perimetro.(equals)
    public boolean sonIguales(Triangulo pTriangulo){
        return this.getPerimetro()==pTriangulo.getPerimetro();
    }
    //compareTo: recibe un triangulo y devuelve 1 si es mayor,0 si son iguales y -1 si es menor.
    public int compareTo(Triangulo pTriangulo){
        if (this.getPerimetro()>pTriangulo.getPerimetro()){
            return 1;
        }else if (this.getPerimetro()==pTriangulo.getPerimetro()){
            return -1;
        }else{
            return 0;
        }
    }

    //Constructor copia: construye un triangulo a partir de otro.
    public Triangulo (Triangulo otroTriangulo){
        this.lado1=otroTriangulo.lado1;
        this.lado2=otroTriangulo.lado2;
        this.lado3=otroTriangulo.lado3;
    }
    
    // Realizar desde otra clase un array de triángulos llamado Figuras de tamaño 15. Cargar y mostrar los triángulos. Crea uno llamado nuevo y comparar si hay alguno igual, indicándolo.


}
