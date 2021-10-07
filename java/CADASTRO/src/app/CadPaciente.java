package app;

import java.util.Scanner;

import entities.Paciente;

public class CadPaciente {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Paciente paciente = new Paciente();
		
		System.out.print("Digite seu nome: ");
        paciente.nome = leia.next();
        System.out.print("Digite o número do seu cartão do SUS: ");
        paciente.numeroSus = leia.nextInt();
        System.out.print("Digite seu ano de nascimento: ");
        paciente.anoNascimento = leia.nextInt();
        System.out.print("Possui doença pré existente?(S/N): ");
        char op = leia.next().charAt(0);
        	if (op == 'N') {
        		paciente.doenca = 'N';
        		System.out.printf("Procure o balcão de informação 1. Por favor informe sua idade.\nVocê tem aproximadamente %d anos.",paciente.calcularIdade(2021));
        	}else {
        		System.out.printf("Procure o balcão de informação 2. Por favor informe sua idade.\nVocê tem aproximadamente %d anos.",paciente.calcularIdade(2021));
        		
        	}
}


}