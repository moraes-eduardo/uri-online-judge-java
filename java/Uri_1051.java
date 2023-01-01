// package Iniciante;

/*
 
 QUEST�O
 Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes 
 em pagar seus impostos, pois sabem que nele n�o existem pol�ticos corruptos 
 e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem 
 qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.

 Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa 
 de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de 
 Imposto de Renda, segundo a tabela abaixo: http://prntscr.com/jwr7in
 
 Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre 
 R$ 1000.00, pois a faixa de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta 
 de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � de 8% sobre R$ 1000.00 
 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso 
 com duas casas decimais.
 
 ENTRADA
 A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.

 SA�DA
 Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, 
 com duas casas ap�s o ponto. Se o valor de entrada for menor ou igual a 2000, dever� ser 
 impressa a mensagem "Isento".
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1051 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario >= 0 && salario <= 2000) {
        	System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
        	System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
        } else if (salario > 3000 && salario <= 4500) {
        	System.out.println(String.format("R$ %.2f", ((salario - 3000)  * 0.18) + 80));
        } else {
        	System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
        }

        sc.close();
    }
	
}