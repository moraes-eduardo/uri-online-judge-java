// package Iniciante;

/*

 QUEST�O
 O problema L�xico nos ensinou como ordenar ordenar duas palavras. Entretanto, 
 quando est�vamos construindo nossa lista de palavras, o estagi�rio encarregado 
 confundiu algumas letras mai�sculas com as min�sculas!

 Agora temos uma lista enorme de palavras, que podem ter letras min�sculas, 
 de a a z, e mai�sculas, de A a Z!

 Precisamos orden�-las, obedecendo a mesma ordem de antes, sem importar se as 
 letras s�o min�sculas ou mai�sculas.

 S� para desempatar, depois que todas as letras foram comparadas, deve-se 
 considerar que as letras mai�sculas vem antes das min�sculas.
 
 ENTRADA
 A primeira linha cont�m um inteiro 1 <= N <= 5 � 104.
 As N linhas seguintes cont�m uma palavra da lista, com comprimento m�ximo de 20 caracteres.
 
 SA�DA
 A sa�da deve conter a lista de palavras ordenadas.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Uri_2829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			lista.add(sc.next());
		}
				
		Collections.sort(lista, new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s2.equalsIgnoreCase(s1) ? s1.compareTo(s2) : s1.toLowerCase().compareTo(s2.toLowerCase());
			}
		});
		
		for (String str : lista) { 
			System.out.println(str);
		}		
	}
	
}