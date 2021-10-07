package entities;

import entities.Pessoa;

public class Produto {

	public String codigo;
	public String nomeProduto;
	public double valor;
	public int estoque;
	
	public void tirarEstoque(int quant) {
		estoque-=quant;}
	public void addEstoque(int quant) {
		estoque+=quant;}
	
}
