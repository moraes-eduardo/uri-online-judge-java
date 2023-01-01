// package Iniciante;

/*
 
 QUEST�O
 Esse ano as Renas do papai Noel decidiram que Rudolph n�o seria mais aquele 
 que sempre ficaria � frente. Elas escolheriam de forma justa entre elas quem 
 iria encabe�ar o tren�. E nada � mais justo que o acaso.

 Ent�o optaram pela seguinte forma para escolher: Cada Rena faria a quantidade 
 que quisesse de bolas de neve, sem as outras verem. Depois, todas as bolas de 
 neve de todas as Renas seriam reunidas em uma �nica e grande pilha. Por 
 �ltimo, as bolas de neve seriam tiradas dessa pilha, uma a uma, e distribu�das 
 entre elas sempre seguindo a ordem: Dasher, Dancer, Prancer, Vixen, Comet, Cupid, 
 Donner, Blitzen e Rudolph. At� que se acabassem as bolas de neve. A rena que 
 ficasse com a �ltima bola de neve seria declarada vencedora e ficaria na posic�o
 principal do tren� este ano.

 Dado o n�mero de bolas de neve feitas por cada Rena, determine qual Rena ganhou o sorteio.
 
 ENTRADA
 A entrada � composta por uma �nica linha contendo 9 n�meros inteiros Ai (1 <= Ai <= 104).
 
 SA�DA
 A sa�da � composta por uma �nica linha contendo o nome da Rena vencedora.

 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2721 {

	private static final String[] RENAS = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int votos = 0;
    	for (int i = 0; i < 9; i++) {
			votos += sc.nextInt();
		}
    	
    	int ganhadora = votos % 9;
    	if (ganhadora != 0) 
    		ganhadora -= 1;
    	else 
    		ganhadora = 8;
    	
    	System.out.println(RENAS[ganhadora]);
    }
    
}