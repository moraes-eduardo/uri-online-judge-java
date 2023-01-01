// package Iniciante;

/*
 
 QUEST�O
 System of a Download � uma famosa banda de Hacker Metal! Certa vez, eles 
 criaram um dispositivo, com seis bot�es, numerados de 0 a 5, e colocaram 
 nesse dispositivo os seus 11 maiores sucessos. Para tocar uma destas m�sicas, 
 � preciso pressionar dois bot�es. Com isso, os n�meros destes dois bot�es s�o 
 somados, e ent�o toca-se a m�sica correspondente ao n�mero da soma, conforme 
 a rela��o abaixo:

 0 - PROXYCITY
 1 - P.Y.N.G.
 2 - DNSUEY!
 3 - SERVERS
 4 - HOST!
 5 - CRIPTONIZE
 6 - OFFLINE DAY
 7 - SALT
 8 - ANSWER!
 9 - RAR?
 10 - WIFI ANTENNAS

 Por exemplo, se os bot�es pressionados forem 3 e 4, ir� tocar a m�sica 7 - SALT
 Escreva um programa que, dados os dois bot�es que forem pressionados, determine 
 qual m�sica ir� tocar.
  
 ENTRADA
 Um n�mero inteiro C ser� informado, que ser� a quantidade de casos de teste. 
 Cada caso tem dois valores inteiros, X e Y, representando quais bot�es foram 
 pressionados.
 
 SA�DA
 Para cada caso de teste, imprima o nome da m�sica correspondente.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2582 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for (int i = 0; i < C; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			Musica music = Musica.valueOf("_"  + (X + Y));
			System.out.println(music.nome);
		}

		sc.close();
	}

	enum Musica {
		_0("PROXYCITY"),
		_1("P.Y.N.G."),
		_2("DNSUEY!"),
		_3("SERVERS"),
		_4("HOST!"),
		_5("CRIPTONIZE"),
		_6("OFFLINE DAY"),
		_7("SALT"),
		_8("ANSWER!"),
		_9("RAR?"),
		_10("WIFI ANTENNAS");

		private String nome;
		
		Musica (String nome) {
			this.nome = nome;
		}
	}
	
}