import java.util.Scanner;
import java.lang.Math;
public class bhaskara {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	 // Declaração das variáveis
    double a, b, c, delta, raiz1, raiz2;
    
    // Solicita ao usuário que digite os valores de a, b e c
    System.out.println("Digite o valor de A:");
    a = ler.nextDouble();
    System.out.println("Digite o valor de B:");
    b = ler.nextDouble();
    System.out.println("Digite o valor de C:");
    c = ler.nextDouble();
    
    // Calcula o valor de delta
    delta = (b * b) - (4 * a * c);
 // Verifica o valor de delta e calcula as raízes, se existirem
    if (delta < 0) {
        System.out.println("Não existem raízes reais.");
    } else if (delta == 0) {
        raiz1 = -b / (2 * a);
        System.out.println("Existe uma raiz real: " + raiz1);
    } else {
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Existem duas raízes reais: " + raiz1 + " e " + raiz2);
    }
 
    ler.close();
}
}

