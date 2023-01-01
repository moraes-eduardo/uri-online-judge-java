// package Strings;

/*

 QUEST�O
 Machado gosta muito de escrever. J� escreveu muitos contos, resenhas, relatos de 
 viagens que fez, al�m de um pequeno romance. Agora Machado quer participar de um 
 concurso de contos, que tem regras muito r�gidas sobre o formato de submiss�o do 
 conto. As regras do concurso especificam o n�mero m�ximo de caracteres por linha, 
 o n�mero m�ximo de linhas por p�gina, al�m de limitar o n�mero total de p�ginas. 
 Adicionalmente, cada palavra deve ser escrita integralmente em uma linha (ou seja, 
 a palavra n�o pode ser separada silabicamente em duas linhas). Machado quer 
 escrever um conto com o maior n�mero de palavras poss�vel, dentro das regras do 
 concurso, e precisa de sua ajuda. Dados o n�mero m�ximo de caracteres por linha, 
 o n�mero m�ximo de linhas por p�gina, e as palavras do conto que Machado est� 
 escrevendo, ele quer saber o n�mero m�nimo de p�ginas que seu conto utilizaria 
 seguindo as regras do concurso.
 
 ENTRADA
 A primeira linha de um caso de teste cont�m tr�s inteiros N (2 <= N <= 1000), 
 L (1 <= L <= 30 ) e C (1 <= C <= 70) , que indicam, respectivamente, o n�mero de 
 palavras do conto de Machado, o n�mero m�ximo de linhas por p�gina e o n�mero 
 m�ximo de caracteres por linha. O conto de Machado � inovador e n�o cont�m 
 nenhum caractere al�m de letras mai�sculas e min�sculas e espa�os em branco, 
 sem letras acentuadas e sem cedilha. A segunda linha cont�m o conto de Machado, 
 composto de N palavras (1 <= comprimento de cada palavra <= C) separadas por 
 espa�os em branco; h� espa�o em branco somente entre duas palavras, e entre duas 
 palavras h� exatamente um espa�o em branco. O final da entrada � determinado pelo 
 final de arquivo (EOF).
 
 SA�DA
 Para cada caso de teste imprima uma �nica linha, contendo um �nico n�mero inteiro, 
 indicando o n�mero m�nimo de p�ginas que o conto de Machado ocupa, considerando as 
 regras do concurso.
 
*/

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class Uri_1222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int linhas = 0;
			int paginas = 0;
			int caracteres = 0;
			int numPalavras = sc.nextInt();
			int maxLinhas = sc.nextInt();
			int maxCarac = sc.nextInt();
			for (int i = 1; i <= numPalavras; i++) {
				String palavra = sc.next();
				caracteres += palavra.length();
				if (caracteres == maxCarac) {
					caracteres = 0;
					linhas++;
				} else if (caracteres > maxCarac) {
					caracteres = palavra.length() + 1;
					linhas++;
				}
				else if (i < numPalavras) {
					caracteres++;
					if (caracteres == maxCarac) {
						caracteres = 0;
						linhas++;
					}
				}
				if (linhas == maxLinhas) {
					linhas = 0;
					paginas++;
				}
			}
			if (linhas > 0 || caracteres > 0)
				paginas++;
			System.out.println(paginas);
		}

		sc.close();
	}

}