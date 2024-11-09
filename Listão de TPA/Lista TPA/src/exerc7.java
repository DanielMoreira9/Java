import java.util.Scanner;
public class exerc7 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int a[], b[], c[], i, j;
	a = new int[15];
	b = new int[15];
	System.out.println("Digite 15 números inteiros para o vetor A:");
	for (i = 0; i < 15; i++) {
	    a[i] = ler.nextInt();
		}
		for (i = 0;  i < 15; i++) {
			int resul = 1;
			for (j = 1;  j <= a[i]; j++) {
				resul *=j;
			}
			b[i] = resul;
		}
	    System.out.println("Vetor A");
	    for (i = 0; i < 15; i++) {
	        System.out.print(a[i] + " ");
	    }
	    System.out.println("\nVetor B fatorial");
	    for (i = 0; i < 15; i++) {
	        System.out.print(b[i] + " ");
	    }
}
}
