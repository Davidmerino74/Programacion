package A02_Practica3_2_Herencias.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TiempoCompleto tc=new TiempoCompleto("david", "merino sanz",2000,235);
        tc.pagar_salario();

        System.out.println();
        TiempoParcial tp=new TiempoParcial("jose","luis",10);
        tp.pagar_salario();
        
    }
}
