
public class Circulo extends Ponto{
	protected double raio;
	
	public Circulo(){
		setRaio(0);
	
	}
	
	public Circulo(double RaioCirculo, int CoordX, int CoordY){
		super(CoordX, CoordY);
		setRaio(RaioCirculo);
	}
	
	public void setRaio(double RaioCirculo){
		raio = (RaioCirculo >= 0.0 ? RaioCirculo : 0.0);

	}

	public double getRaio(){
		return raio;

	}

	public double area(){
		return Math.PI *raio*raio;

	}
	
	public String toString(){
		return "Centro = " + super.toString()+", Raio = "+ raio;
	}

	public String getNome(){
		return "Circulo";

	}
	
}
