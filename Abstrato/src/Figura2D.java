
abstract class Figura2D {
	double base;
	double altura;
	
	public Figura2D(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	abstract double area();
}
