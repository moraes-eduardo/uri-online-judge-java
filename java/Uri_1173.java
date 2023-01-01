// package Iniciante;

/*
 
 QUEST�O
 Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o 
 de um vetor N[10]. Em cada posi��o subsequente, coloque o dobro do valor da 
 posi��o anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem 
 ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.
 
 ENTRADA
 A entrada cont�m um valor inteiro (V<=50).

 SA�DA
 Para cada posi��o do vetor, escreva "N[i] = X", onde i � a posi��o do vetor e X 
 � o valor armazenado na posi��o i. O primeiro n�mero do vetor N (N[0]) ir� receber 
 o valor de V.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1173 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        N[0] = sc.nextInt();
        for (int i=1; i <10; i++) {
            N[i] = N[i-1] * 2;
        }
        for (int i=0; i <10; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }

        sc.close();
    }
	
}