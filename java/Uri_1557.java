// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo que leia um inteiro N (0 <= N <= 15), correspondente a 
 ordem de uma matriz M de inteiros, e construa a matriz de acordo com o 
 exemplo abaixo. http://prntscr.com/k1qa9o
 
 ENTRADA
 A entrada consiste de v�rios inteiros, um valor por linha, correspondentes as 
 ordens das matrizes a serem constru�das. O final da entrada � marcado por um 
 valor de ordem igual a zero (0).
 
 SA�DA
 Para cada inteiro da entrada imprima a matriz correspondente, de acordo com o 
 exemplo. Os valores das matrizes devem ser formatados em um campo de tamanho T 
 justificados � direita e separados por espa�o, onde T � igual ao n�mero de d�gitos
 do maior n�mero da matriz. Ap�s o �ltimo caractere de cada linha da matriz n�o 
 deve haver espa�os em branco. Ap�s a impress�o de cada matriz deve ser deixada 
 uma linha em branco.
  
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1557 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, T, Y;
        while (N != 0) {
        	int[][] M = new int[N][N];
        	X = 1;
        	for (int i = 1; i <= N; i++) {
        		Y = X;
        		for (int j = 1; j <= N; j++) {
        			M[i-1][j-1] = Y;
        			Y *= 2;
        		}
        		X *= 2;
        	}
        	
        	T = String.valueOf(M[N-1][N-1]).length();
        	
        	for (int i = 1; i <= N; i++) {
        		for (int j = 1; j <= N; j++) {
        			
                    System.out.printf("%"+ T +"d", M[i-1][j-1]);
                    if (j < N) System.out.print(" ");
                    else System.out.print("\n");
        		}
        	}
        	
    		System.out.print("\n");
        	N = sc.nextInt();
        }

		sc.close();
    }
	
}