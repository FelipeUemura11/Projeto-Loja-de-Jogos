package Models;

import java.util.List;
import java.util.Scanner;

public class Loja {

    Scanner scan = new Scanner(System.in);

    public void gerenciarLoja(Cadastro pessoa_selecionada, List<ListaJogo> jogos, List<ListaDestaque> destaques, List<ListaOferta> ofertas) {

        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n=========== Loja ===========");
            System.out.println("1. Ver jogos");
            System.out.println("2. Ver Destaques");
            System.out.println("3. Ver Ofertas");
            System.out.println("4. Comprar jogo");
            System.out.println("5. Adicionar desejo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1: // lista de jogos
                    exibirJogos(jogos);
                    break;
                case 2: // lista de destaques
                    exibirDestaques(destaques);
                    break;
                case 3: // lista de ofertas
                    exibirOfertas(ofertas);
                    break;
                case 4:
                    comprarJogo(pessoa_selecionada, jogos, destaques, ofertas);
                    break;
                case 5:
                    desejarJogo(pessoa_selecionada, jogos, destaques, ofertas);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("---------------------------------------");
                    System.out.println(" >> Opcao Invalida! << ");
                    break;
            }
        }
    }

    
    
    
    public void exibirJogos(List<ListaJogo> jogos){
        
        System.out.println("\n         >> JOGOS <<         \n");
        System.out.println("==>[FPS]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("FPS")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[RPG]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("RPG")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Terror]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Terror")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[SoulsLike]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("SoulsLike")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Indie]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Indie")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
        System.out.println("==>[Plataforma]]<============================================\n");
        for(ListaJogo j : jogos){
            for(Categoria c : j.getCategoria()){
                if(c.getNomeCategoria().equals("Plataforma")){
                    System.out.println("Nome: " + j.getTitulo());
                    System.out.println("Preco: R$" + j.getPreco());
                    System.out.println();
                }
            }
        }
    }

    public void exibirDestaques(List<ListaDestaque> destaques){

        System.out.println("\n=========== DESTAQUES ===========");
        System.out.println("\n     !!!Destaques da semana!!!\n");
        System.out.println("----------------------------------");
        for (ListaDestaque destaque : destaques) {
            System.out.println(destaque.toString());
            System.out.println("----------------------------------");
        }
        
    }
    public void exibirOfertas(List<ListaOferta> ofertas) {
        
        System.out.println("\n=========== OFERTAS ===========");
        System.out.println("\n     !!!Ofertas da semana!!!\n");
        System.out.println("----------------------------------");
        for (ListaOferta oferta : ofertas) {
            System.out.println(oferta.toString());
            System.out.println("----------------------------------");
        }
        
    }
    public void comprarJogo(Cadastro pessoa_selecionada, List<ListaJogo> jogos, List<ListaDestaque> destaques, List<ListaOferta> ofertas) {
    
        boolean encontrado = false;

        System.out.println("\n=========== CARRINHO ===========");

        System.out.print("Informe o jogo que deseja comprar: ");
        String jogo_selecionado = scan.nextLine();
        
        for(ListaJogo j : jogos){
            if(j.getTitulo().equals(jogo_selecionado)){
                encontrado = true;
                System.out.println("Jogo: ["+j.getTitulo()+"] - Preco: ["+j.getPreco()+"]");
                System.out.println("Seu saldo atual: "+pessoa_selecionada.getPerfil().getSaldo());

                System.out.println("\nDeseje efetuar a compra?");
                System.out.println("   SIM [1]   NAO[2]");
                int escolha = scan.nextInt();
                
                if(escolha == 1){
                    if(pessoa_selecionada.getPerfil().getSaldo() >= j.getPreco()){
                        pessoa_selecionada.getPerfil().setSaldo(pessoa_selecionada.getPerfil().getSaldo() - j.getPreco());
                        pessoa_selecionada.getPerfil().adicionarCarrinho(j.getTitulo());
                        System.out.println(" >> O jogo "+j.getTitulo()+" foi Comprado! << ");
                        break;
                    }else{
                        System.out.println(" >> Sem saldo na conta! << ");
                    }
                }else if(escolha == 2){
                    System.out.println(" >> Compra cancelada! << ");
                }else{
                    System.out.println(" >> Opcao invalida! << ");
                }
            }
        }
        for(ListaDestaque d : destaques){
            if(d.getNomeDestaque().equals(jogo_selecionado)){
                encontrado = true;
                System.out.println("Jogo: ["+d.getNomeDestaque()+"] - Preco: ["+d.getPrecoDestaque()+"]");
                System.out.println("Seu saldo atual: "+pessoa_selecionada.getPerfil().getSaldo());

                System.out.println("\nDeseje efetuar a compra?");
                System.out.println("   SIM [1]   NAO[2]");
                int escolha = scan.nextInt();
                
                if(escolha == 1){
                    if(pessoa_selecionada.getPerfil().getSaldo() >= d.getPrecoDestaque()){
                        pessoa_selecionada.getPerfil().setSaldo(pessoa_selecionada.getPerfil().getSaldo() - d.getPrecoDestaque());
                        pessoa_selecionada.getPerfil().adicionarCarrinho(d.getNomeDestaque());
                        System.out.println(" >> O jogo "+d.getNomeDestaque()+" foi Comprado! << ");
                        break;
                    }else{
                        System.out.println(" >> Sem saldo na conta! << ");
                    }
                }else if(escolha == 2){
                    System.out.println(" >> Compra cancelada! << ");
                }else{
                    System.out.println(" >> Opcao invalida! << ");
                }
            }
        }
        for(ListaOferta o : ofertas){
            if(o.getNomeOferta().equals(jogo_selecionado)){
                encontrado = true;
                System.out.println("Jogo: ["+o.getNomeOferta()+"] - Preco: ["+o.getPrecoOferta()+"]");
                System.out.println("Seu saldo atual: "+pessoa_selecionada.getPerfil().getSaldo());

                System.out.println("\nDeseje efetuar a compra?");
                System.out.println("   SIM [1]   NAO[2]");
                int escolha = scan.nextInt();
                
                if(escolha == 1){
                    if(pessoa_selecionada.getPerfil().getSaldo() >= o.getPrecoOferta()){
                        pessoa_selecionada.getPerfil().setSaldo(pessoa_selecionada.getPerfil().getSaldo() - o.getPrecoOferta());
                        pessoa_selecionada.getPerfil().adicionarCarrinho(o.getNomeOferta());
                        System.out.println(" >> O jogo "+o.getNomeOferta()+" foi Comprado! << ");
                        break;
                    }else{
                        System.out.println(" >> Sem saldo na conta! << ");
                    }
                }else if(escolha == 2){
                    System.out.println(" >> Compra cancelada! << ");
                }else{
                    System.out.println(" >> Opcao invalida! << ");
                }
            }
        }
        if(!encontrado){
            System.out.println(" >> Jogo nAo encontrado! << ");
        }
    }
    private void desejarJogo(Cadastro pessoa_selecionada, List<ListaJogo> jogos, List<ListaDestaque> destaques, List<ListaOferta> ofertas) {
        
        boolean encontrado = false;

        System.out.println("\n=========== DESEJOS ===========");

        System.out.print("Informe o jogo que deseje: ");
        String jogo_selecionado = scan.nextLine();

        for(ListaJogo j : jogos){
            if(j.getTitulo().equals(jogo_selecionado)){
                System.out.println("Jogo: ["+j.getTitulo()+"] - Preco: ["+j.getPreco()+"]\n");
                pessoa_selecionada.getPerfil().adicionarListaDeDesejos(j.getTitulo());
                System.out.println(" >> O jogo "+j.getTitulo()+" foi adicionado a lista de desejos! << ");
                encontrado = true;
                break;
            }
        }
        for(ListaDestaque d : destaques){
            if(d.getNomeDestaque().equals(jogo_selecionado)){
                System.out.println("Jogo: ["+d.getNomeDestaque()+"] - Preco: ["+d.getPrecoDestaque()+"]\n");
                pessoa_selecionada.getPerfil().adicionarListaDeDesejos(d.getNomeDestaque());
                System.out.println(" >> O jogo "+d.getNomeDestaque()+" foi adicionado a lista de desejos! << ");
                encontrado = true;
                break;
            }
        }
        for(ListaOferta o : ofertas){
            if(o.getNomeOferta().equals(jogo_selecionado)){
                System.out.println("Jogo: ["+o.getNomeOferta()+"] - Preco: ["+o.getPrecoOferta()+"]\n");
                pessoa_selecionada.getPerfil().adicionarListaDeDesejos(o.getNomeOferta());
                System.out.println(" >> O jogo "+o.getNomeOferta()+" foi adicionado a lista de desejos! << ");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println(" >> Jogo nao encontrado! << ");
        }

    }
}
