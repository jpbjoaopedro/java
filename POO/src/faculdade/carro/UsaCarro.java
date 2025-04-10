package faculdade.carro;
public class UsaCarro {
    public void main(String[] args) {
        Carro meuCarro = new Carro("Palio", "azul");

        meuCarro.mostrarAtributos();
        meuCarro.ligarMotor();
        meuCarro.mostrarAtributos();
        meuCarro.desligarMotor();
        meuCarro.mostrarAtributos();
    }
}
