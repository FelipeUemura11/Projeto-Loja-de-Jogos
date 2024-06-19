package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comunidade {
    private List<Noticias> noticias;

    public Comunidade() {
        noticias = new ArrayList<>();
        // Adicionando algumas Noticias de exemplo
        noticias.add(new Noticias("Novo jogo de RPG lancado!", "Um novo RPG revolucionário acaba de ser lançado, trazendo gráficos impressionantes e uma história envolvente."));
        noticias.add(new Noticias("Atualização massiva para jogo de estratégia!", "Uma nova atualização para o jogo de estratégia mais popular do ano foi lançada, trazendo novos mapas, unidades e modos de jogo."));
        noticias.add(new Noticias("Entrevista com desenvolvedor de jogo indie!", "Conversamos com o desenvolvedor por trás do mais novo jogo indie aclamado pela crítica, discutindo o processo de criação e os desafios enfrentados."));
    }

    public void adicionarNoticia(Noticias noticia) {
        noticias.add(noticia);
    }

    public void exibirNoticias() {
        if(noticias.isEmpty()){
            System.out.println("Nenhuma noticia disponivel.");
            return;
        }

        System.out.println("=============== Noticias ===============");
        for (Noticias noticia : noticias) {
            System.out.println("Titulo: " + noticia.getTitulo());
            System.out.println("Descricao: " + noticia.getConteudo());
            System.out.println("----------------------------------");
        }
    }

    public void gerenciarComunidade(Scanner scanner) {
        int opcao = -1;
        do {
            System.out.println("\n=============== Comunidade ===============");
            System.out.println("1. Ver Noticias");
            System.out.println("2. Adicionar noticia de Jogo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    exibirNoticias();
                    break;
                case 2:
                    System.out.print("Digite o título da noticia: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o conteúdo da noticia: ");
                    String conteudo = scanner.nextLine();

                    Noticias novaNoticia = new Noticias(titulo, conteudo);
                    adicionarNoticia(novaNoticia);
                    System.out.println("noticia adicionada com sucesso!");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
            }
        } while (opcao != 0);
    }
}
