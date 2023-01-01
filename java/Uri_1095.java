// package Iniciante;

/*
 
 QUEST�O
 Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 http://prntscr.com/jy6dh2
 
 ENTRADA
 N�o h� nenhuma entrada neste problema.

 SA�DA
 Imprima a sequencia conforme exemplo abaixo

*/

import java.io.IOException;

public class Uri_1095 {
	
	public static void main(String[] args) throws IOException {
		int i=1, j=60;
		while (j >= 0) {
			System.out.println("I=" + i + " J=" + j);
			j-=5;
			i+=3;
		}
	}
	
}