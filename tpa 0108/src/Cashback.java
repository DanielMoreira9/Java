import java.util.Scanner;
public class Cashback {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// Variaveis
			double valor;
		System.out.println("Digite o valor da compra :");
			valor = ler.nextDouble();
			// Decisoes Encadeada
		if (valor <= 100.00) {	
			valor= valor*5/100;
			System.out.println("Seu cashback sera : " + valor);
		} else if (valor <= 1000.00) {
			valor = valor*8/100;
			System.out.println("Seu cashback sera : " + valor);
		} else if ( valor <=2000.00) {
			valor = valor*10/100;
			System.out.println("Seu cashback sera : " + valor);
		} else if (valor <=5000.00) {
			valor = valor*12.5/100;
			System.out.println("Seu cashback ser� : " + valor);	
		} else  {
			valor = valor*15/100;
			System.out.println("Seu cashback ser� : " + valor);
		}
		ler.close();
	}

}
