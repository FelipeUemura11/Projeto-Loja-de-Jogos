package Models;

public class Conquista {
    private String nome;

    Conquista(String nome) {
        this.nome = nome;
    }

    public String getNomeConquista() {
        return nome;
    }

    public void setNomeConquista(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conquista: " + nome;
    }
}
