// package Iniciante;

/*
 
 QUESTA�O
 Come�ou a 4� Maratona de Programa��o da UFFS! Esperamos que voc� aproveite 
 as pr�ximas horas que passar� conosco e que se divirta muito! Boa sorte!

 Este � o 3� ano do Clube de Programa��o, projeto de extens�o que visa em 
 primeiro lugar tornar os programadores da regi�o brasileira conhecida como 
 Fronteira Sul muito mais aptos a enfrentar os desafios computacionais tanto 
 da academia quanto do mercado do trabalho. Nossa principal estrat�gia est� 
 em promover oficinas e treinos para competi��es de Programa��o, n�o apenas 
 para estudantes da UFFS, mas para quem quiser participar. Apesar das v�rias 
 dificuldades, estamos muito felizes com os resultados que temos conquistado. 
 Em parceria com a UNOCHAPEC�, a Uri_e a UNOESC, colaboramos para fazer de 
 Chapec� nos dois �ltimos anos a 2� maior sede do Brasil na etapa regional 
 da Maratona de Programa��o, o que � mais um indicador do entusiasmo que o 
 povo daqui tem por Programa��o.

 Para aquecer voc� para esta competi��o, vamos pedir que voc� desenvolva um 
 programa que calcule o quociente e o resto da divis�o de dois n�meros inteiros, 
 pode ser? Lembre que o quociente e o resto da divis�o de um inteiro a por um 
 inteiro n�o-nulo b s�o respectivamente os �nicos inteiros q e r tais que 
 0 <= r < |b| e:
 
 a = b � q + r
 
 Caso voc� n�o saiba, o teorema que garante a exist�ncia e a unicidade dos 
 inteiros q e r � conhecido como �Teorema da Divis�o Euclidiana� ou �Algoritmo da Divis�o�.
 
 ENTRADA
 A entrada � composta por dois n�meros inteiros a e b (-1.000 <= a, b < 1.000).

 SA�DA
 Imprima o quociente q seguido pelo resto r da divis�o de a por b.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1837 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q, r;
        if (a >= 0) {
        	q = a / b;
        	r = a % b;	
        } else {
        	int x = 0, y = 0;
        	
        	if (b < 0) x = b * -1;
        	else x = b;
        	
        	for (r = 0; r < x; r++) {
        		y = a - r;
        		if (y % b == 0) break;
        	}
        	q = y / b;
        }
        
        System.out.println(q + " " + r);

        sc.close();
    }
	
}