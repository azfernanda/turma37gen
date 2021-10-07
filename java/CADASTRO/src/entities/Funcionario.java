package entities;

public class Funcionario {

	public char confirma;
	public int codigo;
	public String cargo;
	public String nome;
	public int horario;
	
	 public int calcularHorario (int hora) {
	     return (int) (horario+6.0);
	    }
}
