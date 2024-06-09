import java.util.ArrayList;
import java.util.List;

public class Ofertas {
    private List<Jogo> jogos;

    public Ofertas() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
}
