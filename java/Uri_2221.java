// package Iniciante;

/*
 
 QUEST�O
 Depois de capturar muitos Pomekons, Dabriel e Guarte resolveram batalhar. 
 A forma de duelo � simples, cada treinador coloca um Pomekon na batalha e 
 vence quem tem o Pomekon com maior valor de golpe, que � definido da 
 seguinte maneira: http://prntscr.com/ka77vm

 O B�nus ser� dado ao Pomekon do treinador que estiver em um level de valor par.

 Neste problema ser� dado a voc� o valor do b�nus aplicado, os valores de 
 ataque e defesa do Pomekon de Dabriel e Guarte e seus respectivos n�veis, 
 cabe a voc� informar o ganhador da batalha.
  
 ENTRADA
 A entrada � composta por diversas inst�ncias. A primeira linha da entrada cont�m 
 um inteiro T indicando o n�mero de inst�ncias. Cada inst�ncia come�a com um 
 inteiro B (0 <= B <= 100), que indica o valor do b�nus aplicado. Nas duas linhas 
 seguintes ter�o tr�s inteiros Ai, Di e Li (1 <= Ai, Di <= 100, 1 <= Li <= 50), 
 representado o valor de ataque do Pomekon, o valor de defesa e o level do treinador. 
 A primeira linha representa o Pomekon de Dabriel e a segunda o de Guarte.
 
 SA�DA
 Para inst�ncia na entrada voc� dever� imprimir o nome do treinador que ir� vencer 
 a batalha, em caso de empate imprima: "Empate", sem aspas. 
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2221 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int B, A1, D1, L1, A2, D2, L2, V1, V2;
    	for (int i = 0; i < T; i++) {
    		B = sc.nextInt();
    		A1 = sc.nextInt();
    		D1 = sc.nextInt();
    		L1 = sc.nextInt();
    		A2 = sc.nextInt();
    		D2 = sc.nextInt();
    		L2 = sc.nextInt();
    		V1 = ((A1 + D1) / 2) + (L1 % 2 == 0 ? B : 0);
    		V2 = ((A2 + D2) / 2) + (L2 % 2 == 0 ? B : 0);
    		if (V1 > V2) System.out.println("Dabriel");
    		else if (V2 > V1) System.out.println("Guarte");
    		else System.out.println("Empate");
    	}

		sc.close();
    }
	
}