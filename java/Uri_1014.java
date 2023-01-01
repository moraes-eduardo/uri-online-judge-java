// package Iniciante;

/*

 QUEST�O
 Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia 
 total percorrida (em Km) e o total de combust�vel gasto (em litros).

 ENTRADA
 O arquivo de entrada cont�m dois valores: um valor inteiro X representando 
 a dist�ncia total percorrida (em Km), e um valor real Y representando o 
 total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

 SA�DA
 Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas 
 ap�s a v�rgula, seguido da mensagem "km/l".

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1014 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double media = x / y;
        System.out.println(String.format("%.3f km/l", media));   

        sc.close();
    }
	
}