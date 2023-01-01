// package Iniciante;

/*
 
 QUEST�O
 Armandinho tem um amigo o tanto quanto chato, chamado La�rcio. Quando jogam o 
 jogo do mestre manda, um jogo onde algu�m d� uma ordem e algu�m a cumpre, e 
 em vez de dar ordens legais como subir em uma �rvore, pular o muro, plantar 
 bananeira ou organizar manifesta��es para derrubar o governo (independente de 
 quem estiver no poder) ele sempre pede algo ma�ante. Em sua �ltima partido, 
 La�rcio exigiu que Armandinho ordenasse uma lista de n�meros, de forma que 
 apenas os n�meros �mpares aparecessem e o primeiro item seja o maior, o 
 segundo seja o menor, o terceiro o segundo maior, o quarto seja o segundo 
 menor e assim por diante. Como fazer isso a m�o � muito chato, Armandinho 
 procurou sua ajuda.
 
 ENTRADA
 A entrada consiste de um inteiro N que representa o n�mero de casos testes 
 ( 1<N<1000 ). Cada caso teste come�a com um inteiro M, que representa o 
 tamanho da lista (0<M<100). Seguem M inteiros Mi (0<Mi < 1000) que 
 representam a lista de La�rcio.
 
 SA�DA
 Imprima a lista ordenada como La�rcio requisitou, com um espa�o entre os 
 valores, pulando uma linha a cada caso teste.

*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uri_2812 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			ArrayList<Integer> Mi = new ArrayList<>();
			for (int j = 0; j < M; j++) {
				int temp = sc.nextInt();
				if (temp % 2 == 1) {
					Mi.add(temp);
				}
			}
			Collections.sort(Mi);
			String str = "";
			if (Mi.size() % 2 != 0) {
				int cont = 0;
				for (int j = 0; cont != Mi.size(); j++) {
					if (j < Mi.size() / 2) {
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j) + " ");
						cont += 2;
					} else {
						str += (Mi.get(j));
						cont++;
					}
				}
			} else {
				for (int j = 0; j < Mi.size() / 2; j++) {
					if (j + 1 < Mi.size() / 2)
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j) + " ");
					else
						str += (Mi.get(Mi.size() - 1 - j) + " " + Mi.get(j));
				}
			}
			System.out.println(str.trim());
		}

		sc.close();
	}
	
}