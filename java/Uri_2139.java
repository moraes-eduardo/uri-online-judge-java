// package Iniciante;

/*
 
 QUEST�O
 Pedrinho � um garoto que adora festas em fam�lia, principalmente o Natal, 
 quando ganha presente dos pais e dos av�s. Esse ano, seu pai lhe prometeu 
 um PS4, mas somente se Pedrinho conseguir resolver alguns desafios ao 
 longo do ano, sendo um deles, escrever um programa que calcule quantos 
 dias faltam para o Natal.

 Entretanto, Pedrinho tem somente 9 anos e n�o tem no��o alguma de 
 programa��o, mas sabe que voc�, primo dele, mexe com "coisas de computador", 
 e dessa forma, pediu para voc� escrever o programa para ele. N�o somente 
 isso, mas prometeu que deixaria voc� jogar todo final de semana e por quanto 
 tempo quiser!
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. Cada linha cont�m o m�s e 
 o dia do ano de 2016 (ano bissexto). A entrada termina com fim de arquivo.
 
 SA�DA
 Se for Natal, imprima "E natal!"; se faltar somente um dia, imprima "E 
 vespera de natal!"; se j� passou, imprima "Ja passou!". Caso contr�rio, 
 imprima "Faltam X dias para o natal!", sendo X o n�mero de dias que faltam 
 para o Natal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2139 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int mes, dia, faltando;
    	String[] data;
    	while (sc.hasNext()) {
    		data = sc.nextLine().split(" ");
    		mes = Integer.parseInt(data[0]);
    		dia = Integer.parseInt(data[1]);
    		faltando = ((12 - mes) * 30) + (30 - dia);
    		
    		if (mes == 2) faltando -= 1;
    		if (mes == 4) faltando -= 1;
    		if (mes == 5) faltando -= 1;
    		if (mes == 8) faltando += 1;
    		if (mes == 11) faltando -=1;
    		if (mes > 5) faltando -= 2;
    		if (mes > 7) faltando -= 2;
    		if (mes > 11) faltando -= 1;
    		
    		if (faltando == 1) System.out.println("E vespera de natal!");
    		else if (faltando == 0) System.out.println("E natal!");
    		else if (faltando < 0) System.out.println("Ja passou!");
    		else System.out.println("Faltam " + faltando + " dias para o natal!");
    	}

		sc.close();
    }
	
}