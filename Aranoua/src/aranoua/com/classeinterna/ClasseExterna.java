package ifam.com.aranoua.classeinterna;

class ClasseExterna {
	Teste t = new Teste(){
		public void beta(){
			System.out.println("Classe interna que implementa uma interface.");
		}
	};
	public void alfa(Teste p){
		System.out.println("A classe anonima como argumento de metodo.");
	}
}

