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
        ListaOferta oferta1 = new ListaOferta("WATCH DOGS 2", 149.99, 22.49);
        ListaOferta oferta2 = new ListaOferta("TheHunter: Call of the Wild", 59.99, 8.39);
        ListaOferta oferta3 = new ListaOferta("Witch It", 59.99, 14.99);
        ListaOferta oferta4 = new ListaOferta("Cooking Simulator", 59.99, 17.99);
        ListaOferta oferta5 = new ListaOferta("Dead Cells", 47.49, 23.74);

        ofertas.add(oferta1);
        ofertas.add(oferta2);
        ofertas.add(oferta3);
        ofertas.add(oferta4);
        ofertas.add(oferta5);

        // DESTAQUES
        ListaDestaque destaque1 = new ListaDestaque("ELDEN RING Shadow of the Erdtree", 154.90);
        ListaDestaque destaque2 = new ListaDestaque("Sniper Elite 4", 105.99);
        ListaDestaque destaque3 = new ListaDestaque("LIKE A DRAGON: Infinite Wealth", 349.90);
        ListaDestaque destaque4 = new ListaDestaque("TEKKEN 7", 24.37);
        ListaDestaque destaque5 = new ListaDestaque("Back 4 Blood", 27.99);


        destaques.add(destaque1);
        destaques.add(destaque2);
        destaques.add(destaque3);
        destaques.add(destaque4);
        destaques.add(destaque5);

        // FPS
        ListaJogo fps1 = new ListaJogo("Far Cry 5", 179.99);
        ListaJogo fps2 = new ListaJogo("Ghost Recon", 149.99);
        ListaJogo fps3 = new ListaJogo("R6", 274.00);
        ListaJogo fps4 = new ListaJogo("CS2", 149.90);
        ListaJogo fps5 = new ListaJogo("VALORANT", 109.99);

        fps1.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps2.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps3.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps4.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));
        fps5.adicionarCategoria(new FPS("FPS", "Jogos de tiro em primeira pessoa"));

        jogos.add(fps1);
        jogos.add(fps2);
        jogos.add(fps3);
        jogos.add(fps4);
        jogos.add(fps5);


        // RPG
        ListaJogo rpg1 = new ListaJogo("The Witcher 1", 110.0);
        ListaJogo rpg2 = new ListaJogo("The Witcher 2", 120.0);
        ListaJogo rpg3 = new ListaJogo("The Witcher 3", 130.0);
        ListaJogo rpg4 = new ListaJogo("Baldur's Gate", 199.99);
        ListaJogo rpg5 = new ListaJogo("Fallout 76", 155.00);

        rpg1.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg2.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg3.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg4.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));
        rpg5.adicionarCategoria(new RPG("RPG", "Jogos de interpretacao de papeis"));

        jogos.add(rpg1);
        jogos.add(rpg2);
        jogos.add(rpg3);
        jogos.add(rpg4);
        jogos.add(rpg5);


        // TERROR
        ListaJogo terror1 = new ListaJogo("Lethal Company", 33.0);
        ListaJogo terror2 = new ListaJogo("Phasmofobia", 25.0);
        ListaJogo terror3 = new ListaJogo("Russiaphobia", 1.74);
        ListaJogo terror4 = new ListaJogo("Outlast", 59.99);
        ListaJogo terror5 = new ListaJogo("Outlast 2", 88.99);
        terror1.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror2.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror3.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror4.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));
        terror5.adicionarCategoria(new Terror("Terror", "Jogos com terror psicologico"));

        jogos.add(terror1);
        jogos.add(terror2);
        jogos.add(terror3);
        jogos.add(terror4);
        jogos.add(terror5);
        
        // SOULSLIKE
        ListaJogo soulslike1 = new ListaJogo("DARK SOULS™", 154.0); 
        ListaJogo soulslike2 = new ListaJogo("Elden Ring", 229.90); 
        ListaJogo soulslike3 = new ListaJogo("Sekiro: Shadows Die Twice", 274.0);
        ListaJogo soulslike4 = new ListaJogo("NIOH 2", 249.0);
        ListaJogo soulslike5 = new ListaJogo("Remnant: From The Ashes", 75.49);

        soulslike1.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike2.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike3.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike4.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));
        soulslike5.adicionarCategoria(new SoulsLike("SoulsLike", "Jogos inspirados em Dark Souls"));

        jogos.add(soulslike1);
        jogos.add(soulslike2);
        jogos.add(soulslike3);
        jogos.add(soulslike4);
        jogos.add(soulslike5);

        // INDIE
        ListaJogo indie1 = new ListaJogo("Hollow Knight", 46.99);
        ListaJogo indie2 = new ListaJogo("Stardew Valley", 24.99);
        ListaJogo indie3 = new ListaJogo("Overcooked 2", 14.97);
        ListaJogo indie4 = new ListaJogo("LIMBO", 37.00);
        ListaJogo indie5 = new ListaJogo("Journey", 43.99);

        indie1.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie2.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie3.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie4.adicionarCategoria(new Indie("Indie", "Jogos independentes."));
        indie5.adicionarCategoria(new Indie("Indie", "Jogos independentes."));


        jogos.add(indie1);
        jogos.add(indie2);
        jogos.add(indie3);
        jogos.add(indie4);
        jogos.add(indie5);

        // PLATAFORMA
        ListaJogo plataforma1 = new ListaJogo("Rayman", 83.50); 
        ListaJogo plataforma2 = new ListaJogo("Sonic Superstar", 229.90);
        ListaJogo plataforma3 = new ListaJogo("Mega Man 11", 99.90);
        ListaJogo plataforma4 = new ListaJogo("Terraria", 32.99);
        ListaJogo plataforma5 = new ListaJogo("Cuphead", 36.99);
        ListaJogo plataforma6 = new ListaJogo("Crypt Crawler", 33.33);

        plataforma1.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma2.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma3.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma4.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma5.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));
        plataforma6.adicionarCategoria(new Plataforma("Plataforma", " Jogos de plataformas"));

        jogos.add(plataforma1);
        jogos.add(plataforma2);
        jogos.add(plataforma3);
        jogos.add(plataforma4);
        jogos.add(plataforma5);
        jogos.add(plataforma6);
    }
}
