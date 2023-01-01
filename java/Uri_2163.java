// package Iniciante;

/*
 
 QUEST�O
 H� muito tempo atr�s, em uma gal�xia muito, muito distante...

 Ap�s o decl�nio do Imp�rio, sucateiros est�o espalhados por todo o universo 
 procurando por um sabre de luz perdido. Todos sabem que um sabre de luz 
 emite um padr�o de ondas espec�fico: 42 cercado por 7 em toda a volta. Voc� 
 tem um sensor de ondas que varre um terreno com N x M c�lulas. Veja o exemplo 
 abaixo para um terreno 4 x 7 com um sabre de luz nele (na posi��o (2, 4)).

 Voc� deve escrever um programa que, dado um terreno N x M, procura pelo padr�o 
 do sabre de luz nele. Nenhuma varredura tem mais do que um padr�o de sabre de luz.
 
 ENTRADA
 A primeira linha da entrada tem dois n�meros positivos N e M, representando, 
 respectivamente, o n�mero de linhas e de colunas varridos no terreno (3 <= N, 
 M <= 1000). Cada uma das pr�ximas N linhas tem M inteiros, que descrevem os 
 valores lidos em cada c�lula do terreno (-100 <= Tij <= 100, para 1 <= i <= N 
 e 1 <= j <= M).
 
 SA�DA
 A sa�da � uma �nica linha com 2 inteiros X e Y separados por um espa�o. Eles 
 representam a coordenada (X,Y) do sabre de luz, caso encontrado. Se o terreno 
 n�o tem um padr�o de sabre de luz, X e Y s�o ambos zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2163 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	// int X = 0, Z = 0;
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[][] T = new int[N][M];

		sc.close();
    	
    	for (int i = 0; i < T.length; i++) {
    		for (int j = 0; j < T[i].length; j++) {
    			T[i][j] = sc.nextInt();
    		}
    	}
    	
    	for (int i = 1; i < (T.length-1); i++) {
    		for (int j = 1; j < (T[i].length-1); j++) {
    			if (T[i][j] == 42 && isTheSword(T, i, j)) {
    				System.out.println((i+1) + " " + (j+1));
    				return;
    			}
    		}
    	}
    	
    	System.out.println(0 + " " + 0);

		
    }
    
	private static boolean isTheSword(int[][] mat, int i, int j) {
		
		if ((mat[i-1][j-1] == 7) && (mat[i-1][j] == 7) && 
				 (mat[i-1][j+1] == 7) && (mat[i][j-1] == 7) &&
				 (mat[i+1][j-1] == 7) && (mat[i+1][j] == 7) && 
				 (mat[i+1][j+1] == 7) && (mat[i][j+1] == 7)) {
				 return true; }
		
		else { return false; }
	}
	
}