package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca{

    Scanner
    
    public void gerenciarBiblioteca(Cadastro) {

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== Biblioteca =====");
            System.out.println("1. Listar meus Jogos");
            System.out.println("2. Adicionar Favoritos");
            System.out.println("3. Remover Favoritos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scan.nextInt();
            scan.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    System.out.println(" >> LISTA DE JOGOS << ");
                    // funcao list
                    break;
                case 2:
                    System.out.println(" >> FAVORITAR << ");
                    break;
                case 3:
                    System.out.println(" >> DESFAVORITAR << ");
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
        public void listarJogos() {
            if (jogos.isEmpty()) {
                System.out.println("Nenhum jogo na biblioteca.");
                return;
            }
        
            System.out.println("===== Jogos na Biblioteca =====");
            for (ListaJogo j : jogos) {
                System.out.println(j);
                System.out.println("----------------------------------");
            }
        }
}