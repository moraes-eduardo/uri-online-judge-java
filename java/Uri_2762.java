// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia um n�mero no formato: XXXXX.YYY;
 2. Imprima o n�mero na forma invertida: YYY.XXXXX.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem uma 
 linha. A linha tem um n�mero real com 3 casas decimais. Conforme mostrado no 
 exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem 
 uma linha da forma descrita nos itens 2. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2762 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String STR = sc.next();
		int A = Integer.valueOf(STR.split("\\.")[0]);
		int B = Integer.valueOf(STR.split("\\.")[1]);
		System.out.printf("%d.%d\n", B, A);
	}
	
}