package app;

import java.util.Scanner;

import entities.Paciente;

public class CadPaciente {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Paciente paciente = new Paciente();
		
		System.out.print("Digite seu nome: ");
        paciente.nome = leia.next();
        System.out.print("Digite o n�mero do seu cart�o do SUS: ");
        paciente.numeroSus = leia.nextInt();
        System.out.print("Digite seu ano de nascimento: ");
        paciente.anoNascimento = leia.nextInt();
        System.out.print("Possui doen�a pr� existente?(S/N): ");
        char op = leia.next().charAt(0);
        	if (op == 'N') {
        		paciente.doenca = 'N';
        		System.out.printf("Procure o balc�o de informa��o 1. Por favor informe sua idade.\nVoc� tem aproximadamente %d anos.",paciente.calcularIdade(2021));
        	}else {
        		System.out.printf("Procure o balc�o de informa��o 2. Por favor informe sua idade.\nVoc� tem aproximadamente %d anos.",paciente.calcularIdade(2021));
        		
        	}
}


}