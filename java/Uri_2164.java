// package Iniciante;

/*
 
 QUEST�O
 A f�rmula de Binet � uma forma de calcular n�meros de Fibonacci. http://prntscr.com/k4ies0

 Sua tarefa �, dado um natural n, calcular o valor de Fibonacci(n) usando a f�rmula acima.
 
 ENTRADA
 A entrada � um n�mero natural n (0 < n <= 50).

 SA�DA
 A sa�da � o valor de Fibonacci(n) com 1 casa decimal utilizando a f�rmula de Binet dada.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2164 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double N = sc.nextInt();
    	double fib = (Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5);
    	System.out.println(String.format("%.1f", fib));

		sc.close();
    }
	
}