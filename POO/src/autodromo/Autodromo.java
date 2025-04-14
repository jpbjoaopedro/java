package autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.setChassi("1932581");
        civic.ligar();


        Moto a200 = new Moto();
        a200.setChassi("194294");
        a200.ligar();
    }
}
