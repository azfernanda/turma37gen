package lista1;
import java.util.Scanner;

public class lista1tarefa7 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = leia.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = leia.nextDouble();
		System.out.println("Digite o valor de d: ");
		d = leia.nextDouble();
		System.out.println("Digite o valor de e: ");
		e = leia.nextDouble();
		System.out.println("Digite o valor de f: ");
		f = leia.nextDouble();
		
		x=((c*e)-(b*f)/(a*e)-(b*d));
		y=((a*f)-(c*d)/(a*e)-(b*d));

		
		System.out.println("x � igual a" +x);
		System.out.println("x � igual a" +y);
	}
}