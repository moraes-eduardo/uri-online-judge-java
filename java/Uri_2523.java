// package Iniciante;

/*
 
 QUEST�O
 Ao voltar de um intenso jogo de RPG na casa de um amigo, o jovem Will 
 desapareceu misteriosamente! Todos est�o desesperadamente procurando 
 por ele por todos os cantos. Enquanto isso, coisas estranhas est�o 
 acontecendo em sua casa. Uma delas, entretanto, lhe permite comunicar-se com o garoto!

 H� exatamente 26 l�mpadas penduradas na parede da sua sala, numeradas de 1 
 a 26 da esquerda para a direita. Al�m disso, h� uma letra do alfabeto pintada 
 na parede em baixo de cada l�mpada. Quando Will quer lhe enviar uma mensagem, 
 ele ir� (misteriosamente) piscar, uma a uma, as l�mpadas correspondentes a 
 cada letra de sua mensagem. Por exemplo, se ele quer enviar a mensagem HELP, 
 ele ir� piscar, nesta ordem, as l�mpadas acima das letras H, E, L e P.

 Dada a letra associada a cada l�mpada e a ordem das l�mpadas que foram piscadas 
 por Will, decifre a mensagem que ele enviou!
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 uma string de exatamente 26 letras mai�sculas contendo todas as letras do 
 alfabeto ingl�s. A primeira letra da string est� associada � l�mpada 1; a 
 segunda letra est� associada � l�mpada 2; e assim por diante. A pr�xima linha 
 cont�m um inteiro N (1 <= N <= 104), o n�mero de l�mpadas que foram piscadas. 
 A terceira linha cont�m N inteiros li (1 <= li <= 26), indicando as l�mpadas que 
 foram piscadas, em ordem.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha contendo a mensagem enviada por Will.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2523 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String alphabet = sc.next();
			String word = "";
			int letters = sc.nextInt();
			for (int i = 0; i < letters; i++) {
				int letter = sc.nextInt() -1;
				word += alphabet.charAt(letter);
			}
			System.out.println(word);
		}

		sc.close();
	}
	
}