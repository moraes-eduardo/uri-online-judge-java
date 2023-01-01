// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 
 at� X, um valor por linha, inclusive o X, se for o caso.
 
 ENTRADA
 O arquivo de entrada cont�m 1 valor inteiro qualquer.

 SA�DA
 Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1067 {	
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
        	if (i % 2 != 0) System.out.println(i);
        }

        sc.close();
    }
	
}