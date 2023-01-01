// package Iniciante;

/*
 
 QUEST�O
 Voc� tem em m�os dois cabos circulares de energia. O primeiro cabo tem raio 
 R1 e o segundo raio R2. Voc� precisa comprar um conduite circular (veja a
 imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos 
 por dentro dele: http://prntscr.com/k1s2ps
 
 Qual o menor raio do conduite que voc� deve comprar? Em outras palavras, dado 
 dois c�rculos, qual o raio do menor c�rculo que possa englobar ambos os dois?
 
 ENTRADA
 Na primeira linha teremos um inteiro T (T <= 10000), indicando o n�mero de 
 casos de teste.

 Na �nica linha de cada caso teremos dois n�meros inteiros R1 e R2, indicando 
 os respectivos raios. Os inteiros ser�o positivos e todas as contas caber�o 
 em um inteiro normal de 32 bits.
 
 SA�DA
 Em cada caso, imprima o menor raio poss�vel em uma �nica linha

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1589 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int R1, R2, R3;
        for (int i = 0; i < T; i++) {
        	R1 = sc.nextInt();
        	R2 = sc.nextInt();
        	R3 = R1 + R2;
        	System.out.println(R3);
        }

        sc.close();
    }
	
}