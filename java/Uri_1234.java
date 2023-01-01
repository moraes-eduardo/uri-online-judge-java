// package Strings;

/*

 QUEST�O
 Uma senten�a � chamada de dan�ante se sua primeira letra for mai�scula e 
 cada letra subsequente for o oposto da letra anterior. Espa�os devem ser 
 ignorados ao determinar o case (min�sculo/mai�sculo) de uma letra. Por 
 exemplo, "A b Cd" � uma senten�a dan�ante porque a primeira letra ('A') � 
 mai�scula, a pr�xima letra ('b') � min�scula, a pr�xima letra ('C') � 
 mai�scula, e a pr�xima letra ('d') � min�scula.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. Cada caso de teste � composto por 
 uma linha que cont�m uma senten�a, que � uma string que cont�m entre 1 e 50 
 caracteres ('A'-'Z','a'-'z' ou espa�o ' '), inclusive, ou no m�nimo uma letra ('A'-'Z','a'-'z').
 
 SA�DA
 Transforme a senten�a de entrada em uma senten�a dan�ante (conforme o exemplo 
 abaixo) trocando as letras para min�scula ou mai�scula onde for necess�rio. 
 Todos os espa�os da senten�a original dever�o ser preservados, ou seja, " sentence " 
 dever� ser convertido para " SeNtEnCe ".
 
*/

import java.util.Scanner;

public class Uri_1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			boolean upper = true;
			StringBuilder frase = new StringBuilder(sc.nextLine());
			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (upper) 	frase.setCharAt(i, Character.toUpperCase(c));
					else 		frase.setCharAt(i, Character.toLowerCase(c));
					upper =! upper;
				}
			}
			System.out.println(frase);
		}

		sc.close();
	}
	
}