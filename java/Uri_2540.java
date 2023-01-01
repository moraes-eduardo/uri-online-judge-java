// package Iniciante;

/*
 
 QUEST�O
 Anal�gim�n Go! � um jogo bastante popular. Os jogadores de Anal�gim�n Go! s�o 
 divididos em tr�s grandes times: Time Valor, Time Instinto e Time M�stico, 
 que s�o liderados pelos seus l�deres Kandera, Esparky e Blanque, 
 respectivamente. Naturalmente, voc� faz parte de um desses times!

 O l�der do seu time est� sendo acusado de infringir as regras do jogo por 
 gerenciar incorretamente os doces recebidos do Professor que s�o destinados 
 ao time. Isto criou uma grande pol�mica dentro da equipe: alguns jogadores 
 defendem que o l�der realmente agiu incorretamente e deve sofrer um 
 impeachment e ser afastado de seu cargo, enquanto outros defendem que ele 
 n�o infringiu as regras, que a acusa��o � inver�dica e que ele deve continuar 
 no cargo.

 Para resolver a situa��o, uma vota��o ser� realizada entre todos os N 
 jogadores do seu time. Cada jogador dever� votar se o impeachment deve ou 
 n�o ocorrer. Se o n�mero de votos favor�veis ao impeachment foi maior ou 
 igual a 2/3 (dois ter�os) do total de jogadores, o l�der ser� afastado. Caso 
 contr�rio, a acusa��o � arquivada e ele continuar� no cargo.

 Dados os votos de todos os jogadores, determine o resultado da vota��o.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 o inteiro N (1 <= N <= 105), o n�mero de jogadores em seu time. A pr�xima 
 linha cont�m N inteiros v1, ..., vN (vi = 0 ou 1), indicando os votos dos 
 jogadores. O valor 1 indica um voto favor�vel ao impeachment, enquanto o 
 valor 0 indica um voto contr�rio ao mesmo.

 A entrada termina com fim-de-arquivo (EOF). 
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo a palavra impeachment se 
 o l�der deve ser afastado de seu cargo, ou acusacao arquivada caso contr�rio.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2540 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int votos = 0;
			for (int i = 0; i < N; i++) 
				votos += sc.nextInt();
			double doisTercos = (2.0 * N) / 3.0;
			if (votos >= doisTercos)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}

		sc.close();
	}
	
}