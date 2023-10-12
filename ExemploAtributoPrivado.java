class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

public class ExemploAtributoPrivado {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        pessoa1.exibirDados();

        // Utilizando os métodos de acesso e modificação
        pessoa1.setNome("Maria");
        pessoa1.setIdade(30);
        System.out.println("Novo nome: " + pessoa1.getNome());
        System.out.println("Nova idade: " + pessoa1.getIdade());
    }
}

