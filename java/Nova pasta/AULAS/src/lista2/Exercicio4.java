package lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		double numero = 0.00;

		System.out.print("Digite um número: ");
		numero = leia.nextDouble();
		
		if ((numero%2)==0) {
			System.out.printf("O número %.2f é par e sua raíz quadrada é %.2f.",numero,Math.sqrt(numero));
		}
		else if((numero%2)==1) {
			System.out.printf("O número %.2f é ímpar e ao quadrado é %.2f.",numero,Math.pow(numero, 2));
		}
		
	}

}
