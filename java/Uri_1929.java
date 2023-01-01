// package Iniciante;

/*
 
 QUEST�O
 Ana e suas amigas est�o fazendo um trabalho de geometria para o col�gio, em 
 que precisam formar v�rios tri�ngulos, numa cartolina, com algumas varetas 
 de comprimentos diferentes. Logo elas perceberam que n�o d� para formar 
 tri�ngulos com tr�s varetas de comprimentos quaisquer: se uma das varetas 
 for muito grande em rela��o �s outras duas, n�o d� para formar o tri�ngulo.

 Neste problema, voc� precisa ajudar Ana e suas amigas a determinar se, dados 
 os comprimentos de quatro varetas, � ou n�o � poss�vel selecionar tr�s 
 varetas, dentre as quatro, e formar um tri�ngulo.
 
 ENTRADA
 A entrada � composta por apenas uma linha contendo quatro n�meros inteiros 
 A, B, C e D (1 <= A, B, C, D <= 100).

 SA�DA
 Seu programa deve produzir apenas uma linha contendo apenas um caractere, que 
 deve ser �S� caso seja poss�vel formar o tri�ngulo, ou �N� caso n�o seja 
 poss�vel formar o tri�ngulo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1929 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int maior, segundoMaior, menor1, menor2;
		
		if (A > B && A > C && A > D) {
			maior = A;
			if (B > C && B > D) {
				segundoMaior = B;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = B;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = B;
				menor2 = C;
			}
		} else if (B > C && B > D) {
			maior = B;
			if (A > C && A > D ) {
				segundoMaior = A;
				menor1 = C;
				menor2 = D;
			} else if (C > D) {
				segundoMaior = C;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = C;
				menor2 = A;
			}
		} else if (C > D) {
			maior = C;
			if (A > B && A > D) {
				segundoMaior = A;
				menor1 = B;
				menor2 = D;
			} else if (B > D) {
				segundoMaior = B;
				menor1 = A;
				menor2 = D;
			} else {
				segundoMaior = D;
				menor1 = A;
				menor2 = B;
			}
		} else {
			maior = D;
			if (A > B && A > C) {
				segundoMaior = A;
				menor1 = B;
				menor2 = C;
			} else if (B > C) {
				segundoMaior = B;
				menor1 = A;
				menor2 = C;
			} else {
				segundoMaior = C;
				menor1 = A;
				menor2 = B;
			}
		}
		
		if ((menor1 + menor2 > maior) || (menor1 + menor2 > segundoMaior) ||
			(menor1 + segundoMaior > maior) || (menor1 + segundoMaior > maior) ||
			(menor2 + segundoMaior > maior) || (menor2 + segundoMaior > maior))
			System.out.println("S");
		else
			System.out.println("N");

		sc.close();
    }
    
}