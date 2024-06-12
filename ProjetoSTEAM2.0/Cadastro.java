public class Cadastro {
    protected String email;
    protected String senha;
    protected Perfil perfil;

    Cadastro (String email, String senha, Perfil perfil) {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(Perfil perfil){
        this.perfil = perfil;
    }
    
}
