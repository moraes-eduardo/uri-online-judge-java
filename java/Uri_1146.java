// package Iniciante;

/*
 
 QUEST�O
 Este programa deve ler uma vari�vel inteira X in�meras vezes (deve parar 
 quando o valor no arquivo de entrada for igual a zero). Para cada valor 
 lido imprima a sequ�ncia de 1 at� X, com um espa�o entre cada n�mero e seu sucessor.
 
 Obs: cuide para n�o deixar espa�o em branco ap�s o �ltimo valor apresentado 
 na linha ou voc� receber� Presentation Error.
 
 ENTRADA
 O arquivo de entrada cont�m v�rios n�meros inteiros. O �ltimo n�mero no arquivo de entrada � 0.

 SA�DA
 Para cada n�mero N do arquivo de entrada deve ser impressa uma linha de 1 at� N, conforme o 
 exemplo abaixo. N�o deve haver espa�o em branco ap�s o �ltimo valor da linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1146 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        while (X != 0) {
        	for (int i = 1; i <= X; i++) {
        		if (i == X) System.out.print(i + "\n");
        		else System.out.print(i + " ");
        	}
        	X = sc.nextInt();
        }

        sc.close();
    }
	
}