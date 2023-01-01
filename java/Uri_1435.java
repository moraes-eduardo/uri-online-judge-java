// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo que leia um inteiro N (0 <= N <= 100), correspondente 
 a ordem de uma matriz M de inteiros, e construa a matriz de acordo com o 
 exemplo abaixo. http://prntscr.com/k0zax4
 
 ENTRADA
 A entrada consiste de v�rios inteiros, um valor por linha, correspondentes 
 as ordens das matrizes a serem constru�das. O final da entrada � marcado por 
 um valor de ordem igual a zero (0).
 
 SA�DA
 Para cada inteiro da entrada imprima a matriz correspondente, de acordo com 
 o exemplo. Os valores das matrizes devem ser formatados em um campo de 
 tamanho 3 justificados � direita e separados por espa�o. Ap�s o �ltimo 
 caractere de cada linha da matriz n�o deve haver espa�os em branco. Ap�s a 
 impress�o de cada matriz deve ser deixada uma linha em branco.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1435 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int x;
    	while (N != 0) {
    		for (int i = 1; i <= N; i++) {
    			for (int j = 1 ; j <= N; j++) {
    				x = i;
                    if (j < x) x = j;
                    if (N-i+1 < x) x = N-i+1;
                    if (N-j+1 < x) x = N-j+1;
                    
                    System.out.printf("%3d", x);
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