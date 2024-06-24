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
        noticias.add(new Noticias("Tectoy revela linha Zeenix com PC portátil, periféricos e mais", "A Tectoy anunciou sua nova linha de produtos Zeenix, incluindo um PC portátil inovador e uma variedade de periféricos de alta performance."));
        noticias.add(new Noticias("Elden Ring: Diminuir dificuldade 'quebraria o jogo', na opinião do criador", "O criador de Elden Ring afirmou que reduzir a dificuldade do jogo comprometeria a experiência pretendida, mantendo-se firme na decisão de manter o desafio."));
        noticias.add(new Noticias("Resident Evil original pode ser lançado para PC em breve", "Rumores indicam que o clássico Resident Evil original está prestes a ser relançado para PC, trazendo nostalgia e terror para uma nova geração de jogadores."));
        noticias.add(new Noticias("LoL receberá modo de jogo PvE em julho", "League of Legends está programado para receber um novo modo de jogo PvE em julho, oferecendo uma nova experiência de jogo para os fãs da série."));
        
        // Adicionando algumas Discussoes de exemplo
        discussoes.add(new Discussao("Sucesso de ‘Palworld’ abre discussão sobre plágio nos games", "O sucesso de ‘Palworld’ tem levantado questões sobre plágio no mundo dos games. O que vocês acham?"));
        discussoes.add(new Discussao("Jogos de Nintendo Switch finalmente sendo traduzidos? Vc concorda ou não", "Muitos jogos de Nintendo Switch estão sendo traduzidos para diversos idiomas. Vocês concordam com essa prática?"));
        discussoes.add(new Discussao("Playstation, Xbox, Switch ou PC? Qual eu devo escolher?", "Estou pensando em comprar um novo console ou PC para jogos. Qual vocês recomendam e por quê?"));
        discussoes.add(new Discussao("Qual é o melhor jogo de 2024 até agora na sua opinião?", "Até agora, qual jogo lançado em 2024 vocês consideram o melhor?"));
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
            System.out.print("Escolha uma opção: ");

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
                    System.out.print("Digite o conteúdo da noticia: ");
                    String conteudoNoticia = scanner.nextLine();

                    Noticias novaNoticia = new Noticias(tituloNoticia, conteudoNoticia);
                    adicionarNoticia(novaNoticia);
                    System.out.println(" >> Notícia adicionada com sucesso! << ");
                    break;
                case 4:
                    System.out.print("Digite o título da discussao: ");
                    String tituloDiscussao = scanner.nextLine();
                    System.out.print("Digite a descrição da discussao: ");
                    String descricaoDiscussao = scanner.nextLine();

                    Discussao novadiscussao = new Discussao(tituloDiscussao, descricaoDiscussao);
                    adicionarDiscussao(novadiscussao);
                    System.out.println(" >> Discussão adicionada com sucesso! << ");
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