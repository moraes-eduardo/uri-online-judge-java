// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um vetor X[10]. Substitua a seguir, todos os 
 valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
 
 ENTRADA
 A entrada cont�m 10 valores inteiros, podendo ser positivos ou negativos.

 SA�DA
 Para cada posi��o do vetor, escreva "X[i] = x", onde i � a posi��o do vetor 
 e x � o valor armazenado naquela posi��o.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1172 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i=0; i < X.length; i++) {
            X[i] = sc.nextInt();
        }
        for (int i=0; i < X.length; i++) {
            if (X[i] <= 0) X[i] = 1;
        }
        for (int i=0; i < X.length; i++) {
            System.out.println("X["+ i +"] = " + X[i]);
        }

        sc.close();
    }
	
}