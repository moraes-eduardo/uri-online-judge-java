// package Iniciante;

/*
 
 QUEST�O
 N�meros em ponto flutuante podem ser bastante extensos para mostrar. 
 Nesses casos, � conveniente usar a nota��o cient�fica.

 Voc� deve escrever um programa que, dado um n�mero em ponto flutuante, 
 mostre este n�mero na nota��o cient�fica: sempre mostre o sinal da 
 mantissa; sempre mostre 4 casas decimais na mantissa; use o caractere 
 'E' para separar a mantissa do expoente; sempre mostre o sinal do expoente; 
 e mostre o expoente com pelo menos 2 d�gitos.
 
 ENTRADA
 A entrada � um n�mero em ponto flutuante de dupla precis�o X (de acordo com 
 o padr�o IEEE 754-2008). Nunca haver� um n�mero com mais de 110 caracteres 
 nem com mais de 6 casas decimais.
 
 SA�DA
 A sa�da � o n�mero X em uma �nica linha na nota��o cient�fica detalhada acima. 
 Veja os exemplos abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1958 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		System.out.println(String.format((String.valueOf(X).startsWith("-") ? "" : "+") + "%.4E", X));

		sc.close();
    }
	
}