// package Strings;

/*

 QUEST�O
 Ent�o, n�s temos que admitir: precisamos da sua ajuda. Esse ano as coisas n�o estao 
 correndo t�o tranquilamente quanto quer�amos, e n�s n�o conseguimos finalizar o 
 sistema do software da competi��o a tempo. Uma parte vital est� faltando, e como 
 voc� sabe, n�s precisamos desse sistema funcionando at� essa tarde, para a verdadeira 
 competi��o. A parte que est� faltando � a que computa a pontua��o dos times, dada a 
 lista de submiss�es desse time.

 Por favor, por favor, algu�m nos ajude!
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de caso de teste cont�m um 
 �nico inteiro N indicando o n�mero de submiss�es do caso de teste (1 <= N <= 300). 
 Cada uma das N linhas seguintes descrevem uma submiss�o; cada uma dessas linhas 
 cont�m um identificador de problema (uma �nica letra entre 'A' e 'Z'), seguida por 
 um inteiro T representando o tempo em minutos (0 <= T <= 300), seguido por um 
 julgamento (a palavra "correct", correto, ou a palavra "incorrect", incorreto).

 A entrada est� em ordem crescente de tempo, e haver� no m�ximo um julgamento "correct" 
 para cada problema. O final da entrada � indicado por N = 0. A entrada deve ser lida da 
 entrada padr�o.
 
 SA�DA
 Para cada caso de teste a entrada do seu programa deve imprimir uma linha contendo 
 dois inteiros S e P, separados por um espa�o, onde S � o n�mero de problemas distintos 
 com o julgamento "correct" e P � o tempo no qual cada problema distinto foi julgado pela 
 primeira vez como "correct", somado a 20 para cada julgamento "incorrect" recebido nesse 
 problema (desde que no final o problema tenha sido julgado como "correct"). A sa�da 
 deve ser escrita na sa�da padr�o.
 
*/

import java.util.HashMap;
import java.util.Scanner;

public class Uri_1367 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			if (N == 0) break;
			HashMap<Character, Integer> problemasResolvidos = new HashMap<>();
			HashMap<Character, Integer> problemas = new HashMap<>();
			for (int i = 0; i < N; i++) {
				char identificador = sc.next().charAt(0);
				int tempo = sc.nextInt();
				String julgamento = sc.next();
				if (julgamento.equals("correct")) {
					if (problemas.containsKey(identificador) ) {
						tempo += problemas.get(identificador);
					}
					problemasResolvidos.put(identificador, tempo);
				} else {
					int penalidade = 20;
					if (problemas.containsKey(identificador) ) {
						penalidade += problemas.get(identificador);
					}
					problemas.put(identificador, penalidade);
				}
			}
			System.out.println(problemasResolvidos.size() + " " + problemasResolvidos.values().stream().reduce(0, Integer::sum));
		}

		sc.close();
	}

}