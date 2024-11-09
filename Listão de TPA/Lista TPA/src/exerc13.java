import java.util.Scanner;
public class exerc13 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] A = new int[10];
	        int[] B = new int[10];
	        System.out.println("Digite 10 números inteiros para o vetor A:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("A[" + i + "]: ");
	            A[i] = scanner.nextInt(); 
	        }
	        for (int i = 0; i < 10; i++) {
	            if (A[i] % 2 == 0) {
	                B[i] = 1;  // 
	            } else {
	                B[i] = 0
	                	; 
	            }
	        }
	        System.out.print("Vetor A: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(A[i] + " ");
	        }

	        System.out.println();
	        System.out.print("Vetor B: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(B[i] + " ");
	        }
	        
	        scanner.close();
	    }
	}


