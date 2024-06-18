package Controller;

import java.util.ArrayList;
import java.util.List;

import Models.Grupo;
import Models.Membro;
import Models.Adms;
import Models.Visitante;

public class GrupoController{
    private List<Grupo> grupos = new ArrayList<>();
    private List<Membro> m = new ArrayList<>();
    
    public void preGrupos(){
        grupos.add(new Grupo("GALERA DO TI", "Grupo de amigos que fazem ciencia da computacao na UP", 45));
        grupos.add(new Grupo("ATLETAS DE CRISTO", "Grupo de jogadores abencoados", 40));
        grupos.add(new Grupo("Torcida Furiosa", "Torcida organizada da Furia E-sports", 500));
        
    }
    
    public void preMembros(){
        for(Grupo g : grupos){
            for(int i = 0; i < g.getNumVagas(); i++){
                if(g.getNomeGrupo().equals("GALERA DO TI")){
                    m.add(new Adms("Gabriel", "Diretor"));
                    m.add(new Visitante("Felipe", "Calouro"));
                    m.add(new Visitante("John", "Veterano"));
                    m.add(new Visitante("Eduardo", "Veterano"));
                    m.add(new Visitante("Luiz", "Calouro"));
                }else if(g.getNomeGrupo().equals("ATLETAS DE CRISTO")){
                    m.add(new Adms("Jose", "Diretor"));
                    m.add(new Adms("Maria", "Dretor"));
                    m.add(new Adms("Gabriel", "Moderador"));
                    m.add(new Visitante("Joao", "Veterano"));
                    m.add(new Visitante("Pedro", "Calouro"));
                    m.add(new Visitante("Thiago", "Calouro"));
                }else if(g.getNomeGrupo().equals("Torcida Furiosa")){
                    m.add(new Adms("Rafael", "Adiministrador"));
                    m.add(new Adms("Henrique", "Adiministrador"));
                    m.add(new Visitante("Arthur", "Veterano"));
                    m.add(new Visitante("Mateus", "Calouro"));
                }
            }
        }
    }

}