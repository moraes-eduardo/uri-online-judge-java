// package Iniciante;

/*
 
 QUEST�O
 O seu professor de programa��o gostaria que voc� fizesse um programa com as seguintes caracter�sticas:

 1. Crie vinte e seis vari�veis inteira;
 2. Atribua a primeira vari�vel o valor 97;
 3. Atribua as outras demais vari�vel o valor da primeira somado de uma unidade;
 4. Mostre na tela os valores num�ricos da primeira vari�vel, um espa�o em braco, o car�cter 'e', outro 
 	espa�o em branco e o seu valor alfanum�rico (caracteres);
 5. Repita o procedimento para todas as outras vari�veis.
 
 ENTRADA
 N�o h�.
 
 SA�DA
 O resultado de seu programa deve ser o mesmo do exemplo de sa�da.

*/

import java.io.IOException;

public class Uri_2753 {
	
    public static void main(String[] args) throws IOException {
    	for (int i = 97; i < 97 + 26; i++) {
    		System.out.printf("%d e %c\n", i, i);
    	}
    }
	
}