// package Iniciante;

/*
 
 QUEST�O
 Papai Noel est� brincando com seus duendes para entret�-los durante a 
 v�spera do Natal. A brincadeira consiste nos elfos escreverem n�meros 
 em peda�os de papel e colocarem no gorro do Papai Noel. Ap�s todos 
 terminarem de colocar os n�meros Noel sorteia um papel e aquele n�mero 
 representa quantos "Ho" o Noel deve falar.

 Seu trabalho � ajudar o Papai Noel montando um problema que mostre 
 todos os "Ho" que ele deve falar dado o n�mero sorteado.
 
 ENTRADA
 A entrada � composta por um �nico inteiro N (0 < N <= 106) representando 
 quantos "Ho" ser�o falados por Noel.

 SA�DA
 A sa�da � composta por todos "Ho" que Papai Noel deve falar separados por um 
 espa�o. Ap�s o �ltimo "Ho" deve ser apresentado um "!" encerrando o programa.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1759 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
        	if (i == N) System.out.println("Ho!");
        	else System.out.print("Ho ");
        }

        sc.close();
    }
	
}