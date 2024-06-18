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

    public String getNomeGrupo() {
        return nome_grupo;
    }

    public void setNomeGrupo(String nome_grupo) {
        this.nome_grupo = nome_grupo;
    }

    public String getDescGrupo() {
        return desc_grupo;
    }

    public void setDescGrupo(String desc_grupo) {
        this.desc_grupo = desc_grupo;
    }

    public int getNumVagas() {
        return num_vagas;
    }

    public void setNumVagas(int num_vagas) {
        this.num_vagas = num_vagas;
    }
}
