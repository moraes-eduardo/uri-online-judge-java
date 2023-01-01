// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um valor T e preencha um vetor N[1000] com a 
 sequ�ncia de valores de 0 at� T-1 repetidas vezes, conforme exemplo abaixo. 
 Imprima o vetor N.
 
 ENTRADA
 A entrada cont�m um valor inteiro T (2 <= T <= 50).
 
 SA�DA
 Para cada posi��o do vetor, escreva "N[i] = x", onde i � a posi��o do vetor 
 e x � o valor armazenado naquela posi��o.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1177 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[1000];
        int pos = 0;
        while (pos < 999) {
        	for (int j = 0; j < T; j++) {
        		if (pos > 999) break;
        		N[pos] = j;
        		pos++;
        	}
        }
        
        for (int i = 0; i < N.length; i++) {
        	System.out.println("N[" + i + "] = " + N[i]);
        }

        sc.close();
    }
	
}