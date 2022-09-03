package aranoua.com.exercicios.calculadora;

import java.util.Scanner;

public class TestaOperacaoMatematica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Soma soma = new Soma();
		Subtracao sub = new Subtracao();
		Multiplicacao mult = new Multiplicacao();
		Divisao div = new Divisao();
		while (true) {
			System.out.println("MENU");
			System.out.println("1 - SOMA");
			System.out.println("2 - SUBTRACAO");
			System.out.println("3 - MULTIPLICACAO");
			System.out.println("4 - DIVISAO");
			System.out.println("5 - SAIR");
			System.out.println();
			System.out.print("Escolha: ");
			int escolha = scanner.nextInt();
			switch (escolha) {
				case 1:
					soma.exibeMensagem();
					break;
				case 2:
					sub.exibeMensagem();
					break;
				case 3:
					mult.exibeMensagem();
					break;
				case 4:
					div.exibeMensagem();
					break;
				case 5:
					System.out.println("SAINDO...");
					System.exit(0);
				default:
					System.out.println("Invalido");
					System.out.println();
			}
		}
		
	}

}
