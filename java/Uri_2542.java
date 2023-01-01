// package Iniciante;

/*
 
 QUEST�O
 Iu-di-oh! � um jogo de cartas que virou uma verdadeira febre entre os jovens! 
 Todo jogador de Iu-di-oh! tem seu pr�prio baralho, contendo v�rias cartas do 
 jogo. Cada carta cont�m N atributos (como for�a, velocidade, intelig�ncia, 
 etc.). Os atributos s�o numerados de 1 a N e s�o dados por inteiros positivos.

 Uma partida de Iu-di-oh! � sempre jogada por dois jogadores. Ao iniciar a 
 partida, cada jogador escolhe exatamente uma carta de seu baralho. Ap�s as 
 escolhas, um atributo � sorteado. Vence o jogador cujo atributo sorteado em 
 sua carta escolhida � maior que na carta escolhida pelo advers�rio. Caso os 
 atributos sejam iguais, a partida empata.

 Marcos e Leonardo est�o na grande final do campeonato brasileiro de Iu-di-oh!, 
 cujo pr�mio � um Dainavision (que � quase um Plaisteition 2!). Dados os 
 baralhos de ambos, a carta escolhida por cada um e o atributo sorteado, 
 determine o vencedor!
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 um inteiro N (1 <= N <= 100), o n�mero de atributos de cada carta. A segunda 
 linha cont�m dois inteiros M e L (1 <= M, L <= 100), o n�mero de cartas no 
 baralho de Marcos e de Leonardo, respectivamente.

 As pr�ximas M linhas descrevem o baralho de Marcos. As cartas s�o numeradas 
 de 1 a M, e a i-�sima linha descreve a i-�sima carta. Cada linha cont�m N 
 inteiros ai,1,ai,2,..., ai,N (1 <= ai,j <= 109). O inteiro ai,j indica o 
 atributo j da carta i. As pr�ximas L linhas descrevem o baralho de Leonardo. 
 As cartas s�o numeradas de 1 e L e s�o descritas de maneira an�loga.

 A pr�xima linha cont�m dois inteiros CM e CL (1 <= CM <= M, 1 <= CL <= L), as 
 cartas escolhidas por Marcos e Leonardo, respectivamente. Por fim, a �ltima 
 linha cont�m um inteiro A (1 <= A <= N) indicando o atributo sorteado.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo �Marcos� se Marcos � o 
 vencedor, �Leonardo� se Leonardo � o vencedor, ou �Empate� caso contr�rio (sem aspas).
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2542 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int nAtributos = sc.nextInt();
			int nCartasMarcos = sc.nextInt();
			int nCartasLeonardo = sc.nextInt();
			int[][] atributosCartasMarcos = new int[nCartasMarcos][nAtributos];
			int[][] atributosCartasLeonardo = new int[nCartasLeonardo][nAtributos];
			for (int i = 0; i < nCartasMarcos; i++)	{
				for (int j = 0; j < nAtributos; j++) {
					atributosCartasMarcos[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < nCartasLeonardo; i++) {
				for (int j = 0; j < nAtributos; j++) {
					atributosCartasLeonardo[i][j] = sc.nextInt();
				}
			}
			int cartaEscolhidaMarcos = sc.nextInt() -1;
			int cartaEscolhidaLeonardo = sc.nextInt() -1;
			int atributoSorteado = sc.nextInt() -1;
			int marcos = atributosCartasMarcos[cartaEscolhidaMarcos][atributoSorteado];
			int leonardo = atributosCartasLeonardo[cartaEscolhidaLeonardo][atributoSorteado];
			if (marcos == leonardo) 
				System.out.println("Empate");
			else if (marcos > leonardo)
				System.out.println("Marcos");
			else
				System.out.println("Leonador");
		}
	}
	
}