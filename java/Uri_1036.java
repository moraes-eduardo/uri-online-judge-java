// package Iniciante;

/*
 
 QUEST�O
 Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o 
 de Bhaskara. Se n�o for poss�vel calcular as ra�zes, mostre a mensagem 
 correspondente �Impossivel calcular�, caso haja uma divis�o por 0 ou raiz de 
 numero negativo.
 
 ENTRADA
 Leia tr�s valores de ponto flutuante (double) A, B e C.

 SA�DA
 Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem 
 "Impossivel calcular". Caso contr�rio, imprima o resultado das ra�zes com 5 
 d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo abaixo. 
 Imprima sempre o final de linha ap�s cada mensagem.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1036 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        if ((A == 0) | (B * B - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
			// return;
		}
        
        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));

        sc.close();
    }
	
}