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
        System.out.print("Digite o dígito: ");
        conta.numeroDigito = leia.nextInt();
    	System.out.print("Ano de validade do cartão: ");
        conta.ano = leia.nextInt();
        System.out.print("Mês de validade do cartão: ");
        conta.mes = leia.nextInt();
        System.out.printf("Olá %s, o número da sua conta é %d - %d e seu cartão vence em: %d/%d\n", conta.nome,conta.numeroConta,conta.numeroDigito,conta.mes,conta.ano);
        System.out.println("Deposite qualquer valor e ganhe 10% de crédito. Quando deseja depositar? ");
        conta.deposito = leia.nextDouble();
        System.out.printf("Seu saldo é de: R$%.2f",conta.bonus());
	}

}
