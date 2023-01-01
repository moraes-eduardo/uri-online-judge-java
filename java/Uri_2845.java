// package Iniciante;

/*
 
 QUEST�O
 Giovana ficou muito feliz por conseguir mandar sua carta para o papai Noel e 
 receber �timos presentes. A alegria foi tanta que ela resolveu at� convidar 
 todos os duendes do bom velhinho para sua festa de anivers�rio, que � pouco 
 depois do Natal, em Janeiro. Por�m, ela n�o quer que o Grinch apare�a na sua 
 festinha para estragar tudo, ent�o ela bolou um plano.

 Para esconder do malvado Grinch onde ser� a festa, ela resolveu ultilizar o 
 sistema de reuni�es dos Duendes, que funciona assim: cada duende tem um 
 identificador num�rico �nico e, quando haver� uma reuni�o, � escolhida a casa 
 de um dos duendes para sediar o encontro. Mas ao inv�s de escrever o n�mero 
 do duende anfitri�o no mural da f�brica do Papai Noel, onde todos podem ver, 
 � escrito o identificador de exatamente todos os duendes com n�meros menores 
 que o dele e que s�o coprimos ao dele. Esse m�todo � tamb�m uma forma de dizer
  que esses duendes do mural devem levar as comidas e bebidas para a reuni�o.

 Como o Grinch � t�o ruim com n�meros a ponto de nem saber que dois n�meros s� 
 s�o chamados de coprimos se o MDC (m�ximo divisor comum) entre eles � 1, 
 Giovana simplesmente envia uma carta para o polo norte com os n�meros dos 
 duendes que devem levar as comidas, e com isso, os duendes j� conseguem 
 descobrir onde ser� a festa de anivers�rio, mas o Grinch n�o.

 Dada a carta que os duendes receberam, determine na casa de qual Duende ser� 
 a festa de anivers�rio de Giovana.
 
 ENTRADA
 A primeira linha da entrada cont�m um inteiro N (1 <= N <= 104) o qual 
 representa a quantidade de n�meros escritos na carta de Giovana. A segunda 
 linha da entrada possui N n�meros inteiros Ai (1 <= Ai <= 105) representando 
 os identificadores dos duendes escritos na carta.
 
 SA�DA
 A sa�da consiste de uma �nica linha contendo o n�mero do duende que sediar� 
 a festa de Giovana em sua casa.

*/

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Uri_2845 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		for (int i = A[A.length-1] + 1; true; i++)  {
			boolean bol = true;
			for (int j : A) {
				if (mdc(j, i) != 1) {
					bol = false;
					break;
				}
			}
			if (bol) {
				System.out.println(i);
				break;
			}
		}
	}
	
    private static int mdc(int a, int b){
        if (a == 0) 
        	return b;
        return mdc( b % a, a );
    }
	
}