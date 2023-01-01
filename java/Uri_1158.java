// package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro N que � a quantidade de casos de teste que vem a seguir. Cada 
 caso de teste consiste de dois inteiros X e Y. Voc� deve apresentar a soma de Y �mpares 
 consecutivos a partir de X inclusive o pr�prio X se ele for �mpar. Por exemplo:
 para a entrada 4 5, a sa�da deve ser 45, que � equivalente �: 5 + 7 + 9 + 11 + 13
 para a entrada 7 4, a sa�da deve ser 40, que � equivalente �: 7 + 9 + 11 + 13
 
 ENTRADA
 A primeira linha de entrada � um inteiro N que � a quantidade de casos de teste que vem 
 a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
 
 SA�DA
 Imprima a soma dos consecutivos n�meros �mpares a partir do valor X.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1158 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X, Y;
        int soma=0, cont=0;
        for (int i = 0; i < N; i++) {
        	cont = 0;
        	soma = 0;
        	X = sc.nextInt();
        	Y = sc.nextInt();
        	while (cont < Y) {
        		if (X % 2 != 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        }

		sc.close();
    }
	
}