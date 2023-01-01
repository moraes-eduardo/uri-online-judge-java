// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria que voc� fizesse um programa com as seguintes caracter�sticas:

 1. Criar 16 vari�veis inteiras;
 2. Atribuir a elas valores de 0 a 15 a cada um das vari�veis anteriores;
 3. Ter 39 tra�os (-) na primeira linha;
 4. Ter uma | embaixo do primeiro tra�o, d�cimo terceiro, vig�simo terceiro e do trig�simo nono tra�o 
    da primeira linha, embaixo do 4o tra�o deve come�ar a escrever �decimal�, embaixo do 16o tra�o deve 
    come�ar a escrever �octal�, embaixo do 26o tra�o deve come�ar a escrever �Hexadecimal� e o restante 
    preencher com espa�o em branco;
 5. Repita o procedimento 1;
 6. Ter uma | embaixo do primeiro tra�o, d�cimo terceiro, vig�simo terceiro e do trig�simo nono tra�o da 
    primeira linha, embaixo do 8o tra�o deve imprimir o valor da primeira vari�vel em valor decimal, embaixo 
    do 18o tra�o deve imprimir o valor da primeira vari�vel em valor octal, embaixo do 31o tra�o deve 
    imprimir o valor da primeira vari�vel em valor hexadecimal e o restante preencher com espa�o em branco;
 7. Repita o procedimento 6 para as outras 15 vari�veis;
 8. Repita o procedimento 1.

 No final deve ficar igual a imagem a seguir:

 --------------------------------------- (39 tra�os)
 | decimal   |  octal  |  Hexadecimal  |
 ---------------------------------------
 |      0    |    0    |       0       |
 |      1    |    1    |       1       |
 |      2    |    2    |       2       |
 |      3    |    3    |       3       |
 |      4    |    4    |       4       |
 |      5    |    5    |       5       |
 |      6    |    6    |       6       |
 |      7    |    7    |       7       |
 |      8    |   10    |       8       |
 |      9    |   11    |       9       |
 |     10    |   12    |       A       |
 |     11    |   13    |       B       |
 |     12    |   14    |       C       |
 |     13    |   15    |       D       |
 |     14    |   16    |       E       |
 |     15    |   17    |       F       |
 --------------------------------------- (39 tra�os)

 ENTRADA
 N�o h�.
 
 SA�DA
 A sa�da ser� impressa conforme a figura acima.

*/

import java.io.IOException;

public class Uri_2750 {
	
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 20; i++) {
        	for (int j = 1; j <= 39; j++) {
        		
        		if (i == 1 || i == 20 || i == 3)
        			System.out.print("-");
        		
        		else if (j == 1  || j == 13 || j == 23 || j == 39)
        			System.out.print("|");
        		
        		else if (i == 2) {
        			if (j == 4)
        				System.out.print("decimal");
        			else if (j == 16)
        				System.out.print("octal");
        			else if (j == 26)
        				System.out.print("Hexadecimal");
        			else if (j < 4 || j > 36 || (j > 10 && j < 18) || (j > 21 && j <26))
        				System.out.print(" ");
        		}
        		
        		else {
        			if (j == 8)
        				System.out.print(Integer.toString(i - 4));
        			else if (j == 18)
        				System.out.print(Integer.toOctalString(i - 4));
        			else if (j == 31)
        				System.out.print(Integer.toHexString(i - 4).toUpperCase());
        			else if (!(i > 11 && j == 14) && !(i > 13 && j == 2))
        				System.out.print(" ");
        		}
        		
        	}
        	System.out.print("\n");
        }
    }
	
}