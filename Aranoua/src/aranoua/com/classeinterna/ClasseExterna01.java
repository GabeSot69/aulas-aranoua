package ifam.com.aranoua.classeinterna;

public class ClasseExterna01 {
	private String nome = "variavel privada da classe externa.";
	class ClasseInterna{
		public void acesso() {
			System.out.println("Acesso pegou a " + nome);
		}
	}

}
