package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Models.Amigo;
import Models.Cadastro;
import Models.Grupo;

public class FazerLogin {

    Scanner scan = new Scanner(System.in);

    public void funcaoFazerLogin(List<Cadastro> pessoa){

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
                System.out.println("Email nao encontrado...");
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

            if(!senhaVerificado){
                System.out.println("Senha incorreta...");
            }
        }

        if(emailVerificado && senhaVerificado){
            System.out.println("\n >> Login realizado com sucesso como " + pessoa_selecionada.getPerfil().getNome() + "! << ");
        }
        
        int opc = -1;

        do{
            System.out.println("\n-=-=-=-=> Menu <=-=-=-=-\n");
            System.out.println(" >    1. Perfil      < ");
            System.out.println(" >    2. Biblioteca  < ");
            System.out.println(" >    3. Loja        < ");
            System.out.println(" >    4. Noticias    < ");
            System.out.println(" >    5. Comunidade  < ");
            System.out.println(" >    0. Sair        < ");
            System.out.println();
            
            System.out.print("Escolha uma opcao: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch(opc){
                case 1:

                int opcao = -1;

                while(opcao != 0){
                    System.out.println("\n-=-=-=-=> Perfil <=-=-=-=-\n");
                    System.out.println(" >  1. Detalhes da Conta  < ");
                    System.out.println(" >  2. Minha Carteira     < ");
                    System.out.println(" >  3. Amigos             < ");
                    System.out.println(" >  4. Grupos             < ");
                    System.out.println(" >  5. Desejos            < ");
                    System.out.println(" >  6. Deletar Conta      < ");
                    System.out.println(" >  0. Voltar ao Menu     < ");
                    System.out.println();
                    
                    System.out.print("Escolha uma opcao: ");
                    opcao = scan.nextInt();
                    scan.nextLine();
        
                    switch(opcao){
                        case 1: // DETALHES DA CONTA
                            System.out.println("\n-----------------------------");
                            System.out.println(pessoa_selecionada.toString());
                            System.out.println("-----------------------------");
                            break;
                        case 2: // MINHA CARTEIRA
                            System.out.println("-----------------------------");
                            System.out.println(" >> Seu saldo: R$"+pessoa_selecionada.getSaldo());
                            System.out.print(" >> Deseje adicionar dinheiro? sim(1) / nao(2): ");
                            int sim_nao = scan.nextInt();

                            if(sim_nao == 1){
                                System.out.print(" >> Informe a quantidade a ser adicionada: ");
                                double saldo_adicional = scan.nextDouble();

                                pessoa_selecionada.setSaldo(pessoa_selecionada.getSaldo() + saldo_adicional);

                                System.out.println(" >> Saldo Atualizado! Saldo atual: R$"+ pessoa_selecionada.getSaldo());
                                System.out.println("-----------------------------");
                            
                            }else{
                                break;
                            }
                            break;
                        case 3: // AMIGOS

                            int escolha = -1;
                            String nome_amigo = "";
                            boolean encontrado = false;

                            System.out.println("\n-=-=-=-=> Amigos <=-=-=-=-\n");
                            System.out.println(" > 1. Adicionar novo amigo  < ");
                            System.out.println(" > 2. Remover um amigo      < ");
                            System.out.println(" > 3. Lista de amigos       < ");
                            System.out.println(" > 4. buscar um amigo       < ");
                            System.out.println(" > 0. Voltar ao perfil      < ");
                            System.out.println();

                            System.out.print("Escolha uma opcao: ");
                            escolha = scan.nextInt();
                            scan.nextLine();

                            switch(escolha){
                                case 1:
                                    System.out.println(" >> ADICIONAR << ");
                                    System.out.print("Informe o nome do amigo: ");
                                    nome_amigo = scan.nextLine();

                                    for(Cadastro pessoas : pessoa){
                                        if(pessoas.getPerfil().getNome().equals(nome_amigo)){
                                            encontrado = true;
                                            System.out.println("Novo amigo adicionado! -> "+pessoas.getPerfil().getNome());
                                            pessoa_selecionada.getPerfil().amigos.add(new Amigo(pessoas.getPerfil().getNome()));
                                            break;
                                        }
                                    }
                                    if(!encontrado){
                                        System.out.println("Amigo nao encontrado!");
                                    }
                                    break;
                                case 2:
                                    System.out.println(" >> REMOVER << ");
                                    System.out.print("Informe o nome do amigo: ");
                                    nome_amigo = scan.nextLine();
                                    
                                    if(pessoa_selecionada.getPerfil().buscarAmigo(nome_amigo) == null){
                                        System.out.println("ERRO : Amigo nao encontrado!");
                                    }else{
                                        System.out.println("Amigo Removido! -> "+nome_amigo);
                                        pessoa_selecionada.getPerfil().removerAmigo(nome_amigo);     
                                    }
                                    break;
                                case 3:
                                    System.out.println(" >> LISTA << ");
                                    pessoa_selecionada.getPerfil().listarAmigos();
                                    break;
                                case 4:
                                    System.out.println(" >> BUSCAR << ");
                                    System.out.print("Informe o nome do amigo: ");
                                    nome_amigo = scan.nextLine();

                                    if(pessoa_selecionada.getPerfil().buscarAmigo(nome_amigo) == null){
                                          System.out.println("ERRO : Amigo nao encontrado!");
                                    }else{
                                        System.out.println("Amigo encontrado! -> "+nome_amigo);
                                    }
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("---------------------------------------");
                                    System.out.println(" >> Opcao Invalida! << ");
                                    break;
                            }
                            break; 
                        case 4: // GRUPOS

                            int op = -1;
                            Grupo grupo = new Grupo("", "", 0);
                            List<Grupo> grupos = new ArrayList<>();

                            grupo.gruposExistentes(grupos);

                            System.out.println("\n-=-=-=-=> Grupos <=-=-=-=-\n");
                            System.out.println(" > 1. Entrar em um grupo    < ");
                            System.out.println(" > 2. Ver grupos            < ");
                            System.out.println(" > 0. Voltar ao perfil      < ");

                            System.out.print("Escolha uma opcao: ");
                            op = scan.nextInt();
                            scan.nextLine();

                            switch(op){
                                case 1:
                                    System.out.println(" >> ENTRAR EM UM GRUPO << ");
                                    System.out.print("Informe o nome do grupo: ");
                                    
                                    break;
                                case 2:
                                    System.out.println("---------------LISTA---------------");
                                    grupo.toString();
                                    System.out.println("---------------LISTA---------------");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("---------------------------------------");
                                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
                                    break;
                            }
                            break;
                        case 5: // DESEJOS
                            break;
                        case 6: //  DELETAR CONTA
                            break;
                        case 0: // VOLTAR AO MENU
                            break;
                        default:
                            System.out.println("---------------------------------------");
                            System.out.println(" >> Opcao Invalida! Tente novamente << ");
                            break;
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
                case 0:
                    // VOLTAR AO MENU
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
            }

        }while(opc != 0);

    }

}
