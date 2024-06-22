package Controller;

import java.util.List;

import Models.ListaJogo;
import Models.FPS;
import Models.RPG;
import Models.Terror;
import Models.Indie;
import Models.SoulsLike;
import Models.Plataforma;

public class JogosController {
    
    public void jogosExistentes(List<ListaJogo> jogos){
        
        ListaJogo jogo1 = new ListaJogo("Counte-Strike", 75.0);
        ListaJogo jogo2 = new ListaJogo("The Witcher3", 130.0);
        ListaJogo jogo3 = new ListaJogo("Lethal Company", 33.0);
        ListaJogo jogo4 = new ListaJogo("DARK SOULS™", 154.0);
        ListaJogo jogo5 = new ListaJogo("CUP HEAD", 154.0);
        ListaJogo jogo6 = new ListaJogo("Rayman", 90.0);

        jogo1.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        jogo2.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        jogo3.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        jogo4.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        jogo5.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        jogo6.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));

        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);
        jogos.add(jogo4);
        jogos.add(jogo5);
        jogos.add(jogo6);
        
    }

}
