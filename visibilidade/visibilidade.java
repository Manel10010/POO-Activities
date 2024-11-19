package visibilidade;

public class visibilidade {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; ERRO
        c1.carga = 80; // Só não da erro pois na linha 5 usamos o método Caneta
        c1.destampar(); // É possível a mudança pois o método é público
        c1.status();
        c1.rabiscar(); // Rabisca, pois, o destampar muda o valor de c1.tampado apesar de c1.tampado ser private
    }
}
