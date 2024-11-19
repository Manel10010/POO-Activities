package praticas_livro;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String t, String a, int tpg, Pessoa l) {
        titulo = t;
        autor = a;
        totPaginas = tpg;
        pagAtual = 0;
        aberto = false;
        leitor = l;
    }

    public void detalhes() {
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Aberto: " + this.getAberto());
        System.out.println("Leitor: " + this.getLeitor().getNome());
    }
    
    //Métodos implementados da interface
    @Override
    public void abrir() {
        if (!this.getAberto()) {
            this.setAberto(true);
        }
    }
    
    @Override
    public void fechar() {
        if (this.getAberto()) {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear(int pag) {
        if (this.getAberto()) {
            if (pag <= this.getTotPaginas()) {
                this.setPagAtual(pag);
            } else {
                this.setPagAtual(this.getTotPaginas());
            }
        }
    }

    @Override
    public void avançarPag() {
        if (this.getAberto() && this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }
    
    @Override
    public void voltarPag() {
        if (this.getAberto() && this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }

    //Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
