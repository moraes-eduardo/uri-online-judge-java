// package Strings;

/*

 QUEST�O
 Durante anos, todos os contratos da Associa��o de Contratos da Modernol�ndia (ACM) 
 foram datilografados em uma velha m�quina de datilografia.

 Recentemente Sr. Miranda, um dos contadores da ACM, percebeu que a m�quina apresentava 
 falha em um, e apenas um, dos d�gitos num�ricos. Mais especificamente, o d�gito falho, 
 quando datilografado, n�o � impresso na folha, como se a tecla correspondente n�o 
 tivesse sido pressionada. Ele percebeu que isso poderia ter alterado os valores num�ricos 
 representados nos contratos e, preocupado com a contabilidade, quer saber, a partir dos 
 valores originais negociados nos contratos, que ele mantinha em anota��es manuscritas, 
 quais os valores de fato representados nos contratos. Por exemplo, se a m�quina apresenta 
 falha no d�gito 5, o valor 1500 seria datilografado no contrato como 100, pois o 5 n�o 
 seria impresso. Note que o Sr. Miranda quer saber o valor num�rico representado no contrato, 
 ou seja, nessa mesma m�quina, o n�mero 5000 corresponde ao valor num�rico 0, e n�o 000 
 (como ele de fato aparece impresso).
 
 ENTRADA
 A entrada consiste de diversos casos de teste, cada um em uma linha. Cada linha cont�m 
 dois inteiros D e N (1 <= D <= 9, 1 <= N < 10100 ), representando, respectivamente, o d�gito 
 que est� apresentando problema na m�quina e o n�mero que foi negociado originalmente no 
 contrato (que podem ser grande, pois Modernol�ndia tem sido acometida por hiperinfla��o nas �ltimas d�cadas).

 O ultimo caso de teste � seguido por uma linha que cont�m apenas dois zeros separados por espa�os em branco.
 
 SA�DA
 Para cada caso de teste da entrada o seu programa deve imprimir uma linha contendo um �nico 
 inteiro V, o valor num�rico representado de fato no contrato.
 
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Uri_1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			BigInteger D = sc.nextBigInteger();
			BigInteger N = sc.nextBigInteger();
			if (D.equals(BigInteger.ZERO) && N.equals(N.ZERO)) {
				break;
			} else {
				String V = N.toString().replace(D.toString(), "");
				if (V.isEmpty())
					System.out.println(0);
				else 
					System.out.println(new BigInteger(V));
			}
		}

		sc.close();
	}

}