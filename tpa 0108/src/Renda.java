import java.util.Scanner;
public class Renda {
	public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			//variaveis
		double renda , inss;
			System.out.println("Informe sua renda :");
		renda = ler.nextDouble();
		// decisao encadeada
			if (renda <= 1412.00) {
					inss = renda*7.5/100;
				System.out.println("Voce devera pagar para o inss :" + inss);
			} else if (renda <= 2666.68) {
				inss = renda*9/100;
				System.out.println("Voce devera pagar para o inss :" + inss);
			} else if (renda <= 4000.03) {
				inss = renda*12/100;
				System.out.println("Voce devera pagar para o inss :" + inss);
			} else if ( renda <= 7786.02) {
				inss = renda*14/100;
				System.out.println("Voce devera pagar para o inss :" + inss);
			} else {
				inss = renda*16/100;
				System.out.println("Voce devera pagar para o inss :" + inss);
			}
			ler.close();
	}
}
