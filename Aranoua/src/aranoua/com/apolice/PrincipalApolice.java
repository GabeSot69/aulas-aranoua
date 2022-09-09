package aranoua.com.apolice;

public class PrincipalApolice {
	public static void main(String[] args) {
		Apolice apolice = new Apolice("Gabriel", 18, 2000);
		apolice.imprimir();
		apolice.calcularPremioApolice();
		apolice.imprimir();
		apolice.oferecerDesconto("Curitiba");
		apolice.imprimir();
	}
}
