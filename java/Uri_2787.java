// package Iniciante;

/*
 
 QUEST�O
 No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo) 
 � sempre branca e as cores das casas se alternam entre branca e preta, de 
 acordo com o padr�o conhecido como... xadrez! Dessa forma, como o tabuleiro 
 tradicional tem oito linhas e oito colunas, a casa na linha 8, coluna 8 
 (canto inferior direito) ser� tamb�m branca. Neste problema, entretanto, 
 queremos saber a cor da casa no canto inferior direito de um tabuleiro com 
 dimens�es quaisquer: L linhas e C colunas. No exemplo da figura, para L = 6 
 e C = 9, a casa no canto inferior direito ser� preta!
 
 ENTRADA
 A primeira linha da entrada cont�m um inteiro L (1 <= L <= 1000) indicando o 
 n�mero de linhas do tabuleiro. A segunda linha da entrada cont�m um inteiro 
 C (1 <= C <= 1000) representando o n�mero de colunas.
 
 SA�DA
 Imprima uma linha na sa�da. A linha deve conter um inteiro, representando a 
 cor da casa no canto inferior direito do tabuleiro: 1, se for branca; e 0, se for preta.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2787 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int C = sc.nextInt();
        if (L % 2 == C % 2) 
        	System.out.println(1);
        else
        	System.out.println(0);
        
        sc.close();
    }
	
}