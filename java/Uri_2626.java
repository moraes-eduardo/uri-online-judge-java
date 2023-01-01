// package Iniciante;

/*
 
 QUEST�O
 Dod�, Leo e Pepper passam v�rias madrugadas conversando, em algum lugar do 
 Condom�nio Jardim Bot�nico IV. Diversos assuntos astrais ganham pauta nestas 
 conversas hom�ricas. Nas �ltimas sess�es, Dod� tem falado do jogo de RPG que 
 ele e Leo est�o inventando, Leo (para �variar�, mas com raz�o) tem falado do 
 g�nero musical heavy metal e Pepper ficou fascinado com a hist�ria da 
 mitologia grega contada por Leo.

 Os garotos resolveram adotar uma estrat�gia para dividir as sess�es 
 igualmente entre os assuntos, de modo que eles possam especular cada um ao 
 m�ximo e chegarem a conclus�es astron�micas. Eles ir�o jogar �pedra, papel e 
 tesoura� para decidir o assunto da sess�o de hoje, e ent�o ir�o alternar os 
 assuntos nas pr�ximas sess�es. Dadas as jogadas de Dod�, Leo e Pepper, nesta 
 ordem, voc� deve determinar o assunto da sess�o de hoje.
  
 ENTRADA
 A entrada � composta por v�rios casos de teste e termina com fim de arquivo. 
 Cada caso de teste � composto por uma �nica linha, que cont�m as jogadas de 
 cada um dos garotos, como mostrado nos exemplos.
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha com a mensagem "Os atributos 
 dos monstros vao ser inteligencia, sabedoria..." para indicar que Dod� � o 
 vencedor, a mensagem "Iron Maiden�s gonna get you, no matter how far!" para 
 indicar que Leo � o vencedor, a mensagem "Urano perdeu algo muito precioso..." 
 para indicar que Pepper � o vencedor, ou a mensagem "Putz vei, o Leo ta 
 demorando muito pra jogar..." se houver empate.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2626 {

	private static final String PEDRA = "pedra";
	private static final String PAPEL = "papel";
	private static final String TESOU = "tesoura";
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		sc.close();
		while (sc.hasNext()) {
			String dodo = sc.next().toLowerCase().trim();
			String leo = sc.next().toLowerCase().trim();
			String pepper = sc.next().toLowerCase().trim();
			if (isDraw(dodo, leo, pepper)) 
				System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
			else if (isWinner(dodo, leo, pepper)) 
				System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
			else if (isWinner(leo, dodo, pepper))
				System.out.println("Iron Maiden's gonna get you, no matter how far!");
			else if (isWinner(pepper, leo, dodo))
				System.out.println("Urano perdeu algo muito precioso...");
			else
				throw new NullPointerException("invalid game");
		}

		
	}
	
	private static boolean isDraw(String a, String b, String c) {
		
		// Caso todos joguem a mesma coisa da empate
		if (a.equals(PEDRA) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		if (a.equals(PAPEL) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		if (a.equals(TESOU) && b.equals(TESOU) && c.equals(TESOU)) return true;
		
		// Caso todos joguem diferente da empate
		if (a.equals(PEDRA) && b.equals(PAPEL) && c.equals(TESOU)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(PAPEL)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(TESOU) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PEDRA) && c.equals(PAPEL)) return true;
		
		// Caso haja duas tesouras e um papel da empate
		if (a.equals(TESOU) && b.equals(TESOU) && c.equals(PAPEL)) return true;
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(TESOU) && c.equals(TESOU)) return true;
		
		// Caso haja dois papeis e uma pedra da empate
		if (a.equals(PAPEL) && b.equals(PAPEL) && c.equals(PEDRA)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(PAPEL)) return true;
		if (a.equals(PEDRA) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		
		// Caso haja duas pedras e uma tesoura da empate
		if (a.equals(PEDRA) && b.equals(PEDRA) && c.equals(TESOU)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(PEDRA)) return true;
		if (a.equals(TESOU) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		
		// Caso contrario retorna false pois n�o foi empate
		return false;
	}
	
	private static boolean isWinner(String a, String b, String c) {
		
		// Caso uma dessas verifica��es fique satisfeita ent�o se retorna sim
		if (a.equals(TESOU) && b.equals(PAPEL) && c.equals(PAPEL)) return true;
		if (a.equals(PEDRA) && b.equals(TESOU) && c.equals(TESOU)) return true;
		if (a.equals(PAPEL) && b.equals(PEDRA) && c.equals(PEDRA)) return true;
		
		// Caso contrario n�o
		return false;
	}
	
}