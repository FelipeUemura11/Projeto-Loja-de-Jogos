package Models;

public abstract class Categoria {
    private String nome_categoria;

    public Categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public String getNomeCategoria() {
        return nome_categoria;
    }

    public abstract void exibirInfo();
}
