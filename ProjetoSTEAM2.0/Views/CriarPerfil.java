package Views;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import Controller.PerfilController;
import Models.Cadastro;
import Models.Perfil;
import Models.Grupo;

public class CriarPerfil {
    
    Scanner scan = new Scanner(System.in);

    public void funcaoCriarPerfil(List<Cadastro> pessoa){

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        
        Grupo nenhum = new Grupo("Nenhum", "Nenhum", 0);

        Perfil novo_perfil = new Perfil(nome, 0.0, nenhum);
        
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
        if(PerfilController.adicionarPerfil(pessoa, email, senha, novo_perfil)){
            System.out.println("\n >> Perfil criado com sucesso! << ");
            File arquivo = new File("CadastroPessoas.txt");

            try(BufferedWriter br = new BufferedWriter(new FileWriter(arquivo, true))){
                    br.write("--------------------\n");
                    br.write(" >> Nome: "+nome+ "\n");
                    br.write(" >> Email: "+email+ "\n");
                    br.close();
            } catch (Exception e) {
                    e.printStackTrace();
            }
        }else{
            System.out.println("\n >> ERRO : Nao foi possivel adicionar usuario. << ");
        }
    }
}
