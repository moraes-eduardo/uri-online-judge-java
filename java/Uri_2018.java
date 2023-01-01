// package Estruturas e Bibliotecas;

/*

 QUEST�O
 Segundo a tradi��o, as provas das Olimp�adas de Natal s�o muito interessantes 
 e diferentes. Dentre as provas existentes, podemos citar por exemplo, o 
 levantamento de saco de brinquedos, a escalada de pinheiros, o hipismo com renas, 
 o arremesso de duendes (com e sem o consentimento deles - esse segundo � mais 
 perigoso) e o tempo de mergulho em buraco no gelo sem equipamentos, entre outros.

 Parte do melhoramento da competi��o proposto por Noel para este ano sera a 
 disponibiliza��o do quadro de medalhas dos pa�ses participantes atrav�s de um 
 placar eletr�nico. Voc� foi convidado para viajar at� as montanhas de KorvatuntUri_
 na Lap�nia, Finl�ndia, aonde ser� a sede destes jogos, para, � partir de uma rela��o 
 das provas e os pa�ses vencedores, desenvolver o sistema para este placar.

 Ser�o quase trezentos pa�ses participantes e at� 1000 modalidades de provas, no m�ximo.
 
 ENTRADA
 A entrada contem um unico caso de teste que consiste em uma relacao com o resultado 
 de todas as provas realizadas nas Olimp�adas de Natal. Cada prova ou modalidade cont�m 
 quatro linhas de informa��o: a primeira linha cont�m a descri��o da prova, a segunda 
 linha cont�m o pa�s que ficou campe�o nesta modalidade, a terceira linha cont�m o pa�s 
 vice-campe�o e a �ltima linha cont�m o pa�s que ficou com a medalha de bronze na 
 referida prova. O final da entrada � determinado por EOF.
 
 SA�DA
 Como sa�da, deve ser impresso o quadro de medalhas das Olimp�adas de Natal. A primeira 
 linha cont�m a informa��o "Quadro de Medalhas". Cada uma das pr�ximas linhas conter� o 
 nome de um pa�s seguido pelo respectivo n�mero de medalhas de ouro, prata e bronze que 
 este pa�s conquistou, separadas por um espa�o em branco. O crit�rio de desempate �, na 
 ordem, o n�mero de medalhas de ouro seguido pelo n�mero de medalhas de prata e de bronze. 
 Se pa�ses empatarem nestes tr�s crit�rios, a listagem ser� por ordem ascendente do nome 
 do pa�s participante.
 
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Uri_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Equipe> equipes = new HashMap<>();
		
		while (sc.hasNext()) {
			String modalidade = readLine(sc); 
			for (int i = 0; i < 3; i++) {
				String nomeEquipe = readLine(sc); 
				Equipe equipe;
				if (equipes.containsKey(nomeEquipe)) {
					equipe = equipes.get(nomeEquipe);
				} else {
					equipe = new Equipe(nomeEquipe);
					equipes.put(nomeEquipe, equipe);
				}
				equipe.medalhas[i]++;
			}
		}
		
		List<Equipe> listaEquipes = new ArrayList<>(equipes.values());
		Collections.sort(listaEquipes);
		
		System.out.println("Quadro de Medalhas");
		for (Equipe equipe : listaEquipes) {
			System.out.println(equipe);
		}

		sc.close();
	}
	
	public static String readLine(Scanner sc) {
		String line = sc.nextLine();
		while (line.isEmpty())
			line = sc.nextLine();
		return line;
	}
	
}

class Equipe implements Comparable<Equipe> {
	
	public String nome;
	public int[] medalhas;
	
	public Equipe(String nome) {
		this.nome = nome;
		this.medalhas = new int[3];
	}
		
	@Override
	public int compareTo(Equipe e) {
		if (this.medalhas[0] > e.medalhas[0]) 
			return -1;
		else if (this.medalhas[0] < e.medalhas[0])
			return 1;
		else if (this.medalhas[1] > e.medalhas[1])
			return -1;
		else if (this.medalhas[1] < e.medalhas[1])
			return 1;
		else if (this.medalhas[2] > e.medalhas[2])
			return -1;
		else if (this.medalhas[2] < e.medalhas[2])
			return 1;
		else
			return this.nome.compareTo(e.nome);
	}
	
	@Override
	public String toString() {
		return nome + " " + medalhas[0] + " " + medalhas[1] + " " + medalhas[2];
	}
	
}