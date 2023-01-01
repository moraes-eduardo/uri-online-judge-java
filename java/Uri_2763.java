// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
 2. Imprima os quatro n�meros, sendo um valor por linha.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem uma 
 linha. A linha tem o seguinte formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD 
 s�o n�meros inteiros. Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem 
 quatro linhas com um n�mero inteiro em cada uma delas, conforme foi entrado. 
 Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2763 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String STR = sc.next();
		String A = STR.substring(0, 3);
		String B = STR.substring(4, 7);
		String C = STR.substring(8, 11);
		String D = STR.substring(12, 14);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);

		sc.close();
	}
	
}