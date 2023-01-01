// package Iniciante;

/*
 
 QUEST�O
 Pedra, Papel, Ataque A�reo � um jogo infantil muito popular, em que duas 
 ou mais crian�as formam um c�rculo e fazem gestos com a m�o na tentativa 
 de obter a vit�ria. As regras s�o surpreendentemente complexas para um jogo 
 de crian�as, mas mesmo assim � bastante popular por todo o mundo.
 As partidas s�o muito simples. Os jogadores podem escolher entre o sinal de 
 uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o sinal para o 
 Ataque A�reo (igual o do Papel, mas com apenas o polegar e o mindinho 
 estendidos).
 
 Uma partida, com dois jogadores, possuem as seguintes regras para se definir
 um vencedor:

 * Ataque A�reo vs. Pedra: Neste caso, o jogador com o Ataque A�reo derrota 
 o jogador com a Pedra, por raz�es �bvias.
 * Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, 
 porque a Pedra machuca muito mais.
 * Papel vs. Ataque A�reo: Aqui o Ataque A�reo ganha, porque Ataque A�reo 
 sempre ganha e o Papel � pat�tico.
 * Papel vs. Papel: Nesta varia��o, ambos os jogadores ganham, porque o Papel 
 � in�til e ningu�m que enfrenta o Papel pode perder.
 * Pedra vs. Pedra: Para este caso n�o h� ganhador, porque depende do que os 
 jogadores decidem fazer com a Pedra e normalmente n�o fazem nada.
 * Ataque A�reo vs. Ataque A�reo: Quando isto acontece, todos os jogadores 
 perdem, devido a Aniquila��o M�tua.
 * Sua tarefa � escrever um programa que, dada as escolhas de dois jogadores, 
 informe quem venceu o jogo.

 ENTRADA
 A entrada consiste de N (1 <= N <= 1000) casos de teste. N deve ser lido na 
 primeira linha da entrada. Cada caso de teste � composto por duas linhas, 
 cada uma contendo uma string. A primeira string representa o sinal escolhido 
 pelo jogador 1 e a segunda string representa o sinal escolhido pelo jogador 2. 
 Essas strings podem ser:

 * �ataque�: para representar o Ataque A�reo
 * �pedra�: para representar a Pedra
 * �papel�: para representar o Papel
 
 SA�DA
 A sa�da deve conter o seguinte:

 * �Jogador 1 venceu�: se o Jogador Um tiver vencido a partida
 * �Jogador 2 venceu�: se o Jogador Dois tiver vencido a partida
 * �Ambos venceram�: se os dois jogadores tiverem vencido a partida
 * �Sem ganhador�: se n�o houver ganhador
 * �Aniquilacao mutua�: se ocorrer Aniquila��o M�tua
 
 Cada sa�da de um caso de teste deve estar em uma linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2031 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String jogador1, jogador2;
    	for (int i = 0; i < N; i++) {
    		jogador1 = sc.next();
    		jogador2 = sc.next();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
    		else System.out.println("Sem ganhador");
    	}

		sc.close();
    }
	
}