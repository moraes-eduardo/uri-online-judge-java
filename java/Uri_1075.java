// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que 
 divididos por N d�o resto igual a 2.

 
 ENTRADA
 A entrada cont�m um valor inteiro N (N < 10000).

 SA�DA
 Imprima todos valores que quando divididos por N d�o resto = 2, um por linha.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1075 {
	
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 1; i < 10000; i++) {
    		if (i % N == 2) System.out.println(i);
    	}

		sc.close();
	}
	
}