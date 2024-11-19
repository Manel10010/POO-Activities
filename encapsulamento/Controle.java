package encapsulamento;

public class Controle implements interfaceControle{
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public Controle() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }
    
    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("Ligado: " + getLigado());
        System.out.println("Tocando: " + getTocando());
        String vol = "";
        for(int i = 10; i <= getVolume(); i+=10) {
            vol += "|";
        }
        System.out.println(String.format("Volume: %d %s".formatted(getVolume(), vol))); //%s para String, %d Inteiros e %f Reais.
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    public void maisVolume() {
        if(getLigado()) {
            setVolume(getVolume() + 1);
        }
    }

    public void menosVolume() {
        if(getLigado()) {
            setVolume(getVolume() - 1);
        }
    }

    public void ligarMudo() {
        if(getLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    public void desligarMudo() {
        if(getLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    public void play() {
        if(getLigado() && !getTocando()) {
            setTocando(true);
        }
    }

    public void pause() {
        if(getLigado() && getTocando()) {
            setTocando(false);
        }
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    private boolean getLigado() {
        return this.ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    private boolean getTocando() {
        return this.tocando;
    }
}
