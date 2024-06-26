package Models;

public class ListaJogosComprados{

    private String comprado;
    private double preco;

    public ListaJogosComprados(String comprado, double preco) {
        this.comprado = comprado;
        this.preco = preco;
    }

    public String getComprados() {
        return comprado;
    }

    public void setComprados(String comprado) {
        this.comprado = comprado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return " - "+comprado;
    } 
}
