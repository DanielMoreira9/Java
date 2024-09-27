import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    // Declaração das variáveis
	    double peso, alt, imc;
	    
	    // Solicita ao usuário que digite seu peso
	    System.out.println("Digite seu peso ");
	    peso = ler.nextDouble();
	    
	    // Solicita ao usuário que digite sua altura
	    System.out.println("Digite a sua altura");
	    alt = ler.nextDouble();
	    
	    // Calcula o Índice de Massa Corporal (IMC)
	    imc = peso / (alt * alt);
	    
	    // Verifica a categoria do IMC e imprime a mensagem correspondente
	    if (imc < 18.5) {
	        System.out.println("Excesso de magreza");
	    } else if (imc < 25) {
	        System.out.println("Peso normal");
	    } else if (imc < 30) {
	        System.out.println("Excesso de peso");
	    } else if (imc < 35) {
	        System.out.println("Obesidade grau 1");
	    } else if (imc < 40) {
	        System.out.println("Obesidade grau 2");
	    } else {
	        System.out.println("Obesidade grau 3");
	    }
	    
	    ler.close();
	}
}