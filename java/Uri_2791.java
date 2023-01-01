// package Iniciante;

/*
 
 QUEST�O
 Conta-se nos arredores de Montes Claros que, h� muito tempo no mercado 
 municipal, Sebasti�o e seus companheiros de trabalho sempre jogam uma 
 partida de adivinha��o ap�s a entrega dos produtos agr�colas colhidos 
 na semana que se passou. O jogo, que se chama Adivinhe Onde o Feij�o 
 Est�'', consiste em esconder um gr�o de feij�o em um de quatro copos 
 opacos e, depois de embaralh�-los, o apostador deve adivinhar em qual 
 copo o legume est�.
 
 Neste ano, devido ao grande sucesso cultural e hist�rico e � enorme 
 quantidade de pessoas que praticam este jogo no mercado municipal, a 
 prefeitura resolveu realizar um campeonato de Adivinhe Onde o Feij�o 
 Est�''. Entretanto, ela necessita de um programa para mostrar aos 
 expectadores onde o feij�o estava ap�s o fim de uma partida. Sabendo 
 que a pr�xima Maratona Mineira de Programa��o ocorrer� na cidade, ela 
 logo encomendou uma solu��o aos ex�mios programadores. Desta forma, voc� 
 deve auxiliar a organiza��o nesta miss�o com um programa que informe, 
 ao fim de uma partida, onde o feij�o esteve.
 
 ENTRADA
 A entrada conter� apenas uma linha com quatro inteiros, C1, C2, C3 e C4 
 separados por um espa�o. O valor Ci=1 indica que o feij�o estava no copo 
 n�mero i, e Ci=0 indica que o i-�simo copo estava vazio ao fim da partida. 
 Haver� sempre exatamente um copo com o feij�o.
 
 SA�DA
 Escreva na sa�da uma linha contendo um inteiro entre 1 e 4, correspondendo 
 � posi��o onde o feij�o estava.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2791 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[4];
        for (int i=0; i < c.length; i++) {
        	c[i] = sc.nextInt();
        }
        for (int i=0; i < c.length; i++) {
        	if (c[i] == 1) System.out.println(i+1);
        }
    }
	
}