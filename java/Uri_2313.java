// package Iniciante;

/*
 
 QUEST�O
 Dados tr�s valores, verifique se os tr�s podem formar um tri�ngulo. Em caso 
 afirmativo, verifique se ele � escaleno, is�celes ou equil�tero e se trata-se 
 de um tri�ngulo ret�ngulo ou n�o.
 
 ENTRADA
 A entrada consiste em tr�s n�meros inteiros A,B e C (0 < A,B,C < 10^5).


 S�IDA
 A sa�da deve conter a string "Invalido" se os valores lidos n�o formarem um 
 tri�ngulo. Se os valores formarem um tri�ngulo a sa�da deve ser "Valido-Equilatero", 
 "Valido-Escaleno" ou "Valido-Isoceles" de acordo com a caracter�stica do tri�ngulo 
 seguido de "Retangulo: S" se o tri�ngulo for ret�ngulo ou "Retangulo: N" se n�o 
 for, conforme os exemplos. 

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2313 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (!isValidTriangle(A, B, C)) {
			System.out.println("Invalido");
		} else {
			if (A == B && A == C && B == C) 
				System.out.println("Valido-Equilatero");
			else if (A == B || A == C || B == C)
				System.out.println("Valido-Isoceles");
			else 
				System.out.println("Valido-Escaleno");
		
			if (isRectangleTriangle(A, B, C)) 
				System.out.println("Retangulo: S");
			else 
				System.out.println("Retangulo: N");
		}

		sc.close();
	}
	
	private static boolean isValidTriangle(int A, int B, int C) {
		double maior;
		double soma;
		boolean triangulo;
		
		if (A > B && A > C) maior = A;
		else if (B > C) maior = B;
		else maior = C;

		if (maior == A) soma = B + C;
		else if (maior == B) soma = A + C;
		else soma = B + A;
		
		if (soma > maior) triangulo = true;
		else triangulo = false;
		
		return triangulo;
	}
	
	private static boolean isRectangleTriangle(int A, int B, int C) {
		int aA = A * A;
		int bB = B * B;
		int cC = C * C;
		return aA + bB == cC || aA + cC == bB || cC + bB == aA;
	}
	
}