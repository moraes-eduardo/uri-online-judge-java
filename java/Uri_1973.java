// package Iniciante;

/*
 
 QUEST�O
 Ap�s comprar v�rios s�tios adjacentes na regi�o do oeste catarinense, a 
 fam�lia Estrela construiu uma �nica estrada que passa por todos os s�tios 
 em sequ�ncia. O primeiro s�tio da sequ�ncia foi batizado de Estrela 1, o 
 segundo de Estrela 2, e assim por diante. Por�m, o irm�o que vive em 
 Estrela 1 acabou enlouquecendo e resolveu fazer uma Jornada nas Estrelas 
 para roubar carneiros das propriedades de seus irm�os. Mas ele est� 
 definitivamente pirado. Quando passa pelo s�tio Estrela i, ele rouba apenas 
 um carneiro daquele s�tio (se o s�tio tem algum) e segue ou para Estrela 
 i + 1 ou para Estrela i - 1, dependendo se o n�mero de carneiros em Estrela 
 i era, respectivamente, �mpar ou par. Se n�o existe a Estrela para a qual 
 ele deseja seguir, ele interrompe sua jornada. O irm�o louco come�a sua 
 Jornada em Estrela 1, roubando um carneiro do seu pr�prio s�tio.
 
 ENTRADA
 A primeira linha da entrada consiste de um �nico inteiro N (1 <= N <= 106), 
 o qual representa o n�mero de Estrelas. A segunda linha da entrada consiste 
 de N inteiros, de modo que o i-�simo inteiro, Xi (1 <= Xi <= 106), 
 representa o n�mero inicial de carneiros em Estrela i.
 
 SA�DA
 Imprima uma linha contendo dois inteiros, de modo que o primeiro represente 
 o n�mero de Estrelas atacadas pelo irm�o louco e o segundo represente o 
 n�mero total de carneiros n�o roubados.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1973 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);	
    	int N = sc.nextInt();
    	int[] estrela = new int[N];
    	int[] carneiro = new int[N];
    	long totalEstrela = 0;
    	long totalCarneiro = 0;
    	
    	for (int i = 0; i < N; i++) {
	    	carneiro[i] = sc.nextInt();
	    	estrela[i] = 0;
    	}
    	
    	int j = 0;
    	
    	while (true) {
    		if (j == 0 && carneiro[j] % 2 == 0){
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (j == (N-1) && carneiro[j] % 2 == 1) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			break;
    		} else if (carneiro[j] % 2 == 1) {
    			if (carneiro[j] > 0) carneiro[j]--;
    			estrela[j] = 1;
    			j++;
    		} else if (carneiro[j] % 2 == 0) {
    			estrela[j] = 1;
    			if (carneiro[j] > 0) carneiro[j]--;
    			j--;
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		totalCarneiro += carneiro[i];
    		totalEstrela += estrela[i];
    	}
    	
    	System.out.println(totalEstrela + " " + totalCarneiro);

		sc.close();
    }
	
}