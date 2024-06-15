package Views;

import java.util.Scanner;
import java.util.List;

import Models.Cadastro;

public class FazerLogin {

    Scanner scan = new Scanner(System.in);

    public void funcaoFazerLogin(List<Cadastro> pessoa){

        MenuInicial menu_inicial = new MenuInicial();
        Cadastro pessoa_selecionada = null;

        // EMAIL
        String email = "";
        boolean emailVerificado = false;
        // Verificar se email existe
        while(!emailVerificado){

            System.out.print(" >> Digite seu email: ");
            email = scan.nextLine();

            for(Cadastro pessoas : pessoa){
                if(pessoas.getEmail().equals(email)){
                    emailVerificado = true;
                    pessoa_selecionada = pessoas; // armazena a pessoa certa na variavel pessoa_selecionada
                    break;
                }
            }
            if(!emailVerificado){
                System.out.print("Email nao encontrado...");
            }
        }

        // SENHA
        String senha = "";
        boolean senhaVerificado = false;
        // Verificar se a senha esta correta
        while(!senhaVerificado){

            System.out.print(" >> Digite sua senha: ");
            senha = scan.nextLine();

            if(pessoa_selecionada.getSenha().equals(senha)){
                senhaVerificado = true;
                break;
            }

            if(!emailVerificado){
                System.out.print("Senha nao encontrado...");
            }
        }

        if(emailVerificado && senhaVerificado){
            System.out.println("\n >> Login realizado com sucesso como " + pessoa_selecionada.getPerfil().getNome() + "! << ");
        }
        
        menu_inicial.funcaoMenuInicial(pessoa, pessoa_selecionada);
    }
}
