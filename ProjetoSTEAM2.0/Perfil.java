import java.util.ArrayList;
import java.util.List;

public class Perfil{

    protected String nome;
    protected List<Amigo> amigos;
    protected List<Grupo> grupos;
    protected List<Conquista> conquistas;
    protected List<Desejos> desejos;

    Perfil(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.conquistas = new ArrayList<>();
        this.desejos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public List<Amigo> getAmigos() {
        return amigos;
    }

    public Amigo buscarAmigo(String nome_amigo){
        return amigos.stream().filter(Amigo -> nome_amigo.equals(Amigo.getNomeAmigo())).findFirst().orElse(null);
    }

    public Amigo removerAmigo(String nome_amigo){

        Amigo encontrado = buscarAmigo(nome_amigo);

        if(encontrado != null){
            amigos.remove(encontrado);
        }else{
            System.out.println("Amigo nao econtrado!");
        }
        
        return null;
    }
    
}
