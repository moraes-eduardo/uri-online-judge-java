// package Iniciante;

/*
 
 QUEST�O
 Um dia, o grande her�i Chapolout foi ajudar um cientista, que criou muitas 
 inven��es. Uma destas inven��es � um sistema que abre a porta secreta do 
 laborat�rio. O sistema consiste em retirar uma vela do candelabro do lado 
 da porta, que a mesma se abre, e, ao colocar a vela de volta ao candelabro, 
 a porta se fecha. Por�m, Chapolout descobriu que a vela era s� uma desculpa. 
 Na verdade, o assistente do cientista, chamado Pepe, � que abria a porta do 
 laborat�rio, por dentro. Um tempo depois, o sistema foi modificado, para 
 funcionar igualmente ao projeto inicial. Colocaram um sensor de press�o 
 embaixo da vela do candelabro, de modo que a retirada da vela ativa o 
 sistema. Este sistema emite um relat�rio de log por cada vez que a porta 
 abriu ou fechou, mas o log est� bem confuso. A cada registro, tr�s n�meros 
 inteiros s�o cadastrados, sendo a hora e o minuto que o evento ocorreu e um 
 valor que representa se a porta abriu ou fechou naquele momento. Pepe pede a 
 sua ajuda para converter os dados do log em dados mais leg�veis para ele.

 Escreva um programa que, dado um registro de log, este seja convertido em 
 textos mais leg�veis.
 
 ENTRADA
 A primeira linha cont�m a quantidade de casos de teste. Cada linha de um caso de 
 teste possui tr�s inteiros H, M e O, sendo a hora, o minuto da ocorr�ncia, e a 
 pr�pria ocorr�ncia (zero se a porta fechou ou um se a porta abriu).
 
 SA�DA
 Para cada caso de teste, imprima o hor�rio da ocorr�ncia, no devido formato, 
 seguido de um espa�o, um h�fen e um espa�o, e da frase �A porta abriu!� ou 
 �A porta fechou!�, conforme a ocorr�ncia registrada.
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2152 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("00");
    	int N = sc.nextInt();
    	int H, M, O;
    	String log;
    	for (int i = 0; i < N; i++) {
    		log = "";
    		H = sc.nextInt();
    		M = sc.nextInt();
    		O = sc.nextInt();
    		
    		log += df.format(H);
    		log += ":";
    		log += df.format(M);
    		if (O == 1) log += " - A porta abriu!";
    		else log += " - A porta fechou!";
    		
    		System.out.println(log);
    	}

		sc.close();
    }
	
}