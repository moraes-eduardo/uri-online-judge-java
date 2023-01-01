// package Iniciante;

/*
 
 QUEST�O
 As sequ�ncias de Iccanobif s�o sequ�ncias onde cada termo � sempre igual a 
 soma dos dois pr�ximos subsequentes a eles. Exceto pelos dois �ltimos termos 
 os quais s�o sempre iguais a 1.

 Exemplo de uma sequ�ncia de Iccanobif com 10 termos: 55, 34, 21, 13, 8, 5, 3, 2, 1, 1.

 Sua tarefa �, dado um valor inteiro, imprimir a sequ�ncia de Iccanobif de 
 tamanho correspondente.
 
 ENTRADA
 A entrada consiste de um �nico inteiro N (1 <= N <= 40) representando o 
 tamanho da sequ�ncia de Iccanobif desejada.
 
 SA�DA
 A sa�da consiste de um �nica linha contendo os termos da sequ�ncia de 
 Iccanobif de tamanho N separados por um �nico espa�o em branco.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2807 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ant = 1;
		int prox = 1;
		int atual = 0;
		int[] numbers = new int[N+10];
		numbers[0] = 1;
		numbers[1] = 1;
		for (int i = 2; i < N; i++) {
			atual = ant + prox;
			ant = prox;
			prox = atual;
			numbers[i] = atual;
		}
		sort(numbers, 0, numbers.length -1);
		for (int i = 0; i < N; i++) {
			if (i < N-1) System.out.print(numbers[i] + " ");
			else System.out.println(numbers[i]);
		}

		sc.close();
	}

	private static void sort(int[] v, int inicio, int fim) {
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
			sort(v, inicio, up - 1);

		if (fim > down && up + 1 != fim)
			sort(v, up + 1, fim);
	}
	
}