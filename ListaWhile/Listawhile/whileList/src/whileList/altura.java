package whileList;
import java.util.Scanner;
public class altura {
public static void main(String[] args) {
	double joao, pedro, crescPedro, crescJoao;
	int anos;
	anos = 0;
	joao = 1.34;
	pedro = 1.45;
	crescJoao = 0.025;
	crescPedro = 0.020;
	    while (joao < pedro) {
	    	joao = joao + crescJoao;
	    	pedro = pedro + crescPedro;
	    	anos++;
	    }
	    		System.out.println("João ficará maior que pedro em " + anos + " anos " );
}
}
