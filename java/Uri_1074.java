// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N. Este valor ser� a quantidade de valores que 
 ser�o lidos em seguida. Para cada valor lido, mostre uma mensagem em 
 ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo 
 (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), 
 embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � 
 par, seu programa dever� imprimir apenas NULL.
 
 ENTRADA
 A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que 
 indica o n�mero de casos de teste. Cada caso de teste a seguir � um 
 valor inteiro X (-107 < X <107).
 
 SA�DA
 Para cada caso, imprima uma mensagem correspondente, de acordo com o 
 exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre dever� 
 haver um espa�o entre duas palavras impressas na mesma linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1074 {

	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 0; i < N; i++) {
    		int x = sc.nextInt();
    		if (x == 0) System.out.println("NULL");
    		else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");
    		else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");
    		else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");
    		else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
    	}

		sc.close();
	}
	
}