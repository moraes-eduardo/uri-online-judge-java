// package Ad-Hoc;

/*

 QUEST�O
 O seu time de futebol favorito est� jogando em um campeonato para caridade, 
 que � parte de um esfor�o mundial para levantar fundos para ajudar crian�as 
 com dificuldades. Como em um campeonato normal, tr�s pontos s�o dados ao 
 time que vence um partida, e nenhum para o time que perdeu. Se o jogo termina 
 em empate, cada time recebe um ponto.

 O seu time jogou N partidas durante a primeira fase do campeonato, que j� terminou.
 Somente alguns times, os com mais pontos acumulados, ir�o avan�ar para a segunda 
 fase do campeonato. Por�m como o objetivo principal do campeonato � arrecadar 
 dinheiro, antes de definir os times que passaram para a segunda fase, cada time 
 pode comprar gols adicionais. Estes gols contam como gols marcados, e podem ser 
 usados para alterar o resultado de qualquer partida que o time jogou.

 O or�amento do seu time � suficiente para comprar at� G gols. Voc� pode informar 
 o n�mero m�ximo de pontos que o seu time pode obter ap�s comprar os gols, supondo 
 que os outros times n�o ir�o comprar nenhum gol?
 
 ENTRADA
 A entrada cont�m diversos casos de teste e termina com EOF. A primeira linha de um 
 caso de teste cont�m dois inteiros N (1 <= N <= 105) e G (0 <= G <= 106) representando 
 respectivamente o n�mero de partidas que o seu time jogou e o n�mero de gols que o 
 seu time pode comprar. Cada uma das pr�ximas N linhas descrevem o resutado de uma 
 partida com dois inteiros S e R (0 <= S, R, <= 100), indicando respectivamente os gols 
 que o seu time marcou e sofreu na partida antes da compra de gols.
 
 SA�DA
 Para cada caso de teste imprima uma linha com um inteiro representando o n�mero 
 m�ximo total de pontos que o seu time pode obter ap�s comprar os gols.
 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri_1495 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			
			List<Integer> derrotas = new ArrayList<>();
			int N = sc.nextInt();
			int G = sc.nextInt();
			int pontos = 0;
			
			for (int i = 0; i < N; i++) {
				int S = sc.nextInt();
				int R = sc.nextInt();
				
				if (S > R) {
					pontos += 3;
				} 
				
				else if (S == R) {
					if (G > 0) {
						G -= 1;
						pontos += 3;
					} else {
						pontos += 1;
					}
				}
				
				else {
					derrotas.add(R - S + 1);
				}
			}
			
			Collections.sort(derrotas);
			for (int derrota : derrotas) {
				if (G - derrota >= 0) {
					G -= derrota;
					pontos += 3;
					if (G == 0) break;
				} else if (G - derrota == -1) {
					pontos += 1;
					break;
				} else {
					break;
				}
			}
			
			System.out.println(pontos);
		}

		sc.close();
	}

}