// package Iniciante;

/*
 
 QUEST�O
 A sequ�ncia de Fibonacci � uma das sequ�ncias mais famosas do mundo. Os 
 termos de Fibonacci s�o sempre iguais � soma dos dois termos anteriores 
 a eles na sequ�ncia, e os dois primeiros termos s�o 1. Ou seja:
 1 , 1, 2, 3, 5, 8, 13, 21, 34 ...

 Por�m, n�o estamos interessados em achar os termos da sequ�ncia de Fibonacci, 
 mas sim os termos da sequ�ncia de Fibonot!

 A sequ�ncia de Fibonot � composta pelos n�meros que n�o pertencem � sequ�ncia 
 de Fibonacci. Mais especificamente, os n�meros inteiros positivos n�o-nulos. 
 Em ordem crescente!

 Eis os primeiros termos de Fibonot:
 4, 6, 7, 9, 10, 11, 12, 14, 15 ...

 Sua tarefa � achar o K-�simo n�mero de Fibonot.
 
 ENTRADA
 A entrada consiste um �nico inteiro K (1 <= K <= 105) especificando o �ndice 
 do elemento da sequ�ncia de Fibonot desejado.
 
 SA�DA
 Um �nico inteiro representando o K-�simo termo da sequ�ncia de Fibonot.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2846 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int cont = 0, res = 0;
		int a = sc.nextInt();
		for (int i = 4; cont != a; i++) {
			if (!isFib(i)) {
				cont++;
				res = i;
			}
		}
		System.out.println(res);
	}

	private static boolean square(long x){
		long s = (long) Math.sqrt(x);
		return s * s == x;
	}
	
	private static boolean isFib(long c) {
		return (square(5 * c * c + 4) || square(5 * c * c - 4)) ;
	}
	
}