package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

    List<ListaJogo> jogos = new ArrayList<>();
    List<ListaJogo> destaques = new ArrayList<>();
    List<ListaJogo> ofertas = new ArrayList<>();

    public void gerenciarLoja(Scanner scan) {

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
                case 1:
                    //jogos.jogosExistentes();
                    exibirJogos(jogos);
                    break;
                case 2:
                    exibirDestaques(destaques);
                    break;
                case 3:
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
        
        System.out.println("\n=========== JOGOS ===========");
        for (ListaJogo jogo : jogos) {
            System.out.println(jogo);
            System.out.println("----------------------------------");
        }
        
    }

    public void exibirDestaques(List<ListaJogo> destaques){

        System.out.println("\n=========== DESTAQUES ===========");
        for (ListaJogo destaque : destaques) {
            System.out.println(destaque);
            System.out.println("----------------------------------");
        }
        
    }
    public void exibirOfertas(List<ListaJogo> ofertas) {

        System.out.println("\n=========== DESTAQUES ===========");
        for (ListaJogo oferta : ofertas) {
            System.out.println(oferta);
            System.out.println("----------------------------------");
        }
        
    }
}
