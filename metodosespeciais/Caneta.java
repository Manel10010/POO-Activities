package metodosespeciais;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampado;
    private String cor;

    public Caneta(String modelo, float ponta, String cor) { // Método construtor
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.Tampar();
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Está tampado? " + this.getTampado());
        System.out.println("Uma caneta " + this.getCor());
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPonta() {
        return this.ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }


    public boolean getTampado() {
        return this.tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void Tampar() {
        this.tampado = true;
    }

    public void Destampar() {
        this.tampado = false;
    }
}
