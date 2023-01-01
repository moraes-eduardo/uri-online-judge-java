// package Iniciante;

/*
 
 QUEST�O
 A corrida de lesmas � um esporte que cresceu muito nos �ltimos anos, fazendo 
 com que v�rias pessoas dediquem suas vidas tentando capturar lesmas velozes, 
 e treina-las para faturar milh�es em corridas pelo mundo. Por�m a tarefa de 
 capturar lesmas velozes n�o � uma tarefa muito f�cil, pois praticamente todas 
 as lesmas s�o muito lentas. Cada lesma � classificada em um n�vel dependendo 
 de sua velocidade:

 N�vel 1: Se a velocidade � menor que 10 cm/h .
 N�vel 2: Se a velocidade � maior ou igual a 10 cm/h e menor que 20 cm/h .
 N�vel 3: Se a velocidade � maior ou igual a 20 cm/h .

 Sua tarefa � identificar qual n�vel de velocidade da lesma mais veloz de um 
 grupo de lesmas.
 
 ENTRADA
 A entrada consiste de m�ltiplos casos de teste, e cada um consiste em duas 
 linhas: A primeira linha cont�m um inteiro L (1 <= L <= 500) representando o 
 n�mero de lesmas do grupo, e a segunda linha cont�m L inteiros Vi (1 <= Vi <= 50) 
 representando as velocidades de cada lesma do grupo.

 A entrada termina com o fim do arquivo (EOF).
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha indicando o n�vel de velocidade 
 da lesma mais veloz do grupo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1789 {
    
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L, nivel, velocidade;
        while (sc.hasNext()) {
        	L = sc.nextInt();
        	nivel = 0;
        	for (int i = 0; i < L; i++) {
        		velocidade = sc.nextInt();
        		if (velocidade < 10 && nivel <= 1)  nivel = 1;
        		else if (velocidade >= 20 && nivel <= 3) nivel = 3;
        		else if (nivel < 2) nivel = 2;
        	}
        	System.out.println(nivel);
        }

		sc.close();
	}
	
}