// package Iniciante;

/*

 QUEST�O
 Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel 
 gastos em uma viagem, ao utilizar um autom�vel que faz 12 KM/L. Para isso, 
 ele gostaria que voc� o auxiliasse atrav�s de um simples programa. Para 
 efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e 
 a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia 
 percorrida e, em seguida, calcular quantos litros seriam necess�rios. 
 Mostre o valor com 3 casas decimais ap�s o ponto.

 ENTRADA
 O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na 
 viagem (em horas) e o segundo � a velocidade m�dia durante a mesma (em km/h).

 SA�DA
 Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1017 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double kilometros = tempo * velocidade;
        double media = kilometros / 12;
        System.out.println(String.format("%.3f", media)); 

        sc.close();
    }
	
}