package praticas_livro;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pag);
    public abstract void avançarPag();
    public abstract void voltarPag();

}
