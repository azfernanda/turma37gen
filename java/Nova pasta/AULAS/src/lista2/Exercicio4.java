package lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double numero = 0.00;

		System.out.print("Digite um n�mero: ");
		numero = leia.nextDouble();
		
		if ((numero%2)==0) {
			System.out.printf("O n�mero %.2f � par e sua ra�z quadrada � %.2f.",numero,Math.sqrt(numero));
		}
		else if((numero%2)==1) {
			System.out.printf("O n�mero %.2f � �mpar e ao quadrado � %.2f.",numero,Math.pow(numero, 2));
		}
		
	}

}
