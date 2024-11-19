package exemplo_arvore_heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(int aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    //Métodos Especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
}
