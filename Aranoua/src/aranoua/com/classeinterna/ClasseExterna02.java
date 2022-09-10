package ifam.com.aranoua.classeinterna;

public class ClasseExterna02 {
	private int x = 7;
	public void fazInterna(){
		ClasseInterna in = new ClasseInterna();
		in.veClasseExterna();
	}
	class ClasseInterna{
		public void veClasseExterna(){
			System.out.println("x e: " + x);
			System.out.println("A referencia da classe interna e: " + this);
		}
	}
	public static void main(String [] args){
		ClasseExterna02 ex = new ClasseExterna02();
		ex.fazInterna();

	}

}
