programa
{
	
	funcao inicio()
	{
		inteiro x[3][3], soma=0, diagonal=0
		
		para(inteiro i=0;i<3;i++){
			para(inteiro j=0;j<3;j++){
				
				escreva("Digite um valor para a linha ",i, " e coluna ",j, ": ")
				leia(x[i][j])
				soma+=x[i][j]
				se(i==j){
					diagonal+=x[i][j]
				}
			}
		}
		escreva("Soma dos valores da diagonal principal: ", diagonal, "\n")
		escreva("Soma dos valores da matriz: ",soma)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 410; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {x, 6, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */