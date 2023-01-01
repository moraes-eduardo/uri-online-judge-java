// package Iniciante;

/*
 
 QUEST�O
 Alguns algoritmos de processamento de imagem exigem um pr�-processamento no 
 qual � necess�rio transformar uma imagem colorida em uma imagem em tons de 
 cinza. Esta convers�o pode ser realizada de diversas maneiras, dependendo 
 do resultado que se pretende obter.

 Para preservar a percep��o das cores b�sicas pelo olho humano, uma convers�o 
 apropriada seria tomar 30% da componente vermelha (R), 59% da componente 
 verde (G) e 11% da componente azul (B). Em termos matem�ticos,

						P = 0, 30R + 0, 59G + 0, 11B

 Outras abordagens poss�veis seriam determinar o valor de P atrav�s da m�dia 
 aritm�tica das tr�s componentes ou atribuir a P os valores da maior ou da 
 menor entre as tr�s componentes.

 Dadas as componentes RGB de um pixel da imagem colorida, determine o valor 
 do pixel P da imagem em tons de cinza correspondente, determinada a convers�o 
 a ser utilizada. Despreze a parte decimal do resultado, caso exista.
  
 ENTRADA
 A entrada em T (1 <= T <= 100) casos de teste, onde o valor de T � dado na 
 primeira linha da entrada. Cada caso de teste � composto por duas linhas: a 
 primeira linha cont�m a convers�o a ser utilizada: eye para a primeira 
 abordagem descrita, mean para a m�dia aritm�tica, max para o valor da maior 
 componente e min para o valor da menor componente. A segunda linha cont�m os 
 valores R, G, B (0 <= R, G, B <= 255) do pixel da imagem colorida.
 
 SA�DA
 Para cada caso de testes dever ser impressa a seguinte mensagem "Caso #t: P", 
 onde P � o n�vel de cinza do pixel da imagem em tons de cinza ap�s a 
 convers�o do pixel da imagem colorida. Esta mensagem deve ser seguida de uma 
 quebra de linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2630 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			String option = sc.next();
			int R = sc.nextInt();
			int G = sc.nextInt();
			int B = sc.nextInt();
			int answer;
			
			if (option.equalsIgnoreCase("mean")) answer = getMean(R, G, B);
			else if (option.equalsIgnoreCase("eye")) answer = getEye(R, G, B);
			else if (option.equalsIgnoreCase("min")) answer = getMin(R, G, B);
			else if (option.equalsIgnoreCase("max")) answer = getMax(R, G, B);
			else answer = -1;
			
			System.out.println(String.format("Caso #%d: %d", i, answer));
		}
	}
	
	private static int getMean(int a, int b, int c) {
		return (a + b + c) / 3;
	}
	
	private static int getEye(int a, int b, int c) {
		return (int) ((a * 0.30) + (0.59 * b) + (0.11 * c));
	}
	
	private static int getMin(int a, int b, int c) {
		if (a < b && a < c) return a;
		if (b < c) return b;
		else return c;
	}

	private static int getMax(int a, int b, int c) {
		if (a > b && a > c) return a;
		if (b > c) return b;
		else return c;
	}
	
}