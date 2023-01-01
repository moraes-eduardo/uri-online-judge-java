// package Iniciante;

/*
 
 QUEST�O
 Em ano de Copa do Mundo de Futebol, o �lbum de figurinhas oficial � sempre um 
 grande sucesso entre crian�as e tamb�m entre adultos. Para quem n�o conhece, 
 o �lbum cont�m espa�os numerados de 1 a N para colar as figurinhas; cada 
 figurinha, tamb�m numerada de 1 a N, � uma pequena foto de um jogador de uma 
 das sele��es que jogar� a Copa do Mundo. O objetivo � colar todas as 
 figurinhas nos respectivos espa�os no �lbum, de modo a completar o �lbum (ou 
 seja, n�o deixar nenhum espa�o sem a correspondente figurinha).

 Algumas figurinhas s�o carimbadas (efetivamente t�m um carimbo impresso sobre 
 a fotografia do jogador) e s�o mais raras, mais dif�ceis de conseguir. As 
 figurinhas s�o vendidas em envelopes fechados, de forma que o comprador n�o 
 sabe quais figurinhas est� comprando, e pode ocorrer de comprar uma figurinha 
 que ele j� tenha colado no �lbum.

 Para ajudar os usu�rios, a empresa respons�vel pela venda do �lbum e das 
 figurinhas quer criar um aplicativo que permita gerenciar facilmente as 
 figurinhas que faltam para completar o �lbum.

 Dados o n�mero total de espa�os e figurinhas do �lbum (N), a lista das 
 figurinhas carimbadas e uma lista das figurinhas j� compradas (que pode 
 conter figurinhas repetidas), sua tarefa � determinar quantas figurinhas 
 carimbadas faltam para completar o �lbum.
 
 ENTRADA
 A primeira linha cont�m tr�s n�meros inteiros N (1 <= N <= 100) , 
 C (1 <= C <= N/2) e M (1 <= M <= 300) indicando respectivamente o n�mero de 
 figurinhas (e espa�os) do �lbum, o n�mero de figurinhas carimbadas do �lbum 
 e o n�mero de figurinhas j� compradas. A segunda linha cont�m C n�meros 
 inteiros distintos Xi indicando as figurinhas carimbadas do �lbum. A terceira 
 linha cont�m M n�meros inteiros Yi (1 <= Xi , Yi <= N) indicando as figurinhas 
 j� compradas.
 
 SA�DA
 Seu programa deve produzir um inteiro representando o n�mero de figurinhas 
 carimbadas que falta para completar o �lbum.

*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Uri_2783 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int M = sc.nextInt();
        int faltam = 0;
        HashSet<Integer> carimbadas = new HashSet<>();
        HashSet<Integer> compradas = new HashSet<>();
        for (int i = 0; i < C; i++) 
        	carimbadas.add(sc.nextInt());
        for (int i = 0; i < M; i++) 
        	compradas.add(sc.nextInt());
        for (int i : carimbadas) 
        	if (!compradas.contains(i)) faltam++;
        System.out.println(faltam);

        sc.close();
    }
	
}