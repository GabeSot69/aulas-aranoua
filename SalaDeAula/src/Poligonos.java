
public class Poligonos {
	public static void main(String[] args) {
		Triangulo t1 = new Triangulo();
		t1.mostrar();
		Triangulo t2 = new Triangulo(8, 10, 7);
		t2.mostrar();
		Triangulo t3 = new Triangulo(3.2, 4f, 5f);
		t3.mostrar();
		double areaTotalTriangulos = t1.area() + t2.area() + t3.area();
		System.out.println("Área total dos triângulos: " + areaTotalTriangulos);
	}
	
}
