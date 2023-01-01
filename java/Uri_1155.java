// package Iniciante;

/*
 
 QUEST�O
 Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela f�rmula:
 S = 1 + 1/2 + 1/3 + � + 1/100
 
 ENTRADA
 N�o h� nenhuma entrada neste problema.

 SA�DA
 A sa�da cont�m um valor correspondente ao valor de S.
 O valor deve ser impresso com dois d�gitos ap�s o ponto decimal.

*/

import java.io.IOException;

public class Uri_1155 {

    public static void main(String[] args) throws IOException {
    	double S = 1;
    	for (int i = 2; i <= 100; i++) {
    		S += 1.00 / i;
    	}
    	System.out.println(String.format("%.2f", S));
    }
	
}