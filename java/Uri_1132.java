// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos 
 n�meros que n�o s�o m�ltiplos de 13 entre X e Y, incluindo ambos.
 
 ENTRADA
 O arquivo de entrada cont�m 2 valores inteiros quaisquer, n�o necessariamente 
 em ordem crescente.
 
 SA�DA
 Imprima a soma de todos os valores n�o divis�veis por 13 entre os dois valores 
 lidos na entrada, inclusive ambos se for o caso.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1132 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int soma = 0;
		if (X > Y) {
			for (int i = Y; i <= X; i++) {
				if (i % 13 != 0) soma += i;
			}
		} else {
			for (int i = X; i <= Y; i++) {
				if (i % 13 != 0) soma += i;
			}
		}
		System.out.println(soma);

		sc.close();
    }
	
}