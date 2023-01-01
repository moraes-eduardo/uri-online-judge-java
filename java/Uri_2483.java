// package Iniciante;

/*
 
 QUEST�O
 Voc� fica t�o feliz no natal que tem vontade de gritar para todo mundo: 
 "Feliz natal!!". Pra colocar toda essa felicidade pra fora, voc� montou 
 um programa que, colocado um �ndice I de felicidade, seu grito de natal 
 � mais animado.
 
 ENTRADA
 A entrada � composta por um inteiro I (1 < I <= 104) que representa o 
 �ndice de felicidade.

 S�IDA
 A sa�da � composta pela frase "Feliz natal!", sendo repetidas I vezes a 
 �ltima letra a da frase. Uma quebra de linha � necess�ria ap�s a impress�o 
 da frase.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2483 {
 	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a = "a";
		for (int i = 1; i < N; i++) {
			a += "a";
		}
		System.out.printf("Feliz nat%sl!", a);
	}
	
}