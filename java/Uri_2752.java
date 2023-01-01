// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria que voc� fizesse um programa com as seguintes caracter�sticas:

 1. Crie uma vari�vel para armazenar 50 caracteres;
 2. Atribua a vari�vel anterior a frase: "AMO FAZER EXERCICIO NO URI";
 3. Mostre na primeira linha o car�cter <, o valor armazenado na vari�vel com o formato "%s" e o car�cter >;
 4. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%30s" e o car�cter >;
 5. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%.20s" e o car�cter >;
 6. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%-20s" e o car�cter >;
 7. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%-30s" e o car�cter >;
 8. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%.30s" e o car�cter >;
 9. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%30.20s" e o car�cter >;
 10. Mostre na linha seguinte o car�cter < , o valor armazenado na vari�vel com o formato "%-30.20s" e o car�cter >;
 
 ENTRADA
 N�o h�.
 
 SA�DA
 O resultado de seu programa deve ser escrito conforme o exemplo da sa�da.

*/

import java.io.IOException;

public class Uri_2752 {
	
    public static void main(String[] args) throws IOException {
    	String A = "AMO FAZER EXERCICIO NO URI";
    	System.out.printf("<%s>\n", A);
    	System.out.printf("<%30s>\n", A);
    	System.out.printf("<%.20s>\n", A);
    	System.out.printf("<%-20s>\n", A);
    	System.out.printf("<%-30s>\n", A);
    	System.out.printf("<%.30s>\n", A);
    	System.out.printf("<%30.20s>\n", A);
    	System.out.printf("<%-30.20s>\n", A);
    }
	
}