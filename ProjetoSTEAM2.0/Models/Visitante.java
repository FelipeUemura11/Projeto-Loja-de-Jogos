package Models;

public class Visitante extends Membro{
    private String tipo_visitante; // Calouro ou Veterano

    public Visitante(String nome_membro, String tipo_visitante) {
        super(nome_membro);
        this.tipo_visitante = tipo_visitante;
    }

    public String getTipo_visitante() {
        return tipo_visitante;
    }

    public void setTipo_visitante(String tipo_visitante) {
        this.tipo_visitante = tipo_visitante;
    }
    
}
