// package Ad-Hoc;

/*
 
 QUEST�O
 Neste problema sua tarefa ser� ler v�rios n�meros e em seguida dizer quantas 
 vezes cada n�mero aparece na entrada de dados, ou seja, deve-se escrever cada 
 um dos valores distintos que aparecem na entrada por ordem crescente de valor.

 ENTRADA
 A entrada cont�m apenas 1 caso de teste. A primeira linha de entrada contem 
 um �nico inteiro N, que indica a quantidade de valores que ser�o lidos para 
 X (1 <= X <= 2000) logo em seguida. Com certeza cada n�mero n�o aparecer� mais 
 do que 20 vezes na entrada de dados.
 
 SA�DA
 Imprima a sa�da de acordo com o exemplo fornecido abaixo, indicando quantas vezes 
 cada um deles aparece na entrada por ordem crescente de valor.

*/

import java.io.IOException;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Uri_1171 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int numero = sc.nextInt();
			if (numeros.containsKey(numero))
				numeros.replace(numero, numeros.get(numero) + 1);
			else
				numeros.put(numero, 1);
		}
		for (Entry<Integer, Integer> entry : numeros.entrySet()) {
			System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
		}

		sc.close();
	}

}