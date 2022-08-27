
public class AppEmpregado {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Hana Yasmim", "Borborema", 6000);
		Empregado empregado2 = new Empregado("Gabriel","Sotero Mendonca",4500);
		double salMensal1 = empregado1.getSalMensal();
		double salAnual1 = empregado1.calculaSalarioAnual(salMensal1);
		System.out.println("Empregada " + empregado1.getPrimeiroNome() + " " + empregado1.getSobrenome());
		System.out.println("Salario mensal: R$" + salMensal1);
		System.out.println("Salario anual: R$" + salAnual1);
		System.out.println("Salario anual com aumento de 10%: R$" + empregado1.calculaAumento(salAnual1, 1.1));
		System.out.println();
		double salMensal2 = empregado2.getSalMensal();
		double salAnual2 = empregado2.calculaSalarioAnual(salMensal2);
		System.out.println("Empregado " + empregado2.getPrimeiroNome() + " " + empregado2.getSobrenome());
		System.out.println("Salario mensal: R$" + salMensal2);
		System.out.println("Salario anual: R$" + salAnual2);
		System.out.println("Salario anual com aumento de 10%: R$" + empregado2.calculaAumento(salAnual2, 1.1));
		
	}
}
