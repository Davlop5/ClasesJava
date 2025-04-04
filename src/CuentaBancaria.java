public class CuentaBancaria {
    // Atributos
    private String numeroCuenta;
    private double saldo;
    private String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositando $" + monto + " en la cuenta " + numeroCuenta + ". Nuevo saldo: $" + saldo);
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes en la cuenta " + numeroCuenta + ".");
        } else {
            saldo -= monto;
            System.out.println("Retirando $" + monto + " de la cuenta " + numeroCuenta + ". Nuevo saldo: $" + saldo);
        }
    }


}
