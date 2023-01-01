// package Iniciante;

/*
 
 QUEST�O
 Larissa � uma acad�mica muito inteligente e estudiosa, com isso ela � engajada em 
 v�rias atividades. Chegou o final do ano, m�s da sua apresenta��o de TCC. Ela, 
 muito atarefada, precisa saber se vai conseguir realizar sua apresenta��o antes 
 do Natal! Mas antes de sua apresenta��o ela deve passar por uma verifica��o com 
 sua orientadora oriental, a Prof.Takanada (/T� com nada/).

 ENTRADA
 A entrada � composta por um valor E (0 < E < 25) representando o dia que foi entregue 
 o tcc pra verifica��o. Um valor D (0 < D < 25) que representa a data final pra entregar 
 para verifica��o.
 
 SA�DA
 Mostre, para cada caso de teste, se a acad�mica apresentar� ou n�o. A �nica possibilidade 
 da entrega n�o ser realizada na data � por falta de orienta��o da Takanada. Caso n�o seja
 possivel, imprima "Eu odeio a professora!". Caso seja entregue em at� 3 dias antes do prazo 
 final, imprima "Muito bem! Apresenta antes do Natal!", caso contr�rio, sendo muito pr�ximo 
 da data limite imprima "Parece o trabalho do meu filho!", nesse ultimo caso, � adicionado 
 mais dois dias para corre��es, e caso a data final seja menor que a v�spera do natal(24), 
 ela poder� apresentar, sendo impresso "TCC Apresentado!", caso contr�rio imprima "Fail! Entao eh nataaaaal!"

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_2930 {
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int e = sc.nextInt();
    	int d = sc.nextInt();
    	if (e > d) {
    		System.out.println("Eu odeio a professora!");
    	} else if ((d - e) >= 3) {
    		System.out.println("Muito bem! Apresenta antes do Natal!");
    	} else if ((e + 2) < 24) {
    		System.out.println("Parece o trabalho do meu filho!\nTCC Apresentado!");
    	} else {
    		System.out.println("Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!");
    	}

		sc.close();
    }
    
}