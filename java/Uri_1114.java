// package Iniciante;

/*
 
 QUEST�O
 Escreva um programa que repita a leitura de uma senha at� que ela seja 
 v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem 
 "Senha Invalida". Quando a senha for informada corretamente deve ser 
 impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere 
 que a senha correta � o valor 2002. 
 
 ENTRADA
 A entrada � composta por v�rios casos de testes contendo valores inteiros.

 SA�DA
 Para cada valor lido mostre a mensagem correspondente � descri��o do problema.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1114 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int senha = sc.nextInt();
    	while (senha != 2002) {
    		System.out.println("Senha Invalida");
        	senha = sc.nextInt();
    	}
		System.out.println("Acesso Permitido");

		sc.close();
    }
	
}