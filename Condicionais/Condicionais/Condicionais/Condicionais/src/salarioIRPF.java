import java.util.Scanner;
public class salarioIRPF {
public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);

       // Declaração das variáveis
       double sal, aliquota, parc, ir;

       // Solicita ao usuário que digite o salário
       System.out.println("Digite o salário:");
       sal = scanner.nextDouble();

       // Determina a alíquota e a parcela a deduzir com base no salário
       if (sal <= 1434.59) {
           aliquota = 0;
           parc = 0;
       } else if (sal <= 2150.00) {
           aliquota = 7.5;
           parc = 107.59;
       } else if (sal <= 2866.70) {
           aliquota = 15.0;
           parc = 268.84;
       } else if (sal <= 3582.00) {
           aliquota = 22.5;
           parc = 483.84;
       } else {
           aliquota = 27.5;
           parc = 662.94;
       }

       // Calcula o valor do Imposto de Renda (IRPF)
       ir = sal * aliquota / 100 - parc;
       // Exibe o valor do IRPF
       System.out.println("O IRPF é: " + ir);

     
       scanner.close();
   }
}