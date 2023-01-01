// package Iniciante;

/*
 
 QUEST�O
 Dado um conjunto de N pontos sobre uma circunfer�ncia de um c�rculo, todo 
 par de pontos est� ligado por um segmento e tr�s desses segmentos nunca se 
 encontram em um ponto interno � circunfer�ncia.
 
 Sua tarefa � determinar em quantas partes esses segmentos dividem o interior 
 do c�rculo.
 
 ENTRADA
 A primeira e �nica linha da entrada cont�m um inteiro N (1 <= N <= 1000) 
 representando a quantidade de pontos sobre a circunfer�ncia.
 
 SA�DA
 A sa�da consiste de uma �nica linha contendo um inteiro representando a 
 quantidade de partes do c�rculo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2802 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double resposta = (Math.pow(N, 4.0) - (6.0 * Math.pow(N, 3.0)) + (23.0 * Math.pow(N, 2.0)) - (18.0 * N) + 24.0 ) / 24.0;
        System.out.println(String.format("%.0f", resposta));
    }
	
}