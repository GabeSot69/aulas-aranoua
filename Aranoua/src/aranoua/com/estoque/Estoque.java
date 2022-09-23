package aranoua.com.estoque;

public class Estoque {
    String nomeProduto;
    double valor;
    int quantidade;

    public Estoque(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void imprimir(){
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade: " + quantidade);
    }

    public int verificarDisponibilidade(int quant){
        if (quantidade >= quant && quant > 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public int removerProdutos(int quant){
        System.out.println(nomeProduto);
        if (verificarDisponibilidade(quant) == 1){
            quantidade -= quant;
            System.out.println(quant + " produtos removidos com sucesso");
            return 1;
        }
        else {
            System.out.println("Nao foi possivel remover a quantidade solicitada de produtos");
            return 0;
        }
    }
}
