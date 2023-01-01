// package Iniciante;

/*
 
 QUEST�O
 A cifra mais antiga conhecida � a Cifra de C�sar. C�sar escrevia suas cartas 
 trocando cada letra pela pr�xima do alfabeto, para evitar que, quando a 
 carta fosse interceptada, conseguissem ler. Com o tempo, a criptografia 
 adquiriu melhor qualidade, mas a criptografia por substitui��o ainda � uma 
 brincadeira de crian�a interessante, por exemplo:

								ZENIT
								POLAR

 Neste tipo de brincadeira, ao escrever uma carta a letra Z � trocada pela 
 letra P e vice versa, bem como: E e O e assim sucessivamente. A frase cifrada 
 desta forma: "Osro roxre osri caftide" pode ser decifrada como: "Este texto 
 esta cifrado". Como a brincadeira ficou s�ria, a voc� foi solicitado um 
 programa que decifre as mensagens cifradas a partir de uma chave fornecida.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. Cada caso de teste come�a com uma 
 linha indicando dois n�meros inteiros C e N, 0 < C < 21 e 0 < N < 100. C � 
 o tamanho da cifra. Nas duas linhas seguintes est� a cifra de tamanho C 
 indicando quais caracteres da primeira linha ser� substitu�do por caracteres 
 da segunda linha, um caracter aparece uma �nica vez, na primeira ou na segunda 
 linha.

 A cifra pode conter letras de �A� a �Z�, n�meros de �0� a �9� al�m do espa�o 
 em branco e alguns s�mbolos de pontua��o: '.' ',' ';' ':' '(' ')' '!' e '?'. 
 Nas pr�ximas N linhas est�o frases e senten�as criptografadas pela cifra 
 fornecida, que voc� deve decifrar. Cada linha cont�m no m�nimo 1 e no m�ximo 
 1000 caracteres. S�o permitidos quaisquer caracteres ASCII (n�o extendido) 
 imprim�veis, neste caso n�o est�o presentes nenhum caracter acentuado, nem 
 mesmo '�'.
 
 SA�DA
 Para cada caso de teste da entrada seu programa deve gerar para cada linha de 
 frase e senten�a de entrada, uma linha com a sa�da decifrada, respeitando a 
 capitaliza��o da letra (letras mai�sculas s�o decifradas como mai�sculas e 
 min�sculas como min�sculas quando for poss�vel aplicar a diferencia��o, se 
 n�o for poss�vel ser�o decifrados como letras min�sculas). Ap�s cada caso de 
 teste deve ser impressa uma linha em branco, inclusive ap�s o �ltimo.
 
*/

import java.io.IOException;
import java.util.Scanner;
 
public class Uri_2502 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = readLine(sc);
			int C = Integer.parseInt(line.split(" ")[0].trim());
			int N = Integer.parseInt(line.split(" ")[1].trim());
			String cript = readLine(sc);
			String decript = readLine(sc);
			char[][] cripto = new char[400][C+5000];
			String[] mensagens = new String[C+5000];
			
			for (int i = 0; i < N; i++) {
				mensagens[i] = readLine(sc);
			}
			
			for (int i = 0; i < C; i++) {
				char c = cript.charAt(i);
				char d = decript.charAt(i);
				cripto[0][i] = c;
				cripto[1][i] = d;
				cripto[2][i] = Character.toLowerCase(c);
				cripto[3][i] = Character.toLowerCase(d);
			}
			
			for (int i = 0; i < N; i++) {
				String msg = "";
				for (char c : mensagens[i].toCharArray()) {
					for (int j = 0; j < C; j++) {
						if (c == cripto[0][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[1][j]) : cripto[1][j];
							break;
						} else if (c == cripto[1][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[0][j]) : cripto[0][j];
							break;
						}  else if (c == cripto[2][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[3][j]) : cripto[3][j];
							break;
						}  else if (c == cripto[3][j]) {
							msg+= a(c) ? Character.toLowerCase(cripto[2][j]) : cripto[2][j];
							break;
						} else if (j+1 == C) {
							msg += c;
						}
					}
				}
				System.out.println(msg);
			}
			System.out.print("\n");
		}
	}
	
	private static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.equals("")) {
			line = sc.nextLine();
		}
		return line;
	}
	
	private static boolean a(char c) {
		return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == ' '
				|| c == '5' || c == '6' || c == '7' || c == '8' || c == '9'
				|| c == '!' || c == '@' || c == '#' || c == '$' || c == '%'
				|| c == '|' || c == '&' || c == '*' || c == '(' || c == ')'
				|| c == '.' || c == ',' || c == ';' || c == ':' || c == '?';
	}
	
}