package ifam.com.aranoua.classeinterna;

public class Implementa {
	public static void main (String [] args){
		ClasseExterna ce = new ClasseExterna();
		ce.t.beta();
		Implementa i = new Implementa();
		i.gama();
		Runnable r = new Runnable(){public void run(){}};
		System.out.println(new Runnable(){public void run(){}});
		System.out.println(new Teste(){public void beta(){}});
	}
	public void gama(){
		ClasseExterna ce2 = new ClasseExterna();
		ce2.alfa(new Teste(){public void beta(){System.out.println("XXXX");}});
	}
}
