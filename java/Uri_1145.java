// package Iniciante;

/*
 
 QUEST�O
 Escreva um programa que leia dois valores X e Y. A seguir, mostre uma 
 sequ�ncia de 1 at� Y, passando para a pr�xima linha a cada X n�meros.
 
 ENTRADA
 O arquivo de entrada cont�m dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

 SA�DA
 Cada sequ�ncia deve ser impressa em uma linha apenas, com 1 espa�o em branco 
 entre cada n�mero, conforme exemplo abaixo. N�o deve haver espa�o em branco 
 ap�s o �ltimo valor da linha.
 	
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1145 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int cont = 1;
		for (int i = 1; i <= Y; i++) {
			System.out.print(i);
			if (i % X == 0) System.out.println("");
			else System.out.print(" ");
			

		}

		sc.close();
    }
	
}