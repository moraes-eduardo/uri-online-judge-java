// package Iniciante;

/*
  
 QUEST�O
 Escreva um programa que leia um valor inteiro N. N * 2 linhas de sa�da ser�o 
 apresentadas na execu��o do programa, seguindo a l�gica do exemplo abaixo. 
 Para valores com mais de 6 d�gitos, todos os d�gitos devem ser apresentados.
 
 ENTRADA
 O arquivo de entrada cont�m um n�mero inteiro positivo N (1 < N < 1000).

 SA�DA
 Imprima a sa�da conforme o exemplo fornecido. http://prntscr.com/jyfofk

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1144 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
			System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
		}

		sc.close();
    }
	
}