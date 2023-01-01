// package Iniciante;

/*
 
 QUEST�O
 Imagine que voc� tenha uma m�quina do tempo que pode ser usada no m�ximo tr�s 
 vezes, e a cada uso da m�quina voc� pode escolher voltar para o passado ou ir 
 para o futuro. A m�quina possui tr�s cr�ditos fixos; cada cr�dito representa 
 uma certa quantidade de anos, e pode ser usado para ir essa quantidade de 
 anos para o passado ou para o futuro. Voc� pode fazer uma, duas ou tr�s 
 viagens, e cada um desses tr�s cr�ditos pode ser usado uma vez apenas. Por 
 exemplo, se os cr�ditos forem 5, 12 e 9, voc� poderia decidir fazer duas 
 viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado. 
 Dessa forma, voc� terminaria quatro anos no passado, em 2012. Tamb�m poderia 
 fazer tr�s viagens, todas indo para o futuro, usando os cr�ditos em qualquer 
 ordem, terminando em 2042.

 Neste problema, dados os valores dos tr�s cr�ditos da m�quina, seu programa 
 deve dizer se � ou n�o poss�vel viajar no tempo e voltar para o presente, 
 fazendo pelo menos uma viagem e, no m�ximo, tr�s viagens; sempre usando cada 
 um dos tr�s cr�ditos no m�ximo uma vez.
 
 ENTRADA
 A entrada consiste de uma linha contendo os valores dos tr�s cr�ditos A, B e C (1 <= A, B, C <= 1000).

 S�IDA
 Seu programa deve imprimir uma linha contendo o caracter �S� se � poss�vel viajar
 e voltar para o presente, ou �N� caso contr�rio.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2235 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a + b == c || a + c == b || b + c == a || a == b || a == c || b == c) 
			System.out.println("S");
		else 
			System.out.println("N");
	}
	
}