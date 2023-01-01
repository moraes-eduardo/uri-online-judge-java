// package Iniciante;

/*
 
 QUEST�O
 Ao observar a paisagem da Nlog�nia, o professor MC percebeu que a cada 
 intervalo de 100 metros existe um pico. E que exatamente na metade de 
 dois picos h� um vale. Logo, a cada 50 metros h� um vale ou um pico e, 
 ao longo da paisagem, n�o h� um pico seguido por outro pico, nem um vale 
 seguido por outro vale.

 O professor MC ficou curioso com esse padr�o e quer saber se, ao medir 
 outras paisagens, isso se repete. Sua tarefa �, dada uma paisagem, indicar 
 se ela possui esse padr�o ou n�o.
 
 ENTRADA
 A entrada � dada em duas linhas. A primeira tem o n�mero N de medidas da 
 paisagem (1 < N <= 100). A segunda linha tem N inteiros: a altura Hi de 
 cada medida (-10000 <= Hi <= 10000, para todo Hi, tal que 1 <= i <= N). 
 Uma medida � considerada um pico se � maior que a medida anterior. Uma 
 medida � considerada um vale se � menor que a medida anterior.
 
 SA�DA
 A sa�da � dada em uma �nica linha. Caso a paisagem tenha o mesmo padr�o da 
 Nlog�nia, deve ser mostrado o n�mero 1. Caso contr�rio, mostra-se o n�mero 0.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2162 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int H[] = new int[N];
    	int padrao = 0;
    	
    	for (int i = 0; i < N; i++) {
    		H[i] = sc.nextInt();
    	}
    	
    	if (N > 2) {
	    	for (int i = 2; i < N; i++) {
	    		if ((H[i-2] > H[i-1] && H[i-1] < H[i]) || (H[i-2] < H[i-1] && H[i-1] > H[i])) {
	    			padrao = 1;
	    		} else {
	    			padrao = 0; 
		    		break;
	    		}
	    	}
    	} else { 
    		if (H[0] != H[1]) padrao = 1;
    	}
    	
    	System.out.println(padrao);

		sc.close();
    }
	
}