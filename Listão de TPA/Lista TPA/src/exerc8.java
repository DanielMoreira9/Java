import java.util.Scanner;
public class exerc8 {
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int a[], b[], c[], i, j;
a = new int[10];
b = new int[10];

System.out.println("Digite 10 números inteiros para o vetor A:");
for (i = 0; i < 10; i++) {
    a[i] = ler.nextInt();
	}
	for (i = 0; i < 10; i++) { 
    	b[i] = 0; 
	for (j = i; j < 10; j++) {
		b[i] += a[j]; 
		} 
	}

    System.out.println("Vetor A");
    for (i = 0; i < 10; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println("\nVetor B somatórias");
    for (i = 0; i < 10; i++) {
        System.out.print(b[i] + " ");
    }
}
}
