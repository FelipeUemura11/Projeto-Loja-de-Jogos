package Models;

public class Cadastro{
    protected String email;
    protected String senha;
    protected Perfil perfil;
    protected double saldo;

    public Cadastro (String email, String senha, Perfil perfil, double saldo) {
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
        this.saldo = saldo;
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

    @Override
    public String toString() {
        return "\nNome: " + getPerfil().getNome() + "\nEmail: " + email + "\nSenha: " + senha + "\nSaldo: " + saldo;
    }
}
