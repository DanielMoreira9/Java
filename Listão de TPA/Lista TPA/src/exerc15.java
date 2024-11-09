import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class exerc15 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        	int[] A = new int[10];
	        	Integer[] B = new Integer[10];  
	        	Integer[] C = new Integer[10];  
	     // "interger" serve para permitir a ordenaçao dos items
	       
	        System.out.println("Digite 10 números inteiros para o vetor A:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("A[" + i + "]: ");
	            A[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            B[i] = A[i];
	            C[i] = A[i];
	        }

	        // colocando o vetor B em ordem Crescente com Arrays.sort
	        Arrays.sort(B);

	        // colocando o vetor C em ordem decrescente com collections
	        Arrays.sort(C, Collections.reverseOrder());
	        // Apresentando os vetores
	        System.out.println("\nVetor A (original): " + Arrays.toString(A));
	        System.out.println("Vetor B (ordem crescente): " + Arrays.toString(B));
	        System.out.println("Vetor C (ordem decrescente): " + Arrays.toString(C));

	        scanner.close();
	    }
	}
