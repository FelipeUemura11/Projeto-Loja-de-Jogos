package Controller;

import java.util.List;

import Models.Cadastro;
import Models.Perfil;

public class PerfilController {

    public static boolean adicionarPerfil(List<Cadastro> pessoa, String email, String senha, Perfil novo_perfil){
        
        try {
            pessoa.add(new Cadastro(email, senha, novo_perfil));

        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }

        return true;
    }
    
}
