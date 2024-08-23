import java.util.Scanner;
public class Nascimento {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int i,nas,at,id;
	i = 1;
		while (i <= 6) {
			i += 1;
			System.out.println("Digite seu ano de nascimento :");
		nas = ler.nextInt();
			System.out.println("Digite o ano Atual :");
		at = ler.nextInt();
		id = at - nas;
			if (id<18) {
				System.out.println("Sua idade é " + id +" Você é Menor de idade");
			}
			else {
					System.out.println("Sua idade é " + id + " Você é  Maior de idade");
				}
			} ler.close();
		}
		
}

