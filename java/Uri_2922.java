// package Ad-Hoc;

/*
 
 QUEST�O
 O professor de programa��o Barroquinha adora passar quest�es do Uri_para seus 
 alunos, por�m o professor Umbujahyba mudou a senha da rede e esqueceu de passar 
 para Barroquinha.

 Como Barroquinha n�o enxerga muito bem os numeros das salas, ele pediu para voc� 
 desenvolver um algoritmo que calcula quantas portas ele deve passar para chegar 
 na sala de Umbujahyba.
 
 ENTRADA
 A entrada cont�m 2 valores inteiros B(0 <= B <= 150) e U (1 <= U <= 150), com a 
 sala de Barroquinha e Umbujahyba e termina em EOF
 
 SA�DA
 Imprima a quantidade de salas que Barroquinha deve passar para chegar na sala de Umbujahyba.

 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2922 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	while (sc.hasNext()) {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		if (a > b) {
    			int aux = a;
    			a = b;
    			b = aux;
    		}
    		if (a == b)
    			System.out.println(b - a);
    		else
    			System.out.println(b - a - 1);
    	}

		sc.close();
    }
    
}