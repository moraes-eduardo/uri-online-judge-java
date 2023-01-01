// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia 6 valores. Estes valores ser�o somente negativos 
 ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade 
 de valores positivos digitados.
 
 ENTRADA
 Seis valores, negativos e/ou positivos.

 SA�DA
 Imprima uma mensagem dizendo quantos valores positivos foram lidos.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1060 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        for (int i=0; i < 6; i++) {
        	double n = sc.nextDouble();
        	if (n > 0) cont++;
        }
        System.out.println(cont + " valores positivos");

        sc.close();
    }
	
}