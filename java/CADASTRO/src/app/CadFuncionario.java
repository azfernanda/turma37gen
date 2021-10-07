package app;

import java.util.Scanner;

import entities.Funcionario;

public class CadFuncionario {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Você trabalha aqui?(S/N)");
        char op = leia.next().charAt(0);
        if (op == 'S') {
        	funcionario.confirma = 'S';
        	System.out.print("Digite seu nome: ");
        	funcionario.nome = leia.next();
        	System.out.print("Digite a hora: ");
        	funcionario.horario = leia.nextInt();
        	System.out.print("Digite seu código: ");
        	funcionario.codigo = leia.nextInt();       
        	System.out.printf("Oi %s, seja bem vinde! Você larga às %d." ,funcionario.nome,funcionario.calcularHorario(0));
        }else {
        	System.out.print("Tente novamente.");
        	
        }
	}


}