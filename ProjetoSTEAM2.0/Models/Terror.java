package Models;

public class Terror extends Categoria{

    public Terror(){
        super("Terror");
    }

    @Override
    public void exibirInfo() {
            System.out.println("Categoria: " + getNomeCategoria());
            System.out.println("Descrição: Jogos com terror psicológico.");
            System.out.println("Jogos: \n");
            System.out.println("Amnesia: The Bunker: Amnesia: The Bunker é um jogo de terror em primeira pessoa ambientado em um bunker desolado da Primeira Guerra Mundial. Enfrente os terrores que espreitam no escuro. Procure e use as ferramentas e armas à sua disposição. Mantenha as luzes acesas a todo custo e escape com vida. \n");
            System.out.println("Stay Out of the House: Stay Out of the House é inspirado na era dos filmes Slasher em VHS e jogos de terror de sobrevivência de PS1. \n");
            System.out.println("Dead Space: O clássico de terror de sobrevivência e ficção científica está de volta, totalmente reformulado para oferecer uma experiência ainda mais imersiva, incluindo aprimoramentos visuais, de áudio e de jogabilidade, ao mesmo tempo em que se mantém fiel à emocionante visão do jogo original. \n");
            System.out.println("Lethal Company: Um horror cooperativo sobre vasculhar luas abandonadas para vender sucata para a empresa. \n");
            System.out.println("Outlast: Um jogo de terror de sobrevivência em primeira pessoa desenvolvido por veteranos de algumas das maiores franquias de jogos da história. Como o jornalista investigativo Miles Upshur, explore o Mount Massive Asylum e tente sobreviver o suficiente para descobrir seu terrível segredo... se você descobrir...\n");
        }
    }
