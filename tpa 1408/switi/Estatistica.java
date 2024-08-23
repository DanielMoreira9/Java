package switi;
import java.util.Scanner;
public class Estatistica {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
// Variaveis	
int alunos,mb,b,r,i,porcen,notas;
	System.out.println("Digite a quantidade de alunos:");
 alunos = ler.nextInt();
	System.out.println("Digite a quantidade de alunos  que tiraram MB :");
mb = ler.nextInt();
	System.out.println("Digite a quantidade de alunos que tiraram  B :");
b = ler.nextInt();
	System.out.println("Digite a quantidade de alunos que tiraram  R :");
r = ler.nextInt();
	System.out.println("Digite a quantidade de alunos que tiraram I :");
i = ler.nextInt();
	System.out.println("Digite a nota que quer ver : (MB = 1, B = 2, R = 3, I = 4)");
notas = ler.nextInt();	
// switch case
	switch (notas) {
		case 1:
			porcen = 100*mb/alunos;
				System.out.println("Essa foi a porcentagem de alunos que tiraram MB:" + porcen);
		break;
		case 2:
			porcen = 100*b/alunos;
				System.out.println("Essa foi a porcentagem de alunos que tiraram B: " + porcen);
		break;
		case 3:
			porcen = 100*r/alunos;
				System.out.println("Essa foi a porcentagem de alunos que tiraram R: " + porcen);
		break;
		case 4:
			porcen = 100*i/alunos;
				System.out.println("Essa foi a porcentagem de alunos que tiraram I: " + porcen);
		break;
		default:
				System.out.println("Nota inválida");
	}
	ler.close();
}
}
