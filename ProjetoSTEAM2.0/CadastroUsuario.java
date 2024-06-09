import java.util.List;

public class CadastroUsuario extends Cadastro {
    private String senha;
    private List<CadastroUsuario> todosPerfis;

    public CadastroUsuario(Perfil perfil, String senha, List<CadastroUsuario> todosPerfis) {
        super(perfil, todosPerfis);
        this.senha = senha;
        this.todosPerfis = todosPerfis;
    }

    public String getSenha() {
        return senha;
    }

    public Perfil getPerfil() {
        return super.perfil;
    }

    public void adicionarAmigo(String nomeAmigo) {
        boolean perfilExiste = false;
        for (CadastroUsuario perfil : todosPerfis) {
            if (perfil.getPerfil().getNome().equalsIgnoreCase(nomeAmigo)) {
                super.amigos.add(new Amigos(nomeAmigo));
                perfilExiste = true;
                System.out.println("Amigo adicionado com sucesso!");
                break;
            }
        }
        if (!perfilExiste) {
            System.out.println("O perfil " + nomeAmigo + " não existe.");
        }
    }

    public void listarAmigos() {
        System.out.println("Lista de Amigos:");
        for (Amigos amigo : super.amigos) {
            System.out.println(amigo.getNome());
        }
    }
}
