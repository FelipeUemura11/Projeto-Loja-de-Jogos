package Models;

public class Plataforma extends Categoria {
    public Plataforma() {
        super("Plataforma");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " +getNomeCategoria());
        System.out.println("Descrição: Jogos de plataformas.");
    }
}
