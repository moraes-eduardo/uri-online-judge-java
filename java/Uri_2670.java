// package Iniciante;

/*
 
 QUEST�O
 O novo pr�dio da Sociedade Brasileira de Computa��o (SBC) possui 3 andares. 
 Em determinadas �pocas do ano, os funcion�rios da SBC bebem muito caf�. Por 
 conta disso, a presid�ncia da SBC decidiu presentear os funcion�rios com 
 uma nova m�quina de expresso. Esta m�quina deve ser instalada em um dos 3 
 andares, mas a instala��o deve ser feita de forma que as pessoas n�o percam 
 muito tempo subindo e descendo escadas.

 Cada funcion�rio da SBC bebe 1 caf� expresso por dia. Ele precisa ir do andar 
 onde trabalha at� o andar onde est� a m�quina e voltar para seu posto de 
 trabalho. Todo funcion�rio leva 1 minuto para subir ou descer um andar. Como 
 a SBC se importa muito com a efici�ncia, ela quer posicionar a m�quina de 
 forma a minimizar o tempo total gasto subindo e descendo escadas.

 Sua tarefa � ajudar a diretoria a posicionar a m�quina de forma a minimizar 
 o tempo total gasto pelos funcion�rios subindo e descendo escadas.
 
 ENTRADA
 A entrada consiste em 3 n�meros, A1 , A2 , A3 (0 <= A1 , A2 , A3 <= 1000), um 
 por linha, onde Ai representa o n�mero de pessoas que trabalham no i-�simo andar.
 
 SA�DA
 Seu programa deve imprimir uma �nica linha, contendo o n�mero total de minutos 
 a serem gastos com o melhor posicionamento poss�vel da m�quina.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2670 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        int minutos = 0;
        if ((A2 >= A3 && A2 >= A1))
        	minutos = (A3 + A1) * 2;
        else if (A3 >= A1 && (A1 + A2) <= A3)
        	minutos = (A1 * 4) + (A2 * 2);
        else if (A1 >= A3 && (A3 + A2) <= A1)
        	minutos = (A3 * 4) + (A2 * 2);
        else 
        	minutos = (A3 + A1) * 2;
        System.out.println(minutos);

        sc.close();
    }
	
}