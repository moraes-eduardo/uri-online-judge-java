// package Iniciante;

/*
 
 QUEST�O
 Bem-vindo � 3� Maratona de Programa��o J�nior da UFFS. Esperamos sinceramente 
 que as pr�ximas horas sejam muito produtivas para voc�, que voc� fa�a muitos 
 bal�es e que, acima de tudo, voc� se divirta! Lembre que voc� sempre pode pedir 
 esclarecimento quando n�o entender direito a descri��o de um problema. Lembre 
 tamb�m que �s 17:30 os ju�zes autom�ticos ser�o desligados e a competi��o 
 entrar� em modo blind, de modo que todas as submiss�es neste per�odo s� 
 come�ar�o a ser julgadas �s 18:10. Por favor, fique conosco at� o fim da 
 competi��o, trabalhando nas solu��es dos problemas at� o �ltimo minuto, pois, 
 enquanto a competi��o ainda est� ocorrendo, sempre h� esperan�a!

 E foi esperan�a que motivou a Vov� Zaz�, uma senhora de 72 anos, a realizar seu 
 sonho de come�ar um curso universit�rio. Ela est� fascinada com tudo o que diz 
 respeito � Universidade: com as aulas, com a biblioteca, com os projetos de 
 pesquisa e extens�o, com o restaurante universit�rio, mas especialmente com a 
 carteirinha de estudante que ela pode utilizar para pagar meia entrada no cinema. 
 Semana passada, Vov� Zaz� e seus colegas de turma foram ao cinema assistir a um 
 filme, mas ficaram estarrecidos com o aumento do pre�o do ingresso. Revoltados, 
 eles decidiram fazer uma manifesta��o contra o sistema capitalista opressor, 
 agendada para amanh� na Pra�a General Bertaso. Vov� Zaz� quer colaborar com o 
 movimento fazendo um cartaz com a seguinte palavra de ordem:

 QUE ABSURDO! O PRE�O DO CINEMA SUBIU � % !!

 Mas ela n�o � muito boa em Matem�tica, e est� solicitando sua ajuda para calcular 
 a porcentagem de que precisa para completar o cartaz.
 
 ENTRADA
 A �nica linha da entrada consiste de dois valores A e B (0.00 < A <= B <= 1000.00), 
 os quais, fornecidos com exatos dois d�gitos ap�s o ponto separador decimal, 
 representam respectivamente o valor antigo e o valor novo do ingresso do cinema.
 
 SA�DA
 A �nica linha da sa�da deve consistir unicamente de um valor, que represente como 
 uma porcentagem o aumento do valor do ingresso. O valor deve ser acompanhado do 
 s�mbolo % e conter exatos dois d�gitos ap�s o ponto separador decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1963 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	double A = sc.nextDouble();
    	double B = sc.nextDouble();
    	double aumento = (B * 100.0 / A) - 100.0;
    	System.out.println(String.format("%.2f%%", aumento));

		sc.close();
    }
	
}