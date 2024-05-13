

public class SmartTV {
    public boolean ligada;
    public int canal;
    public int volume;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV Desligada");

    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);

    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal:"+ canal);
    }

    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(10);
        tv.desligar();
        
    }
}


