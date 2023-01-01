// package Iniciante;

/*
 
 QUEST�O
 Schoenfeld e Rosser publicaram em 1962 um artigo descrevendo um valor 
 m�nimo e m�ximo para a quantidade de n�meros primos at� n, para n >= 17. 
 Esta quantidade � representada pela fun��o (n) e a f�rmula � mostrada abaixo.
 
 Sua tarefa �, dado um natural n, calcular o m�nimo e m�ximo do intervalo 
 para o n�mero aproximado de primos at� n.
 
 ENTRADA
 A entrada � um n�mero natural n (17 <= n <= 109).

 SA�DA
 A sa�da s�o dois valores P e M com 1 casa decimal cada, tal que P < (n) < M, 
 de acordo com a f�rmula dada acima. Os valores devem ser separados por um 
 espa�o em branco.
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2159 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	long n = sc.nextLong();
    	double P = n / Math.log(n);
    	double M = 1.25506 * (n / Math.log(n));
    	System.out.println(df.format(P) + " " + df.format(M));

		sc.close();
    }
	
}
