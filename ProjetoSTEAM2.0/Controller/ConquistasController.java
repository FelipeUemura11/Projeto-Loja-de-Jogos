package Controller;

import Models.Cadastro;

public class ConquistasController {

    public void conquistasExistentes(Cadastro pessoa_selecionada) {
        
        pessoa_selecionada.getPerfil().adicionarConquista("MAGNATA", "Um dos maiores compradores da historia!");
        pessoa_selecionada.getPerfil().adicionarConquista("Global Sentinel", "Conquistou o ultimo rank do counter strike 2!");
        pessoa_selecionada.getPerfil().adicionarConquista("Vereador Nato", "Amigo de todo mundo, famoso veredor!");
        pessoa_selecionada.getPerfil().adicionarConquista("Rei dos CheckMate", "Conquistou os melhores pontos em jogos de tabuleiro!");

    }

}
