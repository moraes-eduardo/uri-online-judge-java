// package Iniciante;

/*
 
 QUEST�O
 Ramsay: "(...) voc� vence se conseguir adivinhar quem eu sou e por que estou 
 torturando voc�."

 Theon deve pensar r�pido e adivinhar quem � seu algoz! Entretanto, Ramsay j� 
 decidiu o que ele ir� fazer depois que Theon der sua resposta.

 Theon pode dizer que seu algoz � alguma dentre N pessoas. Considere que as 
 pessoas s�o numeradas de 1 a N. Se Theon responder que seu algoz � a pessoa i, 
 Ramsay ir� atingi-lo T vezes.

 Sua tarefa � ajudar Theon a determinar qual deve ser sua resposta de forma a 
 minimizar o n�mero de vezes que ele ser� atingido.
 
 ENTRADA
 A primeira linha cont�m um inteiro N (1 <= N <= 100). A segunda linha cont�m 
 N inteiros T1, T2, ..., TN (0 <= Ti <= 20).

 SA�DA
 Imprima uma linha contendo o n�mero da pessoa que Theon deve dizer ser seu algoz. 
 Se existe mais de uma resposta poss�vel, imprima a menor.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1858 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int i = 1; i <= N; i++) {
			T = sc.nextInt();
			if (i == 1) {
				posMenor = 1;
				menor = T;
			} else if (T < menor) {
				posMenor = i;
				menor = T;
			}
		}
		System.out.println(posMenor);

		sc.close();
    }
	
}