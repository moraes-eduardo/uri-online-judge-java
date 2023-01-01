// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um valor e apresente o n�mero de Fibonacci 
 correspondente a este valor lido. Lembre que os 2 primeiros elementos da 
 s�rie de Fibonacci s�o 0 e 1 e cada pr�ximo termo � a soma dos 2 anteriores 
 a ele. Todos os valores de Fibonacci calculados neste problema devem caber
 em um inteiro de 64 bits sem sinal.
 
 ENTRADA
 A primeira linha da entrada cont�m um inteiro T, indicando o n�mero de 
 casos de teste. Cada caso de teste cont�m um �nico inteiro N (0 <= N <= 60), 
 correspondente ao N-esimo termo da s�rie de Fibonacci.
 
 SA�DA
 Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X � 
 o N-�simo termo da s�rie de Fibonacci.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1176 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 0; j < T; j++) {
        	int N = sc.nextInt();
            long anterior = 0, atual = 1, proximo;
	        for (int i=0; i < N; i++) {
	        	proximo = anterior + atual;
	        	anterior = atual;
	        	atual = proximo;
	        }
	        System.out.println("Fib("+ N +") = " + anterior);
        }

        sc.close();
    }
	
}