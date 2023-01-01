// package Iniciante;

/*
 
 QUEST�O
 Tausf�o apresenta um programa de televis�o o qual d� pr�mios aos participantes 
 que respondem corretamente a c�lculos matem�ticos. Quando os participantes erram, 
 ele ressalta o qu�o longe a resposta est� da esperada. Levando em considera��o 
 somente as respostas erradas, ajude o Tausf�o informando como deve ser a pron�ncia 
 do erro do participante.
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha cont�m um n�mero 
 inteiro C, representando a quantidade de casos de teste. As pr�ximas C linhas ser�o 
 formadas por um n�mero inteiro, seguido por um espa�o, um caractere de opera��o 
 (adi��o, subtra��o ou multiplica��o), outro n�mero inteiro, mais um espa�o, um sinal 
 de igualdade, outro espa�o e, por fim, um n�mero inteiro, representando o resultado 
 dito pelo participante em rela��o ao referido c�lculo do caso de teste.
 
 SA�DA
 Para cada caso de teste de entrada do seu programa, imprima a express�o �Errou!�, 
 baseada na dist�ncia da resposta do participante em rela��o � resposta correta.
 
 */

import java.io.IOException;
import java.util.Scanner;

public class Uri_2868 {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int C = sc.nextInt();
    	for (int i = 0; i < C; i++) {
    		int n1 = sc.nextInt();
    		char op = sc.next().charAt(0);
    		int n2 = sc.nextInt();
    		char ignore = sc.next().charAt(0);
    		int respostaDada = sc.nextInt();
    		int resposta = 0;
    		if (op == '+') {
        		resposta = Math.abs(respostaDada - (n1 + n2));
    		} else if (op == '-') {
        		resposta = Math.abs(respostaDada - (n1 - n2));
    		} else {
        		resposta = Math.abs(respostaDada - (n1 * n2));
    		}
    		StringBuilder faustao = new StringBuilder("E");
    		for (int j = 0; j < resposta; j++) {
    			faustao.append('r');
    		}
    		faustao.append("ou!");
    		System.out.println(faustao);

			sc.close();
    	}
    }
    
}