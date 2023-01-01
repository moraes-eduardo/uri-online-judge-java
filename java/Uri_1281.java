// package Estruturas e Bibliotecas;

/*

 QUEST�O
 Dona Parcinova costuma ir regularmente � feira para comprar frutas e legumes. 
 Ela pediu ent�o � sua filha, Mangojata, que a ajudasse com as contas e que 
 fizesse um programa que calculasse o valor que precisa levar para poder comprar 
 tudo que est� em sua lista de compras, considerando a quantidade de cada tipo 
 de fruta ou legume e os pre�os destes itens.
 
 ENTRADA
 A primeira linha de entrada cont�m um inteiro N que indica a quantidade de idas 
 � feira de dona Parcinova (que nada mais � do que o n�mero de casos de teste 
 que vem a seguir). Cada caso de teste inicia com um inteiro M que indica a 
 quantidade de produtos que est�o dispon�veis para venda na feira. Seguem os M 
 produtos com seus pre�os respectivos por unidade ou Kg. A pr�xima linha de entrada 
 cont�m um inteiro P (1 <= P <= M) que indica a quantidade de diferentes produtos 
 que dona Parcinova deseja comprar. Seguem P linhas contendo cada uma delas um 
 texto (com at� 50 caracteres) e um valor inteiro, que indicam respectivamente o 
 nome de cada produto e a quantidade deste produto.
 
 SA�DA
 Para cada caso de teste, imprima o valor que ser� gasto por dona Parcinova no 
 seguinte formato: R$ seguido de um espa�o e seguido do valor, com 2 casas decimais, 
 conforme o exemplo abaixo.
 
*/

import java.util.Scanner;

public class Uri_1281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double S = 0;
			int M = sc.nextInt();

			String[] vNomeProduto = new String[M];
			double[] vPrecoProduto = new double[M];

			for (int k = 0; k < M; k++) {
				vNomeProduto[k] = sc.next();
				vPrecoProduto[k] = sc.nextDouble();
			}

			int P = sc.nextInt();
			String[] vNomeProdutoX = new String[P];
			int[] vContagemProdutoX = new int[P];

			for (int j = 0; j < P; j++) {
				vNomeProdutoX[j] = sc.next();
				vContagemProdutoX[j] = sc.nextInt();
			}
			
			for (int l = 0; l < P; l++) {
				for (int m = 0; m < M; m++) {
					if (vNomeProduto[m].equalsIgnoreCase(vNomeProdutoX[l])) {
						S = (S + (vPrecoProduto[m]) * vContagemProdutoX[l]);
					}
				}
			}
			
			System.out.println(String.format("R$ %.2f", S));
		}

		sc.close();
	}

}