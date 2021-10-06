package lista3;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		int idade=0;
		char sexo=0; //(1 feminino/2 masculino/3 outros)
		char opcao=0; //1 pessoa calma //2 pessoa nervosa //3 pessoa agressiva
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasAcimados40=0;
		int pessoasCalmasAbaixodos18 = 0;
		char op='S';
		int contadorHabitantes=0;
		
		//entradas
		while(op =='S' && contadorHabitantes <150) {
			System.out.println("Habitante #"+contadorHabitantes);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Escolha: \n1 feminino\n2 masculino\n3 outros");
			sexo = leia.next().charAt(0);
			System.out.println("Escolha: \n1 pessoa calma \n2 pessoa nervosa \n3 pessoa agressiva");
			opcao = leia.next().charAt(0);
			System.out.println("Continuar S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			contadorHabitantes++;
		}
			//processamentos
			
			if (opcao=='1') {
				pessoasCalmas++;
			}
			if (sexo=='1' && opcao=='2') {
				mulheresNervosas++;
			}
			if (sexo=='2' && opcao=='3') {
				homensAgressivos++;
			}
			if (sexo=='3' && opcao=='1') {
				outrosCalmos++;
			}
			if (opcao=='2' && idade >=40) {
				pessoasNervosasAcimados40++;
			}
			if (opcao=='1' && idade <18) {
				pessoasCalmasAbaixodos18++;
			}
		//saidas
			
			System.out.println("Habitantes entrevistados: "+contadorHabitantes);
			System.out.println("Pessoas calmas: "+pessoasCalmas);
			System.out.println("Mulheres nervosas: "+mulheresNervosas);
			System.out.println("Homens agressivos: "+homensAgressivos);
			System.out.println("Outros calmos: "+outrosCalmos);
			System.out.println("Pessoas nervosa acima dos 40 anos: "+pessoasNervosasAcimados40);
			System.out.println("Pessoas calmas abaixo dos 18 anos: ");
	}		
	
}

