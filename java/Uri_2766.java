// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia 10 nomes, sem espa�o em branco;
 2. Imprima o terceiro nome da lista;
 3. Imprima o s�timo nome da lista;
 4. Imprima o nono nome da lista.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem dez 
 linhas. Em cada linha tem um nome de no m�ximo 30 caracteres e sem espa�o em 
 branco. Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem tr�s 
 linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2766 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];
		for (int i = 0; i < 10; i++)
			nomes[i] = sc.next();
		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);

		sc.close();
	}
	
}