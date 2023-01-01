// package Iniciante;

/*
 
 QUEST�O
 P�ricles � um rapaz que tem um interesse �nico por hist�ria. Utilizando 
 seu atualizad�ssimo navegador de internet rapoza cromada, conheceu at� 
 os sitios mais remotos e obscuros atr�s de informa��es sobre a mitologia grega.

 Por ironia do destino, o navegador de P�ricles acabou sendo infectado 
 por um malware com uma caracter�sica peculiar: cada vez que P�ricles 
 fechava uma aba no seu navegador, outras duas abas apareciam! No entanto, 
 quando P�ricles clicou sem querer em uma das propagandas de uma aba, 
 percebeu que, por um erro do navegador, a aba foi encerrada (sem abrir outras 
 abas). Por causa do malware, todas as abas possuem irritantes propagandas.

 Sua tarefa � descobrir com quantas abas que o navegador de P�ricles ficou, 
 sabendo o n�mero inicial de abas e a sequ�ncia de a��es de P�ricles. As 
 a��es podem ser fechou (quando P�ricles fechou uma aba) ou clicou (quando 
 P�ricles clicou em uma propaganda).
 
 ENTRADA
 A entrada � iniciada por uma linha contendo dois n�meros inteiros positivos, 
 N e M (0 < N, M < 500), representando o n�mero inicial de abas e o n�mero de 
 a��es de P�ricles. Cada linha subsequente cont�m uma a��o (fechou ou clicou). 
 Naturalmente, o n�mero de abas � sempre maior ou igual a zero.
 
 SA�DA
 A sa�da deve ser uma linha contendo o n�mero final de abas.


*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2061 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	String acao;
    	for (int i = 0; i < M; i++) {
    		acao = sc.next();
    		if (acao.equalsIgnoreCase("fechou")) N++;
    		else N--;
    	}
    	System.out.println(N);

		sc.close();
    }
	
}