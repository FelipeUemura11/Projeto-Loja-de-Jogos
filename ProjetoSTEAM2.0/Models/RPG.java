package Models;

public class RPG extends Categoria {
    public RPG() {
        super("RPG");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNomeCategoria());
        System.out.println("Descrição: Jogos de interpretação de papéis.");
    }
}
