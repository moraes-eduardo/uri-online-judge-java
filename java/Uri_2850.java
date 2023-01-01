// package Iniciante;

/*
 
 QUEST�O
 Humberto tem um papagaio muito esperto. Quando est� com as duas pernas no 
 ch�o, o papagaio fala em portugu�s. Quando levanta a perna esquerda, fala 
 em ingl�s. Por fim, quando levanta a direita fala em franc�s. Nico, amigo 
 de Humberto, ficou fascinado com o animal. Em sua emo��o perguntou: �E 
 quando ele levanta as duas?�. Antes que Humberto pudesse responder, o 
 papagaio gritou: �Ai eu caio, idiota!�.
 
 ENTRADA
 A entrada consiste de diversos casos de teste. Cada caso de teste consiste 
 uma string informando qual a situa��o de levantamento de pernas do papagaio.
 
 SA�DA
 Para cada condi��o de levantamento de pernas do papagaio, imprima a linguagem 
 que ele utilizar�. Caso ele levante as duas pernas, imprima �caiu�. Quebre 
 uma linha a cada caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2850 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equalsIgnoreCase("esquerda")) System.out.println("ingles");
            else if (str.equalsIgnoreCase("direita")) System.out.println("frances");
            else if (str.equalsIgnoreCase("nenhuma")) System.out.println("portugues");
            else System.out.println("caiu");
        }

        sc.close();
    }
	
}
