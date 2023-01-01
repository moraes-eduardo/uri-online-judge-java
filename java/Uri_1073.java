// package Iniciante;

/*

 QUEST�O
 Leia um valor inteiro N. Apresente o quadrado de cada um dos valores 
 pares, de 1 at� N, inclusive N, se for o caso.

 ENTRADA
 A entrada cont�m um valor inteiro N (5 < N < 2000).

 SA�DA
 Imprima o quadrado de cada um dos valores pares, de 1 at� N, conforme 
 o exemplo abaixo.

 Tome cuidado! Algumas linguagens tem por padr�o apresentarem como sa�da 
 1e+006 ao inv�s de 1000000 o que ocasionar� resposta errada. Neste caso, 
 configure a precis�o adequadamente para que isso n�o ocorra.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1073 {
	
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 1; i <= N; i++) {
    		if (i % 2 == 0) System.out.println(i + "^2 = " + (i * i));
    	}

		sc.close();
	}
	
}