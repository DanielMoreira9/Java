import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int i,tab,tabv;
			System.out.println("insira o numero que voce quer saber a tabuada");
		tab = ler.nextInt();
		tabv = tab;
		i = tab*10;
				while (tab <  i) {
					tab += tabv;
				System.out.println(tab);	
					
					
				}
			ler.close ();	
	} 
	
}
