package POO_ConexionNico.BarajaCartas;

public class CartaTest {
    public static void main(String[] args) {
       Baraja baraja=new Baraja();
       baraja.mezclarBaraja();
       
       Carta c1=baraja.RepartirCarta();
       System.out.println("la carta es "+c1);
       baraja.mostrar(); 
    }
}
