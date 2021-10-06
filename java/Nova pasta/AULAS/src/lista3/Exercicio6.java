package lista3;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int total=0, contador=0, numero;
		double media;
		
		do {
			System.out.println("Digite um múltiplo de 3:");
			System.out.println("P.S.:Digite 0 para obter a média.");
			
			numero = leia.nextInt();
			if((numero%3)==0 && numero!=0) {
				total+=numero;
				contador++;
			}
			
		}while(numero!=0);
		media = total/contador;
		System.out.println("Média da soma dos múltiplos de três: "+media);

	}
}
