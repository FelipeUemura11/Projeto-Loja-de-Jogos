import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void criarPerfil(Scanner scan, List<Cadastro> pessoa) {

        System.out.print("Digite seu nick-name: ");
        String nome = scan.nextLine();

        Perfil novoperfil = new Perfil(nome);
        
        System.out.print("Digite seu email: ");
        String email = scan.nextLine();

        System.out.print("Digite a senha do usuário: ");
        String senha_teste = scan.nextLine();

        boolean verificarSenha = false;
        String senha = "";

        while(!verificarSenha){

            System.out.print("Digite novamente sua senha: ");
            senha = scan.nextLine();

            if(!senha_teste.equals(senha)){
                System.out.println("Senhas diferentes!");
            }else{
                verificarSenha = true;
                break;
            }
        }

        pessoa.add(new Cadastro(email, senha, novoperfil));
        System.out.println(" >> Perfil criado com sucesso! << ");
    }

    public static void fazerLogin(Scanner scan, List<Cadastro> pessoa){

        // otimizacao do codigo - 'Cadastro pessoaSeleciona' vai receber a variavel 'pessoas' que estiver encontrada na lista Cadastro
        // essa variavel vai ser reutilizada para verificar a senha e imprimir o nome da pessoa que esta logando!

        Cadastro pessoaSelecionada = null;
        String email = "";
        boolean emailVerificado = false;

        while(!emailVerificado){
            System.out.print(" >> Digite seu email: ");
            email = scan.nextLine();

            for(Cadastro pessoas : pessoa){
                if(!pessoas.getEmail().equals(email)){
                    System.out.print("Email nao encontrado, digite novamente: ");
                    break;
                }else{
                    emailVerificado = true;
                    pessoaSelecionada = pessoas;
                    break;
                }
            }
        }

        String senha = "";
        boolean senhaVerificado = false;

        while(!senhaVerificado){
            System.out.print(" >> Digite sua senha: ");

            while(!pessoaSelecionada.getSenha().equals((senha = scan.nextLine()))){
                System.out.print("Senha Incorreta, digite novamente: ");
            }
            senhaVerificado = true;
            break;
        }

        if(emailVerificado && senhaVerificado){
            System.out.println(" >> Login realizado com sucesso como " + pessoaSelecionada.getPerfil().getNome() + "! << ");
        }

        int opc = 0;

        do{
            System.out.println("\n-=-=-=-=> Menu <=-=-=-=-\n");
            System.out.println(" >    1. Perfil      < ");
            System.out.println(" >    2. Biblioteca  < ");
            System.out.println(" >    3. Loja        < ");
            System.out.println(" >    4. Noticias    < ");
            System.out.println(" >    5. Comunidade  < ");
            System.out.println();
            
            System.out.print("Escolha uma opcao: ");
            opc = scan.nextInt();

            switch(opc){
                case 1:
                    // Perfil
                    // Detalhes da conta
                    break;
                case 2:
                    // Biblioteca
                    // Lista de jogos, Favoritos
                    break;
                case 3:
                    // Loja
                    // Jogos(categorias), Ofertas, Carrinho
                    break;
                case 4:
                    // Noticias
                    // Catalogo, Noticias os jogos
                    break;
                case 5:
                    // Comunidade
                    // Discussoes, Oficina, Transmissoes
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }

        }while(opc != 6);
        
    }
    
    public static void main(String[] args) {
        
        List<Cadastro> pessoa = new ArrayList<>();

        Scanner scan = new Scanner(System.in); 

        int opcao = 0;

        do{
            System.out.println("\n >>>>>>>>>>>>> Login <<<<<<<<<<<<< \n");
            System.out.println("      >>  [1] Nova Conta  <<");
            System.out.println("      >>  [2] Fazer Login <<");
            System.out.println("      >>  [3] Sair        <<");
            System.out.println();
            System.out.print("Escolha uma opcao: ");

            opcao = scan.nextInt();
            scan.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    criarPerfil(scan, pessoa);
                    break;
                case 2:
                    fazerLogin(scan, pessoa);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }while(opcao != 3);
        
        System.out.println("Saindo do pragrama...");
    }

}


