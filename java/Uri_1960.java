// package Iniciante;

/*
 
 QUEST�O
 A ECI (Editio Chronica Incredibilis ou Editora de Cr�nicas Incr�veis) � 
 muito tradicional quando se trata de numerar as p�ginas de seus livros. 
 Ela sempre usa a numera��o romana para isso. E seus livros nunca ultrapassam 
 as 999 p�ginas pois, quando necess�rio, dividem o livro em volumes.

 Voc� deve escrever um programa que, dado um n�mero ar�bico, mostra seu 
 equivalente na numera��o romana.

 Lembre que I representa 1, V � 5, X � 10, L � 50, C � 100, D � 500 e M representa 1000.
 
 ENTRADA
 A entrada � um n�mero inteiro positivo N (0 < N < 1000).

 SA�DA
 A sa�da � o n�mero N escrito na numera��o romana em uma �nica linha. 
 Use sempre letras mai�sculas.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1960 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int N = sc.nextInt();
    	int i = 0;
    	while (N > 0) {
    		if (N >= vaNum[i]) {
    			System.out.print(vaRom[i]);
    			N -= vaNum[i];
        	} else {
        		i++;
        	}
        }
    	System.out.print("\n");

		sc.close();
    }
	
}