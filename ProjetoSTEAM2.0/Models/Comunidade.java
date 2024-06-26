package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Comunidade {
    private List<Noticias> noticias;
    private List<Discussao> discussoes;

    public Comunidade() {
        noticias = new ArrayList<>();
        discussoes = new ArrayList<>();
        // Adicionando algumas Noticias de exemplo
        noticias.add(new Noticias("Tectoy revela linha Zeenix com PC portatil, perifericos e mais", "A Tectoy anunciou sua nova linha de produtos Zeenix, incluindo um PC portatil inovador e uma variedade de perifericos de alta performance."));
        noticias.add(new Noticias("Elden Ring: Diminuir dificuldade 'quebraria o jogo', na opiniao do criador", "O criador de Elden Ring afirmou que reduzir a dificuldade do jogo comprometeria a experiencia pretendida, mantendo-se firme na decisao de manter o desafio."));
        noticias.add(new Noticias("Resident Evil original pode ser lançado para PC em breve", "Rumores indicam que o classico Resident Evil original esta prestes a ser relançado para PC, trazendo nostalgia e terror para uma nova geracao de jogadores."));
        noticias.add(new Noticias("LoL recebera modo de jogo PvE em julho", "League of Legends esta programado para receber um novo modo de jogo PvE em julho, oferecendo uma nova experiencia de jogo para os fas da serie."));
        
        // Adicionando algumas Discussoes de exemplo
        discussoes.add(new Discussao("Sucesso de 'Palworld' abre discussão sobre plagio nos games", "O sucesso de 'Palworld' tem levantado questoes sobre plagio no mundo dos games. O que voces acham?"));
        discussoes.add(new Discussao("Jogos de Nintendo Switch finalmente sendo traduzidos? Vc concorda ou nao", "Muitos jogos de Nintendo Switch estao sendo traduzidos para diversos idiomas. Vocês concordam com essa pratica?"));
        discussoes.add(new Discussao("Playstation, Xbox, Switch ou PC? Qual eu devo escolher?", "Estou pensando em comprar um novo console ou PC para jogos. Qual vocês recomendam e por que?"));
        discussoes.add(new Discussao("Qual e o melhor jogo de 2024 até agora na sua opiniao?", "Ate agora, qual jogo lançado em 2024 voces consideram o melhor?"));
    }

    public void adicionarNoticia(Noticias noticia) {
        noticias.add(noticia);
    }

    public void adicionarDiscussao(Discussao discussao) {
        discussoes.add(discussao);
    }

    public void exibirNoticias() {
        if (noticias.isEmpty()) {
            System.out.println("Nenhuma noticia disponivel.");
            return;
        }

        System.out.println("=============== Noticias ===============");
        for (Noticias noticia : noticias) {
            System.out.println("Titulo: " + noticia.getTitulo());
            System.out.println("Descricao: " + noticia.getConteudo());
            System.out.println("--------------------------------------------------------------------------------------------");
        }
    }

    public void exibirDiscussoes() {
        if (discussoes.isEmpty()) {
            System.out.println("Nenhuma discussao disponivel.");
            return;
        }

        System.out.println("=============== Discussoes ===============");
        for (Discussao discussao : discussoes) {
            System.out.println("Titulo: " + discussao.getTitulo());
            System.out.println("Descricao: " + discussao.getDescricao());
            System.out.println("--------------------------------------------------------------------------------------------");
        }
    }

    public void gerenciarComunidade(Scanner scanner) {
        int opcao = -1;
        do {
            System.out.println("\n=============== Comunidade ===============");
            System.out.println("1. Ver Noticias");
            System.out.println("2. Ver Discussoes");
            System.out.println("3. Adicionar noticia de Jogo");
            System.out.println("4. Adicionar Discussao");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    exibirNoticias();
                    break;
                case 2:
                    exibirDiscussoes();
                    break;
                case 3:
                    System.out.print("Digite o título da noticia: ");
                    String tituloNoticia = scanner.nextLine();
                    System.out.print("Digite o conteudo da noticia: ");
                    String conteudoNoticia = scanner.nextLine();

                    Noticias novaNoticia = new Noticias(tituloNoticia, conteudoNoticia);
                    adicionarNoticia(novaNoticia);
                    System.out.println(" >> Noticia adicionada com sucesso! << ");
                    break;
                case 4:
                    System.out.print("Digite o titulo da discussao: ");
                    String tituloDiscussao = scanner.nextLine();
                    System.out.print("Digite a descrição da discussao: ");
                    String descricaoDiscussao = scanner.nextLine();

                    Discussao novadiscussao = new Discussao(tituloDiscussao, descricaoDiscussao);
                    adicionarDiscussao(novadiscussao);
                    System.out.println(" >> Discussao adicionada com sucesso! << ");
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