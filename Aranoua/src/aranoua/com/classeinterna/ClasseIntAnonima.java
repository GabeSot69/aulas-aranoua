package ifam.com.aranoua.classeinterna;

public class ClasseIntAnonima {
	public void delta(){
	}
}

class Foo {
	Teste teste = new Teste(){ //aqui temos uma sintaxe estranha
		public void delta(){
			System.out.println("Classe Foo");
		}

		@Override
		public void beta() {
			// TODO Auto-generated method stub
			
		}
	};
}

