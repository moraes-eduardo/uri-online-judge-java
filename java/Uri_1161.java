// package Matem�tica;

/*
 
 QUEST�O
 Leia dois valores inteiros M e N indefinidamente. A cada leitura, calcule e 
 escreva a soma dos fatoriais de cada um dos valores lidos. Utilize uma vari�vel 
 apropriada, pois c�lculo pode resultar em um valor com mais de 15 d�gitos.
 
 ENTRADA
 O arquivo de entrada cont�m v�rios casos de teste. Cada caso cont�m dois n�meros 
 inteiros M (0 <= M <= 20) e N (0 <= N <= 20). O fim da entrada � determinado por eof.
 
 SA�DA
 Para cada caso de teste de entrada, seu programa deve imprimir uma �nica linha, 
 contendo um n�mero que � a soma de ambos os fatoriais (de M e N).
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_1161 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		int M = sc.nextInt();
    		int N = sc.nextInt();
    		long fatorial = fatorial(M) + fatorial(N);
    		System.out.println(fatorial);
    	}

		sc.close();
    }
    
    public static long fatorial(int j) {
    	long fatorial = 1;
    	for(int i = 2; i <= j; i++)
    		fatorial *= i;
    	return fatorial;
    }
    
}