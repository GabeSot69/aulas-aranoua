
public class CalculoArea {
	public static void main(String[] args) {
		//Figura2D r = new Retangulo(3,6);
		//Figura2D t = new Triangulo(3,9);
		Triangulo t = new Triangulo(3,9);
		Retangulo r = new Retangulo(2,6);
		
		System.out.println("A area e: " + r.area());
		System.out.println("A area e: " + t.area());
	}

}
