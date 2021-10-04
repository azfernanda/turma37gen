package lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int a,b,c;
		
		System.out.print("Digite o primeiro número inteiro: ");
		a = leia.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		b = leia.nextInt();
		System.out.print("Digite o terceiro número inteiro: ");
		c = leia.nextInt();
		
		if(a<=b) {
			if(b<=c) {
				System.out.println(a+"/"+b+"/"+c);
			}
			
			else if(a<=c) {
				System.out.println(a+"/"+c+"/"+b);
			} else {
				System.out.println(c+"/"+a+"/"+b);
			}
			
		}
	
		else if(b<=c) {
			if(a<=c) {
				System.out.println(b+"/"+a+"/"+c);
			} else {
				System.out.println(b+"/"+c+"/"+a);
			}
			
		} else {
			System.out.println(c+"/"+b+"/"+a);
		}
		
		
	}

}
