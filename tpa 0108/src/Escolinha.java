import java.util.Scanner;
public class Escolinha {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// variaveis
		int id;
		System.out.println("Digite sua idade : ");
		id = ler.nextInt ();
		// decisoes encadeadas
		if (id <= 6) {
			System.out.println("Dente de Leite");
		} else if (id <= 14) {
			System.out.println("Infantil 1");
		} else if (id <= 16) {
			System.out.println("Juvenil 1 ");
		} else if (id == 17) {
			System.out.println("Juvenil 2");
		} else {
			System.out.println("Nao permitimos jogadores desta idade");
			
		}	
		ler.close();
	} 
	
}
