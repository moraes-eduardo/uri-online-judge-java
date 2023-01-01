// package Ad-Hoc;

/*
 
 QUEST�O
 Todo ano em abril re�nem-se na casa da dona Chica o Curupira, Boitat�, o Boto 
 cor de rosa (esse em sua forma de homem, j� que assim dona chica gosta mais), 
 o Mapinguari e a Iara para se lembrar de seus momentos com Mani, a bela menina 
 de pele branca. E como n�o poderia ser diferente o prato principal dessa reuni�o 
 � a mandioca. Cada um deles come de uma a dez por��es de mandioca e eles sempre 
 avisam dona Chica com anteced�ncia a respeito de quantas por��es ir�o comer nesse 
 dia. O tamanho da por��o de cada um � diferente, mas sempre s�o os mesmos. As 
 por��es s�o as seguintes (em gramas):

  � O Curupira come 300
  � O Boitat� come 1500
  � O Boto come 600
  � O Mapinguari 1000
  � A Iara come 150
  
 Dona chica por sua vez sempre come 225 gramas de mandioca. Cansada de todo ano ter 
 que calcular quanta mandioca preparar ela contactou voc� para escrever um programa 
 que informe quanta mandioca deve ser preparada em gramas.
 
 ENTRADA
 A entrada consiste de 5 inteiros cada um representando as por��es que os convidados 
 de dona Chica v�o consumir. O primeiro inteiro representa as por��es do Curupira, o 
 segundo do Boitat�, o terceiro do Boto, o quarto do Mapinguari e o quinto a da Iara.
 
 SA�DA
 A sa�da consiste de um �nico inteiro que representa quanta mandioca dona Chica deve 
 preparar em gramas. N�o esque�a da quebra de linha ap�s a resposta :).
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2936 {
	
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int total = 225;
    	for (int i = 0; i < 5; i++) {
    		total += sc.nextInt() * porcoes[i];
		}
    	System.out.println(total);


        sc.close();
    }
    
}