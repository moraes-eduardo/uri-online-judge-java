// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria que voc� fizesse um programa com as seguintes caracter�sticas:

 1. Crie duas vari�veis inteiras a e b e duas vari�veis reais de simples precis�o c e d;
 2. Atribua a vari�vel a o valor 15 e atribua a vari�vel b o valor de a dividido por 2;
 3. Atribua a vari�vel c o valor 15.456 e atribua a vari�vel d o valor de c dividido por 7;
 4. Mostre na primeira linha a frase: "Valores de b:";
 5. Mostre na linha seguinte a mesma quantidade de car�cter da frase "Valores de b:", s� que com tra�o (-);
 6. Mostre na linha seguinte a frase "1) b = ", e o valor da vari�vel b;
 7. Mostre na linha seguinte a frase "2) b = ", e o valor da vari�vel b usando 20 espa�o e justificado � direita;
 8. Mostre na linha seguinte a frase "3) b = ", e o valor da vari�vel b usando 20 espa�o preenchidos com 0;
 9. Mostre na linha seguinte a frase "4) b = ", e o valor da vari�vel b usando 20 espa�o e justificado � esquerda;
 10. Mostre na linha seguinte a frase "5) b = ", e o valor da vari�vel b seguido do car�cter '%';
 11. Pule uma linha;
 12. Mostre na linha seguinte a frase: "Valores de d:";
 13. Mostre na linha seguinte a mesma quantidade de car�cter da frase "Valores de d:", s� que com tra�o (-);
 14. Mostre na linha seguinte a frase "1) d = ", e o valor da vari�vel d;
 15. Mostre na linha seguinte a frase "2) d = ", e o valor da vari�vel d somente com sua parte inteira;
 16. Mostre na linha seguinte a frase "3) d = ", e o valor da vari�vel d com uma casa decimal;
 17. Mostre na linha seguinte a frase "4) d = ", e o valor da vari�vel d com duas casas decimais;
 18. Mostre na linha seguinte a frase "5) d = ", e o valor da vari�vel d com tr�s casas decimais;
 19. Mostre na linha seguinte a frase "6) d = ", e o valor da vari�vel d com tr�s casas decimais 
     e colocados em 20 espa�o;
 20. Mostre na linha seguinte a frase "7) d = ", e o valor da vari�vel d com tr�s casas decimais 
     e colocados em 20 espa�o com 0 nos espa�o em branco;
 21. Repita o procedimento 19 com justificativa � esquerda;
 22. Mostre na linha seguinte a frase "9) d = ", e o valor da vari�vel d com duas casas decimais 
     seguido do car�cter '%'.
 
 ENTRADA
 N�o h�.
 
 SA�DA
 O resultado de seu programa deve ser escrito conforme o exemplo de sa�da.

*/

import java.io.IOException;

public class Uri_2751 {
	
    public static void main(String[] args) throws IOException {
    	final int a = 15;
    	final int b = a / 2;
    	final float c = 15.456f;
    	final float d = c / 7;
    	System.out.print("Valores de b:");
    	print("Valores de b:");
    	System.out.printf("1) b = %d\n", b);
    	System.out.printf("2) b = %20d\n", b);
    	System.out.printf("3) b = %020d\n", b);
    	System.out.printf("4) b = %-20d\n", b);
    	System.out.printf("5) b = %d%%\n", b);
    	System.out.print("\nValores de d:");
    	print("Valores de d:");
    	System.out.printf("1) d = %f\n", d);
    	System.out.printf("2) d = %.0f\n", d);
    	System.out.printf("3) d = %.1f\n", d);
    	System.out.printf("4) d = %.2f\n", d);
    	System.out.printf("5) d = %.3f\n", d);
    	System.out.printf("6) d = %20.3f\n", d);
    	System.out.printf("7) d = %020.3f\n", d);
    	System.out.printf("8) d = %-20.3f\n", d);
    	System.out.printf("9) d = %.2f%%\n", d);
    }
    
    private static void print(String s) {
    	System.out.print("\n");
    	for (int i = 0; i < s.length(); i++)
    		System.out.print("-");
    	System.out.print("\n");
    }
	
}