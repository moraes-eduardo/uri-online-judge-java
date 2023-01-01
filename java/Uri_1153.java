// package Iniciante;

/*
 
 QUEST�O
 Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

 ENTRADA
 A entrada cont�m um valor inteiro N (0 < N < 13).

 SA�DA
 A sa�da cont�m um valor inteiro, correspondente ao fatorial de N.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1153 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fat = 1;
        for (int i = 1; i <= N; i++) {
        	fat *= i;
        }
        System.out.println(fat);

        sc.close();
    }
	
}