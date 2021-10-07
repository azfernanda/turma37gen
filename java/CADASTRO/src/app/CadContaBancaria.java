package app;

import java.util.Scanner;

import entities.ContaBancaria;

public class CadContaBancaria {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
    	System.out.print("Digite seu nome: ");
        conta.nome = leia.next();
    	System.out.print("Digite sua conta: ");
        conta.numeroConta = leia.nextInt();
        System.out.print("Digite o d�gito: ");
        conta.numeroDigito = leia.nextInt();
    	System.out.print("Ano de validade do cart�o: ");
        conta.ano = leia.nextInt();
        System.out.print("M�s de validade do cart�o: ");
        conta.mes = leia.nextInt();
        System.out.printf("Ol� %s, o n�mero da sua conta � %d - %d e seu cart�o vence em: %d/%d\n", conta.nome,conta.numeroConta,conta.numeroDigito,conta.mes,conta.ano);
        System.out.println("Deposite qualquer valor e ganhe 10% de cr�dito. Quando deseja depositar? ");
        conta.deposito = leia.nextDouble();
        System.out.printf("Seu saldo � de: R$%.2f",conta.bonus());
	}

}
