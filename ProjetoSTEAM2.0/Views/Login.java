package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Models.Cadastro;

public class Login {

    public void inicio(){
        
        List<Cadastro> pessoa = new ArrayList<>();
        
        CriarPerfil criar_perfil = new CriarPerfil();
        FazerLogin fazer_login = new FazerLogin();
        
        Scanner scan = new Scanner(System.in); 
        
        int opcao = -1;
        
        do{
            System.out.println("\n >>>>>>>>>>>>> Login <<<<<<<<<<<<< \n");
            System.out.println("      >>  [1] Nova Conta  <<");
            System.out.println("      >>  [2] Fazer Login <<");
            System.out.println("      >>  [0] Sair        <<");
            System.out.println();
            System.out.print("Escolha uma opcao: ");
            
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    criar_perfil.funcaoCriarPerfil(pessoa);
                    break;
                case 2:
                    fazer_login.funcaoFazerLogin(pessoa);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
                }
        }while(opcao != 0);
        
        System.out.println("Saindo do pragrama...");
        
        scan.close();
    }
}
    


