// package Iniciante;

/*
 
 QUEST�O
 Fa�a um algoritmo para ler um valor A e um valor N. Imprimir a soma de A 
 para cada i com os valores (0 <= i <= N-1). Enquanto N for negativo ou ZERO, 
 um novo N(apenas N) deve ser lido.
 
 ENTRADA
 A entrada cont�m somente valores inteiros, podendo ser positivos ou negativos. 
 Todos os valores est�o na mesma linha.
 
 SA�DA
 A sa�da cont�m apenas um valor inteiro.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1149 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int soma = 0;
        while (N <= 0) {
        	N = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
        	soma += A;
        	A++;
        }
        System.out.println(soma);

        sc.close();
    }
	
}