package aranoua.com.apolice;

public class Apolice {
	String nomeSegurado;
	int idade;
	double valorPremio;
	
	public Apolice(String nomeSegurado, int idade, double valorPremio) {
		this.nomeSegurado = nomeSegurado;
		this.idade = idade;
		this.valorPremio = valorPremio;
	}
	
	public void imprimir() {
		System.out.println("Nome do Segurado: " + nomeSegurado);
		System.out.println("Idade: " + idade);
		System.out.println("Valor do premio: " + valorPremio);
	}
	
	public void calcularPremioApolice() {
		if (idade >= 18 && idade <= 25) {
			valorPremio += (valorPremio*20)/100;
		}
		else if (idade >= 26 && idade <= 36) {
			valorPremio += (valorPremio*15)/100;
		}
		else if (idade > 36) {
			valorPremio += (valorPremio*10)/100;
		}
		else {
			System.out.println("Idade invalida");
		}
	}
	
	public void oferecerDesconto(String cidade) {
		if (cidade.equalsIgnoreCase("Curitiba")) {
			valorPremio -= (valorPremio*20)/100;
		}
		else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
			valorPremio -= (valorPremio*15)/100;
		}
		else if (cidade.equalsIgnoreCase("Sao Paulo")) {
			valorPremio -= (valorPremio*10)/100;
		}
		else if (cidade.equalsIgnoreCase("Belo Horizonte")) {
			valorPremio -= (valorPremio*5)/100;
		}
		else {
			System.out.println("Cidade invalida");
		}

	}
}
