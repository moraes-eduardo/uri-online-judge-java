// package Iniciante;

/*

 QUEST�O
 Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade 
 constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

 Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do 
 carro X, ou seja, consegue se afastar um quil�metro a cada 2 minutos.

 Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
 tomar essa dist�ncia do outro carro.

 ENTRADA
 O arquivo de entrada cont�m um n�mero inteiro.

 SA�DA
 Imprima o tempo necess�rio seguido da mensagem "minutos".

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1016 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos"); 

        sc.close();
    }
	
}