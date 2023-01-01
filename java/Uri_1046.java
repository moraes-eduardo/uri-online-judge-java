// package Iniciante;

/*
 
 QUEST�O
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o 
 do jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, 
 tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.
 
 ENTRADA
 A entrada cont�m dois valores inteiros representando a hora de in�cio e a hora de fim do jogo.

 SA�DA
 Apresente a dura��o do jogo conforme exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1046 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		
        int hInicial = sc.nextInt();
        int hFinal = sc.nextInt();

        if (hInicial > hFinal) { 
            System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
        } else if (hFinal > hInicial) {
            System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();

    }
    
}