package conta;

public class ContaCorrente implements Conta {
    private double saldo;
    private double taxaOperacao = 0.20;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void sacar(double saque) {
        double conta = this.saldo - (saque + (saque * taxaOperacao));

        if (conta < 0) {
            System.out.println("\nO saque não pode ser maior do que o saldo na sua conta mais a taxa de operação.");
        } else {
            this.saldo = conta;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString() {
        return "-- Conta Corrente --" +
                "\nSaldo: " + getSaldo() +
                "\nTaxa de Operação: " + taxaOperacao +
                "\n------------------";
    }
}
