package ifam.com.aranoua;

public class TestaBagulho {
	public static void main(String[] args) {
		Bagulho bg = new Bagulho("cafe", "Colombia", 5);
		System.out.println("Nome: " + bg.nome + "\nProcedencia: " + bg.procedencia + "\nPreco: " + bg.preco);
		
		Bagulho bg2 = new Bagulho("po","Bolivia",25);
		System.out.println("Nome: " + bg2.nome + "\nProcedencia: " + bg2.procedencia + "\nPreco: " + bg2.preco);
		System.out.println("Nome: " + bg.nome + "\nProcedencia: " + bg.procedencia + "\nPreco: " + bg.preco);
	}
}
