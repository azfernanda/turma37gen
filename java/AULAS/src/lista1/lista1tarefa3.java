package lista1;
import java.util.Scanner;

public class lista1tarefa3 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int entrada, horas, minutos, segundos;
		
		System.out.println("Digite a duração do evento em segundos: ");
		entrada = leia.nextInt();
		
		//processamento
		horas = (entrada/3600);
		minutos = ((entrada - (horas*3600))/60);
		segundos = (entrada%60);
		
		System.out.println("A duração do evento foi de "+horas+" horas, "+ minutos+ " minutos e "+segundos+" segundos.");
		
	}
}
	
