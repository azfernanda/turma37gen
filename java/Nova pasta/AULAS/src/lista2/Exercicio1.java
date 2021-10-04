package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		int a,b,c;
		
		System.out.print("Digite um número: ");
		a = read.nextInt();
		System.out.print("Digite um número: ");
		b = read.nextInt();
		System.out.print("Digite um número: ");
		c = read.nextInt();
		
		if (c>=b) {
			if (c>=a) {
			System.out.println("O maior número é "+c);
			}
		} else if (b>=a) {
			if (b>=c)
			System.out.println("O maior número é "+b);
			
		} else {
			System.out.println("O maior número é "+a);
		}
			
		
	}
}