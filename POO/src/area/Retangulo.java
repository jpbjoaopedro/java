package area;

public class Retangulo implements AreaCalculavel {
    private int lado;
    private int altura;

    public Retangulo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double calculaArea() {
        return lado * altura;
    }

    public String toString() {
        return "-- Retângulo --" +
                "\nLado: " + this.lado +
                "\nAltura: " + this.altura +
                "\nÁrea: " + calculaArea();
    }

}