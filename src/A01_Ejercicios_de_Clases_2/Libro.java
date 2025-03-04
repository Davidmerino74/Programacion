package A01_Ejercicios_de_Clases_2;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;


    public Libro(String pTitulo,String pAutor,int pNumPaginas){
        this.titulo=pTitulo;
        this.autor=pAutor;
        this.numPaginas=pNumPaginas;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int numPaginas(){
        return this.numPaginas;
    }
    public void setTitulo(String pTitulo){
        this.titulo=pTitulo;
    }
    public void setAutor(String pAutor){
        this.autor=pAutor;
    }
    public void setNumPaginas(int pNumPaginas){
        this.numPaginas=pNumPaginas;
    }
    

    public int calcularTiempoLectura(int paginasPorHora){
        int paginasHora=this.numPaginas/paginasPorHora;
        return paginasHora;
    }
   

}
