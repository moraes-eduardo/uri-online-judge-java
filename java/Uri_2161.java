// package Iniciante;

/*
 
 QUEST�O
 Uma das formas de calcular a raiz quadrada de um n�mero natural � pelo 
 m�todo das fra��es peri�dicas continuadas. Esse m�todo usa como denominador 
 uma repeti��o de fra��es. Essa repeti��o pode ser feita uma quantidade 
 espec�fica de vezes.

 Por exemplo, ao repetir 2 vezes a fra��o continuada para calcular a raiz 
 quadrada de 10, temos a f�rmula abaixo.

 Sua tarefa �, dado o n�mero N de repeti��es, calcular o valor aproximado 
 da raiz quadrada de 10.
 
 ENTRADA
 A entrada � um n�mero natural N (0 <= N <= 100), que indica o n�mero de 
 repeti��es do denominador na fra��o continuada.
 
 SA�DA
 A sa�da � o valor aproximado da raiz quadrada com 10 casas decimais.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2161 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double N = sc.nextInt();
        double x = 0.0;
    	for (int i = 0; i < N; i++) {
            x += 6.0;
            x = (1.0 / x);
    	}
        x += 3.0;
    	System.out.println(String.format("%.10f", x));

        sc.close();
    }
	
}