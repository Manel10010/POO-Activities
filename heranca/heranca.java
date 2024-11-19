package heranca;

public class heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fábiana");

        System.out.println(p2.toString()); //Função toString() da classe Pessoa
        System.out.println(p3.toString()); //Funciona como um status
        System.out.println(p4.toString()); //Todos os filhos tem


        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        
    }
}

