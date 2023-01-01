// package Iniciante;

/*
 
 QUEST�O
 Cinco patinhos foram passear. Al�m das montanhas. Para brincar. A mam�e 
 gritou: qu�, qu�, qu�, qu�. Mas s� quatro patinhos voltaram de l�. Quatro 
 patinhos foram passear. Al�m das montanhas. Para brincar. A mam�e gritou: 
 qu�, qu�, qu�, qu�. Mas s� tr�s patinhos voltaram de l�. Tr�s patinhos 
 foram passear. Al�m das montanhas. Para brincar. A mam�e gritou: qu�, qu�, 
 qu�, qu�. Mas s� dois patinhos voltaram de l�. Dois patinhos foram passear. 
 Al�m das montanhas. Para brincar. A mam�e gritou: qu�, qu�, qu�, qu�. Mas s� 
 um patinho voltou de l�. Um patinho foi passear. Al�m das montanhas. Para 
 brincar. A mam�e gritou: qu�, qu�, qu�, qu�. Mas nenhum patinho voltou de l�.

 A mam�e patinha ficou t�o triste naquele dia que resolveu pedir sua ajuda 
 para procurar al�m das montanhas, na beira do mar, quantos patinhos n�o voltaram de l�.
 
 ENTRADA
 Haver� v�rios casos de testes, a primeira linha de cada caso de teste cont�m 
 um inteiro (0 <= P <= 1019) representando a quantidade total de patos, a entrada 
 termina com P = -1.

 S�IDA
 O arquivo de sa�da deve conter a quantidade de patinhos que retornaram.

*/

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Uri_2334 {
 
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger br = new BigInteger("-1"); 
        BigInteger sub = new BigInteger("1");
		while (true) {
			BigInteger N = sc.nextBigInteger();
			if (N.compareTo(br) == 0) break;
			System.out.println(N.compareTo(BigInteger.ZERO) == 0 ? 0 : N.subtract(sub));
		}

		sc.close();
	}
	
}