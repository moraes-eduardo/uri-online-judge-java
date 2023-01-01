// package Iniciante;

/*
 
 QUEST�O
 Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram 
 pares, quantos valores digitados foram �mpares, quantos valores digitados 
 foram positivos e quantos valores digitados foram negativos.
 
 ENTRADA
 O arquivo de entrada cont�m 5 valores inteiros quaisquer.

 SA�DA
 Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, 
 n�o esquecendo o final de linha ap�s cada uma.
 	
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1066 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int x;
        for (int i = 0; i < 5; i++) {
        	x = sc.nextInt();
        	if (x % 2 == 0) contPar++;
        	else contImpar++;
        	if (x > 0) contPositivos++;
        	else if(x < 0) contNegativos++;
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");

        sc.close();
    }
	
}