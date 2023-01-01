// package Iniciante;

/*

 QUEST�O
 Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado 
 evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

 ENTRADA
 O arquivo de entrada cont�m um valor inteiro N.

 SA�DA
 Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
 horas:minutos:segundos, conforme exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1019 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int duracaoSegundos = sc.nextInt();
        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;
        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;
        int segundos = duracaoSegundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);		

        sc.close();
    }
	
}