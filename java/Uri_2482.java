// package Estruturas e Bibliotecas;

/*

 QUEST�O
 Como de costume, neste ano Noel recebeu muitos pedidos de presentes. S� que em 
 fun��o de alguns imprevistos, n�o ter� como entregar todos os presentes 
 pessoalmente neste ano. Da� ent�o decidiu utilizar o velho e bom correio 
 tradicional, para alguns pedidos que podem ser entregues por carta.

 Para esta tarefa, pediu ajuda ao elfo Evergreen Xadada, para que ele imprimisse 
 etiquetas a todos os envelopes que ser�o destinados a algumas destas crian�as, 
 cujo pedido pode ser entregue por carta. Cada uma destas etiquetas dever� conter 
 apenas o nome da crian�a e a sauda��o "Feliz Natal" no respectivo idioma desta 
 crian�a. Para auxiliar nesta tarefa, Noel disponibilizou uma tabela com v�rios 
 idiomas e o nome e o pa�s de cada uma das crian�as selecionadas, de acordo com o 
 exemplo abaixo. Voc� deve ajudar Evergreen fazendo um programa que imprima estas etiquetas.
 
 ENTRADA
 A entrada � composta por um �nico caso de teste. A primeira linha de entrada 
 cont�m um inteiro N (1 < N < 100) que indica a quantidade de tradu��es da palavra 
 "Feliz Natal" existentes na entrada. As pr�ximas N * 2 linhas cont�m respectivamente 
 o nome de uma l�ngua seguido da tradu��o de "Feliz Natal" para esta l�ngua. Segue um 
 inteiro M (1 < M < 100) que indica a quantidade de crian�as que receber�o as cartas. 
 As pr�ximas M * 2 linhas conter�o, respectivamente, o nome da crian�a e a l�ngua nativa 
 desta crian�a.

 Obs.: � garantido que nenhuma tradu��o apare�a repetida ou duplicada e os pa�ses de todas 
 as crian�as estejam presentes na rela��o dos pa�ses.
 
 SA�DA
 Seu programa dever� imprimir todas as etiquetas de acordo com a entrada, conforme o 
 exemplo abaixo, sempre com uma linha em branco ap�s a impress�o de cada uma das etiquetas, 
 inclusive ap�s a �ltima etiqueta.
 
*/

import java.util.HashMap;
import java.util.Scanner;

public class Uri_2482 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> idiomas = new HashMap<>();
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String idioma = readLine(sc);
			String mensagemTraduzida = readLine(sc);
			idiomas.put(idioma, mensagemTraduzida);
		}
		
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String crianca = readLine(sc);
			String idioma = readLine(sc); 
			String mensagemTraduzida = idiomas.get(idioma);
			System.out.println(crianca);
			System.out.println(mensagemTraduzida);
			System.out.println();
		}
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
	
}