package aranoua.com.computador;


public class PrincipalComputador {
	static boolean valorAlterado = false;
	public static void main(String[] args) {
		Computador computador = new Computador("HP", "Preto", "Modelo 1", "123", 2000);
		computador.imprimir();
		computador.calcularValor();
		System.out.println();
		System.out.println("VALOR AJUSTADO");
		computador.imprimir();
		System.out.println();
		Computador computador2 = new Computador("IBM", "Vermelho", "Modelo 2", "456", 2500);
		computador2.imprimir();
		computador2.calcularValor();
		System.out.println();
		System.out.println("VALOR AJUSTADO");
		computador2.imprimir();
		System.out.println();
		valorAlterado = computador2.alterarValor(2200);
		checarValorAlterado(valorAlterado);
		valorAlterado = computador2.alterarValor(-200);
		checarValorAlterado(valorAlterado);
		computador2.imprimir();
		
	}
	public static void checarValorAlterado(boolean valorAlterado) {
		if (valorAlterado) {
			System.out.println("Valor alterado");
		}
		else {
			System.out.println("Valor NAO alterado");
		}
		
	}
}
