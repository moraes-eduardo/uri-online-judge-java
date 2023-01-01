// package Ad-Hoc;

/*

 QUEST�O
 Para dormir voc� resolveu contar carneirinhos. O sono est� demorando muito para vir e 
 voc� percebeu que alguns carneirinhos est�o se repetindo! Cada um deles � identificado 
 por um n�mero inteiro �nico, desta forma voc� vai evitar contar os repetidos.

 Dado a sequ�ncia dos carneirinhos, imprima quantos de verdade voc� contou, ou 
 seja, imprima o n�mero de carneirinhos distintos.
 
 ENTRADA
 Na primeira linha voc� ter� um inteiro T (T = 100*) indicando o n�mero de casos de teste.

 Na primeira linha de cada caso teremos o n�mero inteiro N (1 <= N <= 100* ou 1 <= N <= 104**), 
 indicando o n�mero de carneirinhos. Na pr�xima linha teremos N inteiros separados por 
 espa�o indicando a sequ�ncia de carneirinhos.

 Os identificadores dos carneiros ir�o de 0 at� 109, inclusive.

 *Ocorre em aproximadamente 90% dos casos de teste;

 **Ocorre nos demais casos de teste.
 
 SA�DA
 Imprima o n�mero de carneirinhos distintos para cada caso.

*/

import java.util.HashSet;
import java.util.Scanner;

public class Uri_1609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			HashSet<Integer> numeros = new HashSet<>();
			for (int j = 0; j < N; j++) {
				numeros.add(sc.nextInt());
			}
			System.out.println(numeros.size());
		}

		sc.close();
    }

}