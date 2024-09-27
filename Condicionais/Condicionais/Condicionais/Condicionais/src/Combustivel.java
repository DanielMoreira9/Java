import java.util.Scanner;
public class Combustivel {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    double qtd, litros, km;
	    
	    // Solicita ao usuário que digite a distância percorrida em quilômetros
	    System.out.println("Digite a distância percorrida em quilômetros");
	    km = ler.nextDouble();
	    
	    // Solicita ao usuário que digite a capacidade do tanque em litros
	    System.out.println("Digite a capacidade do tanque");
	    litros = ler.nextDouble();
	    
	    // Calcula a quantidade de quilômetros por litro
	    qtd = km / litros;
	    
	    // Verifica se o veículo é econômico
	    if (qtd >= 10) {
	        System.out.println("Seu veículo é econômico");
	    } else {
	        System.out.println("Seu veículo não é econômico");
	    }
	    
	    ler.close();
	}
}