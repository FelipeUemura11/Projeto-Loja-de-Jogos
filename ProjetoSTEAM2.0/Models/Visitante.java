package Models;

public class Visitante extends Membro{
    private String classe_visitante; // Calouro ou Veterano

    public Visitante(String nome_membro, String classe_visitante) {
        super(nome_membro);
        this.classe_visitante = classe_visitante;
    }
    @Override
    public void verMembros() {
        System.out.println("\nNome: "+ nome_membro +" \nClasse: "+ classe_visitante);
    }
}
