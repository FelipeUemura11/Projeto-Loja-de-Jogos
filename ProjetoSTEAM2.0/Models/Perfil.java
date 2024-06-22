package Models;

import java.util.ArrayList;
import java.util.List;

public class Perfil{

    protected String nome;
    protected double saldo;
    protected Grupo grupo;
    public List<Amigo> amigos;
    protected List<ListaJogosComprados> comprados;
    protected List<Conquista> conquistas;
    protected List<ListaDeDesejos> desejos;

    public Perfil(String nome, double saldo, Grupo grupo) {
        this.nome = nome;
        this.saldo = saldo;
        this.grupo = grupo;
        this.amigos = new ArrayList<>();
        this.comprados = new ArrayList<>();
        this.conquistas = new ArrayList<>();
        this.desejos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Grupo getGrupo(){
        return grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
    // Funcao para listar os amigos
    public Amigo listarAmigos(){
        int i = 0;
        for(Amigo amigo : amigos){
            i++;
            System.out.println("Amigo ("+ i +"): "+amigo.getNomeAmigo());
        }
        return null;
    }
    // Funcao para adicionar no carrinho
    public void adicionarCarrinho(String jogo_selecionado) {
        comprados.add(new ListaJogosComprados(jogo_selecionado));
    }
    // Funcao para adicionar na lista de desejos
    public void adicionarListaDeDesejos(String jogo_selecionado) {
        desejos.add(new ListaDeDesejos(jogo_selecionado));
    }
    
}
