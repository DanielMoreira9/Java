package whileList;
import java.util.Scanner;
public class fatorial {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int i, num, fact;
	System.out.println("Digite o valor que se quer ver fatorial");
	num = ler.nextInt();
	fact = 1;
	i = num;
		while(i>=1) {
			fact = fact*i;
			i--;
			System.out.println(" O fatorial é  " + fact);
		}
}
}
