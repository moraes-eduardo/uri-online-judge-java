// package Iniciante;

/*
 
 QUEST�O
 Como se sabe, l�xico � o conjunto de palavras que existe em uma l�ngua. Nas 
 l�nguas ocidentais, � comum escrever usando o alfabeto latino, com 26 letras 
 que v�o de a at� z.

 � comum enumerar as letras na seguinte ordem: a, b, c, d, e f, g, h, i, j, 
 k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z.

 Se uma lista de palavras est� organizadas de acordo com esta ordem, fica 
 muito mais r�pido pesquis�-las. Seu trabalho neste problema � ordenar duas 
 palavras de acordo com esta ordem.

 Sejam duas palavras A e B. Caso o primeiro caractere de A venha antes do 
 primeiro de B, coloca-se A antes de B. Se o primeiro caractere for igual, 
 usa-se o seguinte para desempate. E se o segundo empatar, usa-se o terceiro, 
 etc. Quando todos os caracteres de A forem iguais ao come�o de B, ou todos 
 os de B forem iguais ao come�o de A, coloca-se a menor palavra primeiro.
 
 ENTRADA
 A entrada cont�m 2 palavras com caracteres min�sculos de a at� z, O comprimento 
 das palavras n�o ultrapassa 20 caracteres.
 
 SA�DA
 A sa�da cont�m as mesmas 2 palavras, s� que na ordem lexicogr�fica.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2826 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if (A.compareTo(B) < 0) {
			System.out.println(A);
			System.out.println(B);
		} else if (A.compareTo(B) > 0) {
			System.out.println(B);
			System.out.println(A);
		} else {
			System.out.println(A);
			System.out.println(B);
		}
	}
	
}