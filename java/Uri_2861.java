// package Iniciante;

/*
 
 QUEST�O
 Cacunda, Bizz e Massacote s�o amigos insepar�veis. Na faculdade, em alguns 
 dias, n�o iam � aula para jogar truco. Certo dia, um professor estava 
 passando perto deles. Na mesma hora, os tr�s gritaram bem alto a palavra 
 �gzuz�. Ap�s esse grito, ficaram invis�veis, e o professor n�o os viu. 
 Outra vez, a turma deles estava respondendo perguntas do professor. 
 Quando era a vez de algum deles, respondiam com a palavra �gzuz�, e o 
 professor aceitava como resposta e dava a nota m�xima da pergunta. Fa�a a 
 simula��o da sa�da que eles encontraram para se safar dos mais diversos problemas.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha cont�m um 
 n�mero inteiro C (2 <= C <= 99) relativo ao n�mero de perguntas que o professor 
 fez. As C linhas seguintes v�m com uma pergunta feita pelo professor.
 
 SA�DA
 Para cada pergunta, imprima a resposta que foi dita pelos tr�s amigos.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2861 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        sc.close();

        for (int i = 0; i < C; i++) {
        	sc.nextLine();
        	System.out.println("gzuz");
        }

        
    }
	
}