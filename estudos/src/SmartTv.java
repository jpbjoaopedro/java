public class SmartTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada? " + smartTv.mudarEstado(true));
        System.out.println("Volume atual: " + smartTv.aumentarVolume(50));
        System.out.println("Canal atual: " + smartTv.aumentarCanal(1));
        System.out.println("Canal atual: " + smartTv.diminuirCanal(1)); 
    }
    
    public boolean mudarEstado(boolean estado) {
        boolean estadoFinal = !estado;
        return estadoFinal;
    }

    public int aumentarVolume(int volume) {
        return volume + 1;
    }

    public int diminuirVolume(int volume) {
        return volume - 1;
    }
    
    public int aumentarCanal(int canal) {
        return canal + 1;
    }

    public int diminuirCanal(int canal) {
        return canal - 1;
    }
}
