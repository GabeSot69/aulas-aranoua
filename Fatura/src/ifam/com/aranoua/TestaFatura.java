package ifam.com.aranoua;

public class TestaFatura {
	public static void main(String[] args) {
		Fatura f1 = new Fatura(1, "Mouse", 5, 80);
		System.out.println("Fatura Item " + f1.getNumItem());
		System.out.println("Descricao: " + f1.getDescItem());
		System.out.println("Quantidade: " + f1.getQuantItem());
		System.out.println("Preco Unitario: R$ " + f1.getPrecoItem());
		System.out.println("Preco total: R$ " + f1.getFaturaAmount());
		System.out.println();
		
		Fatura f2 = new Fatura(2, "Teclado", 10, 100);
		System.out.println("Fatura Item " + f2.getNumItem());
		System.out.println("Descricao: " + f2.getDescItem());
		System.out.println("Quantidade: " + f2.getQuantItem());
		System.out.println("Preco Unitario: R$ " + f2.getPrecoItem());
		System.out.println("Preco total: R$ " + f2.getFaturaAmount());
	}
}
