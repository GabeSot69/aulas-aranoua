
public class Cilindro extends Circulo{
	protected double altura;
	
	public Cilindro(){
		setAltura(0);
	
	}
	
	public Cilindro(double AlturaC, double RaioC, int CoordX, int CoordY){
		super(RaioC, CoordX, CoordY);
		setAltura(AlturaC);

	}
	
	public void setAltura(double AlturaC){
		altura = (AlturaC >= 0 ? AlturaC : 0);
	}

	public double getAltura(){
		return altura;
	}

	public double area(){
		return 2*super.area() + 2*Math.PI*raio*altura;
	}
	
	public double volume(){
		return super.area()*altura;

	}

	public String toString(){
		return super.toString()+ ": altura= " + altura;

	}

	public String getNome(){
		return "Cilindro";
	}
}