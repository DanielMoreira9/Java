import java.util.Scanner;
public class exerc5 {
	public static void main(String[] args) {
		 int a[] = new int[10];
		 Scanner ler = new Scanner(System.in);
		 for (int i = 0; i < 10; i++) {
			 System.out.println("Digite um número");
			 a[i]=ler.nextInt();
		 }
		 for (int i = 0; i < a.length; i++) {
		 System.out.println("Número: " + a[i]);
		 System.out.print("Divisores: ");
		 for (int j = 1; j <= a[i]; j++) {
		 if (a[i] % j == 0) {
			    System.out.print(j + " ");
			      }
			}
			System.out.println("\n");
		 }
		 ler.close();
	}
	}
