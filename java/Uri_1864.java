// package Iniciante;

/*
 
 QUEST�O
 E a�? Curtiu a Escola de Inverno deste ano? Para que esta Escola 
 acontecesse, foram muitos que trabalharam, seja na elabora��o dos 
 problemas, na configura��o do Portal, na log�stica do evento ou na 
 capta��o dos recursos. Nosso agradecimento especial deste ano vai 
 para o Prof. Ricardo Oliveira, que n�o somente aceitou vir ministrar 
 as oficinas como tamb�m participou ativamente na organiza��o da Escola. 
 Temos certeza que a experi�ncia e a carreira dele no ICPC como competidor 
 e como coach motivaram e inspiraram todos n�s.

 Esperamos que voc� tenha gostado desses �ltimos dias em Essos e em 
 Westeros, que tenha aprendido bastante e que tenha se divertido. Mas 
 n�o � s� em Essos e em Westeros que voc� deve se divertir. Aqui, em 
 Al�m da Muralha, programar tamb�m � divertido. Continue estudando, 
 continue treinando, e cada vez mais. O importante � o caminho que voc� 
 vai trilhar daqui para frente. Nosso conselho � que voc� procure sempre 
 aproveitar ao m�ximo cada momento, cada oficina, cada escola, cada treino, 
 cada tempo de pr�tica ou estudo em casa. Nossos dias nunca voltar�o.
 
 ENTRADA
 A entrada consiste de um �nico inteiro N (1 <= N <= 34) numa linha.

 SA�DA
 Imprima os N primeiros caracteres da cita��o de S�ren Kierkegaard definida 
 pelas letras que foram sublinhadas no enunciado deste problema. Preste 
 aten��o, pois nenhum espa�o foi sublinhado � voc� � que deve adivinhar o 
 n�mero e a localiza��o dos espa�os na frase. A �nica linha da sa�da deve 
 consistir apenas de letras mai�sculas e espa�os e ser finalizada por fim de linha.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1864 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String citacao = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		System.out.println(citacao.substring(0, n));

		sc.close();
    }
	
}