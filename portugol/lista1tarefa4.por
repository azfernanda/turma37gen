programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real A,B,C
		real R,S,D

		//entradas
		escreva("Digite o valor de A : ")
		leia(A)
		escreva("Digite o valor de B : ")
		leia(B)
		escreva("Digite o valor de C : ")
		leia(C)

		//processamentos
		R = Matematica.potencia((A + B), 2)
		S = Matematica.potencia((B + C), 2)

		D = (R + S) / 2

		escreva("O valor de D é " ,D)
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */