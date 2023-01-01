// package Iniciante;

/*
 
 QUEST�O
 Fiddlesticks � um campe�o do jogo League of Legends e tem como sua habilidade 
 ultimate a "Tempestade de Corvos", ela funciona da seguinte maneira:

 Primeiro Fiddlesticks escolhe um local estrat�gico e prontamente ele se 
 prepara para ressurgir em uma dire��o at� uma certa dist�ncia, ent�o ele se 
 enraiza e canaliza a ultimate por exatamente 1.5 segundos, ap�s esse tempo 
 ele ressurge imediatamente no local alvo com uma revoada de corvos voando ao 
 seu redor e causando muito dano.

 Fiddlesticks quer sua ajuda para saber se de uma certa posi��o � poss�vel 
 atingir um invasor com sua habilidade ultimate.

 Obs: Considere que Fiddlesticks sempre luta exatamente na dire��o do invasor 
 e o invasor sempre tenta fugir na dire��o contr�ria a Fiddlesticks, em 
 velocidade constante.
 
 ENTRADA
 A entrada � composta de v�rias linhas, cada linha cont�m os seguintes valores 
 inteiros: Xf, Yf, Xi, Yi, Vi, R1 e R2(0 <= Xf, Yf, Xi, Yi, Vi, R1 e R2 <= 100), 
 representando respectivamente as coordenadas de Fiddlesticks, as coordenadas 
 iniciais do invasor, a velocidade do invasor, o raio de conjura��o da ultimate 
 e o raio de voo dos corvos. Considere a unidade de medida como sendo o metro.
 
 SA�DA
 Na sa�da voc� deve imprimir para cada linha o caractere 'Y' caso seja poss�vel 
 atingir o invasor ou 'N' caso contr�rio, ambos seguidos de uma quebra de linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2203 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int Xf, Yf, Xi, Yi, Vi, R1, R2;
    	double D1, D2;
    	while (sc.hasNext()) {
    		Xf = sc.nextInt();
    		Yf = sc.nextInt();
    		Xi = sc.nextInt();
    		Yi = sc.nextInt();
    		Vi = sc.nextInt();
    		R1 = sc.nextInt();
    		R2 = sc.nextInt();
    		D1 = Math.sqrt(Math.pow(Xi - Xf, 2.0) + Math.pow(Yi - Yf, 2.0)) + (Vi * 1.50);
    		D2 = R1 + R2;
    		if (D1 > D2) System.out.println("N");
    		else System.out.println("Y");
    	}

		sc.close();
    }
	
}