
public class Triangulo extends Figura2D {
	Triangulo (double b, double a){
		super(b,a);
	}
	double area() {
		System.out.println("Calculando a area do triangulo");
		return (base*altura)/2;
	}
}
