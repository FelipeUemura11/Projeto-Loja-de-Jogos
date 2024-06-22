package Models;

public class ListaDestaque {
    private String nome_destaque;
    private double preco_destaque;

    public ListaDestaque(String nome_destaque, double preco_destaque) {
        this.nome_destaque = nome_destaque;
        this.preco_destaque = preco_destaque;
    }

    public String getNome_destaque() {
        return nome_destaque;
    }

    public void setNome_destaque(String nome_destaque) {
        this.nome_destaque = nome_destaque;
    }

    public double getPreco_destaque() {
        return preco_destaque;
    }

    public void setPreco_destaque(double preco_destaque) {
        this.preco_destaque = preco_destaque;
    }

    @Override
    public String toString() {
        return "Destaque: " + nome_destaque + "\nPreco: " + preco_destaque;
    }

    
}
