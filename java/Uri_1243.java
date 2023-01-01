// package Strings;

/*

 QUEST�O
 TopCoder decidiu automatizar o processo de atribui��o de n�veis de dificuldade 
 para os problemas. Os desenvolvedores do TopCoder conclu�ram que a dificuldade 
 do problema esta relacionado apenas ao comprimento m�dio das palavras do 
 enunciado do problema. Se o comprimento m�dio das palavras do enunciado � menor 
 ou igual a 3, o problema recebe dificuldade de 250 pontos. Se o comprimento 
 m�dio das palavras do enunciado for 4 ou 5, o problema recebe dificuldade de 
 500 pontos. Se o comprimento m�dio das palavras do enunciado for maior ou igual 
 a 6, o problema recebe dificuldade de 1000 pontos.

 Defini��es:
 
 S�mbolo: um conjunto de carateres ligados em ambos os lados por espa�os, ou 
 pelo in�cio da descri��o do problema, ou ainda pelo fim da descri��o do problema.
 
 Palavra: um s�mbolo que contenha apenas letras a-z ou A-Z, e pode terminar com um �nico ponto.

 Comprimento da palavra: n�mero de letras de uma palavra (um ponto n�o � uma letra).

 Exemplos de s�mbolos que s�o palavras (aspas duplas apenas para exemplificar): "AB", "ab".

 Exemplo de s�mbolos que n�o s�o palavras: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".

 O comprimento m�dio das palavras � dado pela soma dos tamanhos das palavras do enunciado 
 dividido pelo numero de palavras, a divis�o � feita por n�meros inteiros. Se o n�mero de 
 palavras for zero, ent�o o comprimento m�dio das palavras � zero.

 Sua tarefa � dado o enunciado do problema, computar a sua classifica��o de dificuldade do 
 problema, que poder� ser 250, 500, ou 1000.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. Cada caso de teste � composto por uma linha que 
 cont�m o enunciado de um problema, � uma string que cont�m entre 1 e 50 caracteres ('A'-'Z', 
 'a'-'z', '0'-'9', ' ', '.'), inclusive. O final da entrada � determinado por EOF.
 
 SA�DA
 Compute o comprimento m�dio das palavras do enunciado do problema, e mostre a classifica��o 
 do problema, para mais detalhes olhe o exemplo abaixo.
 
*/

import java.util.Scanner;

public class Uri_1243 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String linha = readLine(sc);
			String[] palavras = linha.split(" ");
			int countPalavras   = 0;
			int tamanhoPalavras = 0;
			for (String palavra : palavras) {
				boolean palavraValida = true;
				for (int i = 0; i < palavra.length(); i++) {
					char c = palavra.charAt(i);
					if (!Character.isAlphabetic(c) && !(c == '.' && i + 1 == palavra.length())) {
						palavraValida = false;
						break;
					}
				}
				if (palavraValida) {
					countPalavras++;
					tamanhoPalavras += palavra.replace(".", "").length();
				}
			}
			if (countPalavras == 0 || tamanhoPalavras == 0)  {
				System.out.println(250);
			} else {
				int media = tamanhoPalavras / countPalavras;
				if      (media <= 3) System.out.println(250 );
				else if (media <= 5) System.out.println(500 );
				else                 System.out.println(1000);
			}
		}
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
	
}