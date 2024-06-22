package Models;

import java.util.ArrayList;
import java.util.List;

public class Destaques {
    private List<ListaJogo> destaques;

    public Destaques() {
        this.destaques = new ArrayList<>();
    }

    public void adicionarDestaque(ListaJogo destaque) {
        destaques.add(destaque);
    }

    public List<ListaJogo> getJogos() {
        return destaques;
    }
}
