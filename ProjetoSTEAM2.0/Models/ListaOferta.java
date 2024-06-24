package Models;

public class ListaOferta {
    private String nome_oferta;
    private double preco_original;
    private double preco_oferta;

    public ListaOferta(String nome_oferta, double preco_original, double preco_oferta) {
        this.nome_oferta = nome_oferta;
        this.preco_original = preco_original;
        this.preco_oferta = preco_oferta;
    }

    public String getNomeOferta() {
        return nome_oferta;
    }

    public void setNomeOferta(String nome_oferta) {
        this.nome_oferta = nome_oferta;
    }

    public double getPrecoOriginal() {
        return preco_original;
    }

    public void setPrecoOriginal(double preco_original) {
        this.preco_original = preco_original;
    }

    public double getPrecoOferta() {
        return preco_oferta;
    }

    public void setPrecoOferta(double preco_oferta) {
        this.preco_oferta = preco_oferta;
    }

    @Override
    public String toString() {
        return "Oferta: " + nome_oferta + "\nPreco Original: " + preco_original + "\nPreco de Oferta: " + preco_oferta;
    }

}