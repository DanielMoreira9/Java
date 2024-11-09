import java.util.Scanner;
public class exerc12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] vetor = new int[10];
	        	System.out.println("Digite 10 números inteiros:");
	        	for (int i = 0; i < 10; i++) {
	        		vetor[i] = scanner.nextInt();
	        	}
	        	System.out.println("====================");
	        	
	        for (int i = 0; i < 5; i++) {
	            if (vetor[i] != vetor[9 - i]) { 
	                System.out.println("O vetor não é um palíndromo.");
	                return; 
	            }
	        }
	        System.out.println("O vetor é um palíndromo.");
	        scanner.close();
	    }
	}
