import java.util.Scanner;
public class exerc2 {
	public static void main(String[] args) {
		int i,valor,ii; 
		int a[]= {1,2,3,4,5}; 
		valor=0; 
		for(i = 0; i < 5; i++) { 
			valor=0; 
			System.out.println("tabuada de 1 a 10 do numero "+a[i]);
				for(ii = 0; ii < 10; ii++) {
					valor = a[i] + valor;
					System.out.println(valor); 
			}
		}
	}
}

