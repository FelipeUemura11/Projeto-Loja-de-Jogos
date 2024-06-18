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
        return "Grupo:" + nome_grupo + "\nDescricao: " + desc_grupo + "\nNumero de Vagas: " + num_vagas;
    }

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
