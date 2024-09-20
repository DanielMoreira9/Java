package whileList;
import java.util.Scanner;
public class médiaintervalos {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int início, fim, soma, cont, i;
	double média;
	System.out.println("Digite o intervalo inicial");
	início = ler.nextInt();
	System.out.println("Digite o intervalo finsl");
	fim = ler.nextInt();
	soma = 0;
	cont = 0;
	i = início;
	 while (i <= fim) {
         soma += i;
         cont++;
         i++;
     }
	 média = soma/cont;
	 System.out.println("A média aritmética dos números entre " + início + " e " + fim + " é: " + média);
}
}
