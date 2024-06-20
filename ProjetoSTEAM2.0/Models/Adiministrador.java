package Models;

public class Adiministrador extends Membro{
    private String moderacao;

    public Adiministrador(String nome_membro, String moderacao){
        super(nome_membro);
        this.moderacao = moderacao;
    }
    @Override
    public void verMembros(){
        System.out.println("\nNome: "+ nome_membro +" \nModeracao: "+ moderacao);
    }
}

