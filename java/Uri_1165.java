// package Iniciante;

/*
 
 QUEST�O
 Na matem�tica, um N�mero Primo � aquele que pode ser dividido somente por 1 
 (um) e por ele mesmo. Por exemplo, o n�mero 7 � primo, pois pode ser dividido 
 apenas pelo n�mero 1 e pelo n�mero 7.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha da entrada cont�m 
 um inteiro N (1 <= N <= 100), indicando o n�mero de casos de teste da entrada. 
 Cada uma das N linhas seguintes cont�m um valor inteiro X (1 < X <= 107), que 
 pode ser ou n�o, um n�mero primo.
 
 SA�DA
 Para cada caso de teste de entrada, imprima a mensagem �X eh primo� ou �X nao 
 eh primo�, de acordo com a especifica��o fornecida.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1165 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, cont;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	X = sc.nextInt();
        	for (int j = 2; j < X; j++) {
        		if (X % j == 0) cont++;
        	}
        	if (cont == 0) System.out.println(X + " eh primo");
        	else System.out.println(X + " nao eh primo");
        }

        sc.close();
    }
	
}