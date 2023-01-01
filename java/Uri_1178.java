// package Iniciante;

/*
 
 QUEST�O
 Leia um valor X. Coloque este valor na primeira posi��o de um vetor N[100]. 
 Em cada posi��o subsequente de N (1 at� 99), coloque a metade do valor 
 armazenado na posi��o anterior, conforme o exemplo abaixo. Imprima o vetor N.
 
 ENTRADA
 A entrada contem um valor de dupla precis�o com 4 casas decimais.

 SA�DA
 Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor 
 e Y � o valor armazenado naquela posi��o. Cada valor do vetor deve ser apresentado 
 com 4 casas decimais.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1178 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double[] N = new double[100];
        N[0] = X;
        for (int i = 1; i < N.length; i++) {
        	N[i] = N[i - 1] / 2.0000;
        }
        for (int i = 0; i < N.length; i++) {
        	System.out.println(String.format("N[" + i + "] = %.4f", N[i]));
        }

        sc.close();
    }
	
}