// package Iniciante;

/*
 
 QUEST�O
 Amarelinha provavelmente � a brincadeira em que as crian�as da vila mais se 
 divertem, por�m a mesma vem causando um bom tempo de discuss�o e choro nas 
 crian�as que a praticam. A causa do transtorno � para decidir quem ser� o 
 pr�ximo a pular, mas recentemente Quico (O g�nio!) teve uma grande ideia 
 para solucionar o problema. Basicamente a brincadeira s� poder� ser jogada 
 de dois em dois jogadores e para escolher o pr�ximo jogador Quico indicou o 
 uso do tradicional m�todo par ou �mpar, onde os dois jogadores informam um 
 n�mero e se a soma desses n�meros for par o jogador que escolheu PAR ganha 
 ou vice verso. Entretanto a utiliza��o desse m�todo vem deixando o Quico 
 louco, louco, louco... E por esse motivo ele pediu a sua ajuda! Solicitou a 
 voc� um programa que dado o nome dos jogadores, suas respectivas escolhas 
 PAR ou IMPAR e os n�meros, informe quem foi o vencedor.
 
 ENTRADA
 A primeira linha de entrada cont�m um n�mero inteiro QT (1 <= QT <= 100), 
 indicando a quantidade de casos de teste que vem a seguir. Cada caso de teste 
 cont�m duas linhas. Na primeira linha ser� informado o nome do jogador 1 
 seguido de sua escolha, �PAR� ou �IMPAR� e logo ap�s, o nome do jogador 2 
 seguido de sua escolha, �PAR� ou �IMPAR�. Na segunda linha de entrada, cont�m 
 2 n�meros inteiros N (1 <= N <= 10^9) e M (1 <= M <= 10^9), representando 
 respectivamente os n�meros escolhidos pelo jogador 1 e pelo jogador 2. � 
 garantido que a escolha (PAR ou IMPAR) do jogador 1 ser� diferente da escolha 
 (PAR ou IMPAR) do jogador 2 e que o nome dos jogares s�o formados somente por 
 letras e n�o ultrapassar�o 100 caracteres.
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha contendo o nome do jogador vencedor.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1914 {
	
    public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int QT = Integer.parseInt(sc.readLine());
		String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
		int N, M;
		for (int i = 0; i < QT; i++) {
			linha1 = sc.readLine().split(" ");
			linha2 = sc.readLine().split(" ");
			N = Integer.parseInt(linha2[0]);
			M = Integer.parseInt(linha2[1]);
			nome1 = linha1[0];
			escolha1 = linha1[1];
			nome2 = linha1[2];
			escolha2 = linha1[3];
			
			if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) ||
			    ((N + M) % 2 != 0 && escolha1.equalsIgnoreCase("IMPAR"))) System.out.println(nome1);
			else System.out.println(nome2);
		}

		sc.close();
    }
	
}