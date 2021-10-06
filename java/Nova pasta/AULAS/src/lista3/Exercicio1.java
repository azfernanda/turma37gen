package lista3;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 for(int i = 1000; i<2000;i++) {
			 if((i%11)==5) {
				 System.out.println(i);
			 }
		 }
	
	}
}
