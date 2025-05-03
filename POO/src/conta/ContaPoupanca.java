package conta;

public class ContaPoupanca implements Conta {
    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double saque) {
        if (this.saldo < saque) {
            System.out.println("\nO saque não pode ser maior do que o saldo na sua conta.");
        } else {
            this.saldo -= saque;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return "-- Conta Poupança --\n" +
                "Saldo: " + getSaldo();
    }
}
