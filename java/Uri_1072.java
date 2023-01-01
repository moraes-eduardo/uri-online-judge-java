// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X 
 que ser�o lidos em seguida.
 
 Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos 
 est�o fora do intervalo, mostrando essas informa��es.
 
 ENTRADA
 A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica 
 o n�mero de casos de teste.
 
 Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
 
 SA�DA
 Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o 
 fora (out) do intervalo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1072 {
    
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int in = 0;
    	int out = 0;
    	for (int i = 0; i < N; i++) {
    		int x = sc.nextInt();
    		if (x >= 10 && x <= 20) in++;
    		else out++;
    	}
    	System.out.println(in + " in");
    	System.out.println(out + " out");

		sc.close();
    }
	
}