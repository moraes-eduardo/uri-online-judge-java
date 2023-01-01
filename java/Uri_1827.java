// package Iniciante;

/*
 
 QUEST�O
 Neste programa seu trabalho � ler um valor inteiro que ser� o tamanho da 
 matriz quadrada (largura e altura) que ser� preenchida da seguinte forma: 
 a parte externa � preenchida com 0, a parte interna � preenchida com 1, a 
 diagonal principal � preenchida com 2, a diagonal secund�ria � preenchida 
 com 3 e o ponto central cont�m o valor 4, conforme os exemplos abaixo.

 Obs: o quadrado com '1' sempre come�a na posi��o tamanho/3, tanto na largura 
 quanto quanto na altura. A linha e a coluna come�am em zero (0).
 
 ENTRADA
 A entrada cont�m v�rios casos de teste e termina com EOF (fim de arquivo. 
 Cada caso de teste consiste de um valor inteiro �mpar N (5 <= N <= 101) que � 
 o tamanho da matriz.
 
 SA�DA
 Para cada caso de teste, imprima a matriz correspondente conforme o exemplo 
 abaixo. Ap�s cada caso de teste, imprima uma linha em branco. http://prntscr.com/k1snnj
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1827 {
	
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N, centro, interior, exterior;
        while (sc.hasNext()) {
        	N = sc.nextInt();
        	centro = N / 2;
        	interior = N / 3;
        	exterior = (N - 1) - interior;
        	for (int i = 0; i < N; i++) {
        		for (int j = 0; j < N; j++) {
        			if (i == centro && j == centro) System.out.print(4);
        			else if (i >= interior && j >= interior && i <= exterior && j <= exterior) System.out.print(1);
        			else if (i == j) System.out.print(2);
        			else if (j == N-i-1) System.out.print(3);
        			else System.out.print(0);
        		}
        		System.out.print("\n");
        	}
    		System.out.print("\n");
        }

		sc.close();
	}
	
}