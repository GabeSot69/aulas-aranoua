package ifam.com.aranoua.classeinterna;

public class ClasseExterna03 {
	public void fazInterna(){
		final int A = 33;
		class ClasseInterna{
			public void veClasseExterna(){
				System.out.println("A e: " + A);
			}
		}
		ClasseInterna in = new ClasseInterna();
		in.veClasseExterna();
	}
	public static void main(String [] args){
		ClasseExterna03 ex = new ClasseExterna03();
		ex.fazInterna();
	}

}
