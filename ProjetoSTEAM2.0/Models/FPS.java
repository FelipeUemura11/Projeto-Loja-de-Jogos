package Models;

public class FPS extends Categoria {
    public FPS() {
        super("FPS");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNome());
        System.out.println("Descrição: Jogos de tiro em primeira pessoa.");
        System.out.println("Jogos:\n");
        System.out.println("- Counter Strike: Há mais de duas décadas, o Counter-Strike oferece uma experiência competitiva de elite moldada por milhões de jogadores mundialmente. Agora, o próximo capítulo da história do CS vai começar. Isso é Counter-Strike 2.\n");
        System.out.println("- Destiny: Destiny 2 é um MMO de ação com um mundo único em evolução, que se pode jogar a qualquer hora e em qualquer lugar com os amigos, inteiramente de graça.\n");
        System.out.println("- Call of Duty Black Ops 2: Quebrando as barreiras do que os fãs esperariam da franquia de entretenimento recordista, Call of Duty®: Black Ops II leva os jogadores a um futuro próximo, na Guerra Fria do século XXI, onde a tecnologia e as armas convergiram para criar uma nova geração de guerras.\n");
        System.out.println("- Battlefield 4: Domine o campo de batalha com os extras do Premium.\n");
        System.out.println("- Halo: The Master Chief Collection: A lendária jornada do Master Chief está incluída em seis jogos, feitos para PC e reunidos em uma única experiência. Tanto para fãs de longa data como para os que conhecerão o Spartan 117 agora, a Master Chief Collection é a experiência de jogo definitiva da série Halo.\n");
        System.out.println("- Tom Clancy's Rainbow Six® Siege: Tom Clancy's Rainbow Six® Siege é um jogo de tiro tático em equipes, realista e de elite, no qual planejamento e execução superiores triunfam.\n");
        System.out.println("- PUBG: Pouse em locais estratégicos, saqueie armas e suprimentos e sobreviva para se tornar a última equipe de pé nos mais variados campos de batalha.\n");
    }
}
