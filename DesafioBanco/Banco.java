package DesafioBanco;

public class Banco {
    public static void main(String[] args) {
        ClasseBanco p1 = new ClasseBanco("CC", "Cledisney", 1012);
        ClasseBanco p2 = new ClasseBanco("CP", "Jurema", 1013);
        p1.abrirConta(); // Abrindo contas pra ser capaz de...
        p2.abrirConta(); // executar Depositar() e Sacar().
        p1.Depositar(100);
        p1.Sacar(800);
        p1.fecharConta();
        p1.Sacar(150);
        p1.Depositar(12);
        p1.pagarMensal();
        p1.fecharConta();
        //p2.Depositar(500);
        //p2.Sacar(300);
        p1.status();
        //p2.status();
    }
}
