package Models;

import java.util.ArrayList;
import java.util.List;

public class Perfil{

    protected String nome;
    public List<Amigo> amigos; 
    protected List<Grupo> grupos;
    protected List<Conquista> conquistas;
    protected List<Desejos> desejos;

    public Perfil(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.conquistas = new ArrayList<>();
        this.desejos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    // Funcoes para amigo
    public List<Amigo> getAmigo(){
        return amigos;
    }
    // Funcao para buscar amigo na lista de amigos, retorna o nome do amigo
    public Amigo buscarAmigo(String nome_amigo){
        return amigos.stream().filter(Amigo -> nome_amigo.equals(Amigo.getNomeAmigo())).findFirst().orElse(null);
    }
    // Funcao para remover amigo da lista de amigos
    public Amigo removerAmigo(String nome_amigo){

        Amigo encontrado = buscarAmigo(nome_amigo);

        if(encontrado != null){
            amigos.remove(encontrado);
        }else{
            System.out.println("Amigo nao econtrado!");
        }
        
        return null;
    }
    // Funcao para lsitar os amigos
    public Amigo listarAmigos(){
        int i = 0;
        for(Amigo amigo : amigos){
            i++;
            System.out.println("Amigo ("+ i +"): "+amigo.getNomeAmigo());
        }
        return null;
    }
    // Funcoes para grupos
    public List<Grupo> getGrupo(){
        return grupos;
    }
    // Funcao para buscar grupo
    public Grupo buscarGrupo(String nome_grupo){
        return grupos.stream().filter(Grupo -> nome_grupo.equals(Grupo.getNomeGrupo())).findFirst().orElse(null);
    }
    // Funcao para sair do grupo
    public Amigo sairGrupo(String nome_grupo){

        Grupo encontrado = buscarGrupo(nome_grupo);

        if(encontrado != null){
            grupos.remove(encontrado);
        }else{
            System.out.println("Grupo nao econtrado!");
        }
        
        return null;
    }
    // Funcao para listar os grupos
    public Grupo listarGrupos(){
        int i = 0;
        for(Grupo grupo : grupos){
            i++;
            System.out.println("Amigo ("+ i +"): "+grupo.getNomeGrupo());
        }
        return null;
    }
}
