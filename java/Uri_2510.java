// package Iniciante;

/*
 
 QUEST�O
 Como todos sabem, existem diversos her�is que defendem a humanidade de capangas 
 e for�as do mal. Em Codham, uma das cidades mais sombrias que existem, vive 
 Batmain, o cavaleiro das trevas. Resumidamente, Batmain nada mais � que um ser 
 humano g�nio, multibilion�rio, filantropo que tamb�m � mestre em mais de cem 
 artes marciais. Apesar de ningu�m conhecer sua real identidade, por ele utilizar 
 uma armadura com disfarce de morcego, todas as pessoas do bem o amam. 
 Obviamente, as pessoas m�s o temem. Ap�s diversas batalhas, todos os seus 
 vil�es haviam sido capturados pelo Batmain e a sensa��o de seguran�a parecia 
 fazer parte dos cidad�os de Codham novamente. Toda essa tranquilidade at�pica 
 deixou de existir a dois dias, quando o palha�o do crime � tamb�m conhecido como 
 Coderinga �� escapou de Arkham e conseguiu tornar a cidade mais ca�tica do que 
 nunca. Voc� trabalha para a pol�cia de Codham, em um reconhecido cargo de 
 batprogramador (profiss�o respons�vel por resolver problemas que envolvem o 
 cavaleiro das trevas, realizando a codifica��o de algoritmos) e lhe foi 
 solicitado a seguinte tarefa: dizer, para cada vil�o, se ele alguma vez j� foi 
 capturado pelo cavaleiro das trevas.
 
 ENTRADA
 A primeira linha da entrada � composta por um n�mero inteiro T que indica a 
 quantidade de casos de testes. Cada caso de teste � composto por uma cadeia de 
 caracteres de tamanho N (1 < N < 26). Todos os caracteres s�o letras mai�sculas 
 ou min�sculas do alfabeto ingl�s.
 
 SA�DA
 Caso o vil�o alguma vez j� foi capturado pelo Batmain, imprima Y. Caso contr�rio, imprima N.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2510 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String vilao = sc.nextLine();
			System.out.println("Y");
		}
	}
	
}