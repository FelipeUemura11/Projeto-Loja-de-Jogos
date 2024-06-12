import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<ListaJogo> jogos;

    public ListaDeDesejos() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(ListaJogo jogo) {
        jogos.add(jogo);
    }

    public List<ListaJogo> getJogos() {
        return jogos;
    }
}
