// package Iniciante;

/*
 
 QUEST�O
 Na matem�tica, um n�mero perfeito � um n�mero inteiro para o qual a soma de 
 todos os seus divisores positivos pr�prios (excluindo ele mesmo) � igual 
 ao pr�prio n�mero. Por exemplo o n�mero 6 � perfeito, pois 1+2+3 � igual a 6. 
 Sua tarefa � escrever um programa que imprima se um determinado n�mero � perfeito ou n�o.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha da entrada cont�m um inteiro 
 N (1 <= N <= 20), indicando o n�mero de casos de teste da entrada. Cada uma das N linhas 
 seguintes cont�m um valor inteiro X (1 <= X <= 108), que pode ser ou n�o, um n�mero perfeito.
 
 SA�DA
 Para cada caso de teste de entrada, imprima a mensagem �X eh perfeito� ou �X nao eh perfeito�, 
 de acordo com a especifica��o fornecida.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1164 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, soma;
        for (int i = 0; i < N; i++) {
        	soma = 0;
        	X = sc.nextInt();
        	for (int j = 1; j < X; j++) {
        		if (X % j == 0) soma += j;
        	}
        	if (soma == X) System.out.println(X + " eh perfeito");
        	else System.out.println(X + " nao eh perfeito");
        }

        sc.close();
    }
	
}