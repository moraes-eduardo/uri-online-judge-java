// package Iniciante;

/*
 
 QUEST�O
 Pedrinho est� organizando um evento em sua Universidade. O evento dever� 
 ser no m�s de Abril, iniciando e terminando dentro do m�s. O problema � que 
 Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe 
 quando inicia e quando termina o evento.

 Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� 
 ajudar Pedrinho a calcular a dura��o deste evento.
 
 ENTRADA
 Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o 
 e o dia do m�s no qual o evento vai come�ar. Na linha seguinte, ser� informado o 
 momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta 
 linha de entrada haver� outra informa��o no mesmo formato das duas primeiras linhas, 
 indicando o t�rmino do evento.
 
 SA�DA
 Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:

 W dia(s)
 X hora(s)
 Y minuto(s)
 Z segundo(s)
 
 Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1061 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
        String[] SdiaInicial = sc.nextLine().split(" ");
        String[] ShoraInicial = sc.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = sc.nextLine().split(" ");
        String[] ShoraFinal = sc.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(SdiaInicial[1]);
        int horaInicial = Integer.parseInt(ShoraInicial[0]);
        int minutoInicial = Integer.parseInt(ShoraInicial[1]);
        int segundoInicial = Integer.parseInt(ShoraInicial[2]);
        int diaFinal = Integer.parseInt(SdiaFinal[1]);
        int horaFinal = Integer.parseInt(ShoraFinal[0]);
        int minutoFinal = Integer.parseInt(ShoraFinal[1]);
        int segundoFinal = Integer.parseInt(ShoraFinal[2]);
        
        if (segundoFinal < segundoInicial) {
        	totalSegundos += (60 - segundoInicial) + segundoFinal;
        	totalMinutos--;
        } else if (segundoFinal > segundoInicial) {
        	totalSegundos += segundoFinal - segundoInicial;
        } else {
        	totalSegundos = 0;
        }
        
        if (minutoFinal < minutoInicial) {
        	totalMinutos += (60 - minutoInicial) + minutoFinal;
        	totalHoras--;
        } else if (minutoFinal > minutoInicial)  {
        	totalMinutos += minutoFinal - minutoInicial;
        } else {
        	totalMinutos = 0;
        }
        
        if (horaFinal < horaInicial) {
        	totalHoras += (24 - horaInicial) + horaFinal;
        	totalDias--;
        } else if (horaFinal > horaInicial) {
        	totalHoras += horaFinal - horaInicial;
        } else {
        	totalHoras = 0;
        }
        
        if (diaFinal < diaInicial) {
        	totalDias += (30 - diaInicial) + diaFinal;
        } else if (diaFinal > diaInicial) {
        	totalDias += diaFinal - diaInicial;
        } else {
        	totalDias = 0;
        }
                
        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");

        sc.close();
    }
	
}