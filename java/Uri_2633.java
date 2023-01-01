// package Iniciante;

/*
 
 QUEST�O
 YUri_� um bom companheiro. Sempre fazemos o churras dos �manos ;)� na casa 
 dele! Desta vez, o motivo do churrasco � que os manos est�o finalmente 
 come�ando a passar em bons concursos! Ent�o, hoje teremos aquela edi��o 
 especial do churras, with alcohol and futebol de sab�o!

 A empresa do futebol de sab�o est� demorando para encher o campo e Yuri, j� 
 entendiado, come�ou a viajar na seguinte pergunta: se ass�ssemos as carnes 
 por ordem da data de validade, qual seria a sequ�ncia de pe�as de carne 
 resultante? Como o MacBook de YUri_est� muito longe (e a pregui�a est� muito 
 perto), ele pediu a sua ajuda para responder esta pergunta.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste e termina com fim de arquivo. 
 A primeira linha de um caso de teste cont�m um inteiro N (0 <= N <= 10), que 
 � o n�mero de pe�as de carne do churrasco de hoje. Em seguida vir�o N linhas, 
 cada uma com uma cadeia de no m�ximo 20 caracteres, com apenas caracteres 
 de �a� a �z�, e um inteiro Di (0 <= Di <= 50) que representa a data de validade 
 da i-�sima pe�a. YUri_resolveu colaborar e calcular ao menos este n�mero Di 
 de dias at� a data de validade, a partir de hoje, de cada pe�a de carne. � 
 garantido que se i != j, ent�o Di != Dj .
 
 SA�DA
 Para cada caso de teste, imprima uma �nica linha com a sequ�ncia de pe�as de 
 carne que YUri_quer calcular. Cada pe�a deve estar separada por um �nico espa�o.

*/

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class Uri_2633 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            TreeMap<Integer, String> carnes = new TreeMap<>();
            for (int i = 0; i < N; i++) {
            	String carne = sc.next();
            	Integer validade = sc.nextInt();
            	carnes.put(validade, carne);
            }
            System.out.println(String.join(" ", carnes.values()));
        }

        sc.close();
    }
	
}