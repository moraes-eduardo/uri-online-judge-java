// package Iniciante;

/*
 
 QUEST�O
 Escreva um programa que leia um valor inteiro N. Este N � a quantidade de 
 linhas de sa�da que ser�o apresentadas na execu��o do programa.
 
 ENTRADA
 O arquivo de entrada cont�m um n�mero inteiro positivo N.

 SA�DA
 Imprima a sa�da conforme o exemplo fornecido. http://prntscr.com/jyfmj9

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1142 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cont = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("PUM");
			cont++;
		}

		sc.close();
    }
	
}