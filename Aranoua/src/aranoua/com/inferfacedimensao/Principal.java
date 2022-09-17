package aranoua.com.inferfacedimensao;

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
			System.out.print("Escolha: ");
			String escolha = scanner.nextLine();
			switch(escolha) {
				case "1":
					menuVetor();
					break;
				
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
		}
	}
	
	public static void vetorAdicionarPadrao() {
		VetorUnidimensional unidimensional = new VetorUnidimensional();
		while (true) {
			try {
				System.out.println("Digite um numero para adicionar");
				int valor = scanner.nextInt();
				unidimensional.adicionar(valor);
				unidimensional.imprimir();
			} catch (MyClassException e) {
				System.out.println(e.aviso());
				break;
			}
		}
	}
	
	public static void vetorAdicionarTamEspecifico() {
		int tam;
		VetorUnidimensional unidimensional;
		try {
			System.out.println("Digite o Tamanho");
			tam = scanner.nextInt();
			unidimensional = new VetorUnidimensional(tam);
			while (true) {
				System.out.println("Digite um numero para adicionar");
				int valor = scanner.nextInt();
				unidimensional.adicionar(valor);
				unidimensional.imprimir();
			}
		} catch (MyClassException e) {
			System.out.println(e.aviso());
		}
		
	}
	
	
}
