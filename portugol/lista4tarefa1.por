programa
{
	funcao inicio()
	{
		inteiro nota[5], maiorNota=0
		
		para(inteiro x=0; x<5; x++){
			escreva("Digite sua pontuação: ")
			leia(nota[x])
			
			se(maiorNota<nota[x]){
				maiorNota=nota[x]
			}
		}
		para(inteiro x=0; x<5; x++){
			
			}
			escreva("A maior nota é: " ,maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */