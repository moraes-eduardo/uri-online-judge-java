// package Iniciante;

/*
 
 QUEST�O
 O rod�zio municipal de ve�culos de S�o Paulo � uma restri��o � circula��o de 
 ve�culos automotores na cidade. Implantado desde 1996 com o prop�sito de 
 melhorar as condi��es ambientais reduzindo a carga de poluentes na atmosfera, 
 se consolidou como um instrumento para reduzir congestionamentos nas 
 principais vias da cidade, nos hor�rios de maior movimento. Nas vias 
 delimitadoras n�o � permitido o tr�fego de caminh�es e autom�veis que 
 estejam dentro da restri��o. H� uma escala que determina em quais dias da 
 semana quais ve�culos n�o podem circular. Essa escala � regida pelo �ltimo 
 d�gito da placa do ve�culo, sendo:

 Segunda-feira, digito final da placa 1 e 2
 Ter�a-feira, digito final da placa 3 e 4
 Quarta-feira, digito final da placa 5 e 6
 Quinta-feira, digito final da placa 7 e 8
 Sexta-feira, digito final da placa 9 e 0
 
 Os motoristas que s�o flagrados violando a restri��o de circula��o s�o 
 autuados com multa e quatro pontos na carteira de habilita��o.
 
 ENTRADA
 A primeira linha de entrada representa a quantidade de testes N (0 <= N < 1000) 
 que dever�o ser considerados. As demais entradas s�o cadeia de caracteres 
 com tamanho m�ximo S (1 <= S <= 100) que representam cada placa que dever� 
 ser analisada, de tal forma que, cada placa fique em uma �nica linha de 
 entrada. O formato esperado para uma placa veicular v�lida em S�o Paulo � 
 "AAA-9999", tal que A � um caracter v�lido em [A-Z], e 9 um d�gito num�rico 
 v�lido em [0-9].
 
 SA�DA
 O conjunto de valores v�lidos como sa�da s�o: MONDAY, TUESDAY, WEDNESDAY, 
 THURSDAY e FRIDAY, de acordo com a tabela de restri��es predefinida, e FAILURE 
 caso a placa n�o apresente o padr�o definido.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2712 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 0; i < N; i++) {
    		String placa = sc.next();
    		if (isValidTag(placa)) {
    			int digit = Integer.valueOf(String.valueOf(placa.charAt(7)));
    		         if (digit == 1 || digit == 2) System.out.println("MONDAY");
    			else if (digit == 3 || digit == 4) System.out.println("TUESDAY");
    			else if (digit == 5 || digit == 6) System.out.println("WEDNESDAY");
    			else if (digit == 7 || digit == 8) System.out.println("THURSDAY");
    			else System.out.println("FRIDAY"); 
    		} else {
    			System.out.println("FAILURE");
    		}
    	}

		sc.close();
    }
    
    public static boolean isValidTag(String placa) {
    	return placa.matches("[A-Z]{3}-[0-9]{4}");
    }
    
}