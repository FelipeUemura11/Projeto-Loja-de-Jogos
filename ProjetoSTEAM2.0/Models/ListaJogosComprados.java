package Models;

public class ListaJogosComprados{

    private String comprado;

    public ListaJogosComprados(String comprado) {
        this.comprado = comprado;
    }

    public String getComprados() {
        return comprado;
    }

    public void setComprados(String comprado) {
        this.comprado = comprado;
    }

    @Override
    public String toString() {
        return " - "+comprado;
    } 
}
