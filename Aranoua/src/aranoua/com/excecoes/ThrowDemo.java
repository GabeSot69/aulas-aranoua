package ifam.com.aranoua.excecoes;

public class ThrowDemo {
	static void demoThrow(){
		try{
			//gera uma exceção
			throw new NullPointerException("DEMO");
		}catch(NullPointerException e){
			System.out.println("Identificada dentro de demoThrow");
			//gera novamente a mesma exceção
			throw e;
		}
	}
	public static void main(String args[]){
		try{
			demoThrow();
		}catch(NullPointerException e){
			System.out.println("Identificada novamente: "+e);
		}
	}

}
