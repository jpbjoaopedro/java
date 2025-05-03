package area;

public class Principal {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        System.out.println(quadrado.toString());

        Retangulo retangulo = new Retangulo(2, 3);
        System.out.println(retangulo.toString());
    }
}
