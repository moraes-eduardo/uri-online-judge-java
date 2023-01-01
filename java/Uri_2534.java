// package Iniciante;

/*
 
 QUEST�O
 Todo ano bissexto � realizado o exame geral de matem�tica da Nlog�nia. 
 Todos os cidad�es da na��o s�o avaliados a fim de se estudar o 
 desenvolvimento l�gico e matem�tico do pa�s ao longo dos anos.

 Ap�s as corre��es, os cidad�es s�o ordenadados de acordo com suas notas 
 (quanto maior, melhor) e recebem descontos no imposto de renda de acordo 
 com sua qualifica��o.

 O Escrit�rio Central de Estat�stica (ECE) � encarregado de processar os 
 dados das notas obtidas no exame. Entretanto este ano, Vasya, um dos 
 respons�veis, est� internado no hospital com gripe H1N1 e voc� foi contratado 
 para realizar o seu trabalho.
 
 Escreva um programa que dado o n�mero de habitantes da Nlog�nia e todas as 
 notas obtidas, responda as consultas para retornar a nota do cidad�o que 
 ficou em determinada posi��o.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada caso cont�m 
 dois inteiros N (1 <= N <= 100), Q (1 <= Q <= 100), o n�mero de habitantes 
 do pa�s e o n�mero de consultas, respectivamente.

 As N linhas seguintes cont�m, cada uma, a nota ni obtida pelo i-�simo cidad�o 
 (0 <= ni <= 30000).

 As pr�ximas Q linhas cont�m cada uma uma consulta, a posi��o pi 
 (1 <= pi <= N) a qual a ECE est� interessada em saber a nota.

 A entrada termina com fim-de-arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima, para cada consulta, uma linha contendo a 
 nota do cidad�o que ficou classificado na posi��o pi.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2534 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] notas = new int[N];
			for (int i = 0; i < N; i++) {
				notas[i] = sc.nextInt();
			}
			quickSort(notas, 0, notas.length-1);
			for (int i = 0; i < Q; i++) {
				int consulta = notas[sc.nextInt()-1];
				System.out.println(consulta);
			}
		}
	}

	private static void quickSort(int[] v, int inicio, int fim) {
		int aux, down, up, pivo, i;
		pivo = v[inicio];
		down = inicio;
		up = fim;
		while (down < up) {
			while (v[down] >= pivo && down < fim)
				down++;
			while (v[up] < pivo && up > inicio)
				up--;
			if (down < up) {
				aux = v[down];
				v[down] = v[up];
				v[up] = aux;
			}
		}
		
		v[inicio] = v[up];
		v[up] = pivo;

		if (inicio < up && inicio != up - 1)
			quickSort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			quickSort(v, up + 1, fim);
	}
	
}