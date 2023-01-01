// package Iniciante;

/*
 
 QUEST�O
 Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um 
 tri�ngulo. Em caso positivo, calcule o per�metro do tri�ngulo e apresente a mensagem:
 Perimetro = XX.X


 Em caso negativo, calcule a �rea do trap�zio que tem A e B como base
 e C como altura, mostrando a mensagem:
 Area = XX.X

 ENTRADA
 A entrada cont�m tr�s valores reais.

 SA�DA
 O resultado deve ser apresentado com uma casa decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1043 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
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
		
		if (triangulo) {
			double perimetro = A + B + C;
			System.out.println(String.format("Perimetro = %.1f", perimetro));
		} else {
			double areaTrapezio = ((A + B) * C) / 2;
			System.out.println(String.format("Area = %.1f", areaTrapezio));
		}

		sc.close();
	}
	
}