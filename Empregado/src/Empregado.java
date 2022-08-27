
public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private double salMensal;
	
	public Empregado(String primeiroNome, String sobrenome, double salMensal) {
		setPrimeiroNome(primeiroNome);
		setSobrenome(sobrenome);
		setSalMensal(salMensal);
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalMensal() {
		return salMensal;
	}

	public void setSalMensal(double salMensal) {
		if (salMensal < 0.0) {
			salMensal = 0.0;
		}
		this.salMensal = salMensal;
	}
	
	public double calculaSalarioAnual(double salMensal) {
		return salMensal*12;
	
	}
	
	public double calculaAumento(double salAnual, double porcentagem) {
		return salAnual*porcentagem;
	
	}
	
	
	
	
}
