public class WrapperExemplo {
public static void main(String[] args) {
// Convertendo um valor int em String
int numero = 123;
String numeroEmString = Integer.toString(numero);
System.out.println("Número como String: " + numeroEmString);
// Convertendo uma String em int
String valorTexto = "456";
int numeroConvertido = Integer.parseInt(valorTexto);
System.out.println("String convertida em int: " + numeroConvertido);
// Utilizando métodos de operações matemáticas
int soma = Integer.sum(10, 20);
System.out.println("Soma de 10 e 20: " + soma);
int maximo = Integer.max(50, 100);
System.out.println("O maior valor entre 50 e 100: " + maximo);
int minimo = Integer.min(50, 100);
System.out.println("O menor valor entre 50 e 100: " + minimo);
}
}
