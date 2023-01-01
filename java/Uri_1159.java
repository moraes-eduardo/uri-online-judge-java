// package Iniciante;

/*
 
 QUEST�O
 O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir� 
 parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma 
 dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se o 
 valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado 
 da opera��o: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por 
 exempo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.
 
 ENTRADA
 O arquivo de entrada cont�m muitos valores inteiros. O �ltimo valor do arquivo � zero.

 SA�DA
 Imprima a sa�da conforme a explica��o acima e o exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1159 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int soma=0, cont=0;
        while (X != 0) {
        	cont = 0;
        	soma = 0;
        	while (cont < 5) {
        		if (X % 2 == 0) {
        			soma += X;
        			cont++;
        		}
        		X++;
        	}
        	System.out.println(soma);
        	X = sc.nextInt();
        }

		sc.close();
    }
	
}