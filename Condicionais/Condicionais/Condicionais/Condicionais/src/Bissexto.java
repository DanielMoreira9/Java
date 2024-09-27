import java.util.Scanner;
public class Bissexto {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    int nasc, resto;
	    
	    // Solicita ao usuário que digite o ano de nascimento
	    System.out.println("Digite o ano de nascimento");
	    nasc = ler.nextInt();
	    
	    // Calcula o resto da divisão do ano de nascimento por 4
	    resto = (nasc % 4);
	    
	    // Verifica se o ano é bissexto
	    if (resto == 0) {
	        System.out.println("O ano é bissexto");
	    } else {
	        System.out.println("O ano não é bissexto");
	    }
	    
	    ler.close();
	}
}