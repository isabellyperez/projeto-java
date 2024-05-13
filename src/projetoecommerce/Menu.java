package projetoecommerce;

import java.io.IOException;
import java.util.InputMismatchException;

import java.util.Scanner;

import projetoecommerce.util.Cores;
import projetoecommerce.model.Alimento;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String nome;
		
		System.out.print("Caro cliente, para iniciarmos digite seu nome: ");
		nome = leia.nextLine();

		while(true) {  

			System.out.println(Cores.TEXT_BLACK_BOLD + Cores.ANSI_WHITE_BACKGROUND
					+"***********************************************************");
			System.out.println("                                                           ");
			System.out.println("                LANCHONETE FRANCO PEREZ                    ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println("                                                           ");
     		System.out.println("            1 - Adicionar Alimento a Cesta de Compras      ");
			System.out.println("            2 - Visualizar Cesta de Compras                ");
			System.out.println("            3 - Remover Alimento da Cesta                  ");
			System.out.println("            4 - Finalizar Compra                           ");
			System.out.println("            5 - Sair                                       ");
			System.out.println("                                                           ");
			System.out.println("***********************************************************");
			System.out.println(nome + ", entre com a opção desejada:                      ");
			System.out.println("                                                           " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 5) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nLanchonete Franco Perez - Tradição e Qualidade"
						+ " para toda sua família!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Adicionar Alimento a Cesta de Compras\n\n");
					keyPress();
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Visualizar Cesta de Compras\n\n");
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Remover Alimento da Cesta\n\n");
					keyPress();
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Finalizar Compra\n\n");
					keyPress();
					break;					
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}

	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Isabelly F. Perez");
		System.out.println("Isabelly Perez - isabellyfperez@outlook.com");
		System.out.println("	");
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