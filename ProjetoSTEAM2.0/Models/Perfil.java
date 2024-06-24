package Models;

import java.util.ArrayList;
import java.util.List;

public class Perfil{

    protected String nome;
    protected double saldo;
    protected Grupo grupo;
    public List<Amigo> amigos;
    protected List<ListaJogosComprados> comprados;
    protected List<ListaDeDesejos> desejos;
    public List<ListaConquista> conquistas;

    public Perfil(String nome, double saldo, Grupo grupo) {
        this.nome = nome;
        this.saldo = saldo;
        this.grupo = grupo;
        this.amigos = new ArrayList<>();
        this.comprados = new ArrayList<>();
        this.desejos = new ArrayList<>();
        this.conquistas = new ArrayList<>();
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

    public List<ListaDeDesejos> getDesejos() {
        return desejos;
    }
    // ADICAO DE CONQUISTAS
    public List<ListaConquista> getConquistas() {
        return conquistas;
    }
    public void adicionarConquista(String titulo, String desc_conquista){
        conquistas.add(new ListaConquista(titulo, desc_conquista));
    }

    public void listarConquistas(){
        for(ListaConquista c : conquistas){
            System.out.println("\n >> Titulo: " + c.getTituloConquista() + "\n >> Descricao: "+ c.getDesc_conquista());
        }
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
            System.out.println(" >> Amigo nao econtrado! << ");
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
    
    // Funcoes para jogos comprados
    public List<ListaJogosComprados> getListaComprados() {
        return comprados;
    }
    // Buscar Jogo
    public ListaJogosComprados buscarJogo(String nome_jogo){
        return comprados.stream().filter(ListaJogosComprados -> nome_jogo.equals(ListaJogosComprados.getComprados())).findFirst().orElse(null);
    }
    // Remover Jogo
    public ListaJogosComprados removerJogo(String nome_jogo){
        
        ListaJogosComprados encontrado = buscarJogo(nome_jogo);
        
        if(encontrado != null){
            comprados.remove(encontrado);
        }else{
            System.out.println(" >> Jogo nao econtrado! << ");
        }
        
        return null;
    }
    // Listar Jogos
    public ListaJogosComprados listarJogos(){
        int i = 0;
        for(ListaJogosComprados c : comprados){
            i++;
            System.out.println("Jogo ("+ i +"): "+c.toString());
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
