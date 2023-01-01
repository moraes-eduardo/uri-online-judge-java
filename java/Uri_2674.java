// package Iniciante;

/*
 
 QUEST�O
 A Associa��o dos Primos Indivis�veis elegeu uma categoria de n�meros primos 
 chamados de Super Primos. Um n�mero � considerado super primo se al�m de 
 ser primo, todos os seus d�gitos s�o primos, tamb�m. A Associa��o lhe 
 solicitou que fizesse um programa para caracterizar os n�meros.
 
 ENTRADA
 A entrada cont�m v�rios casos de testes, cada caso de teste � um n�mero 
 inteiro N (0 < N < 105) em uma linha �nica. A entrada termina no �ltimo 
 caso de teste.
 
 SA�DA
 Para cada caso de teste espera-se, em um linha �nica, a classifica��o do 
 n�mero da entrada, que pode ser: "Super", se o n�mero for Super Primo; 
 "Primo" se o n�mero por um n�mero primo apenas; ou "Nada" se o n�mero 
 possuir divisores al�m do 1 e ele mesmo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2674 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (isPrime(N)) {
            	if (isSuperPrime(N)) 
            		System.out.println("Super");
            	else
            		System.out.println("Primo");
            } else {
            	System.out.println("Nada");
            }
        }

		sc.close();
    }
    
    private static boolean isPrime(int n) {
    	if (n == 1 || n == 0) return false;
    	for (int i = 2; i < n; i++) 
    		if (n % i == 0) return false;
    	return true;
    }
    
    private static boolean isSuperPrime(int n) {
    	String number = String.valueOf(n);
    	for (int i = 0; i < number.length(); i++)
    		if (!isPrime(Integer.valueOf(String.valueOf(number.charAt(i)))))
    			return false;
    	return true;
    }
	
}