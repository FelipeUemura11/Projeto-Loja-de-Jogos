package Models;

public class SoulsLike extends Categoria {
    private String desc_categoria;

    public SoulsLike(String nome_categoria, String desc_categoria) {
        super(nome_categoria);
        this.desc_categoria = desc_categoria;
    }

    public String getDesc_categoria() {
        return desc_categoria;
    }

    public void setDesc_categoria(String desc_categoria) {
        this.desc_categoria = desc_categoria;
    }
    @Override
    public String toString() {
        return "Descricao: " + desc_categoria;
    }
}
