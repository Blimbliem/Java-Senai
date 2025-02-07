public class Carro{
  String modelo;
  String cor;
  int ano;

   public Carro(String modelo, String cor, int ano){
   this.modelo = modelo;
   this.cor = cor;
   this.ano = ano;
}

   public void exibirInformacoes(){
   System.out.println("Modelo: " + modelo);
   System.out.println("Cor: "+ cor);
   System.out.println("Ano: "+ ano);
   System.out.println("\n");
}

   public static void main(String[] args){
   Carro celta = new Carro("Celta", "Preto", 2017);
   celta.exibirInformacoes();
   Carro hrv = new Carro("HRV", "Vinho", 2024);
   hrv.exibirInformacoes();
   Carro polo = new Carro("Polo", "Branco", 2020);
   polo.exibirInformacoes();

  }
}