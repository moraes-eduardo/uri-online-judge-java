// package Matem�tica;

/*

 QUEST�O
 Carl � agora a crian�a mais feliz do mundo: ele aprendeu esta manh� o que � o 
 sistema bin�rio. Ele aprendeu, por exemplo, que a representa��o bin�ria de um 
 inteiro positivo k �  uma string anan-1 � � � a1a0 onde cada ai � um d�gito 
 bin�rio 0 ou 1, iniciando com an = 1, e de tal forma que k = Eni=0 ai � 2i. � 
 realmente bom ver ele transformando n�meros decimais em bin�rios, e depois 
 som�-los e multiplic�-los.

 C�sar � o irm�o mais velho de Cal, e ele n�o suporta ver o seu irm�o menor t�o 
 feliz. Por isso ele preparou um desafio: "Olhe Carl, eu tenho uma pergunta f�cil 
 para voc�: eu te darei dois inteiros A e B, e voc� tem que me dize quantos 
 d�gitos 1 existem na representa��o bin�ria de todos os inteiros de A � B, 
 inclusive. Se prepare!". Carl aceitou o desafio.

 Ap�s alguns minutos, ele voltou com uma lista com a representa��o bin�ria de 
 todos os inteiros de 1 a 100. "C�sar, eu estou pronto". C�sar sorriu e disse: 
 "Bom, deixe-me ver, eu escolho A = 1015 e B = 1016. A sua lista n�o ser� �til". 

 Carl odeia perder para o seu irm�o ent�o ele precisa de uma solu��o mais r�pida. 
 Voc� pode ajud�-lo?
 
 ENTRADA
 A entrada � composta por diversos casos de teste e termina com EOF. Cada caso 
 de teste consiste de uma linha com dois inteiros A e B (1 <= A <= B <= 1016).
 
 SA�DA
 Para cada caso de teste, imprima uma linha contendo um inteiro que representa o n�mero 
 total de d�gitos 1 na representa��o bin�ria de todos os inteiros de A to B, inclusive.
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Uri_1492 {

	public static long[][][] dp = new long[60][60][2];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			a--;

			memset(dp, -1);
			long ans = go(b, 55, 0, true);
			memset(dp, -1);
			
			ans -= go(a, 55, 0, true);
			System.out.println(ans);
		}

		sc.close();
	}
	
	public static long go(long n, int i, int acc, boolean top) {
		if (i == -1)
			return acc;

		if (dp[i][acc][top ? 1 : 0] != -1)
			return dp[i][acc][top ? 1 : 0];

		long ans = go(n, i - 1, acc, !(((n >> i) & 1L) != 0) && top);
		if (!top || ((n >> i) & 1) != 0)
			ans += go(n, i - 1, acc + 1, ((n >> i) & 1L) != 0 && top);

		return dp[i][acc][top ? 1 : 0] = ans;
	}
	
	public static void memset(long[][][] array, int value) {
		for (long[][] dps1 : array) {
			for (long[] dps2 : dps1) {
				Arrays.fill(dps2, -1);
			}
		}
	}

}