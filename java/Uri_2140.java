// package Iniciante;

/*
 
 QUEST�O
 Gilberto � um famoso vendedor de esfirras na regi�o. Por�m, apesar de 
 todos gostarem de suas esfirras, ele s� sabe dar o troco com duas notas, 
 ou seja, nem sempre � poss�vel receber o troco certo. Para facilitar a 
 vida de Gil, escreva um programa para ele que determine se � poss�vel ou 
 n�o devolver o troco exato utilizando duas notas.

 As notas dispon�veis s�o: 2, 5, 10, 20, 50 e 100.
 
 ENTRADA
 A entrada deve conter o valor inteiro N da compra realizada pelo cliente e, 
 em seguida, o valor inteiro M pago pelo cliente (N < M <= 104). A entrada 
 termina com N = M = 0.
 
 SA�DA
 Seu programa dever� imprimir "possible" se for poss�vel devolver o troco 
 exato ou "impossible" se n�o for poss�vel.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2140 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (true) {
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	int troco = M - N;
        	int[] notas = {2, 5, 10, 20, 50, 100};
        	boolean possivel = false;
        	
        	if (N == 0 && M == 0) break;
        	
    		for (int i = 0; i < 6; i++) {
    			for (int j = 0; j < 6; j++) {
    				if (troco - notas[j] == notas[i]) possivel = true;
    			}
    		}
    		
    		if (possivel) System.out.println("possible");
    		else System.out.println("impossible");
    	}

		sc.close();
    }
	
}