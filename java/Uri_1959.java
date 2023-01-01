// package Iniciante;

/*
 
 QUEST�O
 Na geometria Euclidiana, um pol�gono regular � um pol�gono em que todos 
 os �ngulos s�o iguais e todos os lados tem o mesmo comprimento. Um pol�gono 
 simples � aquele cujos segmentos de reta n�o se interceptam. Abaixo pode-se 
 ver v�rios mosaicos feitos por pol�gonos regulares. http://prntscr.com/k2zfoy
 
 Voc� deve escrever um programa que, dados o n�mero e o comprimento dos lados 
 de um pol�gono regular, mostre seu per�metro.
 
 ENTRADA
 A entrada tem dois inteiros positivos: N e L, que s�o, respectivamente, o 
 n�mero de lados e o comprimento de cada lado de um pol�gono regular 
 (3 <= N <= 1000000 and 1 <= L <= 4000).
 
 SA�DA
 A sa�da � o per�metro P do pol�gono regular em uma �nica linha.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1959 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long L = sc.nextLong();
		long P = N * L;
		System.out.println(P);

		sc.close();
    }
	
}