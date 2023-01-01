// package Iniciante;

/*
 
 QUEST�O
 Joana gosta de brincar de fingir ser uma agente secreta com suas amigas Bruna, 
 Jaqueline e Laura. Joana e Bruna criaram um c�digo secreto para se comunicar 
 sem que suas inimigas descubram seus planos.
 O c�digo secreto funciona da seguinte forma:

   � A letra 'a' � representada por um �nico ponto '.'
   � A letra 'b' � representada por dois pontos '..'
   � A letra 'c' � representada por tr�s pontos '...'
   � As demais letras seguem a l�gica anterior, por�m cada conjunto de pontos 
   est� separado por um espa�o e sempre com um conjunto a mais de pontos, como no 
   exemplo abaixo:
		. -> a
		.. -> b
		
		... -> c
		
		. . -> d
		
		.. .. -> e
		... ... -> f
		
		. . . -> g
		.. .. .. -> h
		... ... ... -> i

 O seu objetivo � criar um programa que decifre as mensagens secretas e ajudar 
 Jaqueline e Laura descobrirem o que Joana e Bruna est�o planjando.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de cada teste dever� 
 conter um inteiro (N <= 50), que representa a quantidade de letras a serem decifradas 
 e as N linhas seguintes cont�m o c�digo de cada letra.
 
 SA�DA
 Uma string representando a letra do alfabeto correspondente ao c�digo de entrada. 
 Cada string deve estar separada da outra por uma nova linha.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2727 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		int N = sc.nextInt();
    		for (int i = 0; i < N; i++) {
    			String[] codigo = readLine(sc).split(" ");
    			char letra = (char) (96 + (((codigo.length - 1) * 3) + codigo[0].length()));
    			System.out.println(letra);
    		}
    	}
    }
    
    public static String readLine(Scanner sc) {
    	String line = sc.nextLine();
    	while (line.isEmpty())
    		line = sc.nextLine();
    	return line;
    }
    
}