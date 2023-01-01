// package Strings;

/*

 QUEST�O
 Mariazinha criou um exerc�cio para as suas irm�s Paula e Marta: ela distribui um 
 texto e pede que ambas corrijam este texto, sabendo que apenas as palavras OBI e 
 Uri_podem estar escritas de forma errada, e o erro pode estar apenas na �ltima letra.

 Sua tarefa aqui � automatizar este processo, ou seja, criar um programa que fa�a a 
 corre��o dos textos distribu�dos pela Mariazinha para que ela possa conferir as 
 corre��es de suas irm�s sem muito trabalho.

 Note que se "OB" ou "UR" forem o in�cio ou parte de uma palavra maior, como por 
 exemplo "OBOS" ou "URAT"), estas palavras n�o devem ser alteradas.
 
 ENTRADA
 A entrada cont�m duas linhas. A primeira linha cont�m um valor inteiro N (1 < N < 10000) 
 que indica a quantidade de palavras do texto. A segunda linha cont�m as palavras do  texto, 
 cada uma com o m�ximo de 20 caracteres ('A'-'Z'), e com no m�nimo, uma letra ('A'-'Z').
 
 SA�DA
 Seu programa dever� apresentar o texto que foi distribu�do por Mariazinha corrigido, 
 segundo os crit�rios acima estabelecidos.
 
*/

import java.util.Scanner;

public class Uri_2062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] palavras = new String[N];
		for (int i = 0; i < N; i++) {
			String palavra = sc.next();
			if (palavra.length() == 3) {
				if (palavra.startsWith("OB") || palavra.startsWith("UR") && !palavra.endsWith("I")) {
					palavra = palavra.substring(0, 2) + "I";
				}
			}
			palavras[i] = palavra;
		}
		System.out.println(String.join(" ", palavras));

		sc.close();
	}

}