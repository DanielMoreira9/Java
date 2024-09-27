import java.util.Scanner;
public class notaMedia {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Declaração das variáveis
	        int nota1, nota2, media;
	        double notaExame, novaMedia;

	        // Solicita a primeira nota
	        System.out.println("Digite a primeira nota:");
	        nota1 = scanner.nextInt();

	        // Solicita a segunda nota
	        System.out.println("Digite a segunda nota:");
	        nota2 = scanner.nextInt();

	        // Calcula a média das duas notas
	        media = (nota1 + nota2) / 2;

	        // Verifica a situação do aluno com base na média
	        if (media < 3) {
	            System.out.println("REPROVADO.");
	        } else if (media >= 6) {
	            System.out.println("APROVADO.");
	        } else {
	            System.out.println("O aluno está em EXAME.");
	            System.out.println("Digite a nota do EXAME:");
	            
	            // Solicita a nota do exame
	            notaExame = scanner.nextDouble();
	            
	            // Calcula a nova média considerando a nota do exame
	            novaMedia = (media + notaExame) / 2;
	            
	            // Verifica a situação do aluno após o exame
	            if (novaMedia >= 6) {
	                System.out.println("O aluno está APROVADO.");
	            } else {
	                System.out.println("O aluno está REPROVADO.");
	            }
	        }
	        
	        scanner.close();
	    }
	}