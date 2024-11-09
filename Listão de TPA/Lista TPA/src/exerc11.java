import java.util.Scanner;
public class exerc11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        System.out.println("Digite 10 Números inteiros:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("===================");

        System.out.print("Digite o Número a ser buscado: ");
        	int X = scanner.nextInt();
        System.out.println("===================");

        	for (int i = 0; i < 10; i++) {
        		if (A[i] == X) {
        System.out.println("O Número " + X + " foi encontrado no vetor.");
                return;
            }
        }
        System.out.println("O Número " + X + " não foi encontrado no vetor.");
        	 scanner.close();
    }
}

