package Models;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String nome_grupo;
    private String desc_grupo;
    private int num_vagas;
    public List<Membro> membros;

    public Grupo(String nome_grupo, String desc_grupo, int num_vagas) {
        this.nome_grupo = nome_grupo;
        this.desc_grupo = desc_grupo;
        this.num_vagas = num_vagas;
        this.membros = new ArrayList<>();
    }
    // funcao para adicionar membro
    public void adicionarMembro(Membro membro){
        membros.add(membro);
    }
    
    public String getNomeGrupo() {
        return nome_grupo;
    }

    public List<Membro> getMembros(){
        return membros;
    }

    public String getDescGrupo() {
        return desc_grupo;
    }

    public int getNumVagas() {
        return num_vagas;
    }
    @Override
    public String toString() {
        return "Grupo:" + this.nome_grupo + "\nDescricao: " + this.desc_grupo + "\nNumero de Vagas: " + this.num_vagas;
    }

}
