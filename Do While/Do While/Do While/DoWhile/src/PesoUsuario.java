import java.util.Scanner;
public class PesoUsuario {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	String resposta;
	double altura, PesoIdeal;
	int continuar;
	do {
	System.out.println("Digite o sexo do usu�rio (m para masculino, f para feminino): ");
        resposta = ler.next();
	 System.out.println("Digite a altura do usu�rio em cm");
	altura = ler.nextDouble();
	  
		 if (resposta.equalsIgnoreCase("m")) {
			PesoIdeal = 52 + (0.75 * (altura - 152.4));
		    System.out.printf("Seu peso ideal � %.2f kg\\n ", PesoIdeal);
		} else if (resposta.equalsIgnoreCase("f")) {
			PesoIdeal = 52 + (0.67 * (altura - 152.4));
		    System.out.printf("Seu peso ideal � %.2f kg\\n ", PesoIdeal);
		}
		     System.out.println("Deseja continuar? (1) para sim e (2) para n�o");
		     continuar = ler.nextInt();
		     
	 } while (continuar == 1);
	       ler.close();
}
}
