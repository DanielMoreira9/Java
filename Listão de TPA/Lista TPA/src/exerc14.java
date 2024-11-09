import java.util.Scanner;
public class exerc14 {
	 public static void main(String[] args) {
	        int[] A = new int[10];
	        int[] B = new int[10];
	        int[] C = new int[10];
	        	Scanner ler = new Scanner(System.in);
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o valor de A[" + i + "]: ");
	            A[i] = ler.nextInt();  
	            System.out.print("Digite o valor de B[" + i + "]: ");
	            B[i] = ler.nextInt();  
	            
	            C[i] = (A[i] > B[i]) ? 1 : (A[i] == B[i]) ? 0 : -1;
	        }

	        System.out.println("\nVetor A: ");
	        for (int num : A) System.out.print(num + " ");
	        
	        System.out.println("\nVetor B: ");
	        for (int num : B) System.out.print(num + " ");
	        
	        System.out.println("\nVetor C: ");
	        for (int num : C) System.out.print(num + " ");
	        
	        ler.close();  
	    }
	}