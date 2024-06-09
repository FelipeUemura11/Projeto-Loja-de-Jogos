public class SoulsLike extends Categoria {
    public SoulsLike() {
        super("Souls Like");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNome());
        System.out.println("Descrição: Jogos inspirados em Dark Souls.");
    }
}
