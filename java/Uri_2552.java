// package Iniciante;

/*
 
 QUEST�O
 Est� chegando a grande final do Campeonato Nlogonense de Surf Aqu�tico, que 
 este ano ocorrer� na cidade de Bonita Horeleninha (BH)! Nesta cidade, o jogo 
 P�odeQueijoSweeper � bastante popular!

 O tabuleiro do jogo consiste em uma matriz de N linhas e M colunas. Cada 
 c�lula da matriz cont�m um p�o de queijo ou o n�mero de p�es de queijo que 
 existem nas celulas adjacentes a ela. Uma c�lula � adjacente a outra se 
 estiver imediatamente � esquerda, � direita, acima ou abaixo da c�lula. Note 
 que, se n�o contiver um p�o de queijo, uma c�lula deve obrigatoriamente 
 conter um n�mero entre 0 e 4, inclusive.

 Dadas as posi��es dos p�es de queijo, determine o tabuleiro do jogo!
  
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 os inteiros N e M (1 <= N, M <= 100). As pr�ximas N linhas cont�m M inteiros 
 cada, separados por espa�os, descrevendo os p�es de queijo no tabuleiro. O 
 j-�simo inteiro da i-�sima linha � 1 se existe um p�o de queijo na linha i e 
 coluna j do tabuleiro, ou 0 caso contr�rio.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima N linhas com M inteiros cada, n�o separados 
 por espa�os, descrevendo a configura��o do tabuleiro. Se uma posi��o cont�m um 
 p�o de queijo, imprima 9 para ela; caso contr�rio, imprima o n�mero cuja posi��o 
 deve conter.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2552 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] mat = new int[N][M];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					mat[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (mat[i][j] == 1) System.out.print("9");
					else System.out.print(a(mat, i, j));
				}
				System.out.print("\n");
			}
		}

		sc.close();
	}
	
	private static int a(int[][] mat, int i, int j) {
		int p = 0;
		int l = mat.length -1;
		int c = mat[i].length - 1;
		if (i > 0 && mat[i - 1][j] == 1) p++;
		if (i < l && mat[i + 1][j] == 1) p++;
		if (j > 0 && mat[i][j - 1] == 1) p++;
		if (j < c && mat[i][j + 1] == 1) p++;
		return p;
	}
	
}