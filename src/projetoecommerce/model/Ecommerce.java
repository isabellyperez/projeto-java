package projetoecommerce.model;

import java.util.ArrayList;
import java.util.List;
import projetoecommerce.model.Produto;

public class Ecommerce {
    private List<Produto> carrinho;

    public Ecommerce() {
        this.carrinho = new ArrayList<>();
    }

    // Métodos para adicionar, remover e visualizar produtos no carrinho
    public void adicionarProdutoCarrinho(Produto produto) {
        carrinho.add(produto);
        System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
    }

    public void removerProdutoCarrinho(int codigo) {
        for (int i = 0; i < carrinho.size(); i++) {
            if (carrinho.get(i).getCodigo() == codigo) {
                Produto produtoRemovido = carrinho.remove(i);
                System.out.println("Produto removido do carrinho: " + produtoRemovido.getNome());
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public void visualizarCarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("=== Carrinho de Compras ===");
            for (Produto produto : carrinho) {
                System.out.println(produto);
            }
        }
    }

    // Outros métodos relacionados ao e-commerce
    public void fazerLogin() {
        System.out.println("Fazer Login\n");
    }

    public void cadastrarUsuario() {
        System.out.println("Cadastro de Usuário\n");
    }

    public void listarProdutos() {
        System.out.println("Listar Produtos disponíveis\n");
    }

    public void finalizarCompra() {
        System.out.println("Finalizar Compra\n");
    }
}