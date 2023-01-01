// package Iniciante;

/*
 
 QUEST�O
 A Federa��o Ga�cha de Futebol contratou voc� para escrever um programa para 
 fazer uma estat�stica do resultado de v�rios GRENAIS. Escreva um programa 
 para ler o n�mero de gols marcados pelo Inter e pelo Gr�mio em um GRENAL. 
 Logo ap�s escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma 
 resposta. Se a resposta for 1, o algoritmo deve ser executado novamente 
 solicitando o n�mero de gols marcados pelos times em uma nova partida, caso 
 contr�rio deve ser encerrado imprimindo:

 - Quantos GRENAIS fizeram parte da estat�stica.
 - O n�mero de vit�rias do Inter.
 - O n�mero de vit�rias do Gr�mio.
 - O n�mero de Empates.
 - Uma mensagem indicando qual o time que venceu o maior n�mero de GRENAIS 
  (ou "Nao houve vencedor", caso termine empatado).

 ENTRADA
 O arquivo de entrada cont�m 2 valores inteiros, correspondentes aos gols marcados 
 pelo Inter e pelo Gr�mio respectivamente. Em seguida h�ver� um inteiro (1 ou 2), 
 correspondente � repeti��o do programa.
 
 SA�DA
 Ap�s cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
 Quando o algoritmo for encerrado devem ser mostradas as estat�sticas conforme a 
 descri��o apresentada acima. Obs: a palavra "Gremio" deve ser impressa sem acento, 
 conforme o exemplo abaixo.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1131 {
	
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int golsInter;
		int golsGremio;
		int flag = 1;
		int totalJogos = 0;
		int vitoriasGremio = 0;
		int vitoriasInter = 0;
		int empates = 0;
		
		while (flag == 1) {
			totalJogos++;
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();
			if (golsInter > golsGremio) vitoriasInter++;
			else if (golsGremio > golsInter) vitoriasGremio++;
			else empates++;
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			flag = sc.nextInt();
			while (flag != 1 && flag != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				flag = sc.nextInt();
			}
		}
		
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
		if (vitoriasInter > vitoriasGremio) System.out.println("Inter venceu mais");
		else if (vitoriasGremio > vitoriasInter) System.out.println("Gremio venceu mais");
		else System.out.println("Nao houve vencedor");

		sc.close();
    }
	
}