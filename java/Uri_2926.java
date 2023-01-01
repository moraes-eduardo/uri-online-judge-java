// package Ad-Hoc;

/*
 
 QUEST�O
 Voc� sempre fica t�o animado nesta �poca do ano que adora falar sobre isso o 
 tempo todo! Neste ano, voc� tem gritado aos quatro ventos: Ent�o � natal!! 
 Colocando toda essa felicidade pra fora, voc� montou novamente um programa 
 neste ano que, colocando um �ndice I de felicidade, seu grito de "Ent�o � Natal!" 
 � cada vez mais animado!

 ENTRADA
 A entrada � composta por um inteiro I (1 < I <= 104) que representa o seu �ndice de felicidade.
 
 SA�DA
 A sa�da � composta pela frase "Entao eh Natal!", sendo repetidas I vezes as letras 
 a da frase. Uma quebra de linha � necess�ria ap�s a impress�o da frase.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2926 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int I = sc.nextInt();
    	String a = "";
    	for (int i = 0; i < I; i++) {
    		a += "a";
    	}
    	System.out.println("Entao eh Natal!".replace("a", a));
    }
    
}