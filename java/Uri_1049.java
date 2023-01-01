// package Iniciante;

/*
 
 QUEST�O
 Neste problema, voc� dever� ler 3 palavras que definem o tipo de animal poss�vel 
 segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos 
 animais seguintes foi escolhido, atrav�s das tr�s palavras fornecidas.
 http://prntscr.com/jwis51
 
 ENTRADA
 A entrada cont�m 3 palavras, uma em cada linha, necess�rias para identificar o animal 
 segundo a figura acima, com todas as letras min�sculas.
 
 SA�DA
 Imprima o nome do animal correspondente � entrada fornecida.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1049 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}			
			}
		}

		sc.close();
	}
	
}