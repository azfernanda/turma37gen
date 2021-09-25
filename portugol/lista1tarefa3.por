programa
{
		
	funcao inicio()
	{
		inteiro entrada,horas,minutos,segundos
		

		//entradas
		escreva("Digite a duração do evento em segundos: ")
		leia(entrada)

		//processamentos
		horas = (entrada/3600)
		minutos = ((entrada - (horas*3600))/60)
		segundos = (entrada%60)

		//saida
		escreva("A duração do evento é ", horas, " horas ", minutos, " minutos e ", segundos, " segundos." )
		
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */