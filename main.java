// Definição da classe Pessoa
class Pessoa {
    // Atributos da classe
    String nome;
    int idade;

    // Método construtor da classe
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método da classe
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Classe principal
public class main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa("João", 25);

        // Chamada do método para exibir os dados da pessoa1
        pessoa1.exibirDados();
    }
}

