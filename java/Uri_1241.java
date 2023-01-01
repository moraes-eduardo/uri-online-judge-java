// package Strings;

/*
 
 QUEST�O
 Paulinho tem em suas m�os um novo problema. Agora a sua professora lhe pediu que 
 constru�sse um programa para verificar, � partir de dois valores muito grandes 
 A e B, se B corresponde aos �ltimos d�gitos de A.

 ENTRADA
 A entrada consiste de v�rios casos de teste. A primeira linha de entrada cont�m um 
 inteiro N que indica a quantidade de casos de teste. Cada caso de teste consiste de 
 dois valores A e B maiores que zero, cada um deles podendo ter at� 1000 d�gitos.
 
 SA�DA
 Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa 
 no primeiro valor, confome exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1241 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String A = sc.next();
			String B = sc.next();
			if (A.endsWith(B)) 
				System.out.println("encaixa");
			else 
				System.out.println("nao encaixa");
		}

		sc.close();
	}

}