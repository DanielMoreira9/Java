package whileList;
import java.util.Scanner;
public class idade {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int id, i, faixa1, faixa2, faixa3, faixa4, faixa5, max, min; 
    double porc1, porc2, porc3, porc4, porc5; 
    faixa1 = 0;
    faixa2 = 0;
    faixa3 = 0;
    faixa4 = 0;
    faixa5 = 0;
    i = 0;
    max = Integer.MIN_VALUE;
    min = Integer.MAX_VALUE;
        while (i < 15) {
        	System.out.println("Digite a idade");
            id = ler.nextInt();
            if (id <= 15) {
            	System.out.println("1° faixa etária " + id);
                faixa1++;
            } else if (id <= 30) {
            	System.out.println("2° faixa etária " + id);
                faixa2++;
            }  else if (id <= 45) {
            	System.out.println("3° faixa etária " + id);
                faixa3++;
            } else if (id <= 60) {
            	System.out.println("4° faixa etária " + id);
                faixa4++;
            } else {
            	System.out.println("5° faixa etária " + id);
                faixa5++;
            }
            if (id < min) {
            	System.out.println("Idade do mais novo " + id);
                min = id;
            }  if (id > max) {
            	System.out.println("Idade do mais velho " + id);
                max = id;
            }
             i++;
        }
        
        porc1 = faixa1/15.0*100;
        System.out.println("Porcentagem de pessoas na 1° faixa etária" + porc1);
        porc2 = faixa2/15.0*100;
        System.out.println("Porcentagem de pessoas na 2° faixa etária" + porc2);
        porc3 = faixa3/15.0*100;
        System.out.println("Porcentagem de pessoas na 3° faixa etária" + porc3);
        porc4 = faixa4/15.0*100;
        System.out.println("Porcentagem de pessoas na 4° faixa etária" + porc4);
        porc5 = faixa5/15.0*100;
        System.out.println("Porcentagem de pessoas na 5° faixa etária" + porc5);
}
}
