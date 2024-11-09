import java.util.Scanner;
public class exerc1 {
	public static void main(String[] args) {
		int i, a[], b[], valor, ii, j;
		final int cos = 20;
		a = new int [cos];
		b = new int [cos];
		ii = 0;
		j = 0;
		Scanner ler = new Scanner(System.in);
		for (i = 0; i < cos; i++) {
			System.out.println("Escreva o "+(i+1)+"� numero");
			valor = ler.nextInt();
			if(valor % 2 == 0) {
				a[j] = valor;
				j++;
			}
			else {
				b[ii] = valor;
				ii++;
			}			
	}
		System.out.print("\npares =");
		for (i = 0; i < j; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nimpares =");
		for (i = 0; i < ii; i++) {
			System.out.print(b[i]+" ");
		}
		ler.close();
	} 
}

