// package Iniciante;

/*
 
 QUEST�O
 Maria acabou de iniciar seu curso de gradua��o na faculdade de medicina e 
 precisa de sua ajuda para organizar os experimentos de um laborat�rio o qual 
 ela � respons�vel. Ela quer saber no final do ano, quantas cobaias foram 
 utilizadas no laborat�rio e o percentual de cada tipo de cobaia utilizada.

 Este laborat�rio em especial utiliza tr�s tipos de cobaias: sapos, ratos e 
 coelhos. Para obter estas informa��es, ela sabe exatamente o n�mero de 
 experimentos que foram  realizados, o tipo de cobaia utilizada e a quantidade 
 de cobaias utilizadas em cada experimento.
 	
 ENTRADA
 A primeira linha de entrada cont�m um valor inteiro N que indica os v�rios 
 casos de teste que vem a seguir. Cada caso de teste cont�m um inteiro Quantia 
 (1 <= Quantia <= 15) que representa a quantidade de cobaias utilizadas e um 
 caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
 
 SA�DA
 Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada 
 e o percentual de cada uma em rela��o ao total de cobaias utilizadas, sendo que o 
 percentual deve ser apresentado com dois d�gitos ap�s o ponto.
 
*/

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Uri_1094 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(sc.readLine());
    	int totalCoelhos = 0;
    	int totalRatos = 0;
    	int totalSapos = 0;
    	for (int i = 0; i < N; i++) {
    		String info = sc.readLine();
    		String[] infos = info.split(" ");
    		int Quantia = Integer.valueOf(infos[0]);
    		char Tipo = infos[1].toUpperCase().charAt(0);
    		switch (Tipo) {
	    		case 'C': totalCoelhos += Quantia; break;
	    		case 'R': totalRatos += Quantia; break;
	    		case 'S': totalSapos += Quantia; break;
    		}
    	}
    	
    	int totalCobaias = totalCoelhos + totalRatos + totalSapos;
    	double mediaCoelhos = (totalCoelhos * 100) / (double) totalCobaias;
    	double mediaRatos = (totalRatos * 100) / (double) totalCobaias;
    	double mediaSapos = (totalSapos * 100) / (double) totalCobaias;
    	System.out.println("Total: " + totalCobaias + " cobaias");
    	System.out.println("Total de coelhos: " + totalCoelhos);
    	System.out.println("Total de ratos: " + totalRatos);
    	System.out.println("Total de sapos: " + totalSapos);
    	System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
    	System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
    	System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");
	}
	
}