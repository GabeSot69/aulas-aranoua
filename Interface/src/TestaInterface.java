import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestaInterface{
	public static void main(String args[]){
		Ponto ponto = new Ponto(7,11);
		Circulo circulo = new Circulo(3.5,22,8);
		Cilindro cilindro = new Cilindro(10, 3.3,10,10);
		
		Shape arrayOfShapes[] = new Shape[3];
		arrayOfShapes[0] =ponto;
		arrayOfShapes[1] =circulo;
		arrayOfShapes[2] =cilindro;
		DecimalFormat precisao2 = new DecimalFormat("0.00");
		String saida = ponto.getNome()+ ": "+ponto.toString()+ "\n"+
					   circulo.getNome()+ ": "+circulo.toString()+ "\n"+
					   cilindro.getNome()+ ": "+ponto.toString();

		for (int i=0;i <arrayOfShapes.length;i++){
			saida += "\n\n" + arrayOfShapes[i].getNome()+
			": "+ arrayOfShapes[i].toString()+ "\nArea = "+
			precisao2.format(arrayOfShapes[i].area())+ "\nVolume = "+
			precisao2.format(arrayOfShapes[i].volume());

		}
		
		JOptionPane.showMessageDialog(null, saida, "Demonstração de Interface",
		JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}
}