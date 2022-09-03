public class Ponto extends Object implements Shape{
	protected int x,y;
	
	public Ponto(){
		setPonto(0,0);
	}

	public Ponto(int CoordX, int CoordY){
		setPonto(CoordX, CoordY);
	}
	public void setPonto(int CoordX, int CoordY){
		x = CoordX;
		y = CoordY;

	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;

	}
	
	public String toString(){
		return "[" + x + "," + y + "]";

	}
	public String getNome(){
		return "Ponto";

	}
	
	public double volume(){
		return 0.0;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}


}
