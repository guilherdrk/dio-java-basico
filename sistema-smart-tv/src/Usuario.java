public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smatTv = new SmartTv();
        smatTv.ligar();
        
        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.aumentarVolume();
        System.out.println("Canal atual: " + smatTv.canal);
        smatTv.mudarCanal(13);
        System.out.println("Volume atual: " + smatTv.volume);
        System.out.println("Canal atual: " + smatTv.canal);

        System.out.println("TV Ligada? " + smatTv.ligada);
        System.out.println("Canal atual: " + smatTv.canal);
        System.out.println("Volume atual: " + smatTv.volume);
    }
}
