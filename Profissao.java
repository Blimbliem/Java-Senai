public class Profissao{

  // variaveis de instância (futuros estados dos objetos)
    String nome;
    int anosExperiencia;
    double salario;
    String descricao;

  // Construtor
   public Profissao(String nome, int anosExperiencia, double salario, String descricao){
   
   	this.nome = nome;
   	this.anosExperiencia = anosExperiencia;
   	this.salario = salario;
   	this.descricao = descricao;

    }
  //Método para exibir as informacoes da profissão
   public void exibirInformacoes(){
  	System.out.println("Nome: " + nome);
  	System.out.println("Anos de experiência: " + anosExperiencia);
  	System.out.println("Salário: " + salario);
  	System.out.println("Descrição: " + descricao);
  	System.out.println();
  }

  //Método principal para testar a classe.
  
  public static void main(String[] args){
 
	Profissao profissional = new Profissao("Gabriel", 1, 1800, "Estágiario."); 
	profissional.exibirInformacoes();
 

 }
}