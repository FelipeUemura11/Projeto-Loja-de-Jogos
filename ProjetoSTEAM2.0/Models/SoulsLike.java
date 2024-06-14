package Models;

public class SoulsLike extends Categoria {
    public SoulsLike() {
        super("Souls Like");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Categoria: " + getNome());
        System.out.println("Descrição: Jogos inspirados em Dark Souls.");
        System.out.println("DARK SOULS™: REMASTERED: Mas então, fez-se o fogo. Experimente novamente o jogo aclamado pela crítica e definidor de gênero que foi o início tudo. Belamente remasterizado, volte a Lordran com detalhes em alta definição a 60fps.\n");
        System.out.println("DARK SOULS™ II: Scholar of the First Sin: DARK SOULS™ II: Scholar of the First Sin leva a renomada obscuridade e jogabilidade viciante da franquia a um novo nível. Junte-se à jornada sombria e vivencie encontros com inimigos devastadores, perigos diabólicos e o desafio implacável.\n");
        System.out.println("DARK SOULS™ III: DARK SOULS™ continua a ultrapassar seus próprios limites em um ambicioso novo capítulo da série que definiu um gênero e que é aclamada pela crítica. Prepare-se para abraçar a escuridão!\n");
        System.out.println("ELDEN RINGO NOVO RPG DE AÇÃO E FANTASIA. Levante-se, Maculado, e seja guiado pela graça para portar o poder do Anel Prístino e se tornar um Lorde Prístino nas Terras Intermédias.\n");
        System.out.println("Sekiro™: Shadows Die Twice - GOTY Edition: Jogo do Ano - The Game Awards 2019 Melhor Jogo de Ação de 2019 - IGN Trilhe seu próprio caminho de vingança nesta premiada aventura da FromSoftware, os criadores de Bloodborne e da franquia Dark Souls. Obtenha vingança. Retome sua honra. Mate astuciosamente.\n");
    }
}
