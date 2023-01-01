// package Iniciante;

/*
 
 QUEST�O
 Sr. Amn�sio tinha uma grande dificuldade em guardar senhas. Para lembr�-las, 
 ele sempre usava n�meros, e as escrevia em peda�os de papel, que tamb�m 
 perdia com facilidade, fazendo com que ele precisasse modificar a senha 
 cada vez que isto acontecia. Cansado, ele pensou em uma forma mais pr�tica: 
 colocava no papel um n�mero pr�ximo da senha, depois ele usava sempre uma 
 mesma conta para lembrar a senha, baseada no n�mero escrito no papel. Mas ele 
 tamb�m esquecia a f�rmula, por isto, pediu para voc� escrever um programa que, 
 dado o n�mero do papel, informe a senha correspondente.

 Escreva um programa que, dado um n�mero, informe a respectiva senha.
 
 ENTRADA
 A entrada ter� diversos casos de teste. A cada caso de teste, ter� um n�mero 
 N, que representa o n�mero escrito no papel (1001 <= N <= 9999). A entrada 
 termina com o fim do arquivo.
 
 SA�DA
 Para cada caso de teste, imprima a senha correspondente. Em todos os casos, 
 a f�rmula ser� a mesma, igual aos exemplos abaixo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2146 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int numeroProximo, senha;
    	while (sc.hasNext()) {
	    	numeroProximo = sc.nextInt();
	    	senha = numeroProximo - 1;
	    	System.out.println(senha);
    	}

		sc.close();
    }
	
}