// package Iniciante;

/*
 
 QUEST�O
 Ao observar a curva de velocidade de um motor, o engenheiro Z� percebeu que 
 sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms. 
 Mas esta queda acontecia em medidas diferentes a cada novo teste do motor.

 Z� ficou curioso com essa falta de padr�o e quer saber, para cada teste do 
 motor, qual a primeira medida em que ocorre uma queda de velocidade.
 
 ENTRADA
 A entrada � um teste do motor e � dada em duas linhas. A primeira tem o n�mero 
 N de medidas de velocidade do motor (1 < N <= 100). A segunda linha tem N 
 inteiros: o n�mero de RPM (rota��es por minuto) Ri de cada medida (0 <= Ri <= 
 10000, para todo Ri, tal que 1 <= i <= N). Uma medida � considerada uma queda 
 se � menor que a medida anterior.
 
 SA�DA
 A sa�da � o �ndice da medida em que houve a primeira queda de velocidade no 
 teste. Caso n�o aconte�a uma queda de velocidade a sa�da deve ser o n�mero zero.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2167 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] R = new int[N];
    	int queda = 0;
    	for (int i = 0; i < N; i++) {
    		R[i] = sc.nextInt();
    	}
    	for (int i = 0; i < N-1; i++) {
    		if (R[i] > R[i+1]) {
    			queda = i+2;
    			break;
    		}
    	}
    	System.out.println(queda);

		sc.close();
    }
	
}