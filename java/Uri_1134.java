// package Iniciante;

/*
 
 QUEST�O
 Um Posto de combust�veis deseja determinar qual de seus produtos tem a 
 prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de 
 combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 
 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa 
 de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O 
 programa ser� encerrado quando o c�digo informado for o n�mero 4.
 
 ENTRADA
 A entrada cont�m apenas valores inteiros e positivos.
 
 SA�DA
 Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
 que abasteceram cada tipo de combust�vel, conforme exemplo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1134 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;
		while (tipo != 4) {
			tipo = sc.nextInt();
			while (tipo < 1 || tipo > 4) {
				tipo = sc.nextInt();
			}
			switch (tipo) {
				case 1: alcool++; break;
				case 2: gasolina++; break;
				case 3: diesel++; break;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
    }
	
}