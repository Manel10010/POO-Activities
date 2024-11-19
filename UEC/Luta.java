package UEC;

import java.util.Random;

public class Luta {
    private Lutador desafiado; // Tipo abstrato, instância da classe Lutador()
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.marcarLuta(desafiado, desafiante);
        this.rounds = rounds;
    }
    
    //Métodos
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // Método Especiais
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.categoria.equals(desafiante.categoria) && desafiado != desafiante) { // == compara o slot de memória, ja .equals() compara os atributos da classe em sí
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);

        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() { //Usando sintaxe proposta pelo HICARO!
        if (!this.getAprovada()) {
            System.out.println("Impossível acontecer a luta!");
            return;
        }
        System.out.println("# DESAFIADO #");
        this.desafiado.apresentar();
        System.out.println("# DESAFIANTE #");
        this.desafiante.apresentar();
        //Criando uma instância Random()  
        Random vencedor = new Random();
        int resultado = vencedor.nextInt(0, 3); // Gerando número aleatório
        if (resultado == 0) { // Vitoria do desafiado
            System.out.println("Vencedor: " + this.desafiado.getNome());
            this.desafiado.setVitorias(this.desafiado.getVitorias() + 1); // Vencedor
            this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1); // Perdedor
        } else if (resultado == 1) { // Vitoria do desafiante
            System.out.println("Vencedor: " + this.desafiante.getNome());
            this.desafiante.setVitorias(this.desafiante.getVitorias() + 1); // Vencedor
            this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);   // Perdedor
        } else if (resultado == 2) { // Empate  
            System.out.println("Empate!");
            this.desafiado.setEmpates(this.desafiado.getEmpates() + 1); // Empate
            this.desafiante.setEmpates(this.desafiante.getEmpates() + 1); // Empate
        }
    }
}
