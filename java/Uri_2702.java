// package Iniciante;

/*
 
 QUEST�O
 Em um longo voo, companhias a�reas oferecem uma refei��o aos seus passageiros. 
 Geralmente as aeromo�as conduzem carrinhos contendo as refei��es pelos 
 corredores do avi�o. Quando o carrinho chega em sua fileira, voc� � questionado 
 imediatamente: �Frango, bife, ou massa?�. Voc� sabe suas op��es, mas voc� tem 
 apenas alguns segundos para escolher e voc� n�o sabe qual a apar�ncia de sua 
 escolha pois seu vizinho ainda n�o abriu o embrulho�

 A aeromo�a deste voo decidiu alterar o procedimento. Primeiro ela vai perguntar 
 a todos os passageiros qual sua escolha de refei��o, e depois vai checar se o 
 n�mero de refei��es dispon�veis neste voo para cada escolha � suficiente.

 Por exemplo, considere que o n�mero de refei��es de frango, bife e massa 
 dispon�veis s�o respectivamente (80, 20, 40), enquanto o n�mero de passageiros 
 que escolheu frango, bife e massa seja respectivamente (45,23, 48). Neste caso, 
 onze pessoas seguramente ficaram sem suas respectivas escolhas de refei��o, j� 
 que tr�s passageiros que queriam bife e oito que gostariam de massa n�o poder�o 
 ser atendidos.

 Dada a quantidade de refei��es dispon�veis para cada escolha e o n�mero de 
 refei��es pedidas para cada escolha, voc� poderia por favor ajudar a aeromo�a 
 a determinar quantos passageiros seguramente n�o poder�o ser atendidos?
 
 ENTRADA
 A primeira linha contem tr�s inteiros Ca, Ba e Pa (0 <= Ca, Ba, Pa <= 100), 
 representando respectivamente o n�mero de refei��es disponiveis de frango, 
 bife e massa. A segunda linha contem tr�s inteiros Cr, Br e Pr 
 (0 <= Cr, Br, Pr <= 100), indicando respectivamente o n�mero de refei��es 
 requisitadas de frango, bife e massa respectivamente.
 
 SA�DA
 Imprima uma �nica linha com um inteiro representando o n�mero de passageiros 
 que seguramente n�o receber�o sua escolha de refei��o.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2702 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int Ca = sc.nextInt();
    	int Ba = sc.nextInt();
    	int Pa = sc.nextInt();
    	int Cr = sc.nextInt();
    	int Br = sc.nextInt();
    	int Pr = sc.nextInt();
    	int semComida = 0;
    	if (Cr > Ca) semComida += Cr - Ca;
    	if (Br > Ba) semComida += Br - Ba;
    	if (Pr > Pa) semComida += Pr - Pa;
    	System.out.println(semComida);
    }
	
}