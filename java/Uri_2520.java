// package Iniciante;

/*
 
 QUEST�O
 Anal�gim�n Go! � um jogo bastante popular. Em sua jornada, o jogador percorre 
 diversas cidades capturando pequenos monstrinhos virtuais, chamados anal�gim�ns. 
 Voc� acabou de chegar em uma cidade que cont�m o �ltimo anal�gim�n que falta 
 para sua cole��o!

 A cidade pode ser descrita como um grid de N linhas e M colunas. Voc� est� em 
 uma dada posi��o da cidade, enquanto o �ltimo anal�gim�n est� em outra posi��o 
 da mesma cidade. A cada segundo, voc� pode se mover (exatamente) uma posi��o ao 
 norte, ao sul, a leste ou a oeste. Considerando que o anal�gim�n n�o se move, 
 sua tarefa � determinar o menor tempo necess�rio para ir at� a posi��o do monstrinho.

 A figura abaixo descreve o exemplo da entrada, e apresenta um caminho percorrido 
 em 5 segundos. Outros caminhos percorridos no mesmo tempo s�o poss�veis, mas n�o 
 h� outro caminho que pode ser percorrido em um tempo menor.

 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 dois inteiros N e M (2 <= N, M <= 100), o n�mero de linhas e de colunas na cidade, 
 respectivamente. As pr�ximas N linhas cont�m M inteiros cada, descrevendo a 
 cidade. O inteiro 0 indica uma posi��o em branco; o inteiro 1 indica a sua posi��o 
 na cidade; o inteiro 2 indica a posi��o do anal�gim�n na cidade. � garantido que 
 haver� exatamente um inteiro 1 e exatamente um inteiro 2 na descri��o da cidade, 
 e que os demais inteiros ser�o iguais a 0.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo o menor tempo necess�rio para 
 ir at� o monstrinho, em segundos.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2520 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int distancia = 0;
			int treinadorX = 0;
			int treinadorY = 0;
			int pokemonX = 0;
			int pokemonY = 0;
			for (int x = 0; x < N; x++) {
				for (int y = 0; y < M; y++) {
					int P = sc.nextInt();
					if (P == 1) {
						treinadorX = x;
						treinadorY = y;
					}
					if (P == 2) {
						pokemonX = x;
						pokemonY = y;
					}
				}
			}
			
			if (treinadorX > pokemonX) distancia += (treinadorX - pokemonX);
			else if (pokemonX > treinadorX) distancia += (pokemonX - treinadorX);
			
			if (treinadorY > pokemonY) distancia += (treinadorY - pokemonY);
			else if (pokemonY > treinadorY) distancia += (pokemonY - treinadorY);
			
			System.out.println(distancia);
		}

		sc.close();
	}
	
}