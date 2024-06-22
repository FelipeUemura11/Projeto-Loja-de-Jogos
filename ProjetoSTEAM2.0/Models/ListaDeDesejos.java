package Models;


public class ListaDeDesejos {
    private String nome_desejo;

    public ListaDeDesejos(String nome_desejo) {
        this.nome_desejo = nome_desejo;
    }

    public String getNomeDesejo() {
        return nome_desejo;
    }

    public void setNomeDesejo(String nome_desejo) {
        this.nome_desejo = nome_desejo;
    }

    @Override
    public String toString() {
        return "ListaDeDesejos: " + nome_desejo;
    }

    
}
