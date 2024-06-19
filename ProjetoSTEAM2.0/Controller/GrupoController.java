package Controller;

import java.util.List;

import Models.Adiministrador;
import Models.Grupo;
import Models.Visitante;

public class GrupoController {

    public void gruposExistentes(List<Grupo> grupos){
        
        Grupo grupo1 = new Grupo("GALERA DO TI", "Grupo de amigos que fazem ciencia da computacao na UP", 45);
        Grupo grupo2 = new Grupo("ATLETAS DE CRISTO", "Grupo de jogadores abencoados", 40);
        Grupo grupo3 = new Grupo("Torcida Furiosa", "Torcida organizada da Furia E-sports", 500);

        grupo1.adicionarMembro(new Adiministrador("Gabriel", "Diretor"));
        grupo1.adicionarMembro(new Visitante("John", "Veterano"));
        grupo1.adicionarMembro(new Visitante("Eduardo", "Veterano"));
        grupo1.adicionarMembro(new Visitante("Felipe", "Calouro"));
        grupo1.adicionarMembro(new Visitante("Luiz", "Calouro"));
    
        grupo2.adicionarMembro(new Adiministrador("Jose", "Diretor"));
        grupo2.adicionarMembro(new Adiministrador("Maria", "Dretor"));
        grupo2.adicionarMembro(new Adiministrador("Gabriel", "Moderador"));
        grupo2.adicionarMembro(new Visitante("Joao", "Veterano"));
        grupo2.adicionarMembro(new Visitante("Pedro", "Calouro"));
        grupo2.adicionarMembro(new Visitante("Thiago", "Calouro"));
    
        grupo3.adicionarMembro(new Adiministrador("Rafael", "Adiministrador"));
        grupo3.adicionarMembro(new Adiministrador("Henrique", "Adiministrador"));
        grupo3.adicionarMembro(new Visitante("Arthur", "Veterano"));
        grupo3.adicionarMembro(new Visitante("Mateus", "Calouro"));

        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
    }
    
}
