import java.util.ArrayList;
import java.util.List;

public class Ofertas {
    private List<ListaJogo> jogos;

    public Ofertas() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(ListaJogo jogo) {
        jogos.add(jogo);
    }

    public List<ListaJogo> getJogos() {
        return jogos;
    }
}
