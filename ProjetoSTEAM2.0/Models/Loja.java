package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    List<ListaJogo> jogos = new ArrayList<>();
    List<ListaJogo> destaques = new ArrayList<>();
    List<ListaJogo> ofertas = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public void gerenciarLoja(List<ListaJogo> jogos) {

        int opcao = -1;

        while (opcao != 0 ) {
            System.out.println("\n=========== Loja ===========");
            System.out.println("1. Ver jogos");
            System.out.println("2. Ver Destaques");
            System.out.println("4. Ver Ofertas");
            System.out.println("5. Ver Carrinho");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1: // lista de jogos
                    exibirJogos(jogos);
                    break;
                case 2: // lista de destaques
                    exibirDestaques(destaques);
                    break;
                case 3: // lista de ofertas
                    exibirOfertas(ofertas);
                    break;
                case 4:
                    //carrinho.visualizarCarrinho();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! << ");
                    break;
            }
        }
    }

    public void exibirJogos(List<ListaJogo> jogos){
        
        System.out.println("\n=========== JOGOS ===========\n");
        System.out.println("==>[FPS]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("FPS")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[RPG]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("RPG")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Terror]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Terror")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[SoulsLike]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("SoulsLike")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Indie]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Indie")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Plataforma]]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Plataforma")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
    }

    public void exibirDestaques(List<ListaJogo> destaques){

        System.out.println("\n=========== DESTAQUES ===========");
        for (ListaJogo destaque : destaques) {
            System.out.println(destaque.toString());
            System.out.println("----------------------------------");
        }
        
    }
    public void exibirOfertas(List<ListaJogo> ofertas) {

        System.out.println("\n=========== OFERTAS ===========");
        for (ListaJogo oferta : ofertas) {
            System.out.println(oferta.toString());
            System.out.println("----------------------------------");
        }
        
    }
}
