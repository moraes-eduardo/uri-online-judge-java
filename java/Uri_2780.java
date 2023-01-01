// package Iniciante;

/*
 
 QUEST�O
 A organiza��o da OIBR, Olimp�ada Internacional de Basquete de Rob�, est� 
 come�ando a ter problemas com dois times: os Bit Warriors e os Byte Bulls. 
 � que os rob�s desses times acertam quase todos os lan- �amentos, de 
 qualquer posi��o na quadra! Pensando bem, o jogo de basquete ficaria mesmo 
 sem gra�a se jogadores conseguissem acertar qualquer lan�amento, n�o � mesmo? 
 Uma das medidas que a OIBR est� implantando � uma nova pontua��o para os 
 lan�amentos, de acordo com a dist�ncia do rob� para o in�cio da quadra. A 
 quadra tem 2000 cent�metros de comprimento, como na figura.

 Dada a dist�ncia D do rob� at� o in�cio da quadra, onde est� a cesta, a 
 regra � a seguinte:

 � Se D <= 800, a cesta vale 1 ponto;

 � Se 800 < D <= 1400, a cesta vale 2 pontos;

 � Se 1400 < D <= 2000, a cesta vale 3 pontos.

 A organiza��o da OIBR precisa de ajuda para automatizar o placar do jogo. 
 Dado o valor da dist�ncia D, voc� deve escrever um programa para calcular 
 o n�mero de pontos do lan�amento.
 
 ENTRADA
 A primeira e �nica linha da entrada cont�m um inteiro D (0 <= D <= 2000) 
 indicando a dist�ncia do rob� para o in�cio da quadra, em cent�metros, no 
 momento do lan�amento.
 
 SA�DA
 Seu programa deve produzir uma �nica linha, contendo um inteiro, 1, 2 ou 3, 
 indicando a pontua��o do lan�amento.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2780 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        if (D <= 800) 
        	System.out.println(1);
        else if (D <= 1400)
        	System.out.println(2);
        else
        	System.out.println(3);

        sc.close();
    }
	
}