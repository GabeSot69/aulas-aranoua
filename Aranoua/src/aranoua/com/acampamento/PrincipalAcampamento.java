package aranoua.com.acampamento;

public class PrincipalAcampamento {
	public static void main(String[] args) {
		Acampamento acampamento = new Acampamento("Gabriel", 3);
		acampamento.imprimir();
		acampamento.separarGrupos();
		acampamento.imprimir();
	}
}
