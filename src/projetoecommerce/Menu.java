package projetoecommerce;

import java.util.Scanner;
import projetoecommerce.util.Cores;
import projetoecommerce.model.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		ArrayList<String> perfumes = new ArrayList<String>();	
		String nome;		
		perfumes.add("La Vie Est Belle");
		perfumes.add("Coco Channel 01");
		perfumes.add("One Million");
		perfumes.add("Royal Amber");
		perfumes.add("212 sexy");
		perfumes.add("Good Girl");
		perfumes.add("Delina");
		perfumes.add("Euphoria");
		perfumes.add("Rouge Royal");
		perfumes.add("My Way");
		
		System.out.print("Caro cliente, para iniciarmos digite seu nome: ");
		nome = leia.nextLine();

		while(true) {  

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PERFUMES IMPORTADOS ISA              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			//System.out.println("            1 - Fazer Login                         ");
			//System.out.println("            2 - Cadastro de Usuário                 ");
			System.out.println("            1 - Listar Produtos Disponíveis          ");
			System.out.println("            2 - Adicionar Produto ao Carrinho        ");
			System.out.println("            3 - Visualizar Carrinho de Compras       ");
			System.out.println("            4 - Remover Produto do Carrinho:         ");
			System.out.println("            5 - Finalizar Compra                     ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println(nome + ", entre com a opção desejada:                ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nPerfumes Importados Isa - Use e Abuse para Encantar!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Os perfumes disponíveis em nossa loja são: ");
					for(String perfume : perfumes) {
						System.out.println(perfume);
					}

					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Adicionar Produto ao Carrinho\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Visualizar Carrinho de Compras\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Remover Produto do Carrinho\n\n");

					break;
				case 5:
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
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");
			}
		
	}
}
