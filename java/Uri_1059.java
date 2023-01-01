// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.

 ENTRADA
 Neste problema extremamente simples de repeti��o n�o h� entrada.

 SA�DA
 Imprima todos os n�meros pares entre 1 e 100, inclusive se for o caso, um em cada linha.

*/

import java.io.IOException;

public class Uri_1059 {
	
    public static void main(String[] args) throws IOException {
    	for (int i = 1; i <= 100; i++) {
    		if (i % 2 == 0) System.out.println(i);
    	}
    }
	
}