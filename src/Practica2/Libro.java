package Practica2;



public class Libro {

    //Aquí tenéis que crear el método constructor con los siguientes atributos:
    /*
     * titulo: El título del libro en formato String.
     * fecha_publ: El año de publicación del libro en formato Integer.
     * autor: El autor o autora del libro.
     * numPaginas: El número de páginas.
     * genero: El género del libro.
     * sinopsis: La sinopsis del libro.
     */
    private String titulo;
    private int fecha_publ;
    private Autora autor;
    private int numPaginas;
    private Genero genero;
    private String sinopsis;
    // Método constructor
    public Libro (String pTitulo, int pFecha_publ, Autora pAutor, int pNumPaginas, Genero pGenero,String pSinopsis){
        this.titulo=pTitulo;
        this.fecha_publ=pFecha_publ;
        this.autor=pAutor;
        this.numPaginas=pNumPaginas;
        this.genero=pGenero;
        this.sinopsis=pSinopsis;        
    }
    //Getters y setters
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String pTitulo){
        this.titulo=pTitulo;
    }
    public int getFecha_publ(){
        return this.fecha_publ;
    }
    public void setFecha_publ(int pFecha_publ){
        this.fecha_publ=pFecha_publ;
    }
    public Autora getAutor(){
        return this.autor;
    }
    public void setAutor(Autora pAutor){
        this.autor=pAutor;
    }
    public int getNumPaginas(){
        return this.numPaginas;   
    }
    public void setNumPaginas(int pNumPaginas){
        this.numPaginas=pNumPaginas;
    }
    public Genero getGenero(){
        return this.genero;
    }
    public void setGenero(Genero pGenero){
        this.genero=pGenero;
    }
    public String getSinopsis(){
        return this.sinopsis;
    }
    public void setSinopsis(String pSinopsis){
        this.sinopsis=pSinopsis;
    }
    
}
