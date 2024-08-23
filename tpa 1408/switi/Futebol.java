import java.util.Scanner;
public class Futebol {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// variaveis
	int id;
	System.out.println("Informe sua idade :");
		id = ler.nextInt();
	// switch case
		switch (id) {
	// Dente de Leite	
		case 6: 
			System.out.println("Dente de leite");
				break;
	// Junior			
		case 7:
			System.out.println("Junior");
				break;
	// Junior Max			
		case 8:
			System.out.println("Junior Max");
				break;
	// Junior Master			
		case 9:
			System.out.println("Junior Master");
				break;
	// Master			
		case 10:
			System.out.println("Master");
				break;
	// Nao aceitamos			
		default:
			System.out.println("Nao aceitamos pessoas com essa idade.");
		}
	ler.close();	
}
}
