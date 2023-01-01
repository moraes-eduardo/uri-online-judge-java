// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N que � a quantidade de casos de teste que vem a 
 seguir. Cada caso de teste consiste de dois inteiros X e Y. Voc� deve 
 apresentar a soma de todos os �mpares existentes entre X e Y.
 
 ENTRADA
 A primeira linha de entrada � um inteiro N que � a quantidade de casos 
 de teste que vem a seguir. Cada caso de teste consiste em uma linha 
 contendo dois inteiros X e Y.
 
 SA�DA
 Imprima a soma de todos valores �mpares entre X e Y.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1099 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int X, Y, soma;
    	int N = sc.nextInt();
    	for (int i = 0; i < N; i++) {
    		soma = 0;
    		X = sc.nextInt();
    		Y = sc.nextInt();
    		
    		if (Y > X) {
	    		for (int j = X+1; j < Y; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		} else {
	    		for (int j = Y+1; j < X; j++) {
	    			if (j % 2 != 0) soma += j;
	    		}
    		}
    		
    		System.out.println(soma);
    	}

		sc.close();
    }
	
}