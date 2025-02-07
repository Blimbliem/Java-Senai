public class Comentarios{

   // Variaveis de instância(estado dos futuros objetos)
	
   String nome;
   int idade;

  //Construtor (comportamento ao criar um novo objeto)

   public Comentarios(String nome, int idade){
	this.nome = nome;
	this.idade = idade; 
}
  //Método (Comportamento) para exibir informações da pessoa

  public void exibirInformecoes(){
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);

}
  //Método principal para testar a classe

  public static void main(String[] args){
   	Comentarios.comentarios = new Comentarios("Gabriel", 30);
	comentarios.exibirInformacoes();
/*
 Autor: Gabriel Fernandes Blimbliem
 Data: 21/05/2025
*/
 }
}