import java.util.Scanner;
public class Multiplode10 {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    int n, resto;
	    
	    // Solicita ao usuário que digite um número inteiro
	    System.out.println("Digite um número inteiro");
	    n = ler.nextInt();
	    
	    // Calcula o resto da divisão do número por 10
	    resto = (n % 10);
	    
	    // Verifica se o número é múltiplo de 10
	    if (resto == 0) {
	        System.out.println(n + " é múltiplo de 10");
	    } else {
	        System.out.println(n + " não é múltiplo de 10");
	    }
	    
	    ler.close();
	}
}