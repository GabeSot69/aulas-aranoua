package aranoua.com.interfacedimensao;

import java.util.Arrays;

public class VetorUnidimensional implements InterfaceDimensao {
	private int  dim1[];
	protected int linha;
	
	VetorUnidimensional(){
		dim1 = new int[TAMANHO];
		linha = 0;
	}
	
	VetorUnidimensional(int tam) throws MyClassException{
		if (tam <= 0 || tam > 2000000) {
			throw new MyClassException();
		}
		else {
			dim1 = new int[tam];
			linha = 0;
		}
		
	}
	@Override
	public void imprimir() {
		System.out.println("Vetor: " + Arrays.toString(dim1));
		
	}

	public void adicionar(int valor) throws MyClassException {
		if (linha == dim1.length) {
			linha = 0;
			throw new MyClassException();
		}
		dim1[linha] = valor;
		linha++;
	}


}
