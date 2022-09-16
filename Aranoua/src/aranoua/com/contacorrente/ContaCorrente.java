package aranoua.com.contacorrente;

public class ContaCorrente {
    String conta;
    String agencia;
    double saldo;
    String nomeCliente;

    public void imprimir(){
        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Nome do Cliente: " + nomeCliente);
    }

    public boolean sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            return true;
        }
        else {
            return false;

        }

    }

    public void depositar(double valor){
        saldo += valor;
    }
}
