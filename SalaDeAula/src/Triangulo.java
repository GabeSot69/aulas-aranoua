
public class Triangulo {
	double ladoA;
	double ladoB;
	double ladoC;

	Triangulo(){
		System.out.println("Triangulo()");
		ladoA=3;
		ladoB=4;
		ladoC=5;
	}
	Triangulo(int a, int b, int c){
		System.out.println("Triangulo(int)");
		ladoA=a;
		ladoB=b;
		ladoC=c;
	}
	Triangulo(double a, double b, double c){
		System.out.println("Triangulo(double)");
		ladoA=a;
		ladoB=b;
		ladoC=c;
	}
	public double area() {
		double p = perimetro()/2; // semiperímetro
		return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
	}
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}
	public double anguloAlfa() {
		double cosAlfa = (Math.pow(ladoB,2)+Math.pow(ladoC,2)-Math.pow(ladoA,2))/(2*ladoB*ladoC);
		double alfa = Math.acos(cosAlfa);
		return Math.toDegrees(alfa);
	}
	public double anguloBeta() {
		double cosBeta = (Math.pow(ladoA,2)+Math.pow(ladoC,2)-Math.pow(ladoB,2))/(2*ladoA*ladoC);
		double beta = Math.acos(cosBeta);
		return Math.toDegrees(beta);
	}
	public double anguloGama() {
		double cosGama = (Math.pow(ladoA,2)+Math.pow(ladoB,2)-Math.pow(ladoC,2))/(2*ladoA*ladoB);
		double gama = Math.acos(cosGama);
		return Math.toDegrees(gama);
	}
	public void mostrar() {
		System.out.printf("(%f.2,%f.2,%f.2)\n", ladoA, ladoB, ladoC);
		System.out.printf("perímetro: %f.2\n", perimetro());
		System.out.printf("área: %f.2\n", area());
		System.out.printf("alfa: %f.2\n", anguloAlfa());
		System.out.printf("beta: %f.2\n", anguloBeta());
		System.out.printf("gama: %f.2\n", anguloGama());
	}
	
	

}
