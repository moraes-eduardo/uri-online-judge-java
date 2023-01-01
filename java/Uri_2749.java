// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria de fazer uma tela com as seguintes caracter�sticas:

 1. Ter 39 tra�os (-) na primeira linha;
 2. Ter uma | embaixo do primeiro tra�o e do trig�simo nono tra�o da primeira linha, embaixo do 2o tra�o deve come�ar a escrever "x = 35" e o restante preencher com espa�o em branco;
 3. Ter uma | embaixo do primeiro tra�o e do trig�simo nono tra�o da primeira linha, preencher no meio com espa�o em branco;
 4. Ter uma | embaixo do primeiro tra�o e do trig�simo nono tra�o da primeira linha, embaixo do 17o tra�o deve come�ar a escrever "x = 35" e o restante preencher com espa�o em branco;
 5. Repita o procedimento 3;
 6. Ter uma | embaixo do primeiro tra�o e do trig�simo nono tra�o da primeira linha, embaixo do 33o tra�o deve come�ar a escrever "x = 35" e o restante preencher no meio com espa�o em branco;
 7. Repita o procedimento 1.

 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 tra�os)
 |x = 35                               |
 |                                     |
 |               x = 35                |
 |                                     |
 |                               x = 35|
 --------------------------------------- (39 tra�os)
 
 ENTRADA
 N�o h�.
 
 SA�DA
 A sa�da ser� impresso conforme a figura acima.

*/

import java.io.IOException;

public class Uri_2749 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 7; i++) {
        	for (int j = 1; j <= 39; j++) {
        		
        		if (i == 1 || i == 7)
        			System.out.print("-");
        		
        		else if (j == 1 || j == 39)
        			System.out.print("|");
        		
        		else if (i == 2) {
        			if (j == 2)
        				System.out.print("x = 35");
        			else if (j > 7)
        				System.out.print(" ");
        		}
        		
        		else if (i == 4) {
        			if (j == 17) 
        				System.out.print("x = 35");
        			else if (j < 17 || j > 22)
        				System.out.print(" ");
        		}
        		
        		else if (i == 6) {
        			if (j == 33)
        				System.out.print("x = 35");
        			else if (j < 33)
        				System.out.print(" ");
        		}
        		
        		else 
        			System.out.print(" ");
        		
        	}
        	System.out.print("\n");
        }
    }
	
}