// package Iniciante;

/*

 QUEST�O
 Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C 
 e se D for maior do que A, e a soma de C com D for maior que a soma 
 de A e B e se C e D, ambos, forem positivos e se a vari�vel A for par 
 escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

 ENTRADA
 Quatro n�meros inteiros A, B, C e D.

 SA�DA
 Mostre a respectiva mensagem ap�s a valida��o dos valores.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1035 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            System.out.println("Valores aceitos"); 
        } else { 
            System.out.println("Valores nao aceitos");
        }

        sc.close();
        
    }
    
}