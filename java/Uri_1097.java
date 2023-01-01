// package Iniciante;

/*
 
 QUEST�O
 Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 http://prntscr.com/jy6n0r
 
 ENTRADA
 N�o h� nenhuma entrada neste problema.

 SA�DA
 Imprima a sequencia conforme exemplo abaixo

*/

import java.io.IOException;

public class Uri_1097 {
	
	public static void main(String[] args) throws IOException {
		int i=1, j=7;
		while (i <= 9) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j+=5;
			i+=2;
		}
	}
	
}