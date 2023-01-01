// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um valor N. Este N ser� o tamanho de um vetor X[N]. 
 A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor 
 e a sua posi��o dentro do vetor, mostrando esta informa��o.
 
 ENTRADA
 A primeira linha de entrada contem um �nico inteiro N (1 < N < 1000), indicando 
 o n�mero de elementos que dever�o ser lidos em seguida para o vetor X[N] de 
 inteiros. A segunda linha cont�m cada um dos N valores, separados por um espa�o.
 
 SA�DA
 A primeira linha apresenta a mensagem �Menor valor:� seguida de um espa�o e do 
 menor valor lido na entrada. A segunda linha apresenta a mensagem �Posicao:� 
 seguido de um espa�o e da posi��o do vetor na qual se encontra o menor valor 
 lido, lembrando que o vetor inicia na posi��o zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1180 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int menor = 0, posMenor = 0;
        for (int i = 0; i < N; i++) {
        	X[i] = sc.nextInt();
        	if (i == 0) {
        		menor = X[i];
        		posMenor = i;
        	} else if (X[i] < menor) {
        		menor = X[i];
        		posMenor = i;
        	}
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posMenor);

        sc.close();
    }
	
}