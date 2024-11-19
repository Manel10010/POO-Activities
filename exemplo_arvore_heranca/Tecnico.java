package exemplo_arvore_heranca;

public class Tecnico extends Aluno{
    private int registroProfissional;

    public void praticar() {

    }

    //Métodos Especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
