// package Iniciante;

/*
 
 QUEST�O 
 Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
 Escreva para cada X e Y uma mensagem que indique se estes valores foram 
 digitados em ordem crescente ou decrescente.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. Cada caso cont�m dois valores 
 inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores 
 iguais para X e Y.
 
 SA�DA
 Para cada caso de teste imprima �Crescente�, caso os valores tenham sido 
 digitados na ordem crescente, caso contr�rio imprima a mensagem �Decrescente�.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1113 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	while (X != Y) {
    		if (X > Y) System.out.println("Decrescente");
    		else System.out.println("Crescente");
        	X = sc.nextInt();
        	Y = sc.nextInt();
    	}

		sc.close();
    }
	
}