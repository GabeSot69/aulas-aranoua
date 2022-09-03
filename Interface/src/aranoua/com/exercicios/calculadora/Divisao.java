package aranoua.com.exercicios.calculadora;

import java.util.Scanner;

public class Divisao implements OperacaoMatematica{
	public Divisao() {
		
	}
	@Override
	public int calcula(int a, int b) {
		if (b != 0) {
			return a/b;
		}
		else {
			System.out.println("Divisao invalida");
			return 0;
		}
	}
	@Override
	public void exibeMensagem() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o primeiro numero para dividir");
		a = scanner.nextInt();
		System.out.println("Escreva o segundo numero para dividir");
		b = scanner.nextInt();
		int resultado = calcula(a,b);
		System.out.println("Divisao: " + resultado);
	}
	
	

}
