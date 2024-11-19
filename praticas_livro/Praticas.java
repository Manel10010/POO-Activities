package praticas_livro;

public class Praticas {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3]; // Usando
        Livro[] l = new Livro[3];   // Arrays
        p[0] = new Pessoa("Carlos", 19, "Masculino");  
        p[1] = new Pessoa("Carmelia", 35, "Feminina");     
        l[0] = new Livro("A Cabana", "William P. Young", 248, p[0]);
        l[1] = new Livro("Marley & Eu", "John Grogan", 364, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        l[0].detalhes();
        System.out.println("/////////////////////////");
        l[1].abrir();
        l[1].folhear(200);
        l[1].avançarPag();
        l[1].detalhes();
    }
}

