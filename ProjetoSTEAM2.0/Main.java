import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void criarPerfil(Scanner scan, List<Cadastro> pessoa) {

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
                System.out.println("Senhas diferentes!");
            }else{
                verificarSenha = true;
                break;
            }
        }

        pessoa.add(new Cadastro(email, senha, novoperfil, 0.0));
        System.out.println("\n >> Perfil criado com sucesso! << ");
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
                    System.out.print("Email nao encontrado...\n");
                    break;
                }else{
                    emailVerificado = true;
                    pessoaSelecionada = pessoas; // armazena a pessoa certa na variavel pessoaSelecionada
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
            System.out.println(" >    6. Sair        < ");
            System.out.println();
            
            System.out.print("Escolha uma opcao: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch(opc){
                case 1:

                int opcao = 0;

                while(opcao != 7){
                    System.out.println("\n-=-=-=-=> Perfil <=-=-=-=-\n");
                    System.out.println(" >  1. Detalhes da Conta  < ");
                    System.out.println(" >  2. Minha Carteira     < ");
                    System.out.println(" >  3. Amigos             < ");
                    System.out.println(" >  4. Grupos             < ");
                    System.out.println(" >  5. Desejos            < ");
                    System.out.println(" >  6. Deletar Conta      < ");
                    System.out.println(" >  7. Voltar ao Menu     < ");
                    System.out.println();
                    
                    System.out.print("Escolha uma opcao: ");
                    opcao = scan.nextInt();
                    scan.nextLine();
        
                    switch(opcao){
                        case 1: // DETALHES DA CONTA
                            System.out.println("-----------------------------");
                            System.out.println(" >> Nome: "+pessoaSelecionada.getPerfil().getNome());
                            System.out.println(" >> Email: "+pessoaSelecionada.getEmail());
                            System.out.println(" >> Senha: "+pessoaSelecionada.getSenha());
                            System.out.println(" >> Saldo: "+pessoaSelecionada.getSaldo());
                            System.out.println("-----------------------------");
                            break;
                        case 2: // MINHA CARTEIRA
                            System.out.println("-----------------------------");
                            System.out.println(" >> Seu saldo: R$"+pessoaSelecionada.getSaldo());
                            System.out.print(" >> Deseje adicionar dinheiro? sim(1) / nao(2): ");
                            int sim_nao = scan.nextInt();

                            if(sim_nao == 1){
                                System.out.print(" >> Informe a quantidade a ser adicionada: ");
                                double saldo_adicional = scan.nextDouble();

                                pessoaSelecionada.setSaldo(pessoaSelecionada.getSaldo() + saldo_adicional);

                                System.out.println(" >> Saldo Atualizado! Saldo atual: R$"+ pessoaSelecionada.getSaldo());
                                System.out.println("-----------------------------");
                            
                            }else{
                                break;
                            }
                            break;
                        case 3: // AMIGOS

                            int escolha = 0;
                            boolean encontrado = false;
                            String nome_amigo = "";

                            System.out.println("\n-=-=-=-=> Amigos <=-=-=-=-\n");
                            System.out.println(" > 1. Adicionar novo amigo  < ");
                            System.out.println(" > 2. Remover um amigo      < ");
                            System.out.println(" > 3. Lista de amigos       < ");
                            System.out.println(" > 4. buscar um amigo       < ");
                            System.out.println(" > 5. Voltar ao perfil      < ");
                            System.out.println();

                            System.out.print("Escolha uma opcao: ");
                            escolha = scan.nextInt();
                            scan.nextLine();

                            if(escolha == 1){
                                System.out.println(" >> ADICIONAR << ");
                                System.out.println("Informe o nome do amigo: ");
                                nome_amigo = scan.nextLine();

                                for(Cadastro pessoas : pessoa){
                                    if(pessoas.getPerfil().getNome().equals(nome_amigo)){
                                        System.out.println("Novo amigo adicionado! -> "+pessoas.getPerfil().getNome());
                                        pessoaSelecionada.getPerfil().amigos.add(new Amigo(pessoas.getPerfil().getNome()));
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if(!encontrado){
                                    System.out.println("---------------------------------------");
                                    System.out.println("Amigo nao encontrado!");
                                }
                            }else if(escolha == 2){
                                System.out.println(" >> REMOVER <<");
                                System.out.println("Informe o nome do amigo: ");
                                nome_amigo = scan.nextLine();
                                /* 
                                if(pessoaSelecionada.getPerfil().amigos.getNomeAmigo().equals(nome_amigo)){
                                  System.out.println("Amigo Removido! -> "+pessoaSelecionada.getPerfil().getNome());
                                  pessoaSelecionada.getPerfil().amigos.getNomeAmigo().remove();
                                }else{
                                    System.out.println("Amigo nao encontrado!");
                                } */
                                
                            }else if(escolha == 3){
                                    // LISTA DE AMIGOS
                            }else if(escolha == 4){
                                    // BUSCA DE AMIGOS
                            }else{
                                break;
                            }
                            break; 
                        case 4: // GRUPOS
                            break;
                        case 5: // DESEJOS
                            break;
                        case 6: //  DELETAR CONTA
                            break;
                        case 7: // VOLTAR AO MENU
                            break;
                        default:
                            System.out.println("---------------------------------------");
                            System.out.println(" >> Opcao Invalida! Tente novamente << ");
                    }
        
               };
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
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
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
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
            }
        }while(opcao != 3);
        
        System.out.println("Saindo do pragrama...");
    }

}


