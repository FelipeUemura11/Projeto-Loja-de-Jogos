package Controller;

import java.util.List;

import Models.ListaJogo;
import Models.ListaOferta;
import Models.ListaDestaque;

import Models.FPS;
import Models.RPG;
import Models.Terror;
import Models.Indie;
import Models.SoulsLike;
import Models.Plataforma;

public class JogosController {
    
    public void jogosExistentes(List<ListaJogo> jogos, List<ListaDestaque> destaques, List<ListaOferta> ofertas){
        
        // OFERTAS
        ListaOferta oferta1 = new ListaOferta("ROCKET LEAGUE", 30.0);
        ListaOferta oferta2 = new ListaOferta("FORTNITE", 55.0);
        ListaOferta oferta3 = new ListaOferta("CALL OF DUTY", 80.0);
        ofertas.add(oferta1);
        ofertas.add(oferta2);
        ofertas.add(oferta3);

        // DESTAQUES
        ListaDestaque destaque1 = new ListaDestaque("ROBLOX", 33.0);
        ListaDestaque destaque2 = new ListaDestaque("LOL", 50.0);
        ListaDestaque destaque3 = new ListaDestaque("MINECRAFT 2", 200.0);
        destaques.add(destaque1);
        destaques.add(destaque2);
        destaques.add(destaque3);

        // FPS
        ListaJogo fps1 = new ListaJogo("CS2", 75.0);
        ListaJogo fps2 = new ListaJogo("VALORANT", 0.0);
        ListaJogo fps3 = new ListaJogo("R6", 95.0);
        fps1.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps2.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps3.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        jogos.add(fps1);
        jogos.add(fps2);
        jogos.add(fps3);

        // RPG
        ListaJogo rpg1 = new ListaJogo("The Witcher 1", 110.0);
        ListaJogo rpg2 = new ListaJogo("The Witcher 2", 120.0);
        ListaJogo rpg3 = new ListaJogo("The Witcher 3", 130.0);
        rpg1.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg2.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg3.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        jogos.add(rpg1);
        jogos.add(rpg2);
        jogos.add(rpg3);

        // TERROR
        ListaJogo terror1 = new ListaJogo("Lethal Company", 33.0);
        ListaJogo terror2 = new ListaJogo("Phasmofobia", 25.0);
        ListaJogo terror3 = new ListaJogo("Russiaphobia", 1.74);
        terror1.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror2.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror3.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        jogos.add(terror1);
        jogos.add(terror2);
        jogos.add(terror3);
        
        // SOULSLIKE
        ListaJogo soulslike1 = new ListaJogo("DARK SOULS™", 154.0); 
        ListaJogo soulslike2 = new ListaJogo("Elden Ring", 229.90); 
        ListaJogo soulslike3 = new ListaJogo("Sekiro: Shadows Die Twice", 274.0);
        soulslike1.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike2.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike3.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        jogos.add(soulslike1);
        jogos.add(soulslike2);
        jogos.add(soulslike3);

        // INDIE
        ListaJogo indie1 = new ListaJogo("Hollow Knight", 46.99);
        ListaJogo indie2 = new ListaJogo("Stardew Valley", 24.99);
        ListaJogo indie3 = new ListaJogo("Overcooked 2", 14.97);
        indie1.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie2.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie3.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        jogos.add(indie1);
        jogos.add(indie2);
        jogos.add(indie3);

        // PLATAFORMA
        ListaJogo plataforma1 = new ListaJogo("Rayman", 83.50); 
        ListaJogo plataforma2 = new ListaJogo("Sonic Superstar", 229.90);
        ListaJogo plataforma3 = new ListaJogo("Mega Man 11", 99.90);
        plataforma1.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma2.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma3.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        jogos.add(plataforma1);
        jogos.add(plataforma2);
        jogos.add(plataforma3);
    }
}
