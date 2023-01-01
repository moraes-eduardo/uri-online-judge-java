// package Iniciante;

/*
 
 QUEST�O
 Devita � o pr�ncipe dos Calsadins. Juntamente com Pana, eles v�o atr�s de 
 Tataroko, o nome de nascimento de Kogu, para tentar dominar o mundo. Ele 
 possui um rastreador que mede o n�vel de energia de qualquer ser vivo. 
 Todos os seres com o n�vel menor ou igual a 8000, ele considera como se 
 fosse um inseto. Quando passa deste valor, que foi o caso de Kogu, ele se 
 espanta e grita �Mais de 8000�. Baseado nisso, utilize a mesma tecnologia 
 e analise o n�vel de energia dos seres vivos.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha cont�m um 
 n�mero inteiro C relativo ao n�mero de casos de teste. Em seguida, haver� C 
 linhas, com um n�mero inteiro N (100 <= N <= 100000) relativo ao n�vel de 
 energia de um ser vivo.
 
 SA�DA
 Para cada valor lido, imprima o texto correspondente.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2862 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
        	int N = sc.nextInt();
        	if (N > 8000) 
        		System.out.println("Mais de 8000!");
        	else 
        		System.out.println("Inseto!");
        }

        sc.close();
    }
	
}