// package Iniciante;

/*
 
 QUEST�O
 Dado a posi��o inicial de um cavalo em um tabuleiro de xadrez e a posi��o 
 destino, deve se dizer se, com exatamente um �nico movimento, o cavalo 
 consegue alcan�ar a posi��o destino. Se isso for poss�vel, o movimento � 
 classificado como v�lido, caso contr�rio, o movimento � dito inv�lido.

 Em um tabuleiro de xadrez se utiliza n�meros, de 1 a 8, para especificar 
 a linha do tabuleiro e letras, de 'a' a 'h' para especificar a coluna.
 
 ENTRADA
 A entrada � composta por uma �nica linha contendo a posi��o inicial do 
 cavalo  e a posi��o destino, separadas por um espa�o em branco. Uma posi��o 
 no  tabuleiro � especificada por um caractere, que representa a coluna, 
 seguido  de um n�mero inteiro que representa a linha.
 
 SA�DA
 A sa�da consiste em uma linha contendo a mensagem "VALIDO" caso o movimento 
 seja um movimento v�lido de um cavalo no jogo de xadrez ou "INVALIDO" 
 caso contr�rio.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2808 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String inicial = sc.next();
		String destino = sc.next();
		int a1 = inicial.charAt(1);
		int a2 = Pos.get(inicial.charAt(0)).pos;
		int b1 = destino.charAt(1); 
		int b2 = Pos.get(destino.charAt(0)).pos;
		if (valid(a1, a2, b1, b2))
			System.out.println("VALIDO");
		else 
			System.out.println("INVALIDO");
		
		sc.close();
	}
	
	private static boolean valid(int a1, int a2, int b1, int b2) {
		if (a1 + 2 == b1 && a2 + 1 == b2) return true;
		if (a1 + 1 == b1 && a2 + 2 == b2) return true;
		if (a1 + 2 == b1 && a2 - 1 == b2) return true;
		if (a1 + 1 == b1 && a2 - 2 == b2) return true;
		if (a1 - 2 == b1 && a2 - 1 == b2) return true;
		if (a1 - 1 == b1 && a2 - 2 == b2) return true;
		if (a1 - 2 == b1 && a2 + 1 == b2) return true;
		if (a1 - 1 == b1 && a2 + 2 == b2) return true;
		return false;
	}

	enum Pos {
		a(1), b(2), c(3), d(4), e(5), f(6), g(7), h(8);

		int pos;
		
		Pos(int pos) {this.pos = pos;}
		
		private static Pos get(char c) {return Pos.valueOf(String.valueOf(c));}
	}
	
}