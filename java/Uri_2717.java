// package Iniciante;

/*
 
 QUEST�O
 A fabrica��o dos presentes para o Natal � um processo muito complicado. 
 Diversas vezes os duendes ficam at� tarde trabalhando para que tudo possa 
 ser terminado a tempo e com perfei��o.

 Para melhor gerenciar seus cronogramas, os duendes estipularam quantos minutos 
 s�o necess�rios para fabricar cada presente.

 J� est� quase no final do expediente, e um dos duendes pediu sua ajuda.

 Faltam N minutos para a hora de ir embora, e restam dois presentes para o 
 duende Ed fabricar. Ajude-o a descobrir se ele conseguir� fabricar os dois 
 ainda hoje, ou se deve deixar o trabalho para amanh�.
 
 ENTRADA
 Cada caso de teste inicia com um inteiro N, indicando quantos minutos faltam 
 para o final do expediente (2 <= N <= 100).

 Em seguida haver� dois inteiros A e B, indicando quantos minutos s�o necess�rios
 para fabricar os dois presentes que Ed precisa fabricar (1 <= A, B <= 100).
 
 SA�DA
 Imprima uma linha, contendo a frase "Farei hoje!" caso seja poss�vel fabricar 
 os dois presentes antes do final do expediente, ou "Deixa para amanha!" 
 caso contr�rio.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2717 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int A = sc.nextInt() + sc.nextInt();
    	if (A > N)
    		System.out.println("Deixa para amanha!");
    	else
    		System.out.println("Farei hoje!");
    }
	
}