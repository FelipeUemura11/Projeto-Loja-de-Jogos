package Models;

public class ListaConquista {
    private String titulo;
    private String desc_conquista;
    private String jogo;

    public ListaConquista(String titulo, String desc_conquista, String jogo){
        this.titulo = titulo;
        this.desc_conquista = desc_conquista;
        this.jogo = jogo;
    }

    public String getTituloConquista() {
        return titulo;
    }

    public void setTituloConquista(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc_conquista() {
        return desc_conquista;
    }

    public void setDesc_conquista(String desc_conquista) {
        this.desc_conquista = desc_conquista;
    }

    public String getJogo(){
        return jogo;
    }

    public void setJogo(String jogo){
        this.jogo = jogo;
    }

    @Override
    public String toString() {
        return "\n >> Titulo: " + titulo + "\n >> Subtitulo: "+ desc_conquista+ "\n >> Jogo: "+ jogo+ "\n";
    }
}
