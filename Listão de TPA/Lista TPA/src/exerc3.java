import java.util.Scanner;
public class exerc3 {
	public static void main(String[] args) {
    	Scanner ler = new Scanner (System.in);
        int a[]= {1,2,3,4,5,6,7,8,9,10}, i;
        boolean primo;
        primo = false;
        for(i = 0; i < a.length; i++) {
        	double valor = a[i];
        	double valorm = valor-1;
        	if(valorm % valor==0) {
        		primo = true;
        	}
        	if(primo = true) {
        	System.out.println("o numero"+ a[i] +"é primo");
        	} else
        	{
        	System.out.println("o numero" + a[i] + "não é primo");
        	}
        }
    }
}

