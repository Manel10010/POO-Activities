package exemplo_arvore_heranca;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public final void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //toString()
    @Override
    public String toString() {
        return "Dados [idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "]";
    }
}
