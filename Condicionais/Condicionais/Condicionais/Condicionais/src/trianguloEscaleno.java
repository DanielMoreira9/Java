import java.util.Scanner;
public class trianguloEscaleno {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    double a, b, c;
	    
	    // Solicita ao usuário que digite o valor de A
	    System.out.println("Digite o valor de A:");
	    a = ler.nextDouble();
	    
	    // Solicita ao usuário que digite o valor de B
	    System.out.println("Digite o valor de B:");
	    b = ler.nextDouble();
	    
	    // Solicita ao usuário que digite o valor de C
	    System.out.println("Digite o valor de C:");
	    c = ler.nextDouble();
	    
	    // Verifica se os valores informados podem formar um triângulo
	    if (a < b + c && b < a + c && c < a + b) {
	        // Verifica se o triângulo é equilátero
	        if (a == b && b == c) {
	            System.out.println("Triângulo Equilátero");
	        // Verifica se o triângulo é escaleno
	        } else if (a != b && b != c && a != c) {
	            System.out.println("Triângulo Escaleno");
	        // Caso contrário, o triângulo é isósceles
	        } else {
	            System.out.println("Triângulo Isósceles");
	        }
	    } else {
	        // Informa que os valores não formam um triângulo
	        System.out.println("Os valores informados não formam um triângulo");
	    }
	    ler.close();
	}
}