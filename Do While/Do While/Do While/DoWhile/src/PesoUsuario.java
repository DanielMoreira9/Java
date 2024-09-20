import java.util.Scanner;
public class PesoUsuario {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String resposta;
	double altura, PesoIdeal;
	int continuar;
	do {
	System.out.println("Digite o sexo do usuário (m para masculino, f para feminino): ");
        resposta = ler.next();
	 System.out.println("Digite a altura do usuário em cm");
	altura = ler.nextDouble();
	  
		 if (resposta.equalsIgnoreCase("m")) {
			PesoIdeal = 52 + (0.75 * (altura - 152.4));
		    System.out.printf("Seu peso ideal é %.2f kg\\n ", PesoIdeal);
		} else if (resposta.equalsIgnoreCase("f")) {
			PesoIdeal = 52 + (0.67 * (altura - 152.4));
		    System.out.printf("Seu peso ideal é %.2f kg\\n ", PesoIdeal);
		}
		     System.out.println("Deseja continuar? (1) para sim e (2) para não");
		     continuar = ler.nextInt();
		     
	 } while (continuar == 1);
	       ler.close();
}
}
