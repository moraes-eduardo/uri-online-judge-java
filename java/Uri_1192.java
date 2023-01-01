// package Ad-Hoc;

/*

 QUEST�O
 Paula simplesmente adora matem�tica. Seu maior passatempo � ficar inventando 
 jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, 
 nem todos eles n�o s�o t�o apaixonados assim por matem�tica e t�m muita 
 dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou 
 um pequeno passatempo que envolve 3 caracteres: um d�gito num�rico, uma letra e 
 outro d�gito num�rico.

 Se a letra for mai�scula, deve-se subtrair o primeiro d�gito do segundo. Se a 
 letra for min�scula, deve-se somar ambos os d�gitos e se os D�GITOS forem iguais, 
 deve-se desconsiderar a letra e mostrar o produto entre os dois d�gitos. Ela pediu 
 para seu amigo Marcelo, que � bom em programa��o, para criar um programa para que 
 encontre a solu��o para cada uma das sequ�ncias que Paula lhe apresentar.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha da entrada cont�m um 
 inteiro N, indicando o n�mero de casos de teste que vir�o a seguir. Cada caso de 
 teste � uma sequ�ncia de tr�s caracteres criada por Paula. Esta sequ�ncia cont�m 
 na primeira posi��o um caractere de '0' a '9', na segunda posi��o uma letra 
 mai�scula ou min�scula do alfabeto e na terceira posi��o outro caractere de '0' a '9'.
 
 SA�DA
 Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que 
 representa a solu��o da sequ�ncia proposta por Paula.
 
*/

import java.util.Scanner;

public class Uri_1192 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String linha = sc.next();
			int x = Character.getNumericValue(linha.charAt(0));
			char z = linha.charAt(1);
			int y = Character.getNumericValue(linha.charAt(2));
			if (x == y) {
				System.out.println(x * y);
			} else if (Character.isUpperCase(z)) {
				System.out.println(y - x);
			} else {
				System.out.println(x + y);
			}
		}

		sc.close();
	}

}