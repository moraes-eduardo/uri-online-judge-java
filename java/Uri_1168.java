// package Strings;

/*

 QUEST�O
 Jo�o quer montar um painel de leds contendo diversos n�meros. Ele n�o possui 
 muitos leds, e n�o tem certeza se conseguir� montar o n�mero desejado. 
 Considerando a configura��o dos leds dos n�meros abaixo, fa�a um algoritmo que 
 ajude Jo�o a descobrir a quantidade de leds necess�rio para montar o valor.

 ENTRADA
 A entrada cont�m um inteiro N, (1 <= N <= 1000) correspondente ao n�mero de casos 
 de teste, seguido de N linhas, cada linha contendo um n�mero (1 <= V <= 10100) 
 correspondente ao valor que Jo�o quer montar com os leds.
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo o n�mero de leds que Jo�o 
 precisa para montar o valor desejado, seguido da palavra "leds".
 
*/

import java.util.Scanner;

public class Uri_1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String V = sc.next();
			int leds = 0;
			for (int j = 0; j < V.length(); j++) {
				char c =  V.charAt(j);
				switch (c) {
					case '0': leds += 6; break;
					case '1': leds += 2; break;
					case '2': leds += 5; break;
					case '3': leds += 5; break;
					case '4': leds += 4; break;
					case '5': leds += 5; break;
					case '6': leds += 6; break;
					case '7': leds += 3; break;
					case '8': leds += 7; break;
					case '9': leds += 6; break;
				}
			}
			System.out.println(leds + " leds");
		}

		sc.close();
	}

}