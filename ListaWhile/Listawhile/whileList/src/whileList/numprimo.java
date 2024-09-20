package whileList;
import java.util.Scanner;
public class numprimo {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int num, i;
	boolean primo = true;
	System.out.println("Digite o número para saber se é ou não primo");
	num = ler.nextInt();
	i = 2;
		while (i < num) {
		
			if (num % i ==0) {
				primo = false;
				break;
			}
			i++;
		}
		if (primo && num > 1) {
			System.out.println("Este número é primo");
		}
		else {
			System.out.println("Este número não é primo");
		}
		ler.close();
}
}
