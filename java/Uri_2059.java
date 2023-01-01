// package Iniciante;

/*
 
 QUEST�O
 Um novo jogo chamado �mpar, Par ou Roubo (IPR) est� se tornando muito 
 popular. Esse jogo surgiu quando alguns amigos estavam sem conex�o com 
 a internet, sem celular, sem computador e bastante desocupados. O jogo 
 est� t�o popular que ir� acontecer um campeonato mundial de IPR e cada 
 pa�s do mundo ir� escolher um representante para competir.

 O jogo funciona da seguinte forma: dois jogadores participam, o jogador 1 
 escolhe entre par ou �mpar, ent�o cada jogador escolhe um inteiro 
 positivo, se a soma desses n�meros for par e o jogador 1 tiver escolhido 
 par ent�o o jogador 1 ganha, se a soma for �mpar o jogador 2 ganha. Caso 
 o jogador 1 tivesse escolhido �mpar ele ganharia se a soma fosse �mpar, 
 caso a soma fosse par o jogador 2 ganharia. Nada de diferente de um jogo 
 de par ou �mpar convencional, correto?

 A diferen�a do jogo � que o jogador 1 pode roubar e assim assegurar sua 
 vit�ria independentemente do resultado do jogo de �mpar ou par convencional,
 j� o jogador 2 pode ou n�o acusar o jogador 1 de roubo. Com essas adi��es 
 no jogo se o jogador 1 roubar e o jogador 2 acusar o roubo ent�o o jogador 
 2 ganha, caso o jogador 2 n�o acuse o roubo e o jogador 1 roubar ent�o o 
 jogador 1 ganha, caso o jogador 2 acuse o roubo, mas o jogador 1 n�o tiver 
 roubado ent�o o jogador 1 ganha, se o jogador 1 n�o roubar e o jogador 2 
 n�o acusar o roubo o jogo segue como descrito anteriormente.

 Voc� foi contratado pela OIIPR (Organiza��o Internacional de �mpar, Par ou
 Roubo) para desenvolver um programa que dada a escolha do jogador 1 entre 
 par ou �mpar, os n�meros escolhidos como jogada e as a��es dos jogadores 
 (roubo/acusa��o) mostre quem foi o vencedor.
 
 ENTRADA
 A entrada consite de uma �nica linha contendo 5 inteiros: p, j1, j2, r, a. 
 ( 0 <= p, r, a <= 1 e 1 <= j1, j2 <= 100).

 p representa a escolha do jogador 1 (se p = 1 ent�o o jogador 1 escolheu par, 
 se p = 0 ent�o o jogador 1 escolheu �mpar). Os valores j1, j2, representam 
 respectivamente o n�mero escolhido pelo jogador 1 e pelo jogador 2. r representa 
 se o jogador 1 roubou (se r = 1 ent�o o jogador 1 roubou, se r = 0 ent�o o 
 jogador 1 n�o roubou), a representa se o jogador 2 acusou o roubo (se a = 1 
 ent�o o jogador 2 acusou o jogador 1 de roubo, se a = 0 ent�o ele n�o acusou 
 o jogador 1 de roubo).
 
 SA�DA
 Imprima "Jogador 1 ganha!" se o jogador 1 ganhou ou "Jogador 2 ganha!" se o 
 jogador 2 ganhou (sem as aspas).

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2059 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();
    	int j1 = sc.nextInt();
    	int j2 = sc.nextInt();
    	int r = sc.nextInt();
    	int a = sc.nextInt();
    	
    	if (r == 1 && a == 0) System.out.println("Jogador 1 ganha!");
    	else if (r == 0 && a == 1) System.out.println("Jogador 1 ganha!");
    	else if (r == 1 && a == 1) System.out.println("Jogador 2 ganha!");
    	else if (p == 0 && (j1 + j2) % 2 != 0) System.out.println("Jogador 1 ganha!");
    	else if (p == 1 && (j1 + j2) % 2 == 0) System.out.println("Jogador 1 ganha!");
    	else System.out.println("Jogador 2 ganha!");

		sc.close();
    }
	
}