// package Iniciante;

/*
 
 QUEST�O
 A empresa ABC resolveu conceder um aumento de sal�rios a seus funcion�rios 
 de acordo com a tabela abaixo: http://prntscr.com/jwh30j
 
 Leia o sal�rio do funcion�rio e calcule e mostre o novo sal�rio, bem como o 
 valor de reajuste ganho e o �ndice reajustado, em percentual.

 ENTRADA
 A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.

 SA�DA
 Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e o 
 percentual de reajuste ganho, conforme exemplo abaixo.
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1048 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double salario = sc.nextDouble();
		double reajuste;
		double novoSalario;
		int percent;
		
		if (salario >= 0 && salario <= 400) {
			reajuste = salario * 0.15;
			novoSalario = salario + reajuste;
			percent = 15;
		} else if (salario > 400 && salario <= 800) {
			reajuste = salario * 0.12;
			novoSalario = salario + reajuste;
			percent = 12;
		} else if (salario > 800 && salario <= 1200) {
			reajuste = salario * 0.10;
			novoSalario = salario + reajuste;
			percent = 10;
		} else if (salario > 1200 && salario <= 2000) {
			reajuste = salario * 0.07;
			novoSalario = salario + reajuste;
			percent = 7;
		} else {
			reajuste = salario * 0.04;
			novoSalario = salario + reajuste;
			percent = 4;
		}
		
		System.out.println("Novo salario: " + df.format(novoSalario));
		System.out.println("Reajuste ganho: " +df.format(reajuste));
		System.out.println("Em percentual: " + percent + " %");

		sc.close();
	}
	
}