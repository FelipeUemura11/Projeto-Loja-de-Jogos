package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca{
    private List<ListaJogo> jogos;
    ListaJogo jogo_selecionado = null;

    public Biblioteca() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(ListaJogo jogo) {
        jogos.add(jogo);
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

    public void gerenciarBiblioteca(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Biblioteca =====");
            System.out.println("1. Listar meus Jogos");
            System.out.println("2. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                System.out.println(" >> LISTA DE JOGOS << ");
                break;
                case 2:
                System.out.println("voltando...");
                    return;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
            }
        }
    }