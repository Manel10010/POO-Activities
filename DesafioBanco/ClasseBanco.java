package DesafioBanco;

public class ClasseBanco {
    public int numconta;
    protected String tipo;
    private String nome; // Nome do dono da conta
    private int saldo;
    private boolean status;

    public ClasseBanco(String tipo, String nome, int numconta) {
        this.tipo = tipo;
        this.nome = nome;
        this.numconta = numconta;
        this.status = false;

    }

    public void Depositar(int deposito) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + deposito); // Usando get e set pra pegar saldo atual e atualizar o saldo.
            System.out.println("Você depositou: R$" + deposito);
        } else {
            System.out.println("Sua conta ainda não foi aberta!");
        }
    }

    public void Sacar(int saque) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saque) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Você sacou: R$" + saque);
            } else {
                System.out.println("Saldo insuficiente!");
                System.out.println("Saldo disponível: R$" + this.getSaldo());
            }
        } else {
            System.out.println("Sua conta ainda não foi aberta!");
        }
    }

    public void fecharConta() {
        if (this.getStatus() && this.getSaldo() == 0){
            this.status = false;
        } else if (this.getSaldo() > 0) {
            System.out.println("Ainda resta saldo na sua conta, saque e somente depois a feche!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você ainda está em divida como o banco, quite sua divida e então somente depois poderá fechar a conta!");
        } else {
            System.out.println("A conta já está fechada!");
        }
    }

    public void abrirConta() {
        if (!this.getStatus()) {
            this.status = true;
            if (this.getTipo() == "CC" || this.getTipo() == "cc") { // Contas correntes recebem R$50.00
                this.setSaldo(50);
            }
    
            if (this.getTipo() == "CP" || this.getTipo() == "cp") { // Contas poupança recebem R$150.00
                this.setSaldo(150);
            }
        } else {
            System.out.println("A conta já está aberta!");
        }
    }

    public void pagarMensal() {
        if (this.getStatus()) {
            if (this.getTipo() == "CC" || this.getTipo() == "cc") { // Contas correntes pagam R$12.00
                this.setSaldo(this.getSaldo() - 12);
            } else if (this.getTipo() == "CP" || this.getTipo() == "cp") { // Contas poupança pagam R$20.00
                this.setSaldo(this.getSaldo() - 20);
            }
        } else {
            System.out.println("Sua está fechada!");
        }
    }

    public void status() {
        System.out.println("Nome do Dono: " + this.getNome());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Saldo atual: R$" + this.getSaldo());
        System.out.println("Nº da conta: " + this.getNumConta());
        System.out.println("Status da conta: " + this.getStatus());
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumConta() {
        return this.numconta;
    }

    public void setNumConta(int numconta) {
        this.numconta = numconta;
    }
}
