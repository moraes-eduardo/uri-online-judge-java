// package Iniciante;

/*
 
 QUEST�O
 Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada 
 e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia 
 considerando somente aqueles elementos que est�o acima da diagonal secund�ria 
 da matriz, conforme ilustrado abaixo (�rea verde). https://prnt.sc/k0wc32
 
 ENTRADA
 A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'), 
 indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos 
 da matriz. Seguem os 144 valores de ponto flutuante que comp�em a matriz.
 
 SA�DA
 Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1185 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        char O = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		M[i][j] = sc.nextDouble();
        	}
        }
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if (j < M.length-i-1) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= ((M.length * M.length) - 12) / 2; // 66
    	System.out.println(String.format("%.1f", soma));

        sc.close();
    }
	
}