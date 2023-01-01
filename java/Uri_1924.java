// package Iniciante;

/*
 
 QUEST�O
 Est� para nascer algu�m mais indeciso do que Vit�ria. Apesar dela saber 
 que � uma �tima programadora, daquelas que possui projetos na �rea de TI 
 publicados e diversos outros em andamento, ela n�o tem certeza se vai 
 seguir na �rea. H� noites que ela diz que n�o quer Computa��o, h� dias 
 que ela diz que quer alguma Engenharia, em outros ela quer qualquer outro 
 curso, j� chegou at� a pensar em algum de Humanas, que pecado!

 Mas voc� est� aqui pra ajud�-la. A sua tarefa � bem simples, ser� dado uma 
 lista com diversos nomes de cursos de gradua��o e voc� ter� que imprimir o 
 nome do curso que Vit�ria deve fazer.
 
 ENTRADA
 A primeira linha de entrada cont�m um inteiro 1 <= n <= 2000, que representa 
 a quantidade de cursos a serem considerados. Cada uma das pr�ximas n linhas 
 ir� conter uma cadeia de caracteres S, 1 <= |S| <= 100, representando o nome 
 do curso.
 
 SA�DA
 Imprima o nome do curso que Vit�ria deve fazer, sem acentua��o.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1924 {
	
    public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		String curso;
		for (int i = 0; i < N; i++) {
			curso = sc.readLine();
		}
		System.out.println("Ciencia da Computacao");

		sc.close();
    }
	
}