// package Iniciante;

/*
 
 QUEST�O
 Em 2012 foi alcan�ado um novo recorde mundial na famosa Competi��o de Cachorros-Quentes 
 do Nathan: o campe�o, Joey Chestnut, devorou 68 cachorros-quentes em dez minutos, 
 um aumento incr�vel em rela��o aos 62 sandu�ches devorados pelo mesmo Chestnut em 2011.

 O restaurante Nathan�s Famous Corporation, localizado no Brooklyn, NY, � o respons�vel 
 pela competi��o. Eles produzem deliciosos cachorros-quentes, mundialmente famosos, mas 
 quando o assunto � matem�tica eles n�o s�o t�o bons. Eles desejam ser listados no Livro 
 de Recordes do Guinness, mas para isso devem preencher um formul�rio descrevendo os 
 fatos b�sicos da competi��o. Em particular, eles devem informar o n�mero m�dio de 
 cachorros-quentes consumidos pelos participantes durante a competi��o.

 Voc� pode ajud�-los? Eles prometeram pag�-lo com um dos seus saborosos cachorros-quentes. 
 Dados o n�mero total de cachorros-quentes consumidos e o n�mero total de participantes na 
 competi��o, voc� deve escrever um programa para determinar o n�mero m�dio de 
 cachorros-quentes consumidos pelos participantes.
 
 ENTRADA
 A entrada consiste de uma �nica linha que cont�m dois inteiros H e P (1 <= H, P <= 1000) 
 indicando respectivamente o n�mero total de cachorros-quentes consumidos e o n�mero total 
 de participantes na competi��o.
 
 S�IDA
 Seu programa deve produzir uma �nica linha com um n�mero racional representando o n�mero 
 m�dio de cachorros-quentes consumidos pelos participantes. O resultado deve ser escrito 
 como um n�mero racional com exatamente dois d�gitos ap�s o ponto decimal, arredondado se necess�rio.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2234 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double H = sc.nextDouble();
		double P = sc.nextDouble();
		double media = H / P;
		System.out.println(String.format("%.2f", media));

		sc.close();
	}
	
}