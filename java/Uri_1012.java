// package Iniciante;

/*

 QUEST�O
 Escreva um programa que leia tr�s valores com ponto flutuante de dupla 
 precis�o: A, B e C. Em seguida, calcule e mostre: 
 a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
 b) a �rea do c�rculo de raio C. (pi = 3.14159) 
 c) a �rea do trap�zio que tem A e B por bases e C por altura. 
 d) a �rea do quadrado que tem lado B. 
 e) a �rea do ret�ngulo que tem lados A e B. 

 ENTRADA
 O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.

 SA�DA
 O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a 
 uma das �reas descritas acima, sempre com mensagem correspondente e um espa�o 
 entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 
 d�gitos ap�s o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1012 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double triangulo = a * c / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));  

        sc.close();
    }
	
}