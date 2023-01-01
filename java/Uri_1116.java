// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o 
 do primeiro pelo segundo. Caso n�o for poss�vel mostre a mensagem �divisao 
 impossivel� para os valores em quest�o.
 
 ENTRADA
 A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de pares de 
 valores inteiros (X e Y) que ser�o lidos em seguida.
 
 SA�DA
 Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto decimal, 
 ou �divisao impossivel� caso n�o seja poss�vel efetuar o c�lculo.

 Obs.: Cuide que a divis�o entre dois inteiros em algumas linguagens como o C e 
 C++ gera outro inteiro. Utilize cast :)
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1116 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X, Y;
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			if (Y == 0) System.out.println("divisao impossivel");
			else System.out.println((double) X / Y);
		}

		sc.close();
    }
	
}