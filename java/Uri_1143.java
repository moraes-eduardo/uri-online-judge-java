// package Iniciante;

/*

 QUEST�O
 Escreva um programa que leia um valor inteiro N. Este N � a quantidade de 
 linhas de sa�da que ser�o apresentadas na execu��o do programa.

 ENTRADA
 O arquivo de entrada cont�m um n�mero inteiro positivo N.

 SA�DA
 Imprima a sa�da conforme o exemplo fornecido. http://prntscr.com/jyfm34

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1143 {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
		}

		sc.close();
    }
	
}