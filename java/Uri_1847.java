// package Iniciante;

/*
 
 QUEST�O
 Bem-vindos e bem-vindas � Escola de Inverno da Maratona de Programa��o 2015 
 de Erechim! Esperamos sinceramente que voc�s aprendam muito nestes dias para 
 que tenham muito sucesso nas competi��es de Programa��o ainda por vir, mas 
 sobretudo esperamos que voc�s curtam a Escola, pois quando nos divertimos e 
 temos prazer em estudar e programar, o treino deixa de ser um fardo e se 
 torna um hobby. Ent�o, divirtam-se!

 O inverno � uma esta��o maravilhosa, n�o � mesmo? Todos n�s amamos vestir um 
 poncho, participar de uma roda de chimarr�o, assar pinh�es no fog�o a lenha� 
 Mas nem todos gostam do inverno, especialmente em lugares onde o inverno costuma 
 ser muito cruel. Em Westeros, por exemplo, o humor das pessoas � definido de 
 acordo com as tend�ncias clim�ticas. Com base nas temperaturas dos tr�s �ltimos 
 dias, as pessoas podem ficar tristes ou felizes, ficando mais propensas a fazer 
 guerra ou fazer amor, respectivamente. E, sejamos sinceros, � justamente por 
 causa das cenas de amor e de guerra que amamos Game of Thrones!

 Se a temperatura desceu do 1� para o 2� dia, mas subiu ou permaneceu constante 
 do 2� para o 3�, as pessoas ficam felizes (primeira figura).
 
 Se a temperatura subiu do 1� para o 2� dia, mas desceu ou permaneceu constante 
 do 2� para o 3�, as pessoas ficam tristes (segunda figura).
 
 Se a temperatura subiu do 1� para o 2� dia e do 2� para o 3�, mas subiu do 2� 
 para o 3� menos do que subira do 1� para o 2�, as pessoas ficam tristes (terceira figura).
 
 Se a temperatura subiu do 1� para o 2� dia e do 2� para o 3�, mas subiu do 2� 
 para o 3� no m�nimo o tanto que subira do 1� para o 2�, as pessoas ficam felizes (quarta figura).
 
 Se a temperatura desceu do 1� para o 2� dia e do 2� para o 3�, mas desceu do 2� 
 para o 3�  menos do que descera do 1� para o 2�, as pessoas ficam felizes (quinta figura).
 
 Se a temperatura desceu do 1� para o 2� dia e do 2� para o 3�, mas desceu do 2� 
 para o 3� no m�nimo o tanto que descera do 1� para o 2�, as pessoas ficam tristes (sexta figura).
 
 Se a temperatura permaneceu constante do 1� para o 2� dia, as pessoas ficam 
 felizes se subiu do 2� para o 3� dia ou tristes caso contr�rio (respectivamente, s�tima e oitava figuras).
 
 ENTRADA
 A entrada consiste apenas de tr�s inteiros, A, B e C (-100 <= A, B, C <= 100), os quais representam 
 respectivamente as temperaturas registradas no 1�, no 2� e no 3� dias.
 
 SA�DA
 Imprima uma linha contendo uma carinha feliz ou triste, representando como fica o humor do povo de Westeros 
 de acordo com as tend�ncias clim�ticas.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1847 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (B < A && C >= B) System.out.println(":)");
        else if (B > A && C <= B) System.out.println(":(");
        else if (B > A && C > B && (C - B) < (B - A)) System.out.println(":(");
        else if (B > A && C > B && (C - B) >= (B - A)) System.out.println(":)");
        else if (B < A && C < B && (B - C) < (A - B)) System.out.println(":)");
        else if (B < A && C < B && (B - C) >= (A - B)) System.out.println(":(");
        else if (B == A && C > B) System.out.println(":)");
        else if (B == A && C < B) System.out.println(":(");
        else System.out.println(":(");

        sc.close();
    }
	
}