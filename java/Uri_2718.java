// package Iniciante;

/*
 
 QUEST�O
 Giovanna adora o Natal. As festas, a fam�lia, decora��es natalinas e 
 principalmente os famosos pisca pisca led. Por�m, esse ano a pequena Gio 
 ficou triste ao perceber que seu jogo de luzes est� quebrado. Algumas 
 luzes ainda funcionam, outras n�o. Giovanna quer, obviamente, consertar 
 seu objeto preferido mas n�o tem l�mpadas o suficiente pra substituir 
 todas as queimadas ent�o resolveu fazer o segulonge: dividir o pisca pisca 
 em grupos ordenados de 50 l�mpadas e em cada grupo s� consertar a maior 
 quantidade de l�mpadas consecutivas queimadas.

 Por serem muitos grupos, a tarefa se tornou tediosa e para tentar remediar 
 isso, Giovanna, observando a semelhan�a dos grupos com representa��o 
 bin�ria de n�meros quando imaginava l�mpadas queimadas como 1's e l�mpadas 
 funcionais como 0's, decidiu pensar neles efetivamente como n�meros e escreveu 
 as representa��es decimais desses bin�rios ent�o tentou descobrir a quantidade 
 de l�mpadas a serem trocadas a partir dessas anota��es.

 Sua tarefa �, dado as anota��es de Gio, diga quantas l�mpadas ser�o trocadas 
 em cada grupo.
 
 ENTRADA
 A primeira linha da entrada cont�m um n�mero inteiro N (1 <= N <= 103) 
 representando a quantidade de grupos que Giovanna anotou. As pr�ximas N linhas 
 cont�m um inteiro X cada uma representando o equivalente decimal do n�mero 
 que representa o grupo.
 
 SA�DA
 A sa�da consiste de N linhas cada uma contendo o tamanho da maior sequ�ncia 
 de l�mpadas consecutivas queimadas em cada grupo, respeitando a ordem de 
 entrada dos grupos.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2718 {

    public static void main(String[] args) throws IOException {
    	
    	// Criando o Scanner
    	Scanner sc = new Scanner(System.in);
    	
    	// Lendo o total de entradas que vai ter
    	int N = sc.nextInt();
    	
    	// Fazendo um loop por todas as entradas
    	for (int i = 0; i < N; i++) {
    		
    		// Lendo a entrada e criando as variaveis de controle
    		long X = sc.nextLong();
    		int sequenciaMaxima = 0;
    		int sequenciaAtual = 0;
    		
    		// Fazendo um loop enquanto o X for maior que 0
    		while (X > 0) {
    			
    			// Verificando se a lampada esta queimada
    			if (X % 2 == 1) {
    				// Caso ela estiver queimada o contador aumenta
    				sequenciaAtual++;
    			
    			// Caso ela n�o estiver queimanda ent�o a sequencia � zerada
    			} else {
    				// Verificando se a sequencia atual � maior que a maxima
    				if (sequenciaAtual > sequenciaMaxima) {
    					// Caso a sequencia atual seja maior que a maxima ent�o salvamos ela
    					sequenciaMaxima = sequenciaAtual;
    				}
    				// Zerando a sequencia
					sequenciaAtual = 0;
    			}
    			// Diminuindo o X;
    			X /= 2;
    		}
    		
			// Verificando se a sequencia atual � maior que a maxima
			if (sequenciaAtual > sequenciaMaxima) {
				// Caso a sequencia atual seja maior que a maxima ent�o salvamos ela
				sequenciaMaxima = sequenciaAtual;
			}
			
			// Printando a sequencia maxima (saida)
			System.out.println(sequenciaMaxima);
    	}

		sc.close();
    }
    
}