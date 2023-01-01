// package Iniciante;

/*
 
 QUEST�O
 Preencher formul�rios � uma tarefa simples. Mas � preciso conferir se o 
 espa�o reservado para os dados � suficiente.

 Sua tarefa �, dada uma linha de texto, indicar se ele cabe ou n�o cabe em 
 um formul�rio com 80 caracteres.
 
 ENTRADA
 A entrada � uma linha de texto L (1 <= |L| <= 500).

 SA�DA
 A sa�da � dada em uma �nica linha. Ela deve ser "YES" (sem as aspas) se a 
 linha de texto L tem at� 80 caracteres. Se L tem mais de 80 caracteres, a 
 sa�da deve ser "NO".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2160 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String nome = sc.nextLine();
    	System.out.println(nome.length() > 80 ? "NO" : "YES");

		sc.close();
    }
	
}