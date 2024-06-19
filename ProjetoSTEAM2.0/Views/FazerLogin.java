package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Controller.GrupoController;
import Models.Amigo;
import Models.Cadastro;
import Models.Grupo;
import Models.Visitante;

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
            System.out.println("\n->Login realizado com sucesso como [" + pessoa_selecionada.getPerfil().getNome() + "]!\n");
        }
        
        int opc = -1;

        do{
            System.out.println("-=-=-=-=-=> Menu <=-=-=-=-=-");
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
                    System.out.println("\n-=-=-=-=-=> Perfil <=-=-=-=-=-");
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
                                System.out.print("-> Informe a quantidade a ser adicionada: ");
                                double saldo_adicional = scan.nextDouble();

                                pessoa_selecionada.setSaldo(pessoa_selecionada.getSaldo() + saldo_adicional);

                                System.out.println("-> Saldo Atualizado! Saldo atual: R$"+ pessoa_selecionada.getSaldo());
                                System.out.println("-----------------------------");
                            
                            }else{
                                break;
                            }
                            break;
                        case 3: // AMIGOS

                            int escolha = -1;
                            String nome_amigo = "";
                            boolean amg_encontrado = false;

                            do{
                                System.out.println("-=-=-=-=-=> Amigos <=-=-=-=-=-");
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
                                                if(pessoas.getPerfil().getNome().equals(pessoa_selecionada.getPerfil().getNome())){
                                                    System.out.println(" >> ERRO : Voce nao pode adicionar voce mesmo! << ");
                                                    amg_encontrado = true; //  nao imprimir as ultimas linhas
                                                    break;
                                                }
                                                amg_encontrado = true;
                                                System.out.println("\n >> Novo amigo adicionado! -> "+pessoas.getPerfil().getNome()+" << \n");
                                                pessoa_selecionada.getPerfil().amigos.add(new Amigo(pessoas.getPerfil().getNome()));
                                                break;
                                            }
                                        }
                                        if(!amg_encontrado){
                                            System.out.println("Amigo nao encontrado...");
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
                            }while(escolha != 0);

                            break; 
                        case 4: // GRUPOS

                            int op = -1;

                            // LISTA DE GRUPOS EXISTENTES
                            List<Grupo> grupos = new ArrayList<>();
                            GrupoController grupo_controller = new GrupoController();
                            // GRUPO "FANTASMA" PARA QUANDO O USUARIO FOR SAIR DE ALGUM GRUPO EXISTENTE
                            Grupo nenhum = new Grupo("Nenhum", "Nenhum", 0);
                            // CLASSE MEMBRO(VISITANTE) PARA ENTRAR NO GRUPO
                            Visitante v = new Visitante(pessoa_selecionada.getPerfil().getNome(), "Calouro");
                            
                            grupo_controller.gruposExistentes(grupos); // adiciona grupos
                            
                            do{
                                System.out.println("-=-=-=-=-=> Grupos <=-=-=-=-=-");
                                System.out.println(" > 1. Entrar em um grupo    < ");
                                System.out.println(" > 2. Sair do grupo         < ");
                                System.out.println(" > 3. Listar os Grupos      < ");
                                System.out.println(" > 0. Voltar ao perfil      < ");
                                System.out.println();
                                
                                System.out.print("Escolha uma opcao: ");
                                op = scan.nextInt();
                                scan.nextLine();
                                
                                switch(op){
                                    case 1:
                                        boolean grupo_encontrado_entrar = false;
                                        System.out.println(" >> ENTRAR EM UM GRUPO << ");
                                        System.out.print("Informe o nome do grupo: ");
                                        String nome_grupo_entrar = scan.nextLine();
                                        
                                        for(Grupo g : grupos){
                                            if(g.getNomeGrupo().equals(nome_grupo_entrar)){
                                                System.out.println("\n->Entrou no grupo ["+g.getNomeGrupo()+"]");
                                                g.adicionarMembro(v);
                                                g.setNumVagas(g.getNumVagas() - 1);
                                                pessoa_selecionada.getPerfil().setGrupo(g);
                                                grupo_encontrado_entrar = true;
                                                break;
                                            }
                                        }
                                        if(!grupo_encontrado_entrar){
                                            System.out.println(" >> Grupo nao encontrado! << ");
                                        }
                                        
                                        break;
                                    case 2:
                                        boolean grupo_encontrado_sair = false;
                                        System.out.println("\n >> SAIR DO GRUPO << ");

                                        for(Grupo g : grupos){
                                            if(g.getNomeGrupo().equals(pessoa_selecionada.getPerfil().getGrupo().getNomeGrupo())){
                                                System.out.println("\n-> Saiu do grupo ["+g.getNomeGrupo()+"]");
                                                g.removerMembro(v);
                                                g.setNumVagas(g.getNumVagas() + 1);
                                                pessoa_selecionada.getPerfil().setGrupo(nenhum);
                                                grupo_encontrado_sair = true;
                                                break;
                                            }
                                        }
                                        if(!grupo_encontrado_sair){
                                            System.out.println(" >> Voce nao esta em nenhum grupo! << ");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("---------------LISTA-DE-GRUPOS---------------");
                                        for(Grupo g : grupos){
                                            System.out.println("\n"+g.toString()+"\n");
                                        }
                                        System.out.println("---------------LISTA-DE-GRUPOS---------------");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("---------------------------------------");
                                        System.out.println(" >> Opcao Invalida! Tente novamente << ");
                                        break;
                                        
                                    }
                                }while(op != 0);
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
