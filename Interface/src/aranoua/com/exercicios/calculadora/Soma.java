package aranoua.com.exercicios.calculadora;

import java.util.Scanner;

public class Soma implements OperacaoMatematica {
	public Soma() {
		
	}
	@Override
	public int calcula(int a, int b) {
		return a+b;
	}
	@Override
	public void exibeMensagem() {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o primeiro numero para somar");
		a = scanner.nextInt();
		System.out.println("Escreva o segundo numero para somar");
		b = scanner.nextInt();
		int resultado = calcula(a,b);
		System.out.println("Soma: " + resultado);
		
		
	}
	
}
