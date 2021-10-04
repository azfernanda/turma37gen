package lista1;
import java.util.Scanner;

public class lista1tarefa5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1,n2,n3,m;
		
		System.out.println("Digite nota 1: ");
		n1 = leia.nextDouble();
		System.out.println("Digite nota 2: ");
		n2 = leia.nextDouble();
		System.out.println("Digite nota 3: ");
		n3 = leia.nextDouble();

		m =((n1*2) + (n2*3) + (n3*5))/10;
		
		System.out.println("A média ponderada é " +m); 
		
	}
}
