// package Strings;

/*

 QUEST�O
 Textos podem conter mensagens ocultas. Neste problema a mensagem oculta em um 
 texto � composto pelas primeiras letras de cada palavra do texto, na ordem em que aparecem.

 � dado um texto composto apenas por letras min�sculas ou espa�os. Pode haver 
 mais de um espa�o entre as palavras. O texto pode iniciar ou terminar em espa�os, 
 ou mesmo conter somente espa�os.

 ENTRADA
 A entrada cont�m v�rios casos de testes. A primeira linha de entrada cont�m um inteiro N que 
 indica a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de uma 
 �nica linha contendo de um a 50 caracteres, formado por letras min�sculas (�a�-�z�) ou 
 espa�os (� �). Aten��o para poss�veis espa�os no in�cio ou no final do texto!

 Nota: No exemplo de entrada os espa�os foram substitu�dos por pequenos pontos (���) para 
 facilitar o entendimento dos exemplos.

 SA�DA
 Para cada caso de teste imprima a mensagem oculta no texto de entrada.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1272 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String input = sc.nextLine();
			if (input.isEmpty()) input = sc.nextLine();
			String[] linhas = input.split(" ");
			String codigo = "";
			for (String linha : linhas) {
				if (!linha.isEmpty()) {
					codigo += linha.substring(0, 1);
				}
			}
			System.out.println(codigo);
		}

		sc.close();
	}

}