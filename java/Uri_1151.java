// package Iniciante;

/*
 
 QUEST�O
 A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como 
 s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 primeiros, 
 � igual � soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro 
 N (N < 46) e mostre os N primeiros n�meros dessa s�rie.
 
 ENTRADA
 O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).

 SA�DA
 Os valores devem ser mostrados na mesma linha, separados por um espa�o 
 em branco. N�o deve haver espa�o ap�s o �ltimo valor.
     
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1151 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println(anterior);
        	else System.out.print(anterior + " ");
        	proximo = anterior + atual;
        	anterior = atual;
        	atual = proximo;
        }

        sc.close();
    }
	
}