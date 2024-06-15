package Views;

import java.util.Scanner;
import java.util.List;

import Models.Cadastro;
import Models.Perfil;

public class CriarPerfil {
    
    Scanner scan = new Scanner(System.in);

    public void funcaoCriarPerfil(List<Cadastro> pessoa){
        

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        Perfil novoperfil = new Perfil(nome);
        
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

        pessoa.add(new Cadastro(email, senha, novoperfil, 0.0));
        System.out.println("\n >> Perfil criado com sucesso! << ");
    
    }

}
