// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia um vetor N[20]. Troque a seguir, o primeiro 
 elemento com o �ltimo, o segundo elemento com o pen�ltimo, etc., at� 
 trocar o 10� com o 11�. Mostre o vetor modificado.
 
 ENTRADA
 A entrada cont�m 20 valores inteiros, positivos ou negativos.
 
 SA�DA
 Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do 
 vetor e Y � o valor armazenado naquela posi��o.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1175 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int aux;
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }

        sc.close();
    }
	
}