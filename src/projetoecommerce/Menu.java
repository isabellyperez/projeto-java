package projetoecommerce;

import java.util.Scanner;
import projetoecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_PURPLE_BACKGROUND
					+"*****************************************************");
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

			opcao = leia.nextInt();

			if (opcao == 8) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nPerfumes Importados Isa - Use e Abuse para Encantar!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Fazer Login\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastro de Usuário\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar Produtos disponíveis\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Adicionar Produto ao Carrinho\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Adicionar Carrinho de Compras\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Remover Produto do Carrinho\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Finalizar Compra\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_GREEN_BOLD + "\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Isabelly F. Perez");
		System.out.println("Isabelly Perez - isabellyfperez@outlook.com");
		System.out.println("https://github.com/isabellyperez");
		System.out.println("*********************************************************");

	}

}
