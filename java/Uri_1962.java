// package Iniciante;

/*
 
 QUEST�O
 Raul Seixas cantava que nasceu h� 10 mil anos atr�s e n�o tinha nada nesse mundo 
 que ele n�o sabia demais. Os Mamomas Assassinas cantavam que mais de 10 mil anos 
 "se passaram-se" [sic] quando eles repetiram a 5a s�rie. Tantos eventos passados 
 e o professor MC ficou curioso para saber em que ano tudo isso aconteceu.

 Voc� deve escrever um programa que, dada uma s�rie de n�mero de anos transcorridos, 
 mostre, para cada n�mero, em que ano o evento aconteceu. Lembre-se de indicar 
 se ele aconteceu A.C. (Antes de Cristo) ou D.C. (Depois de Cristo).
 
 ENTRADA
 A entrada tem v�rias linhas. A primeira tem um inteiro positivo N (1 <= N <= 100000). 
 A seguir existem N linhas. Cada uma dessas N linhas tem um �nico inteiro n�o 
 negativo T, que indica o n�mero de anos transcorridos at� 2015 D.C. (0 <= T < 2^31).
 
 SA�DA
 A sa�da tem N linhas. Em cada uma, deve ser indicado o ano A em que o correspondente 
 tempo T aconteceu. Veja o exemplo de sa�da.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1962 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int T, anos;
    	for (int i = 0; i < N; i++) {
    		T = sc.nextInt();
    		if (T >= 2015) {
    			anos = T - 2014;
    			System.out.println(anos + " A.C.");
    		} else {
    			anos = 2015 - T;
    			System.out.println(anos + " D.C.");
    		}
    	}

		sc.close();
    }
	
}