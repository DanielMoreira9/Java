import java.util.Scanner;
public class Placa {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
		// variaveis
	int n;
	System.out.println("Digite o Numero final da sua placa");
		n = ler.nextInt();
	//switch case 
		switch (n) {
// Segunda		
		case 1:
		case 2:
			System.out.println("Nao poder� circular na Segunda-Feira");
				break;
// Ter�a				
		case 3:
		case 4:
			System.out.println("Nao poder� circular na Ter�a-Feira");
				break;
// Quarta				
		case 5:
		case 6:
			System.out.println("Nao poder� circular na Quarta-Feira");
				break;
// Quinta				
		case 7:
		case 8:
			System.out.println("Nao poder� circular na Quinta-Feira");
				break;
// Sexta				
		default: 
			System.out.println("Nao poder� circular na Sexta-Feira");
		}
		ler.close();
}
}
