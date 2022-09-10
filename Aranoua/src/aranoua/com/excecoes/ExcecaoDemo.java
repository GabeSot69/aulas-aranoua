package ifam.com.aranoua.excecoes;

public class ExcecaoDemo {
	public static void main(String args[]){
		int i, a;
		for(i = 5; i>= 0; i--){
			try{
				//monitora o bloco de código
				System.out.println("Dividindo 25 por "+ i +"...");
				a = 35/i;
				System.out.println("35 / "+ i +" = " + a);
			}catch(ArithmeticException e){
				//verifica divisão por zero
				System.out.println("Erro! divisão por zero");
			}
	
		}

	}

}
