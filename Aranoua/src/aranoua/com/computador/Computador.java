package aranoua.com.computador;

public class Computador {
	String marca;
	String cor;
	String modelo;
	String numeroSerie;
	double preco;
	
	public Computador(String marca, String cor, String modelo, String numeroSerie,double preco) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.preco = preco;
	}
	
	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de serie: " + numeroSerie);
		System.out.println("Preco: " + preco);
	}
	
	public void calcularValor() {
		if (marca.equalsIgnoreCase("HP")) {
			preco *= 1.3;
		}
		else if (marca.equalsIgnoreCase("IBM")) {
			preco *= 1.5;
			
		}
	}
	
	public boolean alterarValor(double valor) {
		if (valor <= 0) {
			return false;
		}
		else {
			preco = valor;
			return true;
		}
		
	}

}
