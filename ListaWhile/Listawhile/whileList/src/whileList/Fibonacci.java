package whileList;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite o número de termos da série de Fibonacci:");
	int n, a, b, i, temp;
	n = ler.nextInt();
	a = 0;
    b = 1;
    i = 1;
    	System.out.print("Série de Fibonacci: " + a);
    		while (i < n) {
    			 System.out.print(", " + b);
    			 temp = b;
    			 b = a + b;
    	            a = temp;
    	            i++;
    		}
}	
}
