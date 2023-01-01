// package Iniciante;

/*
 
 QUEST�O
 A grande Maratona de Rua de Curitiba ir� ocorrer nos pr�ximos dias! V�rios 
 atletas est�o treinando h� dias para o grande dia da corrida. Fl�vio � um 
 dos atletas que est� treinando diariamente para se sair bem na corrida. 
 Ele tem corrido todas as manh�s nas pistas pr�ximas de sua casa.

 Os treinos do garoto s�o monitorados por um aplicativo em seu celular. Ap�s 
 cada treino, Fl�vio sabe tanto a dura��o do treino quanto a dist�ncia total 
 percorrida. Com essas informa��es, ele consegue determinar a velocidade 
 m�dia obtida em cada treino.

 Fl�vio est� muito preocupado com a evolu��o de seu desempenho nos treinos, e 
 em particular com seu recorde de velocidade m�dia. Tal recorde � batido em 
 um dado treino quando a velocidade m�dia para este treino � maior que todas 
 as velocidades m�dias obtidas nos treinos anteriores. Ajude Fl�vio a
 determinar em quais treinos ele conseguiu bater seu recorde.
  
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 um inteiro N (1 <= N <= 30), o n�mero de treinos feitos. Considere que os 
 treinos foram feitos nos dias 1, 2,...,N. As pr�ximas N linhas descrevem os 
 treinos. A linha i (1 <= i <= N) cont�m dois inteiros Ti e Di (1 <= Ti, 
 Di <= 100), indicando, respectivamente, a dura��o do treino (em minutos) e a 
 dist�ncia percorrida no treino (em quil�metros).

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma lista de inteiros indicando os dias nos 
 quais o recorde foi batido. Cada dia deve ser impresso em uma linha. Imprima 
 os dias em ordem crescente. Note que o dia 1 sempre deve ser impresso.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2551 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			double recorde = 0;
			for (int i = 1; i <= N; i++) {
				double T = sc.nextInt();
				double D = sc.nextInt();
				if (D / T > recorde) {
					System.out.println(i);
					recorde = D / T;
				}
			}
		}
	}
	
}