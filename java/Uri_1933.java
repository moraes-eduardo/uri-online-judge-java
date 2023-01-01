// package Iniciante;

/*
 
 QUEST�O
 Tri-du � um jogo de cartas derivado do popular jogo de Truco. O jogo 
 utiliza um baralho normal de 52 cartas, com treze cartas de cada naipe, 
 mas os naipes s�o ignorados. Apenas o valor das cartas,considerados 
 como inteiros de 1 a 13, s�o utilizados.

 No jogo, cada jogador recebe tr�s cartas. As regras s�o simples:

 * Um trio (tr�s cartas de mesmo valor) ganha de uma dupla (duas cartas de 
 mesmo valor).
 * Um trio formado por cartas de maior valor ganha de um trio formado por 
 cartas de menor valor.
 * Uma dupla formada por cartas de maior valor ganha de uma dupla formada por 
 cartas de menor valor.
 
 Note que o jogo pode n�o ter ganhador em muitas situa��es; nesses casos, as 
 cartas distribu�das s�o devolvidas ao baralho, que � embaralhado e uma nova 
 partida � iniciada

 Um jogador j� recebeu duas das cartas que deve receber, e conhece seus 
 valores. Sua tarefa � escrever um programa para determinar qual o valor 
 da terceira carta que maximiza a probabilidade de esse jogador ganhar o jogo.
 
 ENTRADA
 A entrada consiste de uma �unica linha que cont�m dois inteiros, 
 A (1 <= A <= 13) e B (1 <= B <= 13) indicando os valores das duas primeiras 
 cartas recebidas.
 
 SA�DA
 Seu programa deve produzir uma �nica linha com um inteiro representando o 
 valor da carta que maximiza a probabilidade de o jogador ganhar a partida.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1933 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C;
		if (A == B) C = A;
		else if (A > B) C = A;
		else C = B;
		System.out.println(C);

		sc.close();
    }
	
}