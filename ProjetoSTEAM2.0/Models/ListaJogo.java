package Models;

import java.util.List;
import java.util.ArrayList;

public class ListaJogo implements VerCategoria{
    private List<Categoria> categorias;
    private String titulo;
    private double preco;

    public ListaJogo(String titulo, double preco){
        this.categorias = new ArrayList<>(); 
        this.titulo = titulo;
        this.preco = preco;
    }

    public void adicionarCategoria(Categoria categoria){
        categorias.add(categoria);
    }
    
    public List<Categoria> getCategoria() {
        return categorias;
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
    /*
    @Override
    public String toString() {
        return "Categoria: " + categorias + "\nTitulo: " + titulo + "\nPreco: " + preco;
    }
    */
    @Override
    public void verCategoria(){
        System.out.println("       [FPS] + [RPG] + [TERROR]\n[INDIE] + [PLATAFORMA] + [SOULSLIKE]\n\n");
    }
}