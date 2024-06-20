package Models;

public abstract class Membro {
    protected String nome_membro;

    public Membro(String nome_membro) {
        this.nome_membro = nome_membro;
    }

    public String getNomeMembro() {
        return nome_membro;
    }

    public void setNomeMembro(String nome_membro) {
        this.nome_membro = nome_membro;
    }

    public abstract void verMembros();
}
