package Models;

public class Desejos {
    private String nome;

    Desejos(String nome) {
        this.nome = nome;
    }

    public String getNomeDesejos() {
        return nome;
    }

    public void setNomeDesejos(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Desejos: " + nome;
    }
}
