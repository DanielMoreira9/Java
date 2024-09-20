package whileList;
import java.util.Scanner;
public class tabuada {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int i ,mul, result;   		 
	i = 1;                		
	 	while (i <= 10) {        
	 		mul=1;
	 		while (mul <  10) {
	 			mul++;
	 			result = i*mul;
	 			System.out.println(i + "x" + mul + "=" + result);
	 	}
	 	i++;
}
	 	ler.close();
}
}
