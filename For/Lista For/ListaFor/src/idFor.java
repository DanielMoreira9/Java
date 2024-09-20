import java.util.Scanner;
public class idFor {
public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
int id, nas, at, i;
int idVelho = Integer.MIN_VALUE;
int idNovo = Integer.MAX_VALUE;
System.out.print("Digite o ano atual: ");
at = ler.nextInt();
for (i = 0; i < 10; i++) {
	System.out.print("Digite o ano de nascimento do usuário ");
	nas = ler.nextInt();
	id = at - nas;
	 if (id > idVelho) {
         idVelho = id;
     }
     if (id < idNovo) {
         idNovo = id;
     }

     System.out.println("Usuário " + i + ": " + id + " anos");
 }

 System.out.println("Idade do usuário mais velho: " + idVelho + " anos");
 System.out.println("Idade do usuário mais novo: " + idNovo + " anos");

}	
}	
	
