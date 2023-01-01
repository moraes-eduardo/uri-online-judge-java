// package Iniciante;

/*
 
 QUEST�O
 O Brasil � o pa�s sede da copa esse ano. Por�m, h� muitas pessoas protestando 
 contra o governo. Em redes sociais � poss�vel ver pessoas afirmando que n�o 
 vai ter copa devido aos protestos.

 Mas esses rumores de que n�o haver� copa s�o totalmente falsos, a presidente 
 Dilma Roussef j� avisou: vai ter copa sim, e se reclamar vai ter duas!
 
 ENTRADA
 A entrada cont�m v�rios casos de teste e termina com EOF. Cada caso de teste 
 consiste de uma linha contendo o n�mero N de reclama��es sobre a copa 
 encaminhadas para a presidente (0 <= N <= 100).
 
 SA�DA
 Para cada teste, a sa�da consiste de uma linha dizendo "vai ter copa!" caso 
 n�o haja reclama��es para a presidente. Caso haja reclama��es, a sa�da dever� 
 dizer "vai ter duas!".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1564 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int reclamacoes;
        while (sc.hasNext()) {
        	reclamacoes = sc.nextInt();
        	if (reclamacoes == 0) System.out.println("vai ter copa!");
        	else System.out.println("vai ter duas!");
        }

        sc.close();
    }
	
}