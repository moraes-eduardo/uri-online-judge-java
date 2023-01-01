// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Crie uma vari�vel inteira;
 2. Crie uma vari�vel real de simples precis�o;
 3. Crie uma vari�vel que armazene um car�cter;
 4. Crie uma vari�vel que armazene uma frase de no m�ximo 50 caracteres;
 5. Leia todas as vari�veis na ordem da forma criada;
 6. Imprima todas as vari�veis como foram lidas;
 7. Imprima as vari�veis, separando-as por uma tabula��o (8 espa�os), na ordem que foram lidas;
 8. Imprima as vari�veis com exatos 10 espa�os.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem uma linha. A linha 
 tem uma vari�vel A que armazena um n�mero inteiro, uma vari�vel B que armazena um n�mero real, 
 uma vari�vel C com um car�cter e uma vari�vel D que armazena uma frase de no m�ximo 50 caracteres. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem tr�s linhas da 
 forma descrita nos itens 6, 7 e 8. Conforme mostra o exemplo de sa�da a seguir. Imprima os 
 valores de ponto flutuante com 6 casas decimais ap�s a v�rgula.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2761 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		float B = sc.nextFloat();
		char C = sc.next().charAt(0);
		String input = sc.nextLine();
		String[] sd = input.split("");
		String D = "";
		for (int i = 1; i < sd.length; i++) D += sd[i];
		System.out.printf("%d%.6f%c%s\n", A, B, C, D);
		System.out.printf("%d\t%.6f\t%c\t%s\n", A, B, C, D);
		System.out.printf("%10d%10.6f%10c%10s\n", A, B, C, D);

		sc.close();
	}
	
}