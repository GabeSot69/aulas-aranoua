package aranoua.com.eleitoral;

public class Eleitoral {
    String nome;
    int idade;

    Eleitoral(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        verificar();
    }

    public void verificar(){
        if (idade >= 0 && idade < 16){
            System.out.println("Eleitor nao pode votar");
        } else if (idade >= 16 && idade < 65) {
            System.out.println("Eleitor deve votar");
            
        } else if (idade >= 65) {
            System.out.println("Voto Facultativo");

        } else{
            System.out.println("Idade invalida");

        }
    }

}
