import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração da variável idade
	    int idade;
	    
	    // Solicita ao usuário que digite a idade
	    System.out.println("Digite a idade");
	    idade = ler.nextInt();
	    
	    // Verifica a faixa etária com base na idade fornecida
	    if (idade < 10) {
	        System.out.println("Criança");
	    } else if (idade < 18) {
	        System.out.println("Adolescente");
	    } else if (idade < 60) {
	        System.out.println("Adulto");
	    } else {
	        System.out.println("Idoso");
	    }

	    ler.close();
	}
}