package Models;

public class Adms extends Membro{
    private String moderacao;

    public Adms(String nome_membro, String moderacao){
        super(nome_membro);
        this.moderacao = moderacao;
    }

    public String getModeracao() {
        return moderacao;
    }

    public void setModeracao(String moderacao) {
        this.moderacao = moderacao;
    }
}

