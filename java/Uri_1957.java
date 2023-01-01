// package Iniciante;

/*
 
 QUEST�O
 Os dados armazenados no computador est�o em bin�rio. Uma forma econ�mica 
 de ver estes n�meros � usar a base 16 (hexadecimal).

 Sua tarefa consiste em escrever um programa que, dado um n�mero natural 
 na base 10, mostre sua representa��o em hexadecimal.
 
 ENTRADA
 A entrada � um n�mero inteiro positivo V na base 10 (1 <= V <= 2 x 10^9).

 SA�DA
 A sa�da � o mesmo n�mero V na base 16 em uma �nica linha (n�o esque�a do 
 caractere de fim-de-linha). Use letras mai�sculas, conforme os exemplos.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1957 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		String hexadecimal = Integer.toHexString(decimal).toUpperCase();
		System.out.println(hexadecimal);

		sc.close();
    }
	
}