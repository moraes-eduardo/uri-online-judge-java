// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Crie 3 vari�veis para armazenar um �nico car�cter;
 2. Leia um valor car�cter para a primeira vari�vel;
 3. Leia um valor car�cter para a segunda vari�vel;
 4. Leia um valor car�cter para a terceira vari�vel;
 5. Imprima a letra A, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na primeira vari�vel lida no passo 2, uma virgula, um espa�o 
    em branco, a letra B, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na segunda vari�vel lida no passo 3, a letra C, um espa�o em 
    branco, o sinal de igual, um espa�o em branco, o car�cter armazenado na terceira 
    vari�vel lida no passo 4. N�o esque�a de pular linha;
 6. Imprima a letra A, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na primeira vari�vel lida no passo 3, uma virgula, um espa�o 
    em branco, a letra B, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na segunda vari�vel lida no passo 4, a letra C, um espa�o em 
    branco, o sinal de igual, um espa�o em branco, o car�cter armazenado na terceira 
    vari�vel lida no passo 2. N�o esque�a de pular linha;
 7. Imprima a letra A, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na primeira vari�vel lida no passo 4, uma virgula, um espa�o 
    em branco, a letra B, um espa�o em branco, o sinal de igual, um espa�o em branco, 
    o car�cter armazenado na segunda vari�vel lida no passo 2, a letra C, um espa�o em 
    branco, o sinal de igual, um espa�o em branco, o car�cter armazenado na terceira 
    vari�vel lida no passo 3. N�o esque�a de pular linha.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem tr�s 
 linhas. Na primeira linha tem uma vari�vel A que armazena um valor car�cter. Na 
 segunda linha tem uma vari�vel B que armazena um valor car�cter. Na terceira linha 
 tem uma vari�vel C que armazena um valor car�cter. Conforme mostrado no exemplo 
 de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem tr�s 
 linhas da forma descrita nos itens 5, 6 e 7. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2759 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char A = sc.next().charAt(0);
		char B = sc.next().charAt(0);
		char C = sc.next().charAt(0);
		System.out.printf("A = %c, B = %c, C = %c\n", A, B, C);
		System.out.printf("A = %c, B = %c, C = %c\n", B, C, A);
		System.out.printf("A = %c, B = %c, C = %c\n", C, A, B);

      sc.close();
	}
	
}