// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um vetor A[100]. No final, mostre todas as 
 posi��es do vetor que armazenam um valor menor ou igual a 10 e o valor 
 armazenado em cada uma das posi��es.
 
 ENTRADA
 A entrada cont�m 100 valores, podendo ser inteiros, reais, positivos ou negativos.

 SA�DA
 Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i � a 
 posi��o do vetor e x � o valor armazenado na posi��o, com uma casa ap�s o ponto decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1174 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double[] A = new double[100];
        for (int i=0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }
        for (int i=0; i < A.length; i++) {
            if (A[i] <= 10) System.out.println(String.format("A["+ i +"] = %.1f" , A[i]));
        }

        sc.close();
    }
	
}