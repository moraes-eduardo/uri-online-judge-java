// package Iniciante;

/*
 
 QUEST�O
 Um novo conjunto de autentica��o ser� implementado no Instituto Federal do 
 Sul de Minas, campus Muzambinho.

 Bom, o novo servi�o de autentica��o � seguro, sem bugs e dores de cabe�a 
 mesmo porque estamos no final de semestre. Ele permitir� que sua senha 
 tenha espa�os, mas n�o n�meros ou caracteres especiais. A atualiza��o 
 ocorre sempre no per�odo de f�rias, para que todos os ajustes sejam feitos 
 e no final agrade todos os usuarios. Como estagi�rio da central de suporte 
 da escola, seu dever � implementar a nova autentica��o. Por enquanto o novo 
 padr�o para nomes de usu�rios est� sendo estudado.
 
 Como podemos perceber para cada conjunto de letras teremos um numero especifico. 
 Bole um programa maroto para fazer essa convers�o das letras para os n�meros,
 e como voc� n�o acessar� as senhas dos alunos, fa�a um algoritmo para que o 
 mesmo fa�a o processo sozinho usando seus proprios casos de teste.

 Obs : Seus casos de teste n�o poder�o passar de 20 caracterese e a sa�da, 12 digitos.
 
 ENTRADA
 Voc� ter� N indicando a quantidade de senhas que ser�o trocadas, em seguida N casos de testes.

 SA�DA
 A sa�da ser� uma lista com os novos n�meros, criptografados das senhas que foram digitadas.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2690 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	for (int i = 0 ; i < N; i++) {
    		String password = readLine(sc);
    		StringBuilder crypt = new StringBuilder();
    		for (char c : password.toCharArray()) {
    			if (crypt.length() == 12) break;
    			     if (c == 'G' || c == 'Q' || c == 'a' || c == 'k' || c == 'u')             crypt.append('0');
    			else if (c == 'I' || c == 'S' || c == 'b' || c == 'l' || c == 'v')             crypt.append('1');
    			else if (c == 'E' || c == 'O' || c == 'Y' || c == 'c' || c == 'm' || c == 'w') crypt.append('2');
    			else if (c == 'F' || c == 'P' || c == 'Z' || c == 'd' || c == 'n' || c == 'x') crypt.append('3');
    			else if (c == 'J' || c == 'T' || c == 'e' || c == 'o' || c == 'y')             crypt.append('4');
    			else if (c == 'D' || c == 'N' || c == 'X' || c == 'f' || c == 'p' || c == 'z') crypt.append('5');
    			else if (c == 'A' || c == 'K' || c == 'U' || c == 'g' || c == 'q')             crypt.append('6');
    			else if (c == 'C' || c == 'M' || c == 'W' || c == 'h' || c == 'r')             crypt.append('7');
    			else if (c == 'B' || c == 'L' || c == 'V' || c == 'i' || c == 's')             crypt.append('8');
    			else if (c == 'H' || c == 'R' || c == 'j' || c == 't')                         crypt.append('9');
    		}
    		System.out.println(crypt);
    	}
    }
    
	private static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty()) {
			line = sc.nextLine();
		}
		return line;
	}
    
}