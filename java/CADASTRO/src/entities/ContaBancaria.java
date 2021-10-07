package entities;

public class ContaBancaria {
	
	public int numeroConta;
	public int numeroDigito;
	public int ano;
	public int mes;
	public String nome;
	public double deposito;
	
	public double bonus() {
        return (deposito / 10)+ deposito;
	}

}
