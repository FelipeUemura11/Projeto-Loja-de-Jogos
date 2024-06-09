import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<Jogo> jogos;

    public ListaDeDesejos() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
}
