package whileList;
import java.util.Scanner;
public class expoente {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double base, expo, result;
	int i = 0;
	System.out.println("Digite a base");
	base = ler.nextDouble();
	System.out.println("Digite o expoente");
	expo = ler.nextDouble();
	result = 1;
	 		while (i < expo) {
	 			result = result * base;
	 			i++;
	 		}
	      System.out.println("O resultado é " + result);
}
}
