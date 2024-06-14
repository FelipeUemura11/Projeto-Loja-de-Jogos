package Models;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comunidade {
    private List<Noticias> noticias;

    public Comunidade() {
        this.noticias = new ArrayList<>();
    }

    public void adicionarNoticia(Noticias noticia) {
        noticias.add(noticia);
    }

    public void exibirNoticias() {
        if (noticias.isEmpty()) {
            System.out.println("Nenhuma notícia disponível.");
            return;
        }

        System.out.println("===== Notícias da Comunidade =====");
        for (Noticias noticia : noticias) {
            System.out.println("Título: " + noticia.getTitulo());
            System.out.println("Conteúdo: " + noticia.getConteudo());
            System.out.println("----------------------------------");
        }
    }

    public void gerenciarComunidade(Scanner scanner) {
        while (true) {
            System.out.println("\n===== Comunidade =====");
            System.out.println("1. Ver Notícias");
            System.out.println("2. Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    exibirNoticias();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
