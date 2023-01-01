// package Iniciante;

/*
 
 QUEST�O 
 Escreva um programa para ler as notas da primeira e a segunda avalia��o 
 de um aluno. Calcule e imprima a m�dia semestral. O programa s� dever� 
 aceitar notas v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). 
 Cada nota deve ser validada separadamente.

 No final deve ser impressa a mensagem �novo calculo (1-sim 2-nao)�, 
 solicitando ao usu�rio que informe um c�digo (1 ou 2) indicando se ele deseja 
 ou n�o executar o algoritmo novamente, (aceitar apenas os c�digo 1 ou 2). Se 
 for informado o c�digo 1 deve ser repetida a execu��o de todo o programa para 
 permitir um novo c�lculo, caso contr�rio o programa deve ser encerrado.
 
 ENTRADA
 O arquivo de entrada cont�m v�rios valores reais, positivos ou negativos. Quando 
 forem lidas duas notas v�lidas, deve ser lido um valor inteiro X . O programa 
 deve parar quando o valor lido para este X for igual a 2.
 
 SA�DA
 Se uma nota inv�lida for lida, deve ser impressa a mensagem �nota invalida�. 
 Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem �media = � 
 seguido do valor do c�lculo.

 Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e 
 esta mensagem deve ser apresentada novamente se o valor da entrada padr�o para X for 
 menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

 A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1118 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, flag = 1;
		while (flag == 1) {
			
			nota1 = sc.nextDouble();
			while (nota1 > 10 || nota1 < 0) {
				System.out.println("nota invalida");
				nota1 = sc.nextDouble();
			}
			
			nota2 = sc.nextDouble();
			while (nota2 > 10 || nota2 < 0) {
				System.out.println("nota invalida");
				nota2 = sc.nextDouble();
			}
			
			double media = (nota1 + nota2) / 2;
			System.out.println(String.format("media = %.2f", media));
			
			System.out.println("novo calculo (1-sim 2-nao)");
			flag = sc.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				flag = sc.nextInt();
			}
		}

		sc.close();
    }
	
}