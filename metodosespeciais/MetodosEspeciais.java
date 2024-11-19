package metodosespeciais;

public class MetodosEspeciais {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic cristal", 0.5f, "Azul");
        Caneta c2 = new Caneta("Nick", 0.7f, "Preta");
        ////////////////////////////////////////
        c1.setCor("Amarela"); // Utilizando um método para
        c2.setCor("Azul");   // mudar atributos privados
        c1.status();
        c2.status();
    }
}
