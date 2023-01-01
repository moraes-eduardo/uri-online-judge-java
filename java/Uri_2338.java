// package Iniciante;

/*
 
 QUEST�O
 Todos os seus amigos est�o loucos pelo filme "Interstellar". Agora eles 
 est�o postando textos no Facebook em C�digo Morse. Voc� precisa escrever 
 um c�digo para decodificar Morse!

 Este C�digo Morse cont�m somente letras min�sculas (a-z) e espa�os em branco.

 Nota - C�digo Morse � uma forma de codificar caracteres em uma sequ�ncias 
 de pontos e tra�os. Cada caracter tem uma codifica��o fixa. Um exemplo bem 
 famoso � o Morse de SOS "...---..." . S � codificado como "..." (ponto ponto 
 ponto) e O � codificado como "---" (tra�o tra�o tra�o).
 Neste problema, um ponto � denotado por "=" e um tra�o por "===". S�mbolos 
 s�o separados por "." , letras s�o separadas por "..." e palavras s�o separadas por "......." . 
 Sendo assim, SOS � codificado como =.=.=...===.===.===...=.=.=
 Codifica��es para todos os caracteres podem ser encontradas no link abaixo.
      http://morsecode.scphillips.com/morse2.html
 
 ENTRADA
 A entrada consiste em m�ltiplos casos de teste.

 A primeira linha de cada entrada cont�m o n�mero de casos de teste (t)(1 <= t <= 10).

 As pr�ximas t linhas cont�m os C�digos Morse. O tamanho de cada c�digo � menor 
 que 1000 caracteres.

 S�IDA
 A sa�da � divida em linhas, que representam a mensagem decodificada de cada caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2338 {
 	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String morse = sc.next();
			System.out.println(translateMessage(morse));
		}

		sc.close();
	}
	
	private static String translateMessage(String morse) {
		String[] characters = morse.split("\\.{3}");
		String transaltedMessage = "";
		for (int i = 0; i < characters.length; i++) {
			transaltedMessage += convertedChar(characters[i].startsWith(".") ? characters[i].substring(1, characters[i].length()) : characters[i]);
		}
		return transaltedMessage;
	}

	private static char convertedChar(String str) {
		switch (str) {
			case "=.===":         return 'a';
			case "===.=.=.=":     return 'b';
			case "===.=.===.=":   return 'c';
			case "===.=.=":       return 'd';
			case "=":             return 'e';
			case "=.=.===.=":	  return 'f';
			case "===.===.=":     return 'g';
			case "=.=.=.=":		  return 'h';
			case "=.=":			  return 'i';
			case "=.===.===.===": return 'j';
			case "===.=.===":	  return 'k';
			case "=.===.=.=":	  return 'l';
			case "===.===": 	  return 'm';
			case "===.=":		  return 'n';
			case "===.===.===":	  return 'o';
			case "=.===.===.=":	  return 'p';
			case "===.===.=.===": return 'q';
			case "=.===.=":		  return 'r';
			case "=.=.=":		  return 's';
			case "===":			  return 't';
			case "=.=.===":		  return 'u';
			case "=.=.=.===":	  return 'v';
			case "=.===.===":	  return 'w';
			case "===.=.=.===":   return 'x';
			case "===.=.===.===": return 'y';
			case "===.===.=.=":   return 'z';
			default: return ' ';
		}
	}
	
}