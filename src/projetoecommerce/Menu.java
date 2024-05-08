package projetoecommerce;

import java.util.Scanner;
import projetoecommerce.util.Cores;
import projetoecommerce.model.Ecommerce;
import projetoecommerce.model.Produto;

public class Menu {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Ecommerce ecommerce = new Ecommerce();
        int opcao;

        while (true) {
            exibirMenu();
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    ecommerce.fazerLogin();
                    break;
                case 2:
                    ecommerce.cadastrarUsuario();
                    break;
                case 3:
                    ecommerce.listarProdutos();
                    break;
                case 4:
                    adicionarProdutoCarrinho(leia, ecommerce);
                    break;
                case 5:
                    ecommerce.visualizarCarrinho();
                    break;
                case 6:
                    removerProdutoCarrinho(leia, ecommerce);
                    break;
                case 7:
                    ecommerce.finalizarCompra();
                    break;
                case 8:
                    sair();
                    leia.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(Cores.TEXT_GREEN_BOLD + "\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void exibirMenu() {
        System.out.println(Cores.TEXT_BLACK + Cores.ANSI_PURPLE_BACKGROUND
                + "*****************************************************");
        System.out.println("                                                     ");
        System.out.println("                PERFUMES IMPORTADOS ISA              ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("            1 - Fazer Login                          ");
        System.out.println("            2 - Cadastro de Usuário                  ");
        System.out.println("            3 - Listar Produtos Disponíveis          ");
        System.out.println("            4 - Adicionar Produto ao Carrinho        ");
        System.out.println("            5 - Visualizar Carrinho de Compras:      ");
        System.out.println("            6 - Remover Produto do Carrinho:         ");
        System.out.println("            7 - Finalizar Compra                     ");
        System.out.println("            8 - Sair                                 ");
        System.out.println("                                                     ");
        System.out.println("*****************************************************");
        System.out.println("Entre com a opção desejada:                          ");
        System.out.println("                                                     " + Cores.TEXT_RESET);
    }

    public static void adicionarProdutoCarrinho(Scanner leia, Ecommerce ecommerce) {
        System.out.println(Cores.TEXT_WHITE_BOLD + "\nAdicionar Produto ao Carrinho\n");
        System.out.print("Digite o código do produto que deseja adicionar ao carrinho: ");
        int codigo = leia.nextInt();
        Produto produto = encontrarProduto(codigo);
        if (produto != null) {
            ecommerce.adicionarProdutoCarrinho(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void removerProdutoCarrinho(Scanner leia, Ecommerce ecommerce) {
        System.out.println(Cores.TEXT_WHITE_BOLD + "\nRemover Produto do Carrinho\n");
        System.out.print("Digite o código do produto que deseja remover do carrinho: ");
        int codigo = leia.nextInt();
        ecommerce.removerProdutoCarrinho(codigo);
    }

    public static Produto encontrarProduto(int codigo) {
        return null;
    }

    public static void sair() {
        System.out.println(Cores.TEXT_WHITE_BOLD + "\nPerfumes Importados Isa - Use e Abuse para Encantar!");
        sobre();
    }

    public static void sobre() {
        System.out.println(Cores.TEXT_WHITE_BOLD + "\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Isabelly F. Perez");
        System.out.println("Isabelly Perez - isabellyfperez@outlook.com");
        System.out.println("https://github.com/isabellyperez");
        System.out.println("*********************************************************");
    }
}