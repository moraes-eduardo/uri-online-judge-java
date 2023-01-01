// package Iniciante;

/*
 
 QUEST�O
 O MacPRONALTS est� com uma super promo��o, exclusivo para os competidores 
 da primeira Seletiva do MaratonaTEC. S� que teve um problema, todos os 
 maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila 
 muito grande. O pior � que a mo�a do caixa estava sem calculadora ou um 
 programa para ajud�-la a calcular com maior agilidade, eis que surge voc� 
 para fazer um programa para ajudar a coitada e aumentar a renda do MacPRONALTS. 
 Segue o card�pio do dia contendo o n�mero do produto e seu respectivo valor.

 1001 | R$ 1.50

 1002 | R$ 2.50

 1003 | R$ 3.50

 1004 | R$ 4.50

 1005 | R$ 5.50
 
 ENTRADA
 A primeira entrada informada � a quantidade de produtos comprados (1 <= p <= 5). 
 Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.
 
 Obs.: n�o poder�o ser informados n�meros de produtos repetidos.

 SA�DA
 Voc� deve imprimir o valor da compra com duas casas decimais.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1985 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();
    	double total = 0;
    	int q, c;
    	for (int i = 0; i < p; i++) {
    		c = sc.nextInt();
    		q = sc.nextInt();
    		switch (c) {
    			case 1001: total += q * 1.50; break;
    			case 1002: total += q * 2.50; break;
    			case 1003: total += q * 3.50; break;
    			case 1004: total += q * 4.50; break;
    			case 1005: total += q * 5.50; break;
    		}
    	}
    	System.out.println(String.format("%.2f", total));

		sc.close();
    }
	
}