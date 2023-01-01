// package Iniciante;

/*
 
 QUEST�O
 Dois amigos pedem ao atendente de uma lanchonete propor um desafio, de 
 modo que quem acertasse mais, n�o precisaria pagar a conta. Ent�o foi 
 proposto o seguinte: Dado o seguinte somat�rio abaixo, informar o resultado, 
 com uma quantidade de termos no mesmo:

 S = 1 - 1 + 1 - 1 + 1 - 1 + 1 - 1 ...

 Escreva um programa que, dada uma quantidade de termos, informar o resultado 
 do somat�rio acima.
 
 ENTRADA
 Um n�mero inteiro C ser� informado, que ser� a quantidade de casos de teste. 
 Cada caso de teste inicia com um n�mero inteiro N (1 <= N <= 1000), indicando 
 a quantidade de termos da soma.
 
 SA�DA
 Para cada caso de teste imprima um n�mero S, que � o resultado da soma dos N 
 termos da express�o.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1866 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int N, X;
		for (int i = 0; i < C; i++) {
			N = sc.nextInt();
			X = 0;
			for (int j = 0; j < N; j++) {
				if (j % 2 == 0) X++;
				else X--;
			}
			System.out.println(X);
		}

		sc.close();
    }
	
}