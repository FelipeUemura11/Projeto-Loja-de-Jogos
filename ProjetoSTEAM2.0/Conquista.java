public class Conquista {
    private String nome;

    Conquista(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conquista: " + nome;
    }
}
