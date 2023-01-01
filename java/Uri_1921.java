// package Iniciante;

/*
 
 QUEST�O
 Guilherme adora brincar com pipas, pipas de v�rias cores, formas e tamanhos. 
 Ele tem percebido que para as pipas possu�rem maior estabilidade, e dessa 
 forma voarem mais alto, elas devem possuir um barbante bem esticado ligando 
 todos os pares de pontas n�o vizinhas.

 Apesar de ser uma crian�a bastante criativa e astuta, Guilherme n�o sabe 
 como determinar a quantidade de barbantes que ele ter� que utilizar para 
 tornar  uma pipa de n lados, est�vel. Voc� pode ajud�-lo?.
 
 ENTRADA
 A entrada ser� composta por uma �nica linha, que cont�m um inteiro 
 3 <= n <= 10^5, representando o n�mero de lados da pipa.
 
 SA�DA
 Imprima um n�mero inteiro, que ser� a quantidade de barbantes que Guilherme 
 ter� que utilizar para tornar a pipa de n lados est�vel.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1921 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long resposta = (N * (N - 3)) / 2;
		System.out.println(resposta);

		sc.close();
    }
	
}