// package Iniciante;

/*
 
 QUEST�O
 Samu Elmito adora criar jogos peculiares para desafiar seus amigos. Desta 
 vez, ele inventou um jogo chamado "Jogo do Operador", em que ele cria 
 express�es b�sicas e cada jogador deve escolher uma express�o e preencher 
 a lacuna com o operador correto para valid�-la. Os jogadores poder�o escolher 
 operadores de somente tr�s tipos: adi��o, subtra��o e multiplica��o. Por�m, 
 se o jogador achar que n�o h� operador entre os tr�s tipos que valide a 
 express�o, poder� responder Imposs�vel.

 Sua tarefa � simples: dadas as express�es e as respostas dos jogadores, 
 determinar os jogadores que n�o passar�o para a outra fase do jogo.
 
 ENTRADA
 A entrada � composta por um inteiro T (2 <= T <= 50) que indica a quantidade 
 de express�es e de jogadores. Cada caso de teste � composto por T express�es 
 na forma "X Y=Z", indicando que X operador Y (0 <= X, Y <= 103) � igual a Z 
 (-103 <= Z <= 106), seguido de T jogadores e suas respectivas respostas na 
 forma "N E R", sendo N o nome do jogador (at� 50 caracteres e sem espa�os), 
 E o �ndice da express�o escolhida (1 <= E <= T) e R a resposta (+, -, * ou I, 
 indicando Imposs�vel). A entrada termina com EOF (fim de arquivo).
 
 SA�DA
 Para cada caso de teste, se todos os jogadores passarem, imprima "You Shall 
 All Pass!"; se nenhum jogador passar, imprima "None Shall Pass!"; caso 
 contr�rio, imprima, em ordem lexicogr�fica e entre espa�os, o nome dos 
 jogadores que erraram a resposta e, desta forma, n�o passar�o para a pr�xima 
 fase do jogo.
 
*/

import java.io.IOException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Uri_2493 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String ln = sc.nextLine();
			while (ln.equals("")) {
				ln = sc.nextLine();
			}
			int T = Integer.valueOf(ln.trim());
			String[] jogadas = new String[T];
			String[] respostas = new String[T];
			SortedSet<String> players = new TreeSet<>();
			
			for (int i = 0; i < T; i++) {
				String line = sc.nextLine();
				while (line.equals("")) {
					line = sc.nextLine();
				}
				jogadas[i] = line.replace(' ', '=');
			}
			
			for (int i = 0; i < T; i++) {
				String line = sc.nextLine();
				while (line.equals("")) {
					line = sc.nextLine();
				}
				respostas[i] = line;
			}
			
			for (int i = 0; i < T; i++) {
				String[] resposta = respostas[i].split(" ");
				String player = resposta[0];
				int index = Integer.valueOf(resposta[1].trim()) - 1;
				char operacao = resposta[2].charAt(0);
				String[] jogada = jogadas[index].split("=");
				int n0 = Integer.valueOf(jogada[0].trim());
				int n1 = Integer.valueOf(jogada[1].trim());
				int n2 = Integer.valueOf(jogada[2].trim());
				if (!respostaValida(n0, n1, n2, operacao)) {
					players.add(player);
				}
			}
			
			if (players.size() == T) {
				System.out.println("None Shall Pass!");
			} else if (players.size() == 0) {
				System.out.println("You Shall All Pass!");
			} else {
				System.out.println(String.join(" ", players));
			}
			players.clear();
		}
		sc.close();
	}
	
	private static boolean respostaValida(int n0, int n1, int n2, char operacao) {
		switch (operacao) {
			case '*': return n0 * n1 == n2;
			case '+': return n0 + n1 == n2;
			case '-': return n0 - n1 == n2;
			case 'I': return (n0 * n1 != n2) && (n0 + n1 != n2) && (n0 - n1 != n2); 
			default: return true;
		}
	}
	
}