programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite idade do aluno:")
		leia(idade)

		se (idade<5){
			escreva("Não temos sua categoria")
			}
		senao se (idade>=5 e idade <7) {
			escreva("Infantil A")
		}
				senao se (idade>=8 e idade <11) {
			escreva("Infantil B")
		}
				senao se (idade>=12 e idade <=13) {
			escreva("Juvenil A")
		}
				senao se (idade>=14 e idade <17) {
			escreva("Juvenil B")
				}
				senao se (idade>=18) {
			escreva("Adultos")
		}
		
		}
			
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */