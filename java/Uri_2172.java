// package Iniciante;

/*
 
 QUEST�O
 Prog e Cackto come�aram recentemente a jogar um jogo de RPG chamado Fortaleza. 
 Neste, para o jogador evoluir de n�vel o mesmo precisa derrotar monstros, nos 
 quais d� um valor de experi�ncia (XP) para o jogador.

 A produtora do jogo, Jogos Extremos, anunciou que na pr�xima semana ir� realizar 
 o primeiro evento XP no qual aumentar� a experi�ncia dos monstros em X vezes. 
 Como Prog e Cackto est�o em um n�vel muito alto no qual os monstros tem um 
 valor muito alto de pontos de experi�ncia, eles est�o tendo dificuldades de 
 calcular a quantidade de pontos de experi�ncia que os monstros ter�o durante 
 o evento. Voc� pode ajud�-los?
 
 ENTRADA
 Haver� diversos casos de teste. Cada caso de teste cont�m dois valores X (0 < X 
 <= 3) indicando o valor de aumento da EXP dos monstros e M (10 <= M <= 232-1) 
 indicando o valor de EXP do monstro. A entrada termina com os valores X == 0 e 
 M == 0, nos quais n�o devem ser processados.
 
 SA�DA
 Para cada caso, seu programa dever� mostrar um valor E, referente ao novo EXP do monstro.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2172 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	double M = sc.nextDouble();
    	double totalXP;
    	while(M != 0 && X != 0) {
    		totalXP = X * M;
    		System.out.println(String.format("%.0f", totalXP));
    		X = sc.nextInt();
    		M = sc.nextDouble();
    	}

		sc.close();
    }
	
}