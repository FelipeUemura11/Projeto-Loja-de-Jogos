import java.util.ArrayList;
import java.util.List;

public class Perfil {
    protected String nome;
    protected List<Amigo> amigos;
    protected List<Grupo> grupos;
    protected List<Conquista> conquistas;

    Perfil(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.conquistas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
