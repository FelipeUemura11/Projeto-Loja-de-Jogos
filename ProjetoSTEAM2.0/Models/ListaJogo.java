package Models;

public class ListaJogo {
    private String titulo;
    private double preco;

    ListaJogo(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public void jogosExistentes(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nPreco: " + preco;
    }
}