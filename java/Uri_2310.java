// package Iniciante;

/*
 
 QUEST�O
 Um treinador de voleibol gostaria de manter estat�sticas sobre sua equipe. 
 A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e 
 ataques cada um de seus jogadores fez, bem como quantos desses saques, 
 bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve 
 mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.
 
 ENTRADA
 A entrada � dada pelo n�mero de jogadores N (1 <= N <= 100), seguido pelo nome 
 de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas 
 com tr�s inteiros cada. Na primeira linha S, B e A (0 <= S,B,A <= 10000) 
 representam a quantidade de tentativas de saques, bloqueios e ataques e na 
 segunda linha, S1, B1 e A1 (0 <= S1 <= S; 0 <= B1 <= B; 0 <= A1 <= A) com o 
 n�mero de saques, bloqueios e ataques deste jogador que tiveram sucesso.

 S�IDA
 A sa�da deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2310 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dados = new int[6];
		for (int i = 0; i < N; i++) {
			sc.next();
			for (int j = 0; j < dados.length; j++) {
				dados[j] += sc.nextInt();
			}
		}
		double bloqueios = (dados[3] * 100.0) / dados[0];
		double saques = (dados[4] * 100.0) / dados[1];
		double ataques = (dados[5] * 100.0) / dados[2];
		System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");

		sc.close();
	}
	
}