// package Iniciante;

/*
 
 QUEST�O
 Mariazinha quer resolver um problema interessante. Dadas as informa��es de 
 popula��o e a taxa de crescimento de duas cidades quaisquer (A e B), ela 
 gostaria de saber quantos anos levar� para que a cidade menor (sempre � a 
 cidade A) ultrapasse a cidade B em popula��o. Claro que ela quer saber apenas 
 para as cidades cuja taxa de crescimento da cidade A � maior do que a taxa de 
 crescimento da cidade B, portanto, previamente j� separou para voc� apenas os 
 casos de teste que tem a taxa de crescimento maior para a cidade A. Sua tarefa 
 � construir um programa que apresente o tempo em anos para cada caso de teste.

 Por�m, em alguns casos o tempo pode ser muito grande, e Mariazinha n�o se 
 interessa em saber exatamente o tempo para estes casos. Basta que voc� informe, 
 nesta situa��o, a mensagem "Mais de 1 seculo.".
 
 ENTRADA
 A primeira linha da entrada cont�m um �nico inteiro T, indicando o n�mero de 
 casos de teste (1 <= T <= 3000). Cada caso de teste cont�m 4 n�meros: dois inteiros 
 PA e PB (100 <= PA <= 1000000, PA < PB <= 1000000) indicando respectivamente a 
 popula��o de A e B, e dois valores G1 e G2 (0.1 <= G1 <= 10.0, 0.0 <= G2 <= 10.0, G2 
 < G1) com um digito ap�s o ponto decimal cada, indicando respectivamente o crescimento 
 populacional de A e B (em percentual).

 Aten��o: A popula��o � sempre um valor inteiro, portanto, um crescimento de 2.5 % 
 sobre uma popula��o de 100 pessoas resultar� em 102 pessoas, e n�o 102.5 pessoas, 
 enquanto um crescimento de 2.5% sobre uma popula��o de 1000 pessoas resultar� em 1025 
 pessoas. Al�m disso, n�o utilize vari�veis de precis�o simples para as taxas de crescimento.

 SA�DA
 Imprima, para cada caso de teste, quantos anos levar� para que a cidade A ultrapasse a 
 cidade B em n�mero de habitantes. Obs.: se o tempo for mais do que 100 anos o programa 
 deve apresentar a mensagem: Mais de 1 seculo. Neste caso, acredito que seja melhor 
 interromper o programa imediatamente ap�s passar de 100 anos, caso contr�rio voc� poder� 
 receber como resposta da submiss�o deste problema "Time Limit Exceeded".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1160 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int PA, PB, anos;
        double G1, G2;
        for (int i = 1; i <= T; i++) {
        	anos = 0;
        	PA = sc.nextInt();
        	PB = sc.nextInt();
        	G1 = sc.nextDouble();
        	G2 = sc.nextDouble();
        	while (PB >= PA) {
        		PA += (PA * G1) / 100;
        		PB += (PB * G2) / 100;
        		anos++;
        		if (anos > 100) {
        			break;
        		}
        	}
        	if (anos > 100) {
        		System.out.println("Mais de 1 seculo.");
        	} else {
        		System.out.println(anos + " anos");
        	}
        }

		sc.close();
    }
	
}