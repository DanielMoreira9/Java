import java.util.Scanner;
public class exerc6 {
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int a[] = new int [11];
	for (int i = 0; i < 11; i++) {
		a[i] = (int) Math.pow(2, i);
	}
	System.out.println("Vetor A:"); 
	for (int i = 0; i < 11; i++) {
	System.out.println("A[" + i + "] = " + a[i]); }
}
}
