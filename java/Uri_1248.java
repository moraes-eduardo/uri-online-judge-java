// package Strings;

/*

 QUEST�O
 O doutor deu a voc� a sua dieta, na qual cada caractere corresponde a algum 
 alimento que voc� deveria comer. Voc� tamb�m sabe o que voc� tem comido no 
 caf� da manha e no almo�o, nos quais cada caractere corresponde a um tipo de 
 alimento que voc� deveria ter comido aquele dia. Voc� decidiu que ir� comer 
 todo o restante de sua dieta durante o jantar, e voc� quer imprimi-la como 
 uma String (ordenada em ordem alfab�tica). Se voc� trapaceou de algum modo 
 (ou por comer muito de tipo de alimento, ou por comer algum alimento que n�o 
 est� no plano de dieta), voc� deveria imprimir a cadeia "CHEATER" (significa 
 trapaceiro), sem as aspas.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha de entrada cont�m 
 um inteiro N que indica a quantidade de casos de teste. Cada caso de teste � 
 composto por tr�s linhas, cada uma delas com uma string com at� 26 caracteres 
 de 'A'-'Z' ou vazia, representando respectivamente os alimentos da dieta, do 
 caf� da manh� e do almo�o.
 
 SA�DA
 Para cada caso de teste imprima uma string que representa os alimentos que voc� 
 deveria consumir no jantar, ou "CHEATER" caso voc� tenha trapaceado na sua dieta.
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Uri_1248 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			boolean cheater = false;
			String dieta  = sc.nextLine();
			String cafe   = sc.nextLine();
			String almoco = sc.nextLine();
			
			for (char c : cafe.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			for (Character c : almoco.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			if (cheater) {
				System.out.println("CHEATER");
			} else {
				char[] string = dieta.toCharArray();
				Arrays.sort(string);
				System.out.println(new String(string));
			}
		}

		sc.close();
	}

}