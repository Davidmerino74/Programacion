package POO_ConexionNico.BarajaCartas;

public class Baraja {
    Carta[] aBaraja;
    int iBaraja;
    Baraja(){
        int p,valor;
        aBaraja=new Carta[40];
        for(p=0,valor=1;p<10;p++,valor++){
            aBaraja[p]=new Carta("Bastos",valor);
        }
        for(p=10,valor=1;p<20;p++,valor++){
            aBaraja[p]=new Carta("Espadas",valor);
        }
        for(p=20,valor=1;p<30;p++,valor++){
            aBaraja[p]=new Carta("Copas",valor);
        }
        for(p=30,valor=1;p<40;p++,valor++){
            aBaraja[p]=new Carta("Oros",valor);
        }
        iBaraja=40;
    }

    public void mostrar(){
        for(int p=0; p<iBaraja;p++){
            System.out.println(aBaraja[p]);
        }
        System.out.print("\nSon: "+iBaraja+" cartas");
    }

    public void mezclarBaraja(){
        int pivote;
        Carta temp;
        int azar;

        

        for(pivote=0;pivote<iBaraja;pivote++){
            azar=(int)(Math.random()*iBaraja);
            temp=aBaraja[pivote];
            aBaraja[pivote]=aBaraja[azar];
            aBaraja[azar]=temp;
        }
        System.out.println("Mezcladas!!");
    }

    public Carta RepartirCarta(){
        if(iBaraja==0) return null;
        Carta dev;
        dev=aBaraja[iBaraja-1];
        iBaraja--;
        return (dev);
    }

}

