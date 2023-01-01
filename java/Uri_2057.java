// package Iniciante;

/*
 
 QUEST�O
 Paulo e Pedro fizeram uma longa jornada desde que partiram do Brasil para 
 competir na Final Mundial da Maratona, em Phuket, Tail�ndia. Notaram que a 
 cada escala que faziam, tinham que ajustar seus rel�gios por causa do fuso 
 hor�rio.

 Assim, para melhor se organizarem para as pr�ximas viagens, eles pediram que 
 voc� fa�a um aplicativo para celular que, dada a hora de sa�da, tempo de 
 viagem e o fuso do destino com rela��o � origem, voc� informe a hora de 
 chegada de cada v�o no destino.

 Por exemplo, se eles partiram �s 10 horas da manh� para uma viagem de 4 horas 
 rumo a um destino que fica � leste, em um fuso hor�rio com uma hora a mais 
 com rela��o ao fuso hor�rio do ponto de partida, a hora de chegada ter� que 
 ser: 10 horas + 4 horas de viagem + 1 hora de deslocamento pelo fuso, ou 
 seja, chegar�o �s 15 horas. Note que se a hora calculada for igual a 24, seu 
 programa dever� imprimir 0 (zero).
 
 ENTRADA
 A entrada cont�m 3 inteiros: S (0 <= S <= 23), T (1 <= T <= 12) e F (-5 <= 
 F <= 5), separados por um espa�o, indicando respectivamente a hora da sa�da, 
 o tempo de viagem e o fuso hor�rio do destino com rela��o � origem.
 
 SA�DA
 Imprima um inteiro que indica a hora local prevista no destino, conforme os 
 exemplos abaixo. http://prntscr.com/k3ipn6

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2057 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int S = sc.nextInt();
    	int T = sc.nextInt();
    	int F = sc.nextInt();
    	int hora = S + T + F;
    	if (hora >= 24) hora -= 24;
    	else if (hora < 0) hora += 24;
    	System.out.println(hora);

		sc.close();
    }
	
}