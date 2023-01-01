// package Iniciante;

/*
 
 QUEST�O
 Seu J�lio � propriet�rio de um grande api�rio situado no interior da para�ba. 
 Todo ano, semestralmente, seu J�lio coleta o mel produzido pelas abelhas da 
 sua propriedade e armazena-o em um recipiente de formato CIL�NDRICO para que 
 facilite o transporte do mel para os estabelecimentos que encomendam esse 
 produto natural para a comercializa��o.
 
 Certa vez seu J�lio percebeu que devido a um crescimento na produ��o do mel, 
 em rela��o ao semestre anterior, o recipiente que possuia n�o suportaria o 
 volume de mel produzido por suas abelhas. Seu J�lio precisa agora que voc� 
 fa�a um programa que informado o volume de mel em cm3 e o di�metro da parte 
 interna do recipiente em cm, calcule e mostre:

 - Qual deve ser a altura(em cm) da parte interna do recipiente;
 - A �rea(em cm2) da boca(entrada) do recipiente.

 Obs.: Considere pi = 3.14
 
 ENTRADA
 A entrada cont�m v�rios casos de teste e termina com EOF. Cada caso de teste 
 consiste de duas linhas contendo em cada uma um valor de ponto flutuante de 
 dupla precis�o com duas casas decimais ap�s a v�rgula, sendo um V (1.00 <= V 
 <= 10000.00) e outro D (1.00 <= D <= 100.00), representando respectivamente 
 o volume e o di�metro do recipiente.
 
 SA�DA
 Para cada teste, a sa�da cont�m na primeira linha a mensagem "ALTURA = ", com 
 um espa�o depois de ALTURA e outro depois do s�mbolo de igualdade, seguido do 
 valor da altura do recipiente com duas casas decimais ap�s a v�rgula e na 
 segunda linha a mensagem "AREA = ", tamb�m com um espa�o depois de AREA e 
 outro depois do s�mbolo de igualdade, seguido do valor da area da boca(entrada) 
 do recipiente com duas casas decimais ap�s a v�rgula.

 - N�o esque�a da quebra de linha ao final da sa�da,caso contr�rio voc� receber� "Presentation Error".
 
*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2029 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	double V, D, R, area, altura;
    	while (sc.hasNext()) {
    		V = sc.nextDouble();
    		D = sc.nextDouble();
    		R = D / 2;
    		area = 3.14 * (R * R);
    		altura = V / (3.14 * (R * R));
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(area));
    	}

		sc.close();
    }
	
}