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

    public List<Amigo> getAmigo(){
        return amigos;
    }
    // Funcao para buscar amigo na lista de amigos, retorna o nome do amigo
    public Amigo buscarAmigo(String nome_amigo){
        return amigos.stream().filter(Amigo -> nome_amigo.equals(Amigo.getNomeAmigo())).findFirst().orElse(null);
    }
    // funcao para remover amigo da lista de amigos
    public Amigo removerAmigo(String nome_amigo){

        Amigo encontrado = buscarAmigo(nome_amigo);

        if(encontrado != null){
            amigos.remove(encontrado);
        }else{
            System.out.println("Amigo nao econtrado!");
        }
        
        return null;
    }
    // listar os amigos
    public Amigo listarAmigos(){
        int i = 0;
        for(Amigo amigo : amigos){
            i++;
            System.out.println("Amigo ("+ i +"): "+amigo.getNomeAmigo());
        }
        return null;
    }
}
