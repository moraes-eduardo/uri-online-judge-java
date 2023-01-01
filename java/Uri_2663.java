// package Iniciante;

/*
 
 QUEST�O
 Em diversas competi��es acad�micas, como a Olimp�ada Brasileira de 
 Inform�tica (OBI), uma certa quantidade de competidores se classifica de 
 uma fase para a fase seguinte, garantindo uma das vagas dispon�veis. 
 Entretanto, normalmente essa quantidade � vari�vel, pois dada uma certa 
 quantidade m�nima de classificados, � frequente que haja empate na �ltima 
 vaga de classifica��o. Neste caso, � comum que todos os competidores 
 empatados na �ltima coloca��o se classifiquem.

 Sua tarefa � ajudar a calcular o n�mero de competidores classificados para 
 a pr�xima fase. Voc� receber� uma lista de pontua��es obtidas pelos 
 competidores e o n�mero m�nimo de vagas para a fase seguinte e voc� deve 
 decidir quantos competidores de fato v�o se classificar.
 
 ENTRADA
 A primeira linha da entrada cont�m um n�mero inteiro N, 1 <= N <= 1000, 
 representando o n�mero de competidores. A segunda linha conter� um 
 inteiro K, 1 <= K <= N, indicando o n�mero m�nimo de competidores que 
 devem se classificar para a pr�xima fase. Em seguida, N linhas conter�o, 
 cada uma um n�mero entre 1 e 1000, inclusive, correspondente � pontua��o de 
 um competidor.
 
 SA�DA
 Seu programa deve imprimir uma linha, contendo o n�mero de classificados 
 para a pr�xima fase.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2663 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] notas = new int[N];
        int classificados = K;
        for (int i = 0; i < N; i++) {
        	notas[i] = sc.nextInt();
        }
        sort(notas, 0, notas.length -1);
        for (int i = K-1; i < N; i++) {
        	if (i + 1 < notas.length && notas[i + 1] == notas[i]) classificados++;
        	else break;
        }
        System.out.println(classificados);

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