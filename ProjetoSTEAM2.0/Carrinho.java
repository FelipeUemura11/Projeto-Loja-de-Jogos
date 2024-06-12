import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ListaJogo> jogos;

    public Carrinho() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(ListaJogo jogo) {
        jogos.add(jogo);
    }

    public void removerJogo(ListaJogo jogo) {
        jogos.remove(jogo);
    }

    public void visualizarCarrinho() {
        if (jogos.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        System.out.println("===== Carrinho =====");
        for (ListaJogo jogo : jogos) {
            System.out.println(jogo);
            System.out.println("----------------------------------");
        }
    }

    public void finalizarCompra() {
        // Implementação para finalizar a compra
    }

    public List<ListaJogo> getJogos() {
        return jogos;
    }
}
