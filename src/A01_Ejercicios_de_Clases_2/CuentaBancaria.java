package A01_Ejercicios_de_Clases_2;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int numeroCuenta;
    private int retirosDelDia;
    private static final int limiteRetiro=3;

    public CuentaBancaria (String pTitular,Double pSaldo, int pNumeroCuenta,int pRetirosDelDia){
        this.titular=pTitular;
        this.saldo=pSaldo;
        this.numeroCuenta=pNumeroCuenta;
        this.retirosDelDia=pRetirosDelDia;
    }
    public CuentaBancaria(){
        this.titular="";
        this.saldo=0.0;
        this.numeroCuenta=0;
        this.retirosDelDia=0;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String pTitular){
        this.titular=pTitular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double pSaldo){
        this.saldo=pSaldo;
    }
    public int getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void setNumeroCuenta(int pNumeroCuenta){
        this.numeroCuenta=pNumeroCuenta;
    }
    public int getRetirosDeldia(){
        return this.retirosDelDia;
    }
    public void setRetidosDelDia(int pRetirosDelDia){
        this.retirosDelDia=pRetirosDelDia;
    }


    public void depositar(double cantidad){
        this.saldo=this.saldo+cantidad;
    }

    public double retirar (double cantidad){
        if (this.retirosDelDia<limiteRetiro) {
            if (this.saldo>=cantidad) {
                this.saldo=this.saldo-cantidad;
                return cantidad;
            }
            System.out.println("no hay dinero");
            return 0.0;            
        }else{
            System.out.println("Max de retiros alcanzado");
            return 0.0;
        }
    }

}
