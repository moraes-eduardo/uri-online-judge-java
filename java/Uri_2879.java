// package Iniciante;

/*
 
 QUEST�O
 No palco de um programa de audit�rio h� tr�s portas fechadas: porta 1, 
 porta 2 e porta 3. Atr�s de uma dessas portas h� um carro, atr�s de cada 
 uma das outras duas portas h� um bode. A produ��o do programa sorteia 
 aleatoriamente a porta onde vai estar o carro, sem trapa�a. Somente o 
 apresentador do programa sabe onde est� o carro. Ele pede para o jogador 
 escolher uma das portas. Veja que agora, como s� h� um carro, atr�s de 
 pelo menos uma entre as duas portas que o jogador n�o escolheu, tem que 
 haver um bode!

 Portanto, o apresentador sempre pode fazer o seguinte: entre as duas portas 
 que o jogador n�o escolheu, ele abre uma que tenha um bode, de modo que o 
 jogador e os espectadores possam ver o bode. O apresentador, agora, pergunta 
 ao jogador: �voc� quer trocar sua porta pela outra porta que ainda est� 
 fechada?�. E vantajoso trocar ou n�o? O jogador quer ficar com a porta que 
 tem o carro, claro!

 Paulinho viu uma demonstra��o rigorosa de que a probabilidade de o carro 
 estar atr�s da porta que o jogador escolheu inicialmente � 1/3 e a 
 probabilidade de o carro estar atr�s da outra porta, que ainda est� fechada 
 e que o jogador n�o escolheu inicialmente, � 2/3 e, portanto, a troca � 
 vantajosa. Paulinho n�o se conforma, sua intui��o lhe diz que tanto faz, 
 que a probabilidade � 1/2 para ambas as portas ainda fechadas...

 Neste problema, para acabar com a d�vida do Paulinho, vamos simular esse 
 jogo milhares de vezes e contar quantas vezes o jogador ganhou o carro. 
 Vamos supor que:

 � O jogador sempre escolhe inicialmente a porta 1;

 � O jogador sempre troca de porta, depois que o apresentador revela um 
   bode abrindo uma das duas portas que n�o foram escolhidas inicialmente.

 Nessas condi��es, em um jogo, dado o n�mero da porta que cont�m o carro, 
 veja que podemos saber exatamente se o jogador vai ganhar ou n�o o carro.
 
 ENTRADA
 A primeira linha da entrada cont�m um inteiro N (1 <= N <= 104 ), indicando 
 o n�mero de jogos na simula��o. Cada uma das N linhas seguintes cont�m um 
 inteiro: 1, 2 ou 3; representando o n�mero da porta que cont�m o carro naquele jogo.
 
 SA�DA
 Seu programa deve produzir uma �nica linha, contendo um inteiro representando 
 o n�mero de vezes que o jogador ganhou o carro nessa simula��o, supondo que 
 ele sempre escolhe inicialmente a porta 1 e sempre troca de porta depois que 
 o apresentador revela um bode abrindo uma das duas portas que n�o foram 
 escolhidas inicialmente.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2879 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int vitorias = 0;
        for (int i = 0; i < N; i++) {
        	if (sc.nextInt() != 1) vitorias++;
        }
        System.out.println(vitorias);
    }
	
}