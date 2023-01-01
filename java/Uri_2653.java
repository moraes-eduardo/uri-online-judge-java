// package Iniciante;

/*
 
 QUEST�O
 No jogo O Bruxo, Sigismund Dijkstra � o l�der do Servi�o Secreto Redaniano, 
 por causa disso ele � uma das pessoas mais importantes do mundo.

 Al�m disso Dijkstra possui um grande tesouro, o qual possui diversos tipos de j�ias.

 Dijkstra est� muito curioso para saber quantos tipos de j�ias diferentes seu tesouro possui.

 Sabendo que voc� � o melhor programador do continente Dijkstra te contratou para 
 verificar quantos tipos de j�ias distintas ele tem em seu tesouro.
 
 ENTRADA
 A entrada consiste de v�rias linhas e cada uma cont�m uma string que descreve uma das 
 j�ias de Dijkstra. Essa string � composta apenas dos caracteres '(' e ')', a soma do 
 tamanho de todas as string n�o excede 106.
 
 SA�DA
 Imprima quantos tipos de j�ias distintas Dijkstra tem.

*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Uri_2653 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	Set<String> joias = new HashSet<>();
    	while (sc.hasNext()) {
    		String joia = sc.nextLine();
    		joias.add(joia);
    	}
    	System.out.println(joias.size());

		sc.close();
    }
	
}