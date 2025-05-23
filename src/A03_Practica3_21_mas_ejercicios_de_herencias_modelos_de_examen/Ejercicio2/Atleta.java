package A03_Practica3_21_mas_ejercicios_de_herencias_modelos_de_examen.Ejercicio2;

public  abstract class Atleta {//creo que no hay que poner abstract ya que no heredan ningún método los hijos
    protected String nombre;
    protected String nacionalidad;
    protected int edad;
    protected String disciplina;
    protected int medallasGanadas;
    //no se si estos atributos se pueden poner mejor en los métodos directamente
    protected int medallaOro;
    protected int medallaPlata;
    protected int medallaBronce;
    protected double mejormarca;

    public Atleta(String nombre,String nacionalidad,int edad,String disciplina,int medallasGanadas,double mejormarca){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        this.edad=edad;
        this.disciplina=disciplina;
        this.medallasGanadas=medallasGanadas;
        this.medallaOro=0;//puesto como que empiezan todos con cero medallas
        this.medallaPlata=0;
        this.medallaBronce=0;
        this.mejormarca=mejormarca;
    }


    public String getNombre(){
        return this.nombre;        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad=nacionalidad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;
    }
    public int getMedallasGanadas(){
        return this.medallasGanadas;
    }
    public void setMedallasGanadas(int medallasGanadas) {
        this.medallasGanadas = medallasGanadas;
    }
    public int getMedallaOro(){
        return this.medallaOro;
    }
    public void setMedallaOro(int medallaOro){
        this.medallaOro=medallaOro;
    }
    public int getMedallaPlata(){
        return this.medallaPlata;
    }
    public void setMedallaPlata(int medallaPlata) {
        this.medallaPlata = medallaPlata;
    }
    public int getMedallaBronce() {
        return medallaBronce;
    }
    public void setMedallaBronce(int medallaBronce) {
        this.medallaBronce = medallaBronce;
    }
    public double getMejormarca() {
        return mejormarca;
    }
    public void setMejormarca(double mejormarca) {
        this.mejormarca = mejormarca;
    }


    public void ganarMedalla(String tipo){
        if (tipo.equals("Oro")){
            this.medallaOro++;
            this.medallasGanadas++;
        }else if (tipo.equals("Plata")) {
            this.medallaPlata++;
            this.medallasGanadas++;
        }else if (tipo.equals("Bronce")) {
            this.medallaBronce++;
            this.medallasGanadas++;
        }else{
            System.out.println("el tipo de medalla solo puede ser Oro,Plata o Bronce");
        }        
    }
    public abstract void mejorarMarca(double marca);// ojo con las marcas tienen que ser distintos para un corredor la mejor marca en menor pero en la de gimnasia la mejor marca es superior por lo que no 
     
    //no se si es cambiar a alguna de las disciplinas que ya hay como natacion, tletismo, gimnasia,ciclismo, he puesto una generica dentro de la suya ya que las otras tienen atributos que la suya no tiene.
    public void cambiarDisciplina(String disciplinanueva){
        if (!disciplinanueva.equals(this.disciplina)){
            this.disciplina=disciplinanueva;
        }
    }




}
