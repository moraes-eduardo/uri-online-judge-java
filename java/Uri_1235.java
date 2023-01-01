// package Strings;

/*

 QUEST�O
 A sua impressora foi infectada por um v�rus e est� imprimindo de forma incorreta. 
 Depois de olhar para v�rias p�ginas impressas por um tempo, voc� percebe que ele 
 est� imprimindo cada linha de dentro para fora. Em outras palavras, a metade 
 esquerda de cada linha est� sendo impressa a partir do meio da p�gina at� a 
 margem esquerda. Do mesmo modo, a metade direita de cada linha est� sendo impressa 
 � partir da margem direita e prosseguindo em dire��o ao centro da p�gina.

 Por exemplo a linha:
 THIS LINE IS GIBBERISH

 est� sendo impressa como:
 I ENIL SIHTHSIREBBIG S

 Da mesma foma, a linha " MANGOS " est� sendo impressa incorretamente como "NAM  SOG". 
 Sua tarefa � desembaralhar (decifrar) a string a partir da forma como ela foi impressa 
 para a sua forma original. Voc� pode assumir que cada linha conter� um n�mero par de caracteres.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de entrada cont�m um inteiro 
 N que indica a quantidade de casos de teste. Seguem N linhas, cada uma com uma frase 
 com no m�nimo 2 e no m�ximo 100 caracteres de letras mai�sculas e espa�os que dever� 
 ser desembaralhada (decifrada) � partir da forma impressa para a sua forma original, 
 conforme especifica��o acima.
 
 SA�DA
 Para cada linha de entrada dever� ser impressa uma linha de sa�da com a frase decifrada, 
 conforme a especifica��o acima.
 
*/

import java.util.Scanner;

public class Uri_1235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String frase = readLine(sc);
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
		}
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
	
}