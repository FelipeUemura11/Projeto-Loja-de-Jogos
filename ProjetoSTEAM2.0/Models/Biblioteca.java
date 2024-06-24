package Models;

import java.util.Scanner;

public class Biblioteca{

    Scanner scan = new Scanner(System.in);
    
    public void gerenciarBiblioteca(Cadastro pessoa_selecionada){

        int opc = -1;

        do{
            System.out.println("\n===== Biblioteca =====");
            System.out.println("1. Jogos");
            System.out.println("2. Desejos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            opc = scan.nextInt();
            scan.nextLine();
            
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! << ");
                    break;
            }
        }while(opc != 0);

        public void funcaoJogo()
        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n===== Jogos =====");
            System.out.println("1. Listar meus Jogos");
            System.out.println("2. Remover Jogo");
            System.out.println("3. Buscar Jogo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scan.nextInt();
            scan.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println(" >> LISTA DE JOGOS << ");
                    System.out.println(pessoa_selecionada.getPerfil().listarJogos());
                    break;
                case 2:
                    boolean encontrado = false;
                    System.out.println(" >> REEMBOLSAR JOGO << ");
                    System.out.print("Informe o nome do jogo que deseja reembolsar: ");
                    String reembolsar = scan.nextLine();
                    pessoa_selecionada.getPerfil().removerJogo(reembolsar);
                    break;
                case 3:
                    System.out.println(" >> BUSCAR JOGO << ");
                    System.out.print("Informe o nome do jogo que deseja buscar: ");
                    String buscar = scan.nextLine();
                    pessoa_selecionada.getPerfil().buscarJogo(buscar);
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! << ");
                    break;
            }
        }
    }
}