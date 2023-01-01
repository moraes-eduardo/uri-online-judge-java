// package Iniciante;

/*
 
 QUEST�O
 Todos os habitantes da Nlog�nia est�o super animados com a abertura do 
 Ricardo Barreiro World, o mais novo parque de divers�es do pa�s. Na TV e 
 no r�dio s� passam propagandas da montanha-russa do parque, a mais r�pida 
 do continente. � nela que todos, de crian�as a idosos querem andar.

 Infelizmente foram impostas algumas restri��es no momento da homologa��o do 
 brinquedo pelo governo. Por quest�es de seguran�a, h� uma altura m�nima e uma 
 altura m�xima que as pessoam devem ter para poder passear na montanha-russa.

 Para o dia da inaugura��o do parque, todos os convidados realizaram um 
 pr�-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a 
 opera��o do parque no primeiro dia, voc� foi contratado para fazer um 
 programa que dado o n�mero de visitantes, altura m�nima, altura m�xima e as 
 alturas de todos os visitantes, calcule quantas pessoas poder�o andar na 
 montanha-russa.
  
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso consiste 
 em tr�s inteiros N (1 <= N <= 100), Amin e Amax (50 <= Amin <= Amax <= 250), o 
 n�mero de visitantes, a altura m�nima e m�xima em cent�metros para andar na 
 montanha-russa, respectivamente.

 As N linhas seguintes cont�m, cada uma, um n�mero inteiro Ai (50 <= Ai <= 250), 
 a altura do i-�simo visitante, em cent�metros.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha com o n�mero visitantes que 
 podem passear na montanha-russa.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2547 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int min = sc.nextInt();
			int max = sc.nextInt();
			int cont = 0;
			for (int i = 0; i < N; i++) {
				int A = sc.nextInt();
				if (A >= min && A <= max) cont++;
			}
			System.out.println(cont);
		}
	}
	
}