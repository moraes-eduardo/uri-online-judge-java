// package Iniciante;

/*
 
 QUEST�O
 A ag�ncia de turismo municipal da cidade de Ica, no Peru montou um posto 
 de controle de jipes de aventura que sobem para as dunas do parque Hucachina. 
 Como durante o dia, s�o v�rios os off-roads que sobem e descem do parque 
 nacional, e nem sempre os turistas usam um mesmo transporte para a ida e 
 volta, a prefeitura precisava ter um melhor controle e seguran�a sobre fluxo 
 de visitantes no parque. Desenvolva um programa que receba como entrada se um 
 jipe est� entrando ou voltando do parque e a quantidade de turistas que este 
 ve�culo est� transportando. Ao final do turno, o programa deve indicar a 
 quantidade de ve�culos e de turistas que ainda faltam regressar da aventura.
 
 ENTRADA
 O programa deve receber sucessivos pares de entrada. Cada par deve indicar o 
 movimento do jipe e a quantidade de turistas que este est� transportando. A primeira 
 entrada deve ser "SALIDA" ou "VUELTA". "SALIDA" deve indicar que o jipe est� saindo 
 da central e entrando no parque; e "VUELTA" que o jipe est� retornando do passeio. 
 Imediatamente na sequ�ncia, o programa recebe um n�mero inteiro T (onde, 0 <= T <=20) 
 que indica a quantidade de turistas que est�o sendo transportados pelo jipe. 
 A string "ABEND" deve ser o indicador de fim de processamento.
 
 SA�DA
 Como objetivo o programa deve apresentar duas sa�das, uma em cada linha: a quantidade 
 de turistas e a quantidade de jipes que ainda faltam voltar do parque.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2708 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int turistas = 0;
    	int jipes = 0;
    	while (true) {
    		String input = sc.next();
    		if (input.equals("SALIDA")) {
    			jipes++;
    			turistas += sc.nextInt();
    		}
    		else if (input.equals("VUELTA")) {
    			jipes--;
    			turistas -= sc.nextInt();
    		} else {
    			break;
    		}
    	}
    	System.out.println(turistas);
    	System.out.println(jipes);
    }
    
}