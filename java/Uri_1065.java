// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia 5 valores inteiros. Conte quantos destes valores 
 digitados s�o pares e mostre esta informa��o.
 
 ENTRADA
 O arquivo de entrada cont�m 5 valores inteiros quaisquer.
 
 SA�DA
 Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores 
 pares lidos.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1065 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
        	x = sc.nextInt();
        	if (x % 2 == 0 ) cont++;
        }
        System.out.println(cont + " valores pares");

        sc.close();
    }
	
}