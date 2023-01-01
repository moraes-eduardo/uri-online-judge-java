// package Iniciante;

/*

 QUEST�O
 Leia um n�mero inteiro que representa um c�digo de DDD para discagem 
 interurbana. Em seguida, informe � qual cidade o DDD pertence, 
 considerando a tabela abaixo: http://prntscr.com/jwiwks

 Se a entrada for qualquer outro DDD que n�o esteja presente na tabela 
 acima, o programa dever� informar: DDD nao cadastrado

 ENTRADA
 A entrada consiste de um �nico valor inteiro.

 SA�DA
 Imprima o nome da cidade correspondente ao DDD existente na entrada. 
 Imprima DDD nao cadastrado caso n�o existir DDD correspondente ao n�mero digitado.

*/

import java.io.IOException;
import java.util.Scanner;

public class Uri_1050 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int DDD = sc.nextInt();
        switch (DDD) {
	        case 61: System.out.println("Brasilia"); break;
	        case 71: System.out.println("Salvador"); break;
	        case 11: System.out.println("Sao Paulo"); break;
	        case 21: System.out.println("Rio de Janeiro"); break;
	        case 32: System.out.println("Juiz de Fora"); break;
	        case 19: System.out.println("Campinas"); break;
	        case 27: System.out.println("Vitoria"); break;
	        case 31: System.out.println("Belo Horizonte"); break;
	        default: System.out.println("DDD nao cadastrado");
        }

		sc.close();
    }
	
}