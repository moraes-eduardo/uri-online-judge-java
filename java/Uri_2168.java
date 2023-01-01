// package Iniciante;

/*
 
 QUEST�O
 No crep�sculo, a cidade de Portland fica cheia de vampiros e lobisomens. 
 Entretanto, nenhum deles quer ser visto enquanto passeiam pelo centro.

 V�o ser instaladas c�meras de vigil�ncia em cada esquina do centro de 
 Portland. A cada m�s, um mapa atualizado com as c�meras j� em 
 funcionamento � disponibilizado no site da prefeitura.

 Uma quadra � considerada segura se existem c�meras em, pelo menos, duas 
 de suas quatro esquinas. No centro de Portland todas as quadras s�o 
 quadrados de mesmo tamanho.

 Sua tarefa �, dado o mapa das c�meras em funcionamento nas esquinas, 
 indicar o status de todas as quadras do centro.
 
 ENTRADA
 A primeira linha da entrada tem um inteiro positivo N (1 <= N <= 100). Nas 
 pr�ximas N+1 linhas, existem N+1 n�meros, que indicam, para cada esquina, 
 a presen�a ou aus�ncia de uma c�mera de vigil�ncia em funcionamento. O 
 n�mero 1 indica que existe uma c�mera funcionando na esquina, enquanto o 
 n�mero zero indica que n�o h� c�mera funcionando.
 
 SA�DA
 A sa�da � dada em N linhas. Cada linha tem N caracteres, indicando se a 
 quadra correspondente � segura ou insegura. Se uma quadra � segura, mostre 
 o caractere S; se n�o � segura, mostre o caractere U.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2168 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[][] C = new int[N+1][N+1];
    	
    	for (int i = 0; i < C.length; i++) {
    		for (int j = 0; j < C[i].length; j++) {
    			C[i][j] = sc.nextInt();
    		}
    	}
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = 0; j < N; j++) {
    			if (isSafeZone(C, i, j)) System.out.print("S");
    			else System.out.print("U");
    		}
    		System.out.println("");
    	}

		sc.close();
    }
    
    private static boolean isSafeZone(int[][] mat, int i, int j) {
    	int cont = 0;
    	
    	if (mat[i][j] == 1) cont++;
    	if (mat[i+1][j] == 1) cont++;
    	if (mat[i][j+1] == 1) cont++;
    	if (mat[i+1][j+1] == 1) cont++;
    	    	
    	if (cont > 1) return true;
    	else return false;
    }
	
}