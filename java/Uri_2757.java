// package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria que voc� fizesse um programa com as seguintes caracter�sticas:

 1. Crie tr�s vari�veis para armazenar n�meros inteiros;
 2. Leia o primeiro n�mero, que pode ser um valor na faixa de: -10000 <= A <= 10000;
 3. Leia o segundo n�mero, que pode ser um valor na faixa de: 0 <= B <= 99;
 4. Leia o terceiro n�mero, que pode ser um valor na faixa de: 0 <= C <= 999;
 5. Imprima a letra A, um espa�o em branco, o sinal de igual, um espa�o em branco, o n�mero armazenado 
    na primeira vari�vel, uma virgula, um espa�o em branco, a letra B, um espa�o em branco, o sinal de 
    igual, um espa�o em branco, o n�mero armazenado na segunda vari�vel, uma virgula, um espa�o em branco, 
    a letra C, um espa�o em branco, o sinal de igual, um espa�o em branco, o n�mero armazenado na terceira 
    vari�vel. N�o esque�a de pular linha;
 6. Repita o procedimento 5, colocando o n�mero em um espa�amento de 10 d�gitos e justificado a direita;
 7. Repita o procedimento 5, colocando o n�mero em um espa�amento de 10 d�gitos e preenchido com zeros;
 8. Repita o procedimento 5, colocando o n�mero em um espa�amento de 10 d�gitos e justificado a esquerda.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem tr�s linhas. Na primeira 
 linha tem um inteiro A (-10000 <= A <= 10000). Na segunda linha tem um inteiro B (0 <= B <= 99). Na terceira 
 linha tem um inteiro C (0 <= C <= 999). Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem quatro linhas da forma 
 descrita no item 5. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2757 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);
        System.out.printf("A = %10d, B = %10d, C = %10d\n", A , B, C);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", A , B, C);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", A , B, C);

        sc.close();
    }
	
}
