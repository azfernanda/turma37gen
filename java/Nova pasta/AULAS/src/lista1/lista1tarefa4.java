package lista1;
import java.util.Scanner;
import java.lang.Math;

public class lista1tarefa4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double A,B,C,R,S,D;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = leia.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = leia.nextDouble();
		
		R = Math.pow((A+B),2);
		S = Math.pow((A+B),2);
		D = (R+S)/2;

		
		System.out.println("O valor de D é " +D );
		
	}
}