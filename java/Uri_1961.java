// package Iniciante;

/*
 
 QUEST�O
 Em cada fase do jogo do Pula Sapo voc� deve conduzir seu anf�bio atrav�s 
 de uma sequ�ncia de canos de alturas diferentes at� chegar a salvo no cano 
 mais � direita. Entretanto, o sapo s� consegue sobreviver se a diferen�a 
 de altura entre canos consecutivos for de, no m�ximo, a altura do pulo do 
 sapo. Caso a altura do cano seguinte seja muito alta, o sapo bate no cano 
 e cai. Se a altura do cano seguinte for muito baixa, o sapo n�o aguenta a 
 queda. O sapo sempre come�a em cima do cano mais � esquerda.

 Neste jogo, a dist�ncia entre os canos � irrelevante, ou seja, o sapo sempre 
 consegue alcan�ar o pr�ximo cano com um pulo.
 
 Voc� deve escrever um programa que, dadas as alturas dos canos e a altura 
 do pulo do sapo, mostra se a fase do jogo pode ser vencida ou n�o.
 
 ENTRADA
 A entrada � dada em duas linhas. A primeira tem dois inteiros positivos P e 
 N, a altura do pulo do sapo e o n�mero de canos (1 <= P <= 5 e 2 <= N <= 100). 
 A segunda linha tem N inteiros positivos que indicam as alturas dos canos 
 ordenados da esquerda para a direita. N�o h� altura maior do que 10.
 
 SA�DA
 A sa�da � dada em uma �nica linha. Se o sapo pode chegar no cano mais � 
 direita, escreva "YOU WIN". Se o sapo n�o consegue, escreva "GAME OVER".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1961 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int P = sc.nextInt();
    	int N = sc.nextInt();
    	int pulos[] = new int[N];
    	boolean WIN = true;
    	
    	for (int i = 0; i < N; i++) {
    		pulos[i] = sc.nextInt();
    	}
    	
    	for (int i = 0; i < (N-1); i++) {
    		if ((pulos[i] - pulos[i+1]) < (-P)) WIN = false;
    		else if ((pulos[i] - pulos[i+1]) > P) WIN = false; 
    	}
    	
    	if (WIN) System.out.println("YOU WIN");
    	else System.out.println("GAME OVER");

		sc.close();
    }
	
}