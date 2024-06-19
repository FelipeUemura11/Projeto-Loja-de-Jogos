package Models;

public class Cadastro{
    protected String email;
    protected String senha;
    protected Perfil perfil;

    public Cadastro (String email, String senha, Perfil perfil) {
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
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

    @Override
    public String toString() {
        return "Nome: " + getPerfil().getNome() + "\nEmail: " + email + "\nSenha: " + senha + "\nSaldo: R$" + getPerfil().getSaldo() + "\nGrupo: " + getPerfil().getGrupo().getNomeGrupo();
    }
}
