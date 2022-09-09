package aranoua.com.acampamento;

public class Acampamento {
	String nome;
	char equipe;
	int idade;
	
	public Acampamento(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Equipe: " + equipe);
		System.out.println("Idade: " + idade);
	}
	
	public void separarGrupos() {
		if (idade >= 6 && idade <= 10) {
			equipe = 'A';
		}
		else if (idade >= 11 && idade <= 20) {
			equipe = 'B';
		}
		else if (idade >= 21){
			equipe = 'C';
		}
		else {
			System.out.println("Idade invalida");
		}
	}

}
