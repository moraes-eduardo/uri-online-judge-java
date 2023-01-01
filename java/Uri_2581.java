// package Iniciante;

/*
 
 QUEST�O
 Toorg � o integrante mais s�bio do grupo de her�is denominado Os Protetores 
 da Via L�ctea. Para qualquer pergunta, ele tem a resposta ideal! Escreva 
 um programa que, dada uma pergunta, informe a resposta de Toorg.
  
 ENTRADA
 A entrada ter� diversos casos de teste. A cada caso de teste, um n�mero N � 
 apresentado, que representa o n�mero de casos de teste. Em seguida, haver� 
 N linhas, com as perguntas feitas para Toorg.
 
 SA�DA
 Para cada caso de teste, imprima a resposta de Toorg.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2581 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String question = sc.nextLine();
			System.out.println("I am Toorg!");
		}
	}
	
}