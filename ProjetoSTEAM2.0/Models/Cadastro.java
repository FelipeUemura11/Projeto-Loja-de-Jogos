package Models;

public class Cadastro{
    protected String email;
    protected String senha;
    protected Perfil perfil;
    protected double saldo;
    protected Grupo grupo;

    public Cadastro (String email, String senha, Perfil perfil, double saldo, Grupo grupo) {
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
        this.saldo = saldo;
        this.grupo = grupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Perfil getPerfil(){
        return perfil;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Nome: " + getPerfil().getNome() + "\nEmail: " + email + "\nSenha: " + senha + "\nSaldo: R$" + saldo+ "\nGrupo: "+getGrupo().getNomeGrupo();
    }
}
