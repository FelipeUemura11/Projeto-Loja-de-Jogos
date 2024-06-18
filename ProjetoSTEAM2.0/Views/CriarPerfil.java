package Views;

import java.util.Scanner;
import java.util.List;

import Controller.PerfilController;
import Models.Cadastro;
import Models.Grupo;
import Models.Perfil;

public class CriarPerfil {
    
    Scanner scan = new Scanner(System.in);

    public void funcaoCriarPerfil(List<Cadastro> pessoa){
        
        Grupo grupo = new Grupo("Nenhum", "Nenhum", 0);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        Perfil novo_perfil = new Perfil(nome, grupo);
        
        System.out.print("Digite seu email: ");
        String email = scan.nextLine();

        System.out.print("Digite sua senha: ");
        String senha_teste = scan.nextLine();

        boolean verificarSenha = false;
        String senha = "";

        while(!verificarSenha){

            System.out.print("Digite novamente sua senha: ");
            senha = scan.nextLine();

            if(!senha_teste.equals(senha)){
                System.out.println("Senhas diferentes...");
            }else{
                verificarSenha = true;
                break;
            }
        }
        // Adiciona o novo perfil na lista de cadastro e verifica com try/catch
        if(PerfilController.adicionarPerfil(pessoa, email, senha, novo_perfil, 0.0)){
            System.out.println("\n >> Perfil criado com sucesso! << ");
        }else{
            System.out.println("\n >> ERRO : Nao foi possivel adicionar usuario. << ");
        }

        
    }
}
