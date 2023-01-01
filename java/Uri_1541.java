// package Iniciante;

/*
 
 QUEST�O
 Sr PI � um construtor muito famoso na cidade de Programol�ndia. Ele precisa 
 de sua ajuda para encontrar os melhores terrenos da cidade, para realizar 
 assim a constru��o de v�rios projetos de casas que possui.

 Considere que ele tenha por exemplo, um projeto para construir uma casa de 8 
 metros por 10 metros, e a legisla��o do munic�pio permite a constru��o de no 
 m�ximo 100% do terreno. Como todos os terrenos nesta cidade s�o perfeitamente 
 quadrados e o valor dos lados da casa s�o apenas uma refer�ncia para a �rea 
 total a ser constru�da (80 metros quadrados), o sr PI precisaria de um terreno 
 de 8.994 metros, o que simplificado daria como resultado 8 metros e o tamanho 
 real da casa seria de 64 metros quadrados. Se a legisla��o permitisse a utilizar 
 50% do terreno, o mesmo teria que ter 160 metros para que 50% dele fosse 80 
 metros quadrados, o suficiente para uma casa de 8 x 8 metros (64 metros quadrados).
 No primeiro caso de teste, como o percentual para construir � de apenas 20%, o 
 terreno teria que ter 20 metros de lado para que 1/5 deste terreno tivesse o 
 tamanho de 80 metros quadrados. Ajude o sr PI a determinar o tamanho minimo do terreno.
  
 ENTRADA
 A entrada � composta de v�rios casos de testes. Cada caso de teste � composto de tr�s 
 n�meros inteiros A, B e C ( > 0 e <= 1000) separados por um espa�o. Estes n�meros 
 representam as medidas da casa (A e B) e o percentual m�ximo liberado para construir 
 nesse bairro (C). Um �nico valor igual a 0 indica o fim das entradas.
 
 SA�DA
 Voc� dever� informar um n�mero inteiro, o qual representa a medida do lado do terreno. 
 Este valor dever� ser truncado caso necess�rio.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1541 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A, B, C, X;
        while ((A = sc.nextInt()) != 0) {
        	B = sc.nextInt();
        	C = sc.nextInt();
        	X = Math.sqrt((((A * B) / C) * 100.0));
        	System.out.println((int)X);
        }

        sc.close();
    }
	
}