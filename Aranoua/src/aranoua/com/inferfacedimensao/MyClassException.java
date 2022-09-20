package aranoua.com.interfacedimensao;

public class MyClassException extends Exception{
	public String tamanhoUltrapassado() {
		return "Tamanho excedido\nSe continuar havera sobreposicao de conteudo";
	}
	public String tamanhoInvalido(){ return "Tamanho invalido"; }
}
