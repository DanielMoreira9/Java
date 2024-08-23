package switi;
import java.util.Scanner;
public class Cantina {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
// Variaveis
	int codigo;
	System.out.println("Digite o código do produto :");
codigo = ler.nextInt();
// switch case
	switch (codigo) {
	case 1:
		System.out.println("Cachorro quente no valor de : R$ 8,00");
	break;
	case 2:
		System.out.println("Cheeseburguer no valor de : R$ 12,00");
	break;
	case 3:
		System.out.println("X-salada no valor de : R$ 15,00");
	break;
	case 4:
		System.out.println("Misto quente no valor de : R$ 11,00");
	break;
	case 5:
		System.out.println("Pão na chapa no valor de : R$ 6,00");
	break;
	default:
		System.out.println("Não temos o código deste produto.");
	}
	ler.close();
}
}
