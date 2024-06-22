package Models;

public class RPG extends Categoria {
    private String desc_categoria;
    
    public RPG(String nome_categoria, String desc_categoria) {
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
