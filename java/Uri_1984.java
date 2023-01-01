// package Iniciante;

/*
 
 QUEST�O
 Os cientistas da NASA descobriram um novo exoplaneta que fica a 1 bilh�o 
 de anos luz da terra. O nome desse planeta foi batizado de Pronal�ndia em 
 homenagem aos novos cientistas que est�o sendo formados no PRONATEC. S� 
 que o mais incr�vel ainda est� por vir. Ao observar melhor o planeta eles 
 conseguiram identificar que os habitantes da Pronal�ndia estavam querendo 
 se comunicar por uma numera��o. S� que a numera��o que encontraram est� 
 invertida e como encontraram muitas delas chamaram voc� para conseguir 
 automatizar esse processo. Logo, dado um n�mero grande, sua tarefa � 
 imprimir esse n�mero invertido.
 
 ENTRADA
 O arquivo cont�m apenas uma linha de teste que � o n�mero encontrado (0 < n < 9999999999).

 Obs.: Perceba que o n�mero lido � muito alto para armazenar em uma vari�vel 
 do tipo int, logo voc� ir� precisar utilizar o tipo long, que para a leitura e
 impress�o em C, voc� deve utilizar o %llu.
  
 SA�DA
 Imprimir o n�mero lido invertido. N�o esque�a de imprimir a quebra de linha 
 (\n) no final, caso contr�rio voc� receber� (Presentation Error).
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1984 {
	
	// M�todo 1
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String N = String.valueOf(sc.nextLong());
    	String invertido = "";
    	for (int i = 0; i < N.length(); i++) {
    		invertido += N.charAt(N.length()-i-1);
    	}
    	System.out.println(invertido);

		sc.close();
    }
    
    // M�todo 2
    public static void Main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String N = String.valueOf(sc.nextLong());
    	StringBuilder sb = new StringBuilder(N);
    	String invertido = String.valueOf(sb.reverse());
    	System.out.println(invertido);

		sc.close();
    }

}