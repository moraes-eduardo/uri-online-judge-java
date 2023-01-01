// package Iniciante;

/*
 
 QUEST�O
 Leia 100 valores inteiros. Apresente ent�o o maior valor lido e a posi��o 
 dentre os 100 valores lidos.

 ENTRADA
 O arquivo de entrada cont�m 100 n�meros inteiros, positivos e distintos.

 SA�DA
 Apresente o maior valor lido e a posi��o de entrada, conforme exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1080 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int posMaior = 1;
		int x;
		for (int i = 1; i <= 100; i++) {
			x = sc.nextInt();
			if (i == 1) {
				maior = x;
				posMaior = 1;
			} else if (x > maior) {
				maior = x;
				posMaior = i;
			}
		}
		System.out.println(maior);
		System.out.println(posMaior);

		sc.close();
	}
	
}