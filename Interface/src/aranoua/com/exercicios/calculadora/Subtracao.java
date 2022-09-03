package aranoua.com.exercicios.calculadora;

import java.util.Scanner;

public class Subtracao implements OperacaoMatematica{
	public Subtracao() {
		
	}
	@Override
	public int calcula(int a, int b) {
		return a-b;
	}
	@Override
	public void exibeMensagem() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o primeiro numero para subtrair");
		a = scanner.nextInt();
		System.out.println("Escreva o segundo numero para subtrair");
		b = scanner.nextInt();
		int resultado = calcula(a,b);
		System.out.println("Subtracao: " + resultado);
		
	}
	
	
}
