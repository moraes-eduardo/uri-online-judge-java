// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela f�rmula:
 S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 
 ENTRADA
 N�o h� nenhuma entrada neste problema.

 SA�DA
 A sa�da cont�m um valor correspondente ao valor de S.
 O valor deve ser impresso com dois d�gitos ap�s o ponto decimal.
 
*/

import java.io.IOException;

public class Uri_1156 {
	
    public static void main(String[] args) throws IOException {
    	double S = 1;
    	int cont = 2;
    	for (int i = 3; i <= 39; i++) {
    		if (i % 2 == 1)  {
    			S += (double) i / cont;
        		cont *= 2.00;
    		}
    	}
    	System.out.println(String.format("%.2f", S));
    }
	
}