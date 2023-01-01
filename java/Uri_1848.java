// package Iniciante;

/*
 
 QUEST�O
 Como se sabe, existe um corvo com tr�s olhos. O que n�o se sabia � que o 
 corvo com tr�s olhos pode prever o resultado da loteria de Westeros. 
 Enquanto todos os outros corvos coletam as apostas, o corvo de tr�s 
 olhos j� sabe o resultado, e quando Bran sonha com o corvo, o corvo conta 
 o resultado. O problema � que Bran apesar de lembrar do sonho, n�o consegue 
 interpret�-lo sozinho em tempo h�bil. A sua tarefa � fazer um programa para 
 interpretar o sonho de Bran e calcular o resultado da loteria.

 Durante o sonho, o corvo pisca diversas vezes e grita apenas 3 vezes. A cada 
 grito um n�mero do resultado da loteria � calculado.

 Cada piscada do corvo comunica um n�mero em bin�rio. Um olho aberto significa 
 1 e um olho fechado significa 0. O olho da esquerda � o mais significativo e o
 da direita � o menos significativo. A cada piscada, este n�mero deve ser somado, 
 e quando o corvo grita, essa soma � um resultado.
  
 ENTRADA
 A entrada descreve, em cada linha, em sequ�ncia, ou um grito ou uma piscada do corvo.

 Um grito � representado pela string caw caw

 Uma piscada � representada por tr�s caracteres * ou -, representando, respectivamente, 
 um olho aberto ou um olho fechado, da esquerda para a direita.

 Lembre-se que o corvo tem 3 olhos.

 Os n�meros sorteados na loteria n�o excedem 1000.
 
 SA�DA
 A sa�da s�o tr�s linhas, cada linha com um n�mero da loteria.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1848 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int numero, flag;
        String corvo;
        for (int i = 0; i < 3; i++) {
        	numero = 0;
        	flag = 0;
        	while (flag == 0) {
        		corvo = sc.nextLine();
        		switch (corvo) {
	        		case "--*": numero += 1; break;
	        		case "-*-": numero += 2; break;
	        		case "-**": numero += 3; break;
	        		case "*--": numero += 4; break;
	        		case "*-*": numero += 5; break;
	        		case "**-": numero += 6; break;
	        		case "***": numero += 7; break;
	        		default: flag = 1; break;
        		}
        	}
        	System.out.println(numero);
        }

		sc.close();
    }
	
}