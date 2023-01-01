// package Iniciante;

/*
 
 QUEST�O
 Ler um n�mero inteiro N e calcular todos os seus divisores.

 ENTRADA
 O arquivo de entrada cont�m um valor inteiro.

 SA�DA
 Escreva todos os divisores positivos de N, um valor por linha.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1157 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
        	if (N % i == 0) System.out.println(i);
        }

        sc.close();
    }
	
}