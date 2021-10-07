package entities;

public class Paciente {
	
	public int numeroSus;
	public char doenca;
	public String nome;
	public int anoNascimento;

    public int calcularIdade(int ano) {
        return ano - anoNascimento;
    }
}
