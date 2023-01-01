// package Iniciante;

/*
 
 QUEST�O
 No oitavo episodio da segunda temporada do seriado The Big Bang Theory, 
 The Lizard-Spock Expansion, Sheldon e Raj discutem qual dos dois � o 
 melhor: o filme Saturn 3 ou a s�rie Deep Space 9. A sugest�o de Raj 
 para a resolu��o do impasse � uma disputa de Pedra-Papel-Tesoura. 
 Contudo, Sheldon argumenta que, se as partes envolvidas se conhecem, 
 entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, 
 e ent�o sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

 As regras do jogo proposto s�o:

 a tesoura corta o papel;
 o papel embrulha a pedra;
 a pedra esmaga o lagarto;
 o lagarto envenena Spock;
 Spock destr�i a tesoura;
 a tesoura decapita o lagarto;
 o lagarto come o papel;
 o papel contesta Spock;
 Spock vaporiza a pedra;
 a pedra quebra a tesoura.
 
 Embora a situa��o n�o se resolva no epis�dio (ambos escolhem Spock, resultando 
 em um empate), n�o � dif�cil deduzir o que aconteceria se a disputa continuasse. 
 Caso Sheldon vencesse, ele se deleitaria com a vit�ria, exclamando "Bazinga!"; 
 caso Raj vencesse, ele concluiria que "Raj trapaceou!"; caso o resultado fosse 
 empate, ele exigiria nova partida: "De novo!". Conhecidas as personagens do jogo 
 escolhido por ambos, fa�a um programa que imprima a prov�vel rea��o de Sheldon.
 
 ENTRADA
 A entrada consiste em uma s�rie de casos de teste. A primeira linha cont�m um 
 inteiro positivo T (T <= 100), que representa o n�mero de casos de teste. Cada 
 caso de teste � representado por uma linha da entrada, contendo as escolhas de 
 Sheldon e Raj, respectivamente, separadas por um espa�o em branco. As escolha 
 poss�veis s�o as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.
 
 SA�DA
 Para cada caso de teste dever� ser impressa a mensagem "Caso #t: R", onde t � o 
 n�mero do caso de teste (cuja contagem se inicia no n�mero um) e R � uma das tr�s 
 rea��es poss�veis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!".
 
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri_1828 {
	
    public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(sc.readLine());
        String escolhas, sheldon, raj;
        for (int i = 1; i <= N; i++) {
        	escolhas = sc.readLine();
        	sheldon = escolhas.split(" ")[0];
        	raj = escolhas.split(" ")[1];
        	if (sheldon.equalsIgnoreCase(raj)) System.out.println("Caso #" + i + ": De novo!");
        	else if (escolhas.equalsIgnoreCase("tesoura papel")) System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("papel pedra"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("pedra lagarto"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("lagarto spock"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("spock tesoura"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("tesoura lagarto"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("lagarto papel"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("papel spock"))  System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("spock pedra")) System.out.println("Caso #" + i + ": Bazinga!");
        	else if (escolhas.equalsIgnoreCase("pedra tesoura")) System.out.println("Caso #" + i + ": Bazinga!");
        	else System.out.println("Caso #" + i + ": Raj trapaceou!");
        }
    }
	
}