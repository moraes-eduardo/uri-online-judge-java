// package Iniciante;

/*
 
 QUEST�O
 Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos 
 n�meros impares entre eles.

 ENTRADA
 O arquivo de entrada cont�m dois valores inteiros.

 SA�DA
 O programa deve imprimir um valor inteiro. Este valor � a soma dos 
 valores �mpares que est�o entre os valores fornecidos na entrada que 
 dever� caber em um inteiro.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1071 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int soma = 0;
		int X = sc.nextInt();
		int Y = sc.nextInt();

		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);

		sc.close();
    }
	
}