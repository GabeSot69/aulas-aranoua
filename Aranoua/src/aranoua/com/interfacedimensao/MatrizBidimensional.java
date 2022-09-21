package aranoua.com.interfacedimensao;

import java.util.Arrays;

public class MatrizBidimensional extends VetorUnidimensional{
	private int dim2[][];
	private int coluna;

	MatrizBidimensional(){
		dim2 = new int[TAMANHO][TAMANHO];
		linha = 0;
		coluna = 0;
	}

	MatrizBidimensional(int tamLinha, int tamColuna) throws MyClassException{
		if ((tamLinha <= 0 || tamLinha > 2000000) || (tamColuna <= 0 || tamColuna > 2000000)){
			throw new MyClassException();
		}
		dim2 = new int[tamLinha][tamColuna];
		linha = 0;
		coluna = 0;
	}
	@Override
	public void imprimir() {
		System.out.println("Matriz: ");
		System.out.println(Arrays.deepToString(dim2).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
	}

	@Override
	public void adicionar(int valor) throws MyClassException {
		if (linha == dim2.length){
			linha = 0;
			throw new MyClassException();
		}
		dim2[linha][coluna] = valor;
		coluna++;
		if (coluna == dim2[0].length){
			linha++;
			coluna = 0;
		}
		
	}
	

}
