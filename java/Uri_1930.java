// package Iniciante;

/*
 
 QUEST�O
 Finalmente, o time da Universidade conseguiu a classifica��o para a Final 
 Nacional da Maratona de Programa��o da SBC. Os tr�s membros do time e o 
 t�cnico est�o ansiosos para bem representar a Universidade, e al�m de 
 treinar muito, preparam com todos os detalhes a sua viagem a S�o Paulo, 
 onde ser� realizada a Final Nacional.

 Eles planejam levar na viagem todos os seus v�rios equipamentos 
 eletr�nicos: celular, tablet, notebook, ponto de acesso wifi, c�meras, 
 etc, e sabem que necessitar�o de v�rias tomadas de energia para conectar 
 todos esses equipamentos. Eles foram informados de que ficar�o os quatro 
 no mesmo quarto de hotel, mas j� foram alertados de que em cada quarto 
 h� apenas uma tomada de energia dispon�vel.

 Precavidos, os tr�s membros do time e o t�cnico compraram cada um uma 
 r�gua de tomadas, permitindo assim ligar v�rios aparelhos na �nica 
 tomada do quarto de hotel; eles tamb�m podem ligar uma r�gua em outra 
 para aumentar ainda mais o n�mero de tomadas dispon�veis. No entanto, 
 como as r�guas t�m muitas tomadas, eles pediram para voc� escrever um 
 programa que, dado o n�mero de tomadas em cada r�gua, determine o n�mero 
 m�ximo de aparelhos que podem ser conectados � energia num mesmo instante.
 
 ENTRADA
 A entrada consiste de uma linha com quatro n�meros inteiros T1, T2, T3, T4, 
 indicando o n�mero de tomadas de cada uma das quatro r�guas (2 <= Ti <= 6).
 
 SA�DA
 Seu programa deve produzir uma �nica linha contendo um �nico n�mero inteiro, 
 indicando o n�mero m�ximo de aparelhos que podem ser conectados � energia num 
 mesmo instante.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1930 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T1 = sc.nextInt();
		int T2 = sc.nextInt();
		int T3 = sc.nextInt();
		int T4 = sc.nextInt();
		int totalTomadas = (T1 + T2 + T3 + T4) - 3;
		System.out.println(totalTomadas);

		sc.close();
    }
	
}