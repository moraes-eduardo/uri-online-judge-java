// package Iniciante;

/*
 
 QUEST�O
 Dados dois n�meros naturais N1 e N2, diz-se que N1 � subsequ�ncia cont�gua 
 de N2 se todos os d�gitos de N1 aparecem, na mesma ordem e de forma 
 cont�gua, em N2. Crie uma aplica��o que leia dois n�meros naturais e diga 
 se o primeiro � uma subsequ�ncia cont�gua do segundo.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste e termina com final de 
 arquivo (EOF). A primeira linha de cada entrada � composta por um valor 
 natural N1(1 < N1 < 1010), a segunda linha � composta por um valor N2( N1 < N2 < 1032).
 
 SA�DA
 Para cada caso de teste imprima a quantidade de subsequ�ncias cont�guas 
 e a posi��o onde a subsequ�ncia � iniciada, caso exista mais de uma 
 subsequ�ncia, imprima onde � iniciada a �ltima subsequ�ncia. Caso n�o 
 exista subsequ�ncia, imprima "Nao existe subsequencia". Mostre o resultado 
 conforme o exemplo de sa�da.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2126 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int caso = 1, cont = 0, pos = 0, flag = 0;
    	String N1, N2;
    	while (sc.hasNext()) {
    		cont = 0;
    		N1 = sc.next();
    		N2 = sc.next();
    		System.out.println("Caso #" + caso + ":");
    		
    		for (int i = 0; i < N2.length(); i++) {
    			if (N1.charAt(0) == N2.charAt(i)) {
    				flag = 0;
    				for (int j = 0; j < N1.length(); j++) {
    					if (i+j >= N2.length()) break;
    					if (N1.charAt(j) == N2.charAt(i+j)) flag++;
    				}
    				if (flag == N1.length()) {
    					cont++;
    					pos = i+1;
    				}
    			}
    		}
    		
    		if (cont == 0) {
    			System.out.println("Nao existe subsequencia");
    		} else {
    			System.out.println("Qtd.Subsequencias: " + cont );
    			System.out.println("Pos: " + pos);
    		}
    		
    		System.out.println("");
    		caso++;
    	}

		sc.close();
    }
	
}