// package Iniciante;

/*
 
 QUEST�O
 Leia 1 valor inteiro N, que representa o n�mero de casos de teste que 
 vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um 
 deles com uma casa decimal. Apresente a m�dia ponderada para cada um 
 destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, 
 o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 
 ENTRADA
 O arquivo de entrada cont�m um valor inteiro N na primeira linha. Cada 
 N linha a seguir cont�m um caso de teste com tr�s valores com uma casa 
 decimal cada valor.
 
 SA�DA
 Para cada caso de teste, imprima a m�dia ponderada dos 3 valores, 
 conforme exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;


public class Uri_1079 {
	
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 0; i < N; i++) {
    		double n1 = sc.nextDouble();
    		double n2 = sc.nextDouble();
    		double n3 = sc.nextDouble();
    		double media = ((n1*2) + (n2*3) + (n3*5)) / 10;
    		System.out.println(String.format("%.1f", media));
    	}

		sc.close();
	}
	
}