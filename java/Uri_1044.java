// package Iniciante;

/*
 
 QUEST�O
 Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma 
 mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
 valores lidos s�o m�ltiplos entre si.
 
 ENTRADA
 A entrada cont�m valores inteiros.

 SA�DA
 A sa�da deve conter uma das mensagens conforme descrito acima.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1044 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
    
}