// package Iniciante;

/*
 
 QUEST�O
 Umil Bolt � um excelente corredor. Sua especialidade � a prova dos 100 metros 
 rasos. Todos os dias, ele faz uma bateria de tentativas de correr esta prova 
 em um tempo cada vez menor. Pode se perceber que, dependendo da quantidade de 
 tentativas, o seu desempenho melhora ou piora. Sobre isso, ele pede a sua 
 ajuda para calcular a tentativa mais r�pida de cada bateria di�ria.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha de cada caso 
 de teste cont�m um n�mero inteiro T (2 <= T <= 99) relativo ao n�mero de 
 tentativas de um dia. As T linhas seguintes cont�m um n�mero real Ti 
 (9 <= Ti <= 11) relativo ao tempo, em segundos, da i-�sima tentativa da 
 bateria. A entrada termina com fim de arquivo.
 
 SA�DA
 Para cada caso de teste de entrada do seu programa, voc� deve imprimir um 
 n�mero real contendo o tempo da tentativa mais r�pida de cada bateria.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2863 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int T = sc.nextInt();
        	double melhor = 999;
        	for (int i = 0; i < T; i++) {
        		double t = sc.nextDouble();
        		if (t < melhor) melhor = t;
        	}
        	System.out.println(melhor);
        }

		sc.close();
    }
	
}