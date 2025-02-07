public class Pessoa {
    // Variáveis de instância (estado dos futuros objetos)
    String nome;
    int idade;

    // Construtor (comportamento ao criar um novo objeto)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método (comportamento) para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.exibirInformacoes();

	Pessoa pessoa2 = new Pessoa(args[0], Integer.parseInt(args[1]));
	pessoa2.exibirInformacoes();
    }
}