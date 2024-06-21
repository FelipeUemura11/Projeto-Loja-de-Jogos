package Models;

public class Indie extends Categoria {
    public Indie() {
        super("Indie");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNomeCategoria());
        System.out.println("Descrição: Jogos independentes.");
    }
}
