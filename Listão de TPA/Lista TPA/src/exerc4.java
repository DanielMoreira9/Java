import java.util.Scanner;
public class exerc4 {
	public static void main(String[] args) {
    	int i,valor;
        int[] a = new int[10];
        Scanner ler = new Scanner(System.in);


        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < a.length; i++) {
            a[i] = ler.nextInt();
        }
        	
        for (i = 0; i < a.length; i++) {
        	if(a[i] == 0) {
        		System.out.println(a[i] + " este numero � par e contem apenas a si mesmo como par");
        	}
        	else if (a[i] == 1) {
        		System.out.println(a[i]+" este numero não é par");
        	}
        	else {
        	System.out.println(" ");
        	System.out.println(" ");
        	System.out.println("os pares até o número " + a[i] + " são");
        		while(a[i] != 0) {
        			a[i]--;
        			valor = a[i];
        	if(valor % 2 == 0) {
        		System.out.print(valor+", ");
        	}
        		}
        	}
        }
        ler.close();
    }
}
