// package Iniciante;

/*
 
 QUEST�O
 Est� chegando a grande final do Campeonato Nlogonense de Surf Aqu�tico, que 
 este ano ocorrer� na cidade de Bonita Horeleninha (BH)! Antes de viajar para 
 BH, voc� e seus N-1 amigos decidiram combinar algum dia para ir a uma 
 pizzaria, para relaxar e descontrair (e, naturalmente, comer!).

 Neste momento est� sendo escolhida a data do evento. Para que todas as 
 pessoas possam participar, foi decidido que o encontro na pizzaria ocorrer� 
 em um data tal que todas as N pessoas podem comparecer � pizzaria nesta data. 
 Portanto, nem toda data pode ser escolhida, pois algumas pessoas podem ter 
 outros compromissos j� marcados em alguns dias.

 Dada a lista de datas consideradas para o evento e a informa��es de quais 
 pessoas podem comparecer em quais datas, determine se o evento poder� ocorrer 
 e, em caso positivo, sua data. Caso mais de uma data seja poss�vel, o evento 
 deve ocorrer o mais cedo poss�vel.
  
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 os inteiros N e D (1 <= N, D <= 50), o n�mero de pessoas e o n�mero de datas 
 consideradas, respectivamente. As pessoas s�o numeradas de 1 a N. As pr�ximas 
 D linhas descrevem uma data considerada. Cada linha come�a com a data na 
 forma dia/mes/ano. A linha � seguida de N inteiros p1,p2,...,pN. O inteiro pi 
 � 1 se a pessoa i pode comparecer na data considerada, ou 0 caso contr�rio. � 
 garantido que as datas s�o sempre v�lidas, e n�o h� zeros � esquerda. Al�m 
 disso, as datas s�o dadas em ordem, do dia mais cedo para o dia mais tarde.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo a data que o evento deve 
 ocorrer, na forma dia/mes/ano, de maneira id�ntica � da entrada. Caso n�o seja 
 poss�vel realizar o evento, imprima �Pizza antes de FdI� (sem aspas).
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2554 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int D = sc.nextInt();
			String oficialDate = "Pizza antes de FdI";
			boolean swp = true;
			for (int i = 0; i < D; i++) {
				String date = sc.next();
				boolean bol = true;
				for (int j = 0; j < N; j++) {
					if (sc.nextInt() != 1)
						bol = false;
				}
				if (bol && swp) {
					swp = false;
					oficialDate = date;
				}
			}
			System.out.println(oficialDate.trim());
		}
	}
	
}