package carro;

public class Carro {
    String marca;
    String cor;
    Boolean motorEstado;

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.motorEstado = false;
    }

    public void ligarMotor() {
        this.motorEstado = true;
    }

    public void desligarMotor() {
        this.motorEstado = false;
    }

    public void mostrarAtributos() {
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Estado do motor: " + this.motorEstado + "\n");
    }
}
