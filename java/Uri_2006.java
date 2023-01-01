// package Iniciante;

/*
 
 QUEST�O
 Degusta��o de ch� �s escuras � a habilidade de identificar um ch� usando 
 apenas seus sentidos do olfato e paladar.

 Isto faz parte da Competi��o Ideal de Consumidores de Ch� Puro (da sigla 
 em ingl�s ICPC), que um programa de TV local est� organizado. Durante o 
 show, um bule de ch� completo � preparado e s�o entregues uma x�cara de 
 ch� para cada um dos cinco competidores. Os participantes devem cheirar, 
 saborear e avaliar a amostra, de modo a identificar o tipo de ch�, que 
 pode ser: (1) o ch� branco; (2) ch� verde; (3) ch� preto; ou (4) ch� de 
 ervas. No final, as respostas s�o verificadas para determinar o n�mero de 
 suposi��es corretas.

 Dado o tipo de ch� real e as respostas fornecidas, determinar o n�mero de 
 participantes que receberam a resposta correta.
 
 ENTRADA
 A primeira linha cont�m um inteiro T representando o tipo de ch� (1 <= T <= 4). 
 A segunda linha cont�m cinco inteiros A, B, C, D e E, que indica a resposta 
 dada por cada competidor (1 <= A, B, C, D, E <= 4).
 
 SA�DA
 A sa�da cont�m um inteiro representando o n�mero de concorrentes que obtiveram 
 a resposta correta.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2006 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int X, cont = 0;
    	for (int i = 0; i < 5; i++) {
    		X = sc.nextInt();
    		if (X == T) cont++;
    	}
    	System.out.println(cont);

		sc.close();
    }
	
}