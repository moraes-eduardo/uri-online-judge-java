// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N que � o tamanho da matriz que deve ser impressa 
 conforme o modelo fornecido.

 ENTRADA
 A entrada cont�m v�rios casos de teste e termina com EOF. Cada caso de 
 teste � composto por um �nico inteiro N (3 <= N < 70), que determina o 
 tamanho (linhas e colunas) de uma matriz que deve ser impressa.
 
 SA�DA
 Para cada N lido, apresente a sa�da conforme o exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1534 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    	int N;
        while (sc.hasNext()) {
    		N = sc.nextInt();
    		for (int i = 0; i < N; i++) {
    			for (int j = 0; j < N; j++) {
    				if (j == N-i-1) System.out.print(2);
    				else if (i == j) System.out.print(1);
    				else System.out.print(3);
    			}
    			System.out.print("\n");
    		}
    	}

		sc.close();
    }
	
}