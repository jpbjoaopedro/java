package area;

public class Quadrado implements AreaCalculavel {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calculaArea() {
        return lado * lado;
    }

    public String toString() {
        return "-- Quadrado -- " +
                "\nLado: " + this.lado +
                "\nÁrea: " + calculaArea();
    }
}