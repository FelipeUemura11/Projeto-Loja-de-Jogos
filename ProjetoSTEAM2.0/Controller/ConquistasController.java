package Controller;

import Models.Cadastro;

public class ConquistasController {

    public void conquistasExistentes(Cadastro pessoa_selecionada) {
        
        pessoa_selecionada.getPerfil().adicionarConquista("MAGNATA", "Um dos maiores compradores da historia!", "Medalha da comunidade!");
        pessoa_selecionada.getPerfil().adicionarConquista("Um novo começo", "Isso aqui também é Counter-Strike.", "Counter Strike 2");
        pessoa_selecionada.getPerfil().adicionarConquista("Vereador Nato", "Amigo de todo mundo, famoso vereador!", "Medalha da comunidade!");
        pessoa_selecionada.getPerfil().adicionarConquista("ILUMINADO", "Restaure a energia no Bloco de Administração", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("DRENADO", "Drene os esgotos", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("INFORMADO", "Colete 15 documentos e complete 15 gravações", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("ENSOPADO", "Ative os aspersores de incêndio na Ala Masculina", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("EMANCIPADO", "Colete a chave na ala feminina", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("CASTIGADO", "Termine o jogo", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("ARQUIVISTA", "Colete todos os documentos", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("LEGADO", "Complete todas as notas", "Outlast");
        pessoa_selecionada.getPerfil().adicionarConquista("LUNÁTICO", "Termine o jogo no modo Insano", "Outlast");
    }
}
