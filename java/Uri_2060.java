// package Iniciante;

/*
 
 QUEST�O
 Bino e Cino s�o colegas insepar�veis. Bino gosta de criar desafios 
 matem�ticos para Cino resolver. Desta vez, Bino gerou uma lista de 
 n�meros e perguntou ao Cino quantos n�meros da lista s�o m�ltiplos 
 de 2, 3, 4 e 5.

 Esse desafio pode parecer simples, por�m, quando a lista cont�m muitos 
 n�meros, Cino se confunde e acaba errando alguns c�lculos. Para ajudar 
 Cino, fa�a um programa para resolver o desafio de Bino.
 
 ENTRADA
 A primeira linha da entrada consiste em um inteiro N (1 <= N <=1000), 
 representando a quantidade de n�meros na lista de Bino.

 A segunda linha cont�m N inteiros Li (1 <= Li <= 100), representando os 
 n�meros da lista de Bino.
 
 SA�DA
 Imprima a quantidade de n�meros m�ltiplos de 2, 3, 4 e 5 presentes na 
 lista. Observe a formata��o da sa�da nos exemplos, pois ela deve ser 
 seguida rigorosamente.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2060 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int L, m2 = 0, m3 = 0, m4 = 0, m5 = 0;
    	for (int i = 0; i < N; i++) {
    		L = sc.nextInt();
    		if (L % 2 == 0) m2++;
    		if (L % 3 == 0) m3++;
    		if (L % 4 == 0) m4++;
    		if (L % 5 == 0) m5++;
    	}
    	System.out.println(m2 + " Multiplo(s) de 2");
    	System.out.println(m3 + " Multiplo(s) de 3");
    	System.out.println(m4 + " Multiplo(s) de 4");
    	System.out.println(m5 + " Multiplo(s) de 5");

		sc.close();
    }
	
}