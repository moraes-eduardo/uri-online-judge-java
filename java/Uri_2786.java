// package Iniciante;

/*
 
 QUEST�O
 O col�gio pretende trocar o piso de uma sala de aula e a diretora aproveitou 
 a oportunidade para passar uma tarefa aos alunos. A sala tem o formato de um 
 ret�ngulo de largura L metros e comprimento C metros, onde L e C s�o n�meros 
 inteiros. A diretora precisa comprar lajotas de cer�mica para cobrir todo o 
 piso da sala. Seria f�cil calcular quantas lajotas seriam necess�rias se cada 
 lajota fosse um quadrado de 1 metro de lado. O problema � que a lajota que a 
 diretora quer comprar � um quadrado que possui 1 metro de diagonal, n�o de 
 lado. Al�m disso, ela quer preencher o piso da sala com as diagonais das 
 lajotas alinhadas aos lados da sala, como na figura.

 A loja vai fornecer lajotas do tipo 1: inteiras; do tipo 2, que correspondem � 
 metade das do tipo 1, cortadas ao longo da diagonal; e lajotas do tipo 3, que 
 correspondem � metade do tipo 2. Veja os tr�s tipos de lajotas na figura.

 Est� muito claro que sempre ser�o necess�rias 4 lajotas do tipo 3 para os 
 cantos da sala. A tarefa que a diretora passou para os alunos � calcular o 
 n�mero de lajotas dos tipos 1 e 2 que ser�o necess�rias. Na figura, para L = 3 
 e C = 5, foram necess�rias 23 do tipo 1 e 12 do tipo 2. Seu programa precisa 
 computar, dados os valores de L e C, a quantidade de lajotas do tipo 1 e do 
 tipo 2 necess�rias.
 
 ENTRADA
 A primeira linha da entrada cont�m um inteiro L (1 <= L <= 100) indicando a 
 largura da sala. A segunda linha cont�m um inteiro C (1 <= C <= 100) 
 representando o comprimento da sala.
 
 SA�DA
 Imprima duas linhas na sa�da. A primeira deve conter um inteiro, representando 
 o n�mero de lajotas do tipo 1 necess�rias. A segunda deve conter um inteiro, 
 indicando o n�mero de lajotas do tipo 2.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2786 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int C = sc.nextInt();
        int lajes1 = (L * C) + ((L - 1) * (C - 1));
        int lajes2 = ((L - 1) * 2) + ((C - 1) * 2);
        System.out.println(lajes1);
        System.out.println(lajes2);

        sc.close();
    }
	
}