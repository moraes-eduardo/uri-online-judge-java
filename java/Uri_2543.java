// package Iniciante;

/*
 
 QUEST�O
 Assim como a maioria dos estudantes de computa��o, voc� vive jogando os jogos 
 eletr�nicos mais populares atualmente: Liga of Legendas (LOL) e Contra-Strike 
 (CS). Embora voc� tamb�m jogue LOL, voc� gosta mais � de usar todas suas 
 grandes habilidades para derrotar a equipe terrorista em Contra-Strike! Voc� 
 � t�o empenhado no combate ao terror que � frequentemente comparado com o 
 presidente dos EUA que anunciou a captura e derrota de um grande terrorista 
 da vida real.

 Por ser bastante habilidoso, os v�deos de suas jogadas (seus famosos gameplays) 
 vivem aparecendo na Jogatina UFPR, uma p�gina na internet que publica gameplays 
 de alunos da universidade.

 A p�gina publica muitos v�deos diariamente. Por isso, pode ser dificil 
 encontrar e contar todos os seus v�deos na p�gina. Entretanto, como voc� 
 tamb�m � programador, voc� decidiu escrever um programa para auxili�-lo nesta 
 tarefa. Dada a lista de gameplays publicados na p�gina, determine quantos 
 gameplays seus de Contra-Strike foram publicados.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 dois inteiros N e I (1 <= N <= 104, 1000 <= I <= 9999), o n�mero de gameplays 
 publicados na p�gina e o seu identificador na universidade, respectivamente.

 As pr�ximas N linhas descrevem os gameplays publicados. Cada gameplay � 
 descrito por dois inteiros i e j (1000 <= i <= 9999, j=0 ou 1), onde i � o 
 identificador na universidade do autor do gameplay, e j=0 se o gameplay � de 
 Contra-Strike, ou j=1 se � de Liga of Legendas.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha com um n�mero indicando 
 quantos gameplays seus de Contra-Strike foram publicados na p�gina.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2543 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int I = sc.nextInt();
			int cont = 0;
			for (int k = 0; k < N; k++) {
				int i = sc.nextInt();
				int j = sc.nextInt();
				if (i == I && j == 0) cont++;
			}
			System.out.println(cont);
		}

		sc.close();
	}
	
}