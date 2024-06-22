package Models;

public class ListaJogosComprados{

    private String comprados;

    public ListaJogosComprados(String comprados) {
        this.comprados = comprados;
    }

    public String getComprados() {
        return comprados;
    }

    public void setComprados(String comprados) {
        this.comprados = comprados;
    }

    @Override
    public String toString() {
        return "Comprado: " + comprados;
    } 
}
