import java.util.Scanner;
public class SalarioInss {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    double sal, inss;
	    
	    // Solicita ao usuário que digite o salário
	    System.out.println("Digite o seu salário");
	    System.out.println("================");
	    sal = ler.nextDouble();
	    
	    // Calcula o valor do INSS com base no salário
	    if (sal <= 2500) {
	        inss = sal * 9 / 100;  
	        System.out.println("================");
	        System.out.println("Você pagará ao INSS: " + inss);
	    } else {
	        inss = sal * 11 / 100;  
	        System.out.println("================");
	        System.out.println("Você pagará ao INSS: " + inss);
	    }
	    
	    ler.close();
	}
}