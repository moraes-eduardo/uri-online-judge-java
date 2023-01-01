// package Iniciante;

/*
 
 QUEST�O
 Neste problema voc� deve ler um n�mero, indicando uma linha da matriz na 
 qual uma opera��o deve ser realizada, um caractere mai�sculo, indicando a 
 opera��o que ser� realizada, e todos os elementos de uma matriz M[12][12]. 
 Em seguida, calcule e mostre a soma ou a m�dia dos elementos que est�o na 
 �rea verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso 
 da entrada do valor 2 para a linha da matriz, demonstrando os elementos que 
 dever�o ser considerados na opera��o.
 
 ENTRADA
 A primeira linha de entrada contem um n�mero L (0 <= L <= 11) indicando a linha 
 que ser� considerada para opera��o. A segunda linha de entrada cont�m um �nico 
 caractere Mai�sculo T ('S' ou 'M'), indicando a opera��o (Soma ou M�dia) que 
 dever� ser realizada com os elementos da matriz. Seguem os 144 valores de ponto 
 flutuante que comp�em a matriz, sendo que a mesma � preenchida linha por linha, 
 da linha 0 at� a linha 11, sempre da esquerda para a direita.
 
 SA�DA
 Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal.


*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1181 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        double soma = 0;
        char T = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		M[i][j] = sc.nextDouble();
        	}
        }
        
    	for(int j = 0; j < M.length; j++) {
    		soma += M[L][j];
    	}

        if (T == 'M') soma /= M.length;   
    	System.out.println(String.format("%.1f", soma));

        sc.close();
    }
	
}