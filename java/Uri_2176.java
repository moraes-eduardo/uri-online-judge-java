// package Iniciante;

/*
 
 QUEST�O
 A populariza��o das redes WiFi aumentou a taxa de perda de informa��es sendo 
 transferidas, uma vez que diversos fatores do meio ambiente podem facilmente 
 comprometer os dados durante o tr�fego. A URI, Unidade de Recupera��o de 
 Informa��es, tem como principal objetivo identificar e corrigir erros em 
 mensagens enviadas via redes WiFi.

 A t�cnica utilizada pela Uri_para identifica��o de erros � o teste de paridade, 
 o qual pode ser descrito da seguinte forma: Seja S uma mensagem que ser� 
 enviada de um dispositivo para outro. Antes de S ser enviada, um bit extra B � 
 adicionado no final da representa��o bin�ria de S. Se a mensagem S tiver um 
 n�mero par de bits de valor 1, o bit extra B ter� valor 0. Caso contr�rio, se S 
 tiver um n�mero �mpar de bits de valor 1, B ter� valor 1. Desta forma, ap�s a 
 inser��o do bit B, a mensagem S ter� um n�mero par de bits de valor 1.

 Quando o destinat�rio recebe a mensagem S ele faz a contagem de bits de valor 1. 
 Se a quantidade for par, significa que a mensagem chegou com sucesso. Caso 
 contr�rio, significa que a mensagem sofreu uma altera��o e n�o est� correta.

 Sua tarefa � escrever um algoritmo que fa�a a inser��o do bit B na mensagem S, 
 de forma que ap�s a inser��o a mensagem S tenha um n�mero par de bits de valor 1.
 
 ENTRADA
 Cada caso de teste consiste em uma linha contendo a mensagem S, a qual consiste 
 em no m�nimo 1 e no m�ximo 100 bits.
 
 SA�DA
 Imprima uma linha contendo a mensagem S adicionada do bit extra B.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2176 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String S = sc.next();
    	String[] bits = S.split("");
    	int x = 0;
    	for (String bit : bits) {
    		if (bit.equals("1")) x++;
    	}
    	S += x % 2 == 0 ? 0 : 1; 
    	System.out.println(S);

		sc.close();
    }
	
}