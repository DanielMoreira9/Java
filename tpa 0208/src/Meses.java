import java.util.Scanner;
public class Meses {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Vari�veis
		int meses;
	System.out.println("Digite o Numero correspondente ao mes :");
		meses = ler.nextInt();
	switch (meses) {
//Meses com 31 Dias	
		case 1:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mes tem 31 dias");
				break;
// Meses com 30 Dias				
		case 3:
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este Mes tem 30 dias");
			break;
// M�s com 28 Dias			
		case 2:
			System.out.println("Este mes tem 28 dias");
				break;
// N�o Existente :)				
		default:
			System.out.println("Mes Invalido");
	}
	ler.close();
}
}
