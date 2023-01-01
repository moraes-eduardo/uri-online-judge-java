// package Iniciante;

/*

 QUEST�O
 Leia um valor inteiro. A seguir, calcule o menor n�mero de notas 
 poss�veis (c�dulas) no qual o valor pode ser decomposto. As notas 
 consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o 
 valor lido e a rela��o de notas necess�rias.

 ENTRADA
 O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

 SA�DA
 Imprima o valor lido e, em seguida, a quantidade m�nima de notas de 
 cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de 
 imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa 
 apresentar� a mensagem: �Presentation Error�.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1018 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int notasInseridas = sc.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -= notas50 * 50;
        int notas20 = atual / 20;
        atual -= notas20 * 20;
        int notas10 = atual / 10;
        atual -= notas10 * 10;
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        int notas1 = atual;
        
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");


        sc.close();
    }
	
}