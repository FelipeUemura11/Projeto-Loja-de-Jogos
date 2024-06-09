public class Conquistas {
    private String nome;

    public Conquistas(String nome) {
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
