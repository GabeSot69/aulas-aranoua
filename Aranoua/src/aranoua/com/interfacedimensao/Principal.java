package aranoua.com.interfacedimensao;

import java.util.Scanner;

public class Principal {
	static InterfaceDimensao dimensao;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		executar();
	}
	
	public static void executar() {
		while (true) {
			System.out.println("MENU");
			System.out.println("1 - VETOR");
			System.out.println("2 - MATRIZ");
			System.out.println("0 - SAIR");
			System.out.print("Escolha: ");
			String escolha = scanner.nextLine();
			switch(escolha) {
				case "1":
					menuVetor();
					break;
				case "2":
					menuMatriz();
					break;
				case "0":
					System.out.println("SAINDO...");
					System.exit(0);
					break;
				default:
					System.out.println("CARACTERE INVALIDO");
					System.out.println();

			}
		}
	}
	
	public static void menuVetor() {
		System.out.println("MENU DE VETOR");
		System.out.println("1 - Vetor Com Tamanho Padrao (2)");
		System.out.println("2 - Vetor Com Tamanho Definido Pelo Usuario");
		String escolha = scanner.nextLine();
		switch(escolha) {
			case "1":
				vetorAdicionarPadrao();
				break;
			case "2": 
				vetorAdicionarTamEspecifico();
				break;
			default:
				System.out.println("CARACTERE INVALIDO");
				System.out.println();
		}
	}

	public static void menuMatriz(){
		System.out.println("MENU DE MATRIZ");
		System.out.println("1 - Matriz Com Tamanho Padrao (2)(2)");
		System.out.println("2 - Matriz Com Tamanho Definido Pelo Usuario");
		String escolha = scanner.nextLine();
		switch(escolha) {
			case "1":
				matrizAdicionarPadrao();
				break;
			case "2":
				matrizAdicionarTamEspecifico();
				break;
			default:
				System.out.println("CARACTERE INVALIDO");
				System.out.println();
		}
	}
	
	public static void adicionar(InterfaceDimensao vetor){
		while (true) {
			try {
				System.out.println("Digite um numero para adicionar ou 0 para concluir");
				int valor = scanner.nextInt();
				if (valor == 0){
					break;
				}
				vetor.adicionar(valor);
			} catch (MyClassException e) {
				System.out.println(e.tamanhoUltrapassado());
				System.out.println();
			}
		}
		scanner.nextLine();
		vetor.imprimir();
	}

	public static void vetorAdicionarPadrao() {
		dimensao = new VetorUnidimensional();
		adicionar(dimensao);
	}
	
	public static void vetorAdicionarTamEspecifico() {
		int tam;
		while (true) {
			try {
				System.out.println("Digite o Tamanho");
				tam = scanner.nextInt();
				dimensao = new VetorUnidimensional(tam);
				break;
			} catch (MyClassException e) {
				System.out.println(e.tamanhoInvalido());
			}
		}
		adicionar(dimensao);
	}

	public static void matrizAdicionarPadrao() {
		dimensao = new MatrizBidimensional();
		adicionar(dimensao);

	}

	public static void matrizAdicionarTamEspecifico(){
		int tamLinhas = 0,tamColunas = 0;
		while (true) {
			try {
				System.out.println("Digite o Tamanho de Linhas");
				tamLinhas = scanner.nextInt();
				System.out.println("Digite o Tamanho de Colunas");
				tamColunas = scanner.nextInt();
				dimensao = new MatrizBidimensional(tamLinhas,tamColunas);
				break;
			} catch (MyClassException e) {
				System.out.println(e.tamanhoInvalido());
			}
		}
		adicionar(dimensao);

	}
	
	
}
