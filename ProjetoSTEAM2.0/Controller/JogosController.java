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
    
    public void jogosExistentes(List<ListaJogo> jogos, List<ListaJogo> destaques, List<ListaJogo> ofertas){
        
        ListaJogo fps1 = new ListaJogo("Counte-Strike", 75.0); // FPS
        ListaJogo fps2 = new ListaJogo("VALORANT", 0.0); // FPS
        ListaJogo fps3 = new ListaJogo("RAINBOW SIX SIEGE", 95.0); // FPS
        fps1.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps2.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps3.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        jogos.add(fps1);
        jogos.add(fps2);
        jogos.add(fps3);
        
        ListaJogo rpg1 = new ListaJogo("The Witcher1", 110.0); // RPG
        ListaJogo rpg2 = new ListaJogo("The Witcher2", 120.0); // RPG
        ListaJogo rpg3 = new ListaJogo("The Witcher3", 130.0); // RPG
        rpg1.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg2.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg3.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        jogos.add(rpg1);
        jogos.add(rpg2);
        jogos.add(rpg3);

        ListaJogo terror1 = new ListaJogo("Lethal Company", 33.0); // TERROR
        ListaJogo terror2 = new ListaJogo("Phasmofobia", 25.0); // TERROR
        ListaJogo terror3 = new ListaJogo("Russiaphobia", 1.74); // TERROR
        terror1.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror2.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror3.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        jogos.add(terror1);
        jogos.add(terror2);
        jogos.add(terror3);
        
        ListaJogo soulslike1 = new ListaJogo("DARK SOULS™", 154.0); // SOULSLIKE
        ListaJogo soulslike2 = new ListaJogo("Elden Ring", 229.90); // SOULSLIKE
        ListaJogo soulslike3 = new ListaJogo("Sekiro: Shadows Die Twice", 274.0); // SOULSLIKE
        soulslike1.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike2.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike3.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        jogos.add(soulslike1);
        jogos.add(soulslike2);
        jogos.add(soulslike3);

        ListaJogo indie1 = new ListaJogo("Hollow Knight", 46.99); // INDIE
        ListaJogo indie2 = new ListaJogo("Stardew Valley", 24.99); // INDIE
        ListaJogo indie3 = new ListaJogo("Overcooked 2", 14.97); // INDIE
        indie1.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie2.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie3.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        jogos.add(indie1);
        jogos.add(indie2);
        jogos.add(indie3);

        ListaJogo plataforma1 = new ListaJogo("Rayman", 83.50); // PLATAFORMA
        ListaJogo plataforma2 = new ListaJogo("Sonic Superstar", 229.90); // PLATAFORMA
        ListaJogo plataforma3 = new ListaJogo("Mega Man 11", 99.90); // PLATAFORMA
        plataforma1.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma2.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma3.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        jogos.add(plataforma1);
        jogos.add(plataforma2);
        jogos.add(plataforma3);
    }
}
