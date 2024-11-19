package exemplo_arvore_heranca;

public class exemplo_arvore_heranca {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        a1.setNome("Claudio");
        a1.setMatricula(21111923);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        b1.setNome("Jubilei");
        b1.setMatricula(21111924);
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
