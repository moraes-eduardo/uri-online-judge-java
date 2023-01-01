// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria de fazer uma tela com as seguintes caracter�sticas:

 1. Ter 39 tra�os (-) na primeira linha;
 2. Ter uma | embaixo do primeiro tra�o e do trig�simo nono tra�o da primeira linha, preencher 
    no meio com espa�o em branco;
 3. Repita o procedimento 2 mais quatro vezes;
 4. Repita o procedimento 1.
 
 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 tra�os)
 |                                     |
 |                                     |
 |                                     |
 |                                     |
 |                                     |
 --------------------------------------- (39 tra�os)
 
 ENTRADA
 N�o h�.
 
 SA�DA
 A sa�da ser� impresso conforme a figura acima.

*/

import java.io.IOException;

public class Uri_2747 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        	for (int j = 1; j <= 39; j++) {
        		if (i == 1 || i == 7)
        			System.out.print("-");
        		else if (j == 1 || j == 39)
        			System.out.print("|");
        		else 
        			System.out.print(" ");
        	}
        	System.out.print("\n");
        }
    }
	
}