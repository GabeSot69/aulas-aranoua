package aranoua.com.contacorrente;

import java.util.Scanner;

public class PrincipalContaCorrente {
    static Scanner scanner = new Scanner(System.in);
    static ContaCorrente contaCorrente = new ContaCorrente();
    public static void main(String[] args) {
        while (true) {
            System.out.println("Escolha");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Consultar");
            String escolha = scanner.nextLine();
            switch (escolha) {
                case "1":
                    execCadastro();
                    break;
                case "2":
                    execSaque();
                    break;
                case "3":
                    execDeposito();
                    break;
                case "4":
                    execConsulta();
                    break;
                default:
                    System.out.println("Invalido");
                    System.out.println();
                    break;

            }
        }
    }

    public static void execSaque(){
        double valor;
        System.out.println("Digite o valor para sacar");
        valor = scanner.nextDouble();
        scanner.nextLine();
        if (contaCorrente.sacar(valor)){
            System.out.println("Saque Realizado");
        }
        else {
            System.out.println("Saque NAO Realizado");
        }

    }
    public static void execDeposito(){
        double valor;
        System.out.println("Digite o valor para depositar");
        valor = scanner.nextDouble();
        scanner.nextLine();
        contaCorrente.depositar(valor);
    }
    public static void execConsulta(){
        contaCorrente.imprimir();
    }
    public static void execCadastro(){
        System.out.println("Digite o numero da conta");
        contaCorrente.conta = scanner.nextLine();
        System.out.println("Digite a agencia");
        contaCorrente.agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente");
        contaCorrente.nomeCliente = scanner.nextLine();
    }

}
