import java.util.ArrayList;
import java.util.List;

public class Carrinho extends Loja {
    private List<Jogos> jogos;
    private List<ListaDeDesejos> listaDeDesejos;
    private int finalizarCompra;

    public Carrinho() {
        this.jogos = new ArrayList<>();
        this.listaDeDesejos = new ArrayList<>();
    }

    public void adicionarItem(Jogos jogos, int quantidade) throws Exception {
        if (Jogos.getQuantidade() >= quantidade) {
            jogos.setQuantidade(jogos.getQuantidade() - quantidade);
            this.jogos.add(jogos);
        } else {
            throw new Exception("Estoque insuficiente para o item: " + jogos.getTitulo());
        }
    

    public void removeJogos(Jogos jogo, int quantidade) {
        jogos.remove(jogo);
        jogos.remove = getQuantidade(jogos);
    }

    public void visualizarCarrinho() {
        if (jogos.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        System.out.println("===== Carrinho =====");
        for (Jogos jogo : jogos) {
            System.out.println(jogo);
            System.out.println("----------------------------------");
            }
            for( ListaDeDesejos listaDeDesejos : listaDeDesejos){
                System.out.println(listaDeDesejos);
                System.out.println("----------------------------------");

        }
    }
    public class Pedido {
        public void gerarConfirmacao(Carrinho carrinho, double valorTotal) {
            System.out.println("Pedido confirmado!");
            System.out.println("Itens do pedido:");
            for (Jogos jogo : carrinho.getJogos()) {
                System.out.printf("%s - R$%.2f\n", jogo.getTitulo(), jogo.getPreco());
            }
            System.out.printf("Total: R$%.2f\n", valorTotal);
        }
    }
    

    public List<Jogos> getJogos() {
        return jogos;
    
}

    public void setJogos(List<Jogos> jogos) {
        this.jogos = jogos;
    }

    public List<ListaDeDesejos> getListaDeDesejos() {
        return listaDeDesejos;
    }

    public void setListaDeDesejos(List<ListaDeDesejos> listaDeDesejos) {
        this.listaDeDesejos = listaDeDesejos;
    }

    public int getFinalizarCompra() {
        return finalizarCompra;
    }

    public void setFinalizarCompra(int finalizarCompra) {
        this.finalizarCompra = finalizarCompra;
    }
}
}
