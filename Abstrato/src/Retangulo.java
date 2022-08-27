
public class Retangulo extends Figura2D{
	Retangulo(double b, double a){
		super(b,a);
	}
	double area() {
		System.out.println("Calculando a area do retangulo");
		return base*altura;
	}
}
