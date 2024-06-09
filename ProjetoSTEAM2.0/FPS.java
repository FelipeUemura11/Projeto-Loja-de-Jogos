public class FPS extends Categoria {
    public FPS() {
        super("FPS");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNome());
        System.out.println("Descrição: Jogos de tiro em primeira pessoa.");
    }
}
