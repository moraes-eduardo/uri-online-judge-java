// package Iniciante;

/*
 
 QUEST�O
 Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram 
 positivos. Na pr�xima linha, deve-se mostrar a m�dia de todos os valores 
 positivos digitados, com um d�gito ap�s o ponto decimal.
 
 ENTRADA
 A entrada cont�m 6 n�meros que podem ser valores inteiros ou de ponto 
 flutuante. Pelo menos um destes n�meros ser� positivo.

 SA�DA
 O primeiro valor de sa�da � a quantidade de valores positivos. A pr�xima 
 linha deve mostrar a m�dia dos valores positivos digitados.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1064 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;
        
        for (int i = 0; i < 6; i++) {
        	x = sc.nextDouble();
        	if (x > 0) {
        		cont++;
        		media += x;
        	}
        }
        
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        sc.close();
    }
	
}