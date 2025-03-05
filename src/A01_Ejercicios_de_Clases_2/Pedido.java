package A01_Ejercicios_de_Clases_2;

public class Pedido {
    private String cliente;
    private String producto;
    private double precio;
    private String estado;


    public Pedido(String pCliente,String pProducto,double pPrecio,String pEstado){
        this.cliente=pCliente;
        this.producto=pProducto;
        this.precio=pPrecio;
        if(pEstado !="Pendiente"&& pEstado!="Pagado"&& pEstado!="Enviado"){
            this.estado="Pendiente";
        }else{
            this.estado=pEstado;
        }

        
    }

    public String getCliente(){
        return this.cliente;
    }
    public String getProducto(){
        return this.producto;
    }
    public double getPrecio(){
        return this.precio;
    }
    public String getEstado(){
        return this.estado;
    }

    public void setCliente(String pCliente){
        this.cliente=pCliente;
    }
    public void setProducto(String pProducto){
        this.producto=pProducto;
    }
    public void setPrecio(double pPrecio){
        this.precio=pPrecio;
    }
   
    //no he puesto método set y lo centralizo con este otro
    //método set modificado
    public void actualizarEstado(String nuevoEstado){
        if (this.estado.equals("Pendiente") && nuevoEstado.equals("Pagado")){
            this.estado=nuevoEstado;
        }else if (this.estado.equals("Pagado") && nuevoEstado.equals("Enviado")){
            this.estado=nuevoEstado;
        }else {
            System.out.println("el nuevo estado no esta permitido");
        }            
        
    }
}
