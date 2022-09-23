package aranoua.com.estoque;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalEstoque {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque("Mouse",60,6);
        Estoque estoque1 = new Estoque("Teclado",120,4);
        Estoque estoque2 = new Estoque("Cadeira",340,8);
        estoque.imprimir();
        estoque1.imprimir();
        estoque2.imprimir();
        estoque.removerProdutos(3);
        pausaTela();
        estoque1.removerProdutos(5);
        pausaTela();
        estoque2.removerProdutos(-1);
        pausaTela();
        estoque.imprimir();
        estoque1.imprimir();
        estoque2.imprimir();
    }
    public static void pausaTela() throws IOException {
        System.out.println();
        System.out.println("Aperte ENTER para continuar");
        System.in.read();
    }
}
