// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Crie 3 vari�veis para armazenar uma frase de no m�ximo 100 caracteres;
 2. Leia uma frase para a primeira vari�vel;
 3. Leia uma frase para a segunda vari�vel;
 4. Leia uma frase para a terceira vari�vel;
 5. Imprima a primeira vari�vel lida no passo 2, a segunda vari�vel lida no passo 3, 
    a terceira vari�vel lida no passo 4. N�o esque�a de pular linha;
 6. Imprima a primeira vari�vel lida no passo 3, a segunda vari�vel lida no passo 4, 
    a terceira vari�vel lida no passo 2. N�o esque�a de pular linha;
 7. Imprima a primeira vari�vel lida no passo 4, a segunda vari�vel lida no passo 2, 
    a terceira vari�vel lida no passo 3. N�o esque�a de pular linha;
 8. Repita o procedimento 5, imprimindo s� 10 caracteres de cada vari�vel.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem tr�s linhas. 
 Na primeira linha tem uma vari�vel A que armazena uma frase de no m�ximo 40 caracteres. 
 Na segunda linha tem uma vari�vel B que armazena uma frase de no m�ximo 40 caracteres. 
 Na terceira linha tem uma vari�vel C que armazena uma frase de no m�ximo 40 caracteres. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem quatro 
 linhas da forma descrita nos itens 5, 6, 7 e 8. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2760 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		String C = sc.nextLine();
		System.out.printf("%s%s%s\n", A, B, C);
		System.out.printf("%s%s%s\n", B, C, A);
		System.out.printf("%s%s%s\n", C, A, B);
		System.out.printf("%.10s%.10s%.10s\n", A, B, C);
	}
	
}