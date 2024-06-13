public class Cadastro{
    protected String email;
    protected String senha;
    protected Perfil perfil;
    protected double saldo;

    Cadastro (String email, String senha, Perfil perfil, double saldo) {
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
}
