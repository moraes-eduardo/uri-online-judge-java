// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Crie duas vari�veis para armazenar n�meros reais de precis�o simples;
 2. Crie duas vari�veis para armazenar n�meros reais de precis�o dupla;
 3. Leia o primeiro n�mero de precis�o simples que sempre ter� uma casa decimal;
 4. Leia o segundo n�mero de precis�o simples que sempre ter� duas casas decimais;
 5. Leia o primeiro n�mero de precis�o dupla que sempre ter� tr�s casas decimais;
 6. Leia o segundo n�mero de precis�o dupla que sempre ter� quatro casas decimais;
 7. Imprima a letra A, um espa�o em branco, o sinal de igual, um espa�o em branco, o 
    n�mero armazenado na primeira vari�vel lida no passo 3, uma virgula, um espa�o em branco, 
    a letra B, um espa�o em branco, o sinal de igual, um espa�o em branco, o n�mero armazenado 
    na segunda vari�vel lida no passo 4. N�o esque�a de pular linha;
 8. Imprima a letra C, um espa�o em branco, o sinal de igual, um espa�o em branco, o n�mero 
    armazenado na primeira vari�vel lida no passo 5, uma virgula, um espa�o em branco, a letra 
    D, um espa�o em branco, o sinal de igual, um espa�o em branco, o n�mero armazenado na segunda 
    vari�vel lida no passo 6. N�o esque�a de pular linha;
 9. Repita o procedimento 7, imprimindo os n�meros com uma casa decimal;
 10. Repita o procedimento 8, imprimindo os n�meros com uma casa decimal;
 11. Repita o procedimento 7, imprimindo os n�meros com duas casas decimais;
 12. Repita o procedimento 8, imprimindo os n�meros com duas casas decimais;
 13. Repita o procedimento 7, imprimindo os n�meros com tr�s casas decimais;
 14. Repita o procedimento 8, imprimindo os n�meros com tr�s casas decimais;
 15. Repita o procedimento 7, imprimindo os n�meros com tr�s casas decimais e em forma de 
     nota��o cientifica com o car�cter E;
 16. Repita o procedimento 8, imprimindo os n�meros com tr�s casas decimais e em forma de 
     nota��o cientifica com o car�cter E;
 17. Repita o procedimento 7, imprimindo somente a parte inteira do n�mero;
 18. Repita o procedimento 8, imprimindo somente a parte inteira do n�mero.
 
 ENTRADA
 A entrada consiste em v�rios arquivos de teste. Em cada arquivo de teste tem duas linhas. 
 Na primeira linha tem dois n�meros reais A e B (-1000.0 <= A, B <= 1000.0), separados por 
 espa�o em branco. Na segunda linha tem dois n�meros reais C e D (-1000.0 <= C, D <= 1000.0), 
 separados por espa�o em branco. Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem doze 
 linhas da forma descrita no item 7 e 8. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2758 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("");
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		double C = sc.nextDouble();
		double D = sc.nextDouble();

		df = new DecimalFormat("0.000000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.00");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		df = new DecimalFormat("0.000E00");
		if (!df.format(A).contains("E-"))
			System.out.print("A = " + df.format(A).replace("E", "E+"));
		else
			System.out.print("A = " + df.format(A));
		if (!df.format(B).contains("E-"))
			System.out.println(", B = " + df.format(B).replace("E", "E+"));
		else
			System.out.println(", B = " + df.format(B));

		if (!df.format(C).contains("E-"))
			System.out.print("C = " + df.format(C).replace("E", "E+"));
		else
			System.out.print("C = " + df.format(C));
		if (!df.format(D).contains("E-"))
			System.out.println(", D = " + df.format(D).replace("E", "E+"));
		else
			System.out.println(", D = " + df.format(D));

		df = new DecimalFormat("0");
		System.out.println("A = " + df.format(A) + ", B = " + df.format(B));
		System.out.println("C = " + df.format(C) + ", D = " + df.format(D));

		sc.close();
	}
	
}