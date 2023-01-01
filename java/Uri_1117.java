// package Iniciante;

/*
 
 QUEST�O
 Fa�a um programa que leia as notas referentes �s duas avalia��es de um 
 aluno. Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� 
 aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). 
 Cada nota deve ser validada separadamente.
 
 ENTRADA
 A entrada cont�m v�rios valores reais, positivos ou negativos. O programa 
 deve ser encerrado quando forem lidas duas notas v�lidas.
 
 SA�DA
 Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
 Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " 
 seguido do valor do c�lculo. O valor deve ser apresentado com duas casas ap�s 
 o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1117 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		while (nota1 > 10 || nota1 < 0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		double nota2 = sc.nextDouble();
		while (nota2 > 10 || nota2 < 0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		System.out.println(String.format("media = %.2f", media));

		sc.close();
    }
	
}