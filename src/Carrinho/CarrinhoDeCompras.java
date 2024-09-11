package Carrinho;
import Produtos.Compras;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
    public List<Compras> listaCompras;

    public CarrinhoDeCompras() {
        this.listaCompras = new ArrayList<>();
    }
        
    public void adicionarCompra(String nome, double preco, int quantidade) {
        listaCompras.add(new Compras(nome, preco, quantidade));
    }
    
    public void removerCompra(String nome) {
        List<Compras> ComprasParaRemover = new ArrayList<Compras>();
        for(Compras c : listaCompras) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                ComprasParaRemover.add(c);
            }
        }
        listaCompras.removeAll(ComprasParaRemover);
    }

    public void calcularValorTotal() {
        double ValorTolal = 0;
        for(Compras v : listaCompras) {
           double somaDeCada = v.getPreco() * v.getQuantidade();
           ValorTolal += somaDeCada;
        }
        System.out.println("Valor Total da Compra : " + ValorTolal);
    }

    public void exibirItens() {
        System.out.println("Itens no Carrinho: " + listaCompras);
    }

    public static void main(String[] args) {
        
        // instâncias exemplo.
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarCompra("Farinha", 5.50 , 3);
        carrinho.adicionarCompra("Açucar", 3.20,3);
        carrinho.adicionarCompra("Manteiga", 2.20,2);
        carrinho.adicionarCompra("Feijão", 4.50,6);
        carrinho.adicionarCompra("Arroz", 19.00,4);
        carrinho.adicionarCompra("Papel Higiênico", 5.0,2);
        carrinho.adicionarCompra("Achocolatado", 4.5,2);


        carrinho.exibirItens();

        carrinho.calcularValorTotal();

        carrinho.removerCompra("Feijão");

        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }
}
    

