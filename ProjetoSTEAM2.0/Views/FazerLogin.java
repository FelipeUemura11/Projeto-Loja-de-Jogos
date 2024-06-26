package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Controller.ConquistasController;
import Controller.GrupoController;
import Controller.JogosController;

import Models.ListaJogo;
import Models.ListaDestaque;
import Models.ListaOferta;

import Models.Cadastro;
import Models.Amigo;
import Models.Grupo;
import Models.Membro;
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
        
        // MENU PRINCIPAL
        List<ListaJogo> jogos = new ArrayList<>();
        List<ListaDestaque> destaques = new ArrayList<>();
        List<ListaOferta> ofertas = new ArrayList<>();
        List<Grupo> grupos = new ArrayList<>();

        JogosController jogos_controller = new JogosController();
        jogos_controller.jogosExistentes(jogos, destaques, ofertas); // adicao de jogos no sistema

        ConquistasController conquista_controller = new ConquistasController();
        conquista_controller.conquistasExistentes(pessoa_selecionada); // adicao de conquistas

        GrupoController grupo_controller = new GrupoController();
        grupo_controller.gruposExistentes(grupos); // adicao de grupos

        int opc = -1;
        do{
            System.out.println("-=-=-=-=> Menu <=-=-=-=-");
            System.out.println(" >    1. Perfil      < ");
            System.out.println(" >    2. Biblioteca  < ");
            System.out.println(" >    3. Loja        < ");
            System.out.println(" >    4. Comunidade  < ");
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
                    System.out.println(" >  5. Conquistas         < ");
                    System.out.println(" >  6. Deletar Conta      < ");
                    System.out.println(" >  0. Voltar ao Menu     < ");
                    System.out.println();
                    
                    System.out.print("Escolha uma opcao: ");
                    opcao = scan.nextInt();
                    scan.nextLine();
        
                    switch(opcao){
                        case 1: // DETALHES DA CONTA
                            System.out.println("\n==> DETALHES DA CONTA <=======\n");
                            System.out.println(pessoa_selecionada.toString());
                            System.out.println("\n==> DETALHES DA CONTA <=======");
                            break;
                        case 2: // MINHA CARTEIRA
                            System.out.println("\n============ SALDO ============");
                            System.out.println(" >> Seu saldo: R$"+pessoa_selecionada.getPerfil().getSaldo());
                            System.out.println(" >> Deseja adicionar dinheiro? << ");
                            System.out.println(" >>      SIM[1]    NAO[2]      << ");
                            int sim_nao = scan.nextInt();

                            if(sim_nao == 1){
                                System.out.print("-> Informe a quantidade a ser adicionada: ");
                                double saldo_adicional = scan.nextDouble();

                                pessoa_selecionada.getPerfil().setSaldo(pessoa_selecionada.getPerfil().getSaldo() + saldo_adicional);

                                System.out.println("-> Saldo Atualizado! Saldo atual: R$"+ pessoa_selecionada.getPerfil().getSaldo());
                                System.out.println("\n============ SALDO ============\n");
                            
                            }else{
                                break;
                            }
                            break;
                        case 3: // AMIGOS

                            int escolha = -1;
                            String nome_amigo = "";
                            boolean amg_encontrado = false;

                            do{
                                System.out.println("=========== Amigos =========== ");
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
                                                System.out.println("\n >> Novo amigo adicionado! ["+pessoas.getPerfil().getNome()+"] << \n");
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
                            // GRUPO "FANTASMA" PARA O USUARIO FICAR NELE TEMPORARIAMENTE QUANDO FOR SAIR DE ALGUM GRUPO
                            Grupo nenhum = new Grupo("Nenhum", "Nenhum", 0);
                            // CLASSE MEMBRO(VISITANTE) PARA ENTRAR NO GRUPO
                            Visitante v = new Visitante(pessoa_selecionada.getPerfil().getNome(), "Calouro");
                            
                            
                            do{
                                System.out.println("=========== Grupos =========== ");
                                System.out.println(" > 1. Entrar em um grupo    < ");
                                System.out.println(" > 2. Sair do grupo         < ");
                                System.out.println(" > 3. Listar os Grupos      < ");
                                System.out.println(" > 4. Analisar Grupo        < ");
                                System.out.println(" > 0. Voltar ao perfil      < ");
                                System.out.println();
                                
                                System.out.print("Escolha uma opcao: ");
                                op = scan.nextInt();
                                scan.nextLine();
                                
                                switch(op){
                                    case 1:
                                        boolean grupo_encontrado_entrar = false;
                                        if(pessoa_selecionada.getPerfil().getGrupo().getNomeGrupo().equals(nenhum.getNomeGrupo())){
                                            System.out.println(" >> ENTRAR EM UM GRUPO << ");
                                            System.out.println("====================================================");
                                            for(Grupo g : grupos){
                                                System.out.print("["+g.getNomeGrupo()+"] ");
                                            }
                                            System.out.println("\n====================================================");
                                            System.out.print("\nInforme o nome do grupo: ");
                                            String nome_grupo_entrar = scan.nextLine();
                                            

                                            for(Grupo g : grupos){
                                                if(g.getNomeGrupo().equals(nome_grupo_entrar)){
                                                    if(g.getNumVagas() < 1){
                                                        System.out.println(" >> Grupo lotado! << ");
                                                    }else{
                                                        System.out.println("\n->Entrou no grupo ["+g.getNomeGrupo()+"]\n");
                                                        g.adicionarMembro(v);
                                                        g.setNumVagas(g.getNumVagas() - 1);
                                                        pessoa_selecionada.getPerfil().setGrupo(g);
                                                        grupo_encontrado_entrar = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if(!grupo_encontrado_entrar){
                                                System.out.println(" >> Grupo nao encontrado! << ");
                                            }
                                        }else{
                                            System.out.println(" >> Voce ja esta em um grupo! << ");
                                        }
                                        break;
                                    case 2:
                                        boolean grupo_encontrado_sair = false;
                                        if(!pessoa_selecionada.getPerfil().getGrupo().getNomeGrupo().equals(nenhum.getNomeGrupo())){
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
                                        }else{
                                            System.out.println(" >> Voce nao esta em um grupo! << ");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("---------------LISTA-DE-GRUPOS---------------");
                                        for(Grupo g : grupos){
                                            System.out.println("\n"+g.toString()+"\n");
                                        }
                                        System.out.println("---------------LISTA-DE-GRUPOS---------------");
                                        break;
                                    case 4:
                                        System.out.print("Informe o nome do grupo: ");
                                        String nome_grupo_buscar = scan.nextLine();

                                        for(Grupo g : grupos){
                                            if(g.getNomeGrupo().equals(nome_grupo_buscar)){
                                                System.out.println("---------------INFO-GRUPO---------------");
                                                System.out.println(g.toString());
                                                System.out.println("\n >> Membros << ");
                                                for(Membro m : g.getMembros()){
                                                    m.verMembros();
                                                }
                                                System.out.println("---------------INFO-GRUPO---------------");
                                            }
                                        }
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
                        case 5: // CONQUISTAS

                            int options = -1;    

                            System.out.println("\n=========== CONQUISTAS ===========");
                            System.out.println(" >     1. Lista de Conquista    < "); 
                            System.out.println(" >     2. Add nova Conquista    < ");
                            System.out.println(" >     0. Voltar                < ");
                            System.out.println();

                            System.out.print("Escolha uma das opcoes: ");
                            options = scan.nextInt();
                            scan.nextLine();

                            switch(options){
                                case 1:
                                    System.out.println("=========== MINHAS CONQUISTAS ===========");
                                    pessoa_selecionada.getPerfil().listarConquistas();
                                    System.out.println();
                                    System.out.println("=========== MINHAS CONQUISTAS ===========");
                                    break;
                                case 2:
                                    System.out.println(" >> ADICIONAR << ");
                                    System.out.print("Informe o titulo da conquista: ");
                                    String titulo = scan.nextLine();

                                    System.out.print("Informe a descricao da conquista: ");
                                    String desc_conquista = scan.nextLine();

                                    System.out.print("Informe o jogo a que essa conquista se refere: ");
                                    String jogo = scan.nextLine();

                                    pessoa_selecionada.getPerfil().adicionarConquista(titulo, desc_conquista, jogo);
                                    System.out.println(" >> CONQUISTA ADICIONADA! <<");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("---------------------------------------");
                                    System.out.println(" >> Opcao Invalida! Tente novamente << ");
                                    break;
                            }
                            break;
                        case 6: // DELETAR CONTA

                            Login login = new Login();

                            System.out.println("=========== DELETAR CONTA ===========");
                            System.out.println("\nRealmente deseja deletar sua conta?");
                            System.out.println("\t [1] Sim   [2] Nao");
                            int deletar_conta = scan.nextInt();

                            if(deletar_conta == 1){
                                System.out.println("Conta deletada com sucesso!");
                                pessoa.remove(pessoa_selecionada);
                                login.inicio();
                            }else if(deletar_conta == 2){
                                System.out.println("Operacao cancelada!");
                            }else{
                                System.out.println("---------------------------------------");
                                System.out.println(" >> Opcao Invalida! <<");
                            }
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
                case 2: // BIBLIOTECA
                    Biblioteca biblioteca = new Biblioteca();
                    biblioteca.gerenciarBiblioteca(pessoa_selecionada);
                    break;
                case 3: // LOJA
                    Loja loja = new Loja();
                    loja.gerenciarLoja(pessoa_selecionada, jogos, destaques, ofertas);
                    break;
                case 4: // COMUNIDADE
                    Comunidade comunidade = new Comunidade();
                    comunidade.gerenciarComunidade(scan);
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