    // Creacion de Clase
public class CuentaBancaria {
    private String NumeroCuenta;
    private double Saldo;
    private String TipoCuenta;

    //Constructores

    //Por Defecto
    public CuentaBancaria() {
        this.NumeroCuenta = "0000";
        this.Saldo = 0.0;
        this.TipoCuenta = "Por Defecto";
    }


    //Con Dos Parametros
    public CuentaBancaria(String NumeroCuenta, String TipoCuenta){
        this.NumeroCuenta = NumeroCuenta;
        this.TipoCuenta = TipoCuenta;
    }

    public CuentaBancaria(String NumeroCuenta, double Saldo, String TipoCuenta){
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.TipoCuenta = TipoCuenta;

    }


        @Override
        public String toString() {
            return "Numero De Cuenta = " + NumeroCuenta + " \nSaldo De La Cuenta = " + Saldo + "\nTipo De Cuenta = " + TipoCuenta;
        }
    }
