// package Ad-Hoc;

/*

 QUEST�O
 O polo norte vem enfrentando um problema de log�stica devido ao aquecimento 
 global. Isso se deve ao fato de que a fabrica e o armaz�m de brinquedos 
 encontram-se em margens opostas de um lago que costumava estar congelado 
 durante o ano inteiro. Entretanto com o aumento da temperatura nos �ltimos 
 anos o gelo que cobre o lago vem ficando cada vez menos espesso. Para contornar 
 o problema Balladug ,um gnomo �lfico muito esperto, criou um radar que consegue 
 mapear a espessura do gelo. Assim Balladug entregou o mapa do lago para os 
 gnomos �lficos encarregados do transporte. Tais gnomos conseguem pular numa 
 dist�ncia m�xima de 2 metros. Com o mapa em m�os, os gnomos de saber se � poss�vel 
 cruzar o lago de gelo com seus pulos e se for poss�vel eles gostariam de saber 
 quantos pulos ter�o que dar para tal.

 ENTRADA
 A entrada consiste de um n�mero inteiro N (0<N<101) que representa a quantidade 
 de linhas do mapa. As pr�ximas N linhas contem at� 10 caracteres onde o 
 caractere "-" representa uma regi�o de gelo firme e o caractere "." representa uma 
 regi�o de gelo fino que ir� quebrar caso seja pisado. Cada linha representa um 
 metro de largura no mapa.Considere que os gnomos iniciam no canto superior esquerdo 
 e devem cruzar todo o lago at� chegarem em qualquer posi��o da margem oposta que se 
 encontra ap�s a �ltima linha do mapa.Uma linha sempre ser� composta inteiramente pelo 
 mesmo caractere.

 SA�DA
 A sa�da consiste de um inteiro inteiro indicando o n�mero de pulos para percorrer o 
 lago ou do caractere "N"caso seja imposs�vel cruzar o lago. N�o esque�a de deixar uma 
 linha em branco ap�s a resposta.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2928 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String[] linhas = new String[N];
    	int saltos = 0;
    	for (int i = 0; i < N; i++) {
    		linhas[i] = sc.next();
    	}
    	for (int i = 1; i < N; i++) {
    		if (linhas[i].startsWith(".")) {
    			if (linhas[i-1].startsWith(".")) {
    				if ((i + 1 < N) && linhas[i+1].startsWith(".")) {
    					System.out.println('N');
    					return;
    				}
    			} else {
        			saltos++;
				}
    		}
    	}
    	System.out.println(saltos);
    }
    
}