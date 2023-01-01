// package Iniciante;

/*
 
 QUEST�O
 Todo ano ap�s a competi��o que ocorre na cidade de Taxil�ndia, os 
 participantes e os coaches v�o para o c�lebre restaurante Radar. Por�m, 
 os gar�ons (sempre muito gentis e educados) ficam sobrecarregados devido 
 � quantidade de pessoas, e consequentemente, acabam demorando um pouco 
 para atender a um pedido.

 Os participantes ou coaches que sentam nas pontas s�o os privilegiados, 
 pois s�o atendidos com somente um pedido, mas os demais precisam sempre 
 pedir duas vezes, pois os gar�ons (apesar de gentis e educados) s�o 
 desatentos e se esquecem facilmente dos pedidos. Al�m disso, h� uma 
 supersti��o entre os participantes e coaches de que se n�o houver um 
 n�mero par de pessoas que n�o sentam nas pontas, na pr�xima competi��o 
 nenhuma equipe da universidade conseguir� vencer.

 Portanto, sua tarefa � determinar a soma da quantidade de pedidos de 
 cada um para saber se vale a pena ir ao Radar. Mas apesar do resultado, 
 lembre-se: sempre vale a pena ir ao Radar!
 
 ENTRADA
 A entrada � composta por T (1 <= T <= 100) indicando a quantidade de casos 
 de teste e ent�o, T inteiros N (3 <= N <= 104), indicando a quantidade de 
 pessoas. A mesa � retangular e haver� pelo menos e no m�ximo uma pessoa em 
 uma das pontas, isto �, se uma ponta estiver vazia, a outra deve ser ocupada, 
 ou sen�o, as duas pontas estar�o ocupadas, mas o n�mero de pessoas que n�o 
 est�o nas pontas sempre ser� par. O final da entrada � indicado por T = 0.
 
 SA�DA
 Seu programa dever� imprimir a soma da quantidade de pedidos de cada pessoa. 
 N�o haver� linha em branco entre os casos de teste.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2143 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int N;
    	while (T != 0) {
    		for (int i = 1; i <= T; i++) {
    			N = sc.nextInt();
    			if (N % 2 != 0) System.out.println((N * 2) - 1);
    			else System.out.println((N * 2) - 2);
    		}
    		
    		T = sc.nextInt();
    	}

		sc.close();
    }
	
}