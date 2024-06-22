package Models;

public class ListaOferta {
    private String nome_oferta;
    private double preco_oferta;

    public ListaOferta(String nome_oferta, double preco_oferta) {
        this.nome_oferta = nome_oferta;
        this.preco_oferta = preco_oferta;
    }

    public String getNome_oferta() {
        return nome_oferta;
    }

    public void setNome_oferta(String nome_oferta) {
        this.nome_oferta = nome_oferta;
    }

    public double getPreco_oferta() {
        return preco_oferta;
    }

    public void setPreco_oferta(double preco_oferta) {
        this.preco_oferta = preco_oferta;
    }

    @Override
    public String toString() {
        return "Oferta: " + nome_oferta + "\nPreco: " + preco_oferta;
    }

}
