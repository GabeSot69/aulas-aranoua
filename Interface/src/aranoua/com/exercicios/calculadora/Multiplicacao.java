package aranoua.com.exercicios.calculadora;

import java.util.Scanner;

public class Multiplicacao implements OperacaoMatematica{
	public Multiplicacao() {
		
	}
	@Override
	public int calcula(int a, int b) {
		return a*b;
	}
	@Override
	public void exibeMensagem() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o primeiro numero para multiplicar");
		a = scanner.nextInt();
		System.out.println("Escreva o segundo numero para multiplicar");
		b = scanner.nextInt();
		int resultado = calcula(a,b);
		System.out.println("Multiplicacao: " + resultado);
	}
	
}
