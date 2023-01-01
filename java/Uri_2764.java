// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia uma data no formato DD/MM/AA;
 2. Imprima a data no formato MM/DD/AA;
 3. Imprima a data no formato AA/MM/DD;
 4. Imprima a data no formato DD-MM-AA.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem uma linha. 
 A linha tem o seguinte formato DD/MM/AA onde DD, MM, AA s�o n�meros inteiros. 
 Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem tr�s 
 linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2764 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String STR = sc.next();
		String DD = STR.split("/")[0];
		String MM = STR.split("/")[1];
		String AA = STR.split("/")[2];
		System.out.printf("%s/%s/%s\n", MM, DD, AA);
		System.out.printf("%s/%s/%s\n", AA, MM, DD);
		System.out.printf("%s-%s-%s\n", DD, MM, AA);
	}
	
}